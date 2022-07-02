import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale88();
        java.lang.String str5 = locale4.getISO3Language();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eng" + "'", str5, "eng");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eng");
        boolean boolean3 = languageRange1.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        float float8 = random7.nextFloat();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.7308782f + "'", float8 == 0.7308782f);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber41();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 0.7308782f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker149();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale76();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Random random1 = new java.util.Random((long) 10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.stream.LongStream longStream7 = random3.longs((long) (byte) 10, 0L, (long) 100);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(longStream7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale81();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale9 = serializedObjectSupporter8.deserializeObjectLocale37();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter8.deserializeObjectFaker161();
        java.util.Random random11 = serializedObjectSupporter8.deserializeObjectRandom1();
        java.util.Locale locale12 = serializedObjectSupporter8.deserializeObjectLocale56();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter8.deserializeObjectFaker98();
        java.util.Locale locale14 = serializedObjectSupporter8.deserializeObjectLocale79();
        java.lang.String str15 = locale7.getDisplayCountry(locale14);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(random11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = random6.nextInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem7();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        double double2 = random1.nextDouble();
        java.util.stream.IntStream intStream3 = random1.ints();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random1.longs(0L, 10L, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7308781907032909d + "'", double2 == 0.7308781907032909d);
        org.junit.Assert.assertNotNull(intStream3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale91();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance30();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime38();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime22();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale86();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber23();
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem47();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        java.lang.String str5 = locale4.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale4.getUnicodeLocaleType("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eng");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.lang.Object obj5 = locale4.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        double double2 = random1.nextDouble();
        double double3 = random1.nextGaussian();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles(0L, (double) (byte) -1, (double) 100);
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7308781907032909d + "'", double2 == 0.7308781907032909d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4123569817688534d) + "'", double3 == (-0.4123569817688534d));
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker101();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Random random1 = new java.util.Random((long) (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker134();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker166();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode3();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness12();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance59();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker119();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber32();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker85();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance41();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Random random0 = new java.util.Random();
        float float1 = random0.nextFloat();
// flaky:         org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.50835454f + "'", float1 == 0.50835454f);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode28();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook49();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker92();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions18();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale96();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker155();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale100();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness44();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber33();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor4();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale110();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance41();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness44();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions18();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale96();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany48();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale98();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance39();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale16();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions57();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(options4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale116();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem21();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker88();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale62();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker27();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany38();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions46();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker73();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber56();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook33();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale26();
        java.lang.Class<?> wildcardClass7 = locale6.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem39();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker167();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness6();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale68();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale95();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber9();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale79();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale11();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        double double2 = random1.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream6 = random1.ints((long) (byte) 100, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7308781907032909d + "'", double2 == 0.7308781907032909d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale26();
        java.lang.String str7 = locale6.getLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        random5.setSeed((long) 1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker113();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale9 = serializedObjectSupporter8.deserializeObjectLocale37();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter8.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter8.deserializeObjectLorem60();
        com.github.javafaker.Number number12 = serializedObjectSupporter8.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter8.deserializeObjectLorem19();
        com.github.javafaker.Faker faker14 = serializedObjectSupporter8.deserializeObjectFaker108();
        java.util.Locale locale15 = serializedObjectSupporter8.deserializeObjectLocale20();
        com.github.javafaker.Faker faker16 = serializedObjectSupporter8.deserializeObjectFaker83();
        boolean boolean17 = locale7.equals((java.lang.Object) serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(lorem11);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNull(faker14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertNull(faker16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale12();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker107();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor41();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale30();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker64();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker91();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale13();
        java.lang.String str8 = locale7.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem10();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor57();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Number number14 = serializedObjectSupporter0.deserializeObjectNumber42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(number14);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker100();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime33();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode49();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.stream.LongStream longStream4 = random3.longs();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Random random1 = new java.util.Random((long) 'x');
        random1.setSeed((long) '4');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.Faker faker16 = serializedObjectSupporter1.deserializeObjectFaker178();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNull(faker16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker63();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber30();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker74();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker118();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor57();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale88();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker166();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Faker faker14 = serializedObjectSupporter0.deserializeObjectFaker120();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNull(faker14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        float float7 = random6.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random6.doubles((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.7308782f + "'", float7 == 0.7308782f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker97();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker121();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem3();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem10();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker20();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode49();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode42();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.getfakeValuesService();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("eng");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: eng [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness27();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Random random1 = new java.util.Random((long) 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 0.7308782f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker97();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale109();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService12();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker45();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness30();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter11 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale12 = serializedObjectSupporter11.deserializeObjectLocale37();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter11.deserializeObjectFaker161();
        java.util.Random random14 = serializedObjectSupporter11.deserializeObjectRandom1();
        java.util.Locale locale15 = serializedObjectSupporter11.deserializeObjectLocale56();
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale10.getDisplayVariant(locale15);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(random14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker65();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker124();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode12();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber43();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor21();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.DateAndTime dateAndTime14 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(dateAndTime14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions21();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions55();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber34();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(dateAndTime11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem45();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale98();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber30();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem42();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness50();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(code9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness54();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode15();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker20();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness8();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions18();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale58();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker120();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany47();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness50();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode48();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter6 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale7 = serializedObjectSupporter6.deserializeObjectLocale37();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter6.deserializeObjectFaker161();
        java.util.Random random9 = serializedObjectSupporter6.deserializeObjectRandom1();
        java.util.Locale locale10 = serializedObjectSupporter6.deserializeObjectLocale56();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter6.deserializeObjectFaker98();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter6.deserializeObjectFaker81();
        com.github.javafaker.Options options13 = serializedObjectSupporter6.deserializeObjectOptions39();
        java.util.Locale locale14 = serializedObjectSupporter6.deserializeObjectLocale83();
        java.util.Locale locale15 = serializedObjectSupporter6.deserializeObjectLocale42();
        boolean boolean16 = locale5.equals((java.lang.Object) serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Business business3 = faker0.business;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = faker0.resolve("eng");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale71();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(random9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale107();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale70();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale55();
        java.lang.String str16 = locale14.getUnicodeLocaleType("en");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Finance finance1 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode42();
        org.junit.Assert.assertNotNull(finance1);
        org.junit.Assert.assertNotNull(code2);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber43();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(phoneNumber6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale10();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(finance9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany1();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany1();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker173();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime26();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime21();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany41();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker164();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale95();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale74();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale86();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor25();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker128();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker113();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker42();
        java.util.Random random11 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(random11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker49();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale72();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker83();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber54();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode45();
        com.github.javafaker.service.FakeValuesService fakeValuesService12 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(fakeValuesService12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook60();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance54();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker76();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale24();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker115();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber43();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale89();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime47();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber57();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(phoneNumber3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker43();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker168();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale112();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany12();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance51();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale98();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale76();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter10 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale11 = serializedObjectSupporter10.deserializeObjectLocale37();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter10.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter10.deserializeObjectLorem60();
        com.github.javafaker.Number number14 = serializedObjectSupporter10.deserializeObjectNumber59();
        com.github.javafaker.Finance finance15 = serializedObjectSupporter10.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem16 = serializedObjectSupporter10.deserializeObjectLorem15();
        java.util.Locale locale17 = serializedObjectSupporter10.deserializeObjectLocale27();
        com.github.javafaker.Faker faker18 = serializedObjectSupporter10.deserializeObjectFaker47();
        java.util.Locale locale19 = serializedObjectSupporter10.deserializeObjectLocale34();
        java.lang.String str20 = locale9.getDisplayLanguage(locale19);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(lorem13);
        org.junit.Assert.assertNotNull(number14);
        org.junit.Assert.assertNotNull(finance15);
        org.junit.Assert.assertNotNull(lorem16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertNull(faker18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale16();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale110();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem45();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber57();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Book book10 = serializedObjectSupporter0.deserializeObjectBook1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(book10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale36();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale82();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions37();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions39();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale12();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService55();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setVariant("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Business business12 = serializedObjectSupporter0.deserializeObjectBusiness16();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor57();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker153();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor21();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("eng", (-0.4123569817688534d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.4123569817688534");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker166();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions37();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness4();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber30();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber6();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.service.RandomService randomService7 = serializedObjectSupporter0.deserializeObjectRandomService1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(randomService7);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions58();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale67();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService5();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale42();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker80();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode28();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker97();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance53();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions37();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale90();
        java.lang.String str5 = locale4.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.FakeValuesService fakeValuesService1 = faker0.fakeValuesService;
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Finance finance3 = faker0.finance;
        org.junit.Assert.assertNotNull(fakeValuesService1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Internet internet2 = faker0.getinternet();
        com.github.javafaker.Finance finance3 = faker0.getfinance();
        com.github.javafaker.Business business4 = faker0.getbusiness();
        com.github.javafaker.Address address5 = faker0.address;
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(address5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en");
        double double2 = languageRange1.getWeight();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.lang.String str10 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode57();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.service.RandomService randomService6 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany9();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(randomService6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale79();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker9();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        java.util.Random random9 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random9);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(random9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(random10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions35();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker118();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode51();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale67();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale39();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker137();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService28();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Lorem lorem3 = faker0.lorem();
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime50();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale58();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode50();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor39();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale66();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker89();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale97();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale94();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker10();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker169();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker127();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany30();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime18();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness32();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(business2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker169();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale13();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale5);
        com.github.javafaker.Company company7 = faker6.company;
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker81();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook52();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker128();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Name name1 = faker0.name();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.dateAndTime;
        com.github.javafaker.Business business3 = faker0.business;
        com.github.javafaker.Address address4 = faker0.address;
        org.junit.Assert.assertNotNull(name1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(address4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook31();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem52();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber8();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker173();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem21();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode33();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor28();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale77();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber52();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber45();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker104();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness44();
        java.util.Random random8 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(random8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.Random random1 = new java.util.Random((-1L));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale78();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness39();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany24();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker58();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany16();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions15();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.Random random1 = new java.util.Random((long) 'x');
        java.util.stream.LongStream longStream3 = random1.longs((long) '4');
        org.junit.Assert.assertNotNull(longStream3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber30();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber6();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale44();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor10();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness41();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker178();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem16();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode52();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem51();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem8();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook6();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker69();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale54();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode36();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker15();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale103();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(dateAndTime12);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook29();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker81();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode30();
        com.github.javafaker.service.FakeValuesService fakeValuesService13 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(fakeValuesService13);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor20();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService12();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem1();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook4();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook33();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker162();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor9();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany29();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale43();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode49();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany58();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker104();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService49();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem41();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker123();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker95();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber18();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Number number2 = faker0.getnumber();
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.PhoneNumber phoneNumber4 = faker0.getphoneNumber();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness44();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.Random random1 = new java.util.Random((long) (short) 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en", (double) 0.50835454f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker43();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker61();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor7();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(random7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale20();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale113();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker176();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker20();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker95();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService53();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany60();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(company13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber41();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany34();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale44();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor28();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker96();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness51();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.Finance finance16 = faker0.finance;
        com.github.javafaker.DateAndTime dateAndTime17 = faker0.getdateAndTime();
        com.github.javafaker.PhoneNumber phoneNumber18 = faker0.phoneNumber();
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(finance16);
        org.junit.Assert.assertNotNull(dateAndTime17);
        org.junit.Assert.assertNotNull(phoneNumber18);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber42();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem32();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany22();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(company10);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook48();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber57();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale86();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale106();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness57();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale23();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker155();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem24();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker103();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance11();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany60();
        com.github.javafaker.Book book14 = serializedObjectSupporter0.deserializeObjectBook1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(company13);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness12();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker113();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions59();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.service.RandomService randomService7 = serializedObjectSupporter0.deserializeObjectRandomService3();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom2();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale58();
        java.lang.String str7 = locale6.getDisplayName();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "English" + "'", str7, "English");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber25();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook3();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale88();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook1();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker59();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker42();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness44();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem18();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale112();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale2 = serializedObjectSupporter1.deserializeObjectLocale37();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter1.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter1.deserializeObjectLorem60();
        com.github.javafaker.Number number5 = serializedObjectSupporter1.deserializeObjectNumber59();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter1.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter1.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter1.deserializeObjectLorem60();
        java.util.Locale locale9 = serializedObjectSupporter1.deserializeObjectLocale17();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter1.deserializeObjectFaker56();
        com.github.javafaker.Company company11 = serializedObjectSupporter1.deserializeObjectCompany51();
        com.github.javafaker.Options options12 = serializedObjectSupporter1.deserializeObjectOptions28();
        com.github.javafaker.Color color13 = serializedObjectSupporter1.deserializeObjectColor19();
        java.util.Locale locale14 = serializedObjectSupporter1.deserializeObjectLocale16();
        faker0.serializedObjectSupporter = serializedObjectSupporter1;
        com.github.javafaker.PhoneNumber phoneNumber16 = faker0.getphoneNumber();
        com.github.javafaker.Book book17 = faker0.book();
        com.github.javafaker.Lorem lorem18 = faker0.lorem;
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber16);
        org.junit.Assert.assertNotNull(book17);
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem27();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber35();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook31();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber26();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker171();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany13();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker11();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (-0.4123569817688534d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.4123569817688534");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem54();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker100();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness27();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(random5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem3();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker63();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale26();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor36();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber41();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale71();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor57();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        java.util.Random random7 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber57();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(random7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.DateAndTime dateAndTime15 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale16 = serializedObjectSupporter0.deserializeObjectLocale94();
        java.lang.String str17 = locale16.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "English" + "'", str17, "English");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber30();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber28();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker179();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale62();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions50();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness8();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber13();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker129();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber17();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService13();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber30();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance13();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker118();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker79();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale82();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance27();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode31();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.DateAndTime dateAndTime15 = serializedObjectSupporter0.deserializeObjectDateAndTime44();
        java.util.Locale locale16 = serializedObjectSupporter0.deserializeObjectLocale94();
        com.github.javafaker.Options options17 = serializedObjectSupporter0.deserializeObjectOptions1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en");
        org.junit.Assert.assertNotNull(options17);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber45();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker58();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker92();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness9();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker108();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Internet internet2 = faker0.getinternet();
        com.github.javafaker.Finance finance3 = faker0.getfinance();
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Name name5 = faker0.getname();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(name5);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        java.util.Random random11 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Book book12 = serializedObjectSupporter0.deserializeObjectBook47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(random11);
        org.junit.Assert.assertNull(book12);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber24();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor1();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale115();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness36();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale111();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker126();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker13();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany35();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Internet internet2 = faker0.getinternet();
        com.github.javafaker.Number number3 = faker0.getnumber();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(number3);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem8();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor43();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness48();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(business10);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker46();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions35();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker11();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode59();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor19();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.PhoneNumber phoneNumber14 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(phoneNumber14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker173();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService44();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance59();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale41();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance22();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(finance12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook7();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker64();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance11();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker91();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime55();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker86();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale35();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale31();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale84();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale2();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale27();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook8();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale96();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode2();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook27();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem8();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker92();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor30();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions7();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale58();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook6();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem61();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker102();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.service.FakeValuesService fakeValuesService1 = faker0.fakeValuesService;
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.getdateAndTime();
        com.github.javafaker.Lorem lorem3 = faker0.getlorem();
        org.junit.Assert.assertNotNull(fakeValuesService1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(lorem3);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany61();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker55();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker27();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker96();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale65();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode36();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker142();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker82();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.util.Locale locale0 = java.util.Locale.UK;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem44();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode41();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker133();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook19();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber35();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber14();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale107();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker104();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Random random5 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale70();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(random5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions40();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber25();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale41();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("eng");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = faker2.resolve("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber27();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem8();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker63();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber54();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService57();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(lorem2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook15();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(finance5);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.util.Locale locale0 = java.util.Locale.US;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Random random1 = new java.util.Random((long) 100);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Color color3 = faker2.color;
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker179();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale85();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness25();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.PhoneNumber phoneNumber1 = faker0.phoneNumber();
        com.github.javafaker.Internet internet2 = faker0.getinternet();
        com.github.javafaker.Finance finance3 = faker0.getfinance();
        com.github.javafaker.Business business4 = faker0.getbusiness();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker0.getfakeValuesService();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker83();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale120();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness22();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness2();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker108();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker156();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale36();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook21();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook13();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale114();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber20();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("English");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany37();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker96();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions28();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker105();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale35();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness24();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService8();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker98();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions10();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker24();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker76();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale95();
        java.util.Random random10 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(random10);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker164();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode34();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany16();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker21();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale77();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker17();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem58();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Random random3 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance28();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions60();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(random3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker161();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber59();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem15();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem60();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker56();
        com.github.javafaker.Company company10 = serializedObjectSupporter0.deserializeObjectCompany51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker7();
        java.util.Locale locale12 = serializedObjectSupporter0.deserializeObjectLocale59();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany60();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(company10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertNull(company13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Random random1 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions19();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode18();
        org.junit.Assert.assertNotNull(random1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(code3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale30();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker48();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService7();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode2();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber42();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(phoneNumber4);
    }
}
