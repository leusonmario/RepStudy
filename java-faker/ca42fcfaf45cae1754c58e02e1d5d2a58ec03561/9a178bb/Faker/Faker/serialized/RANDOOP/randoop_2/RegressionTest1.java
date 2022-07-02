import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter1 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color2 = serializedObjectSupporter1.deserializeObjectColor46();
        com.github.javafaker.Company company3 = serializedObjectSupporter1.deserializeObjectCompany59();
        java.util.Locale locale4 = serializedObjectSupporter1.deserializeObjectLocale1();
        java.util.Locale.setDefault(category0, locale4);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale97();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.lang.String str7 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5);
        java.util.Locale.LanguageRange languageRange9 = new java.util.Locale.LanguageRange("en");
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] { languageRange9 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Locale locale17 = java.util.Locale.JAPAN;
        java.util.Locale locale18 = java.util.Locale.TAIWAN;
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale23 = new java.util.Locale("", "", "");
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.util.Locale locale25 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale30 = new java.util.Locale("", "", "");
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = java.util.Locale.ENGLISH;
        java.util.Random random36 = new java.util.Random(100L);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale34, random36);
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet39 = locale38.getExtensionKeys();
        java.util.Locale locale40 = java.util.Locale.UK;
        java.lang.String str41 = locale40.getDisplayVariant();
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.lang.String str43 = locale42.getVariant();
        java.util.Locale locale44 = java.util.Locale.ENGLISH;
        java.util.Random random46 = new java.util.Random(100L);
        com.github.javafaker.Faker faker47 = new com.github.javafaker.Faker(locale44, random46);
        java.util.Locale locale48 = java.util.Locale.JAPAN;
        java.util.Locale locale52 = new java.util.Locale("", "", "");
        java.util.Locale locale53 = java.util.Locale.CHINESE;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.ITALIAN;
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.util.Locale locale58 = java.util.Locale.UK;
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale61 = java.util.Locale.ROOT;
        java.util.Locale locale65 = new java.util.Locale("", "", "");
        java.util.Locale locale66 = java.util.Locale.CHINESE;
        java.lang.String str67 = locale65.getDisplayVariant(locale66);
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale16, locale17, locale18, locale19, locale23, locale24, locale25, locale31, locale33, locale34, locale38, locale40, locale42, locale44, locale48, locale52, locale55, locale56, locale57, locale58, locale59, locale61, locale65 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList69);
        java.lang.String[] strArray78 = new java.lang.String[] { "\u4e2d\u6587", "Chinese (China)", "zh", "", "\u4e2d\u6587", "Chinese (China)" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.lang.String>) strList79);
        java.util.Locale.FilteringMode filteringMode82 = null;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.lang.String>) strList79, filteringMode82);
        java.lang.String str84 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList79);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ja_JP");
        org.junit.Assert.assertEquals(locale52.toString(), "");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "it");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(charSet60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "");
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions25();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness42();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness21();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode16();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany18();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode37();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale61();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter0.deserializeObjectLorem28();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime7();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(dateAndTime2);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor35();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook44();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Options options5 = faker2.getoptions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.getdateAndTime();
        com.github.javafaker.Internet internet2 = faker0.internet;
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(internet2);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.service.RandomService randomService9 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale64();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale63();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter2 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color3 = serializedObjectSupporter2.deserializeObjectColor46();
        com.github.javafaker.Company company4 = serializedObjectSupporter2.deserializeObjectCompany59();
        java.util.Locale locale5 = serializedObjectSupporter2.deserializeObjectLocale1();
        java.lang.String str6 = locale1.getDisplayCountry(locale5);
        java.lang.String str8 = locale5.getExtension('u');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker110();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany44();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany8();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale29();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode60();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber30();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale89();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale2();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness49();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale54();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker154();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem14();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService6();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker118();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook29();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions11();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance61();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker14();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale68();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker33();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker101();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(phoneNumber11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions32();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook22();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker165();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker100();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker159();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker126();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem60();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("fr-FR", (double) (byte) 1);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker65();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance30();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode16();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem2();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService33();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker23();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService18();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker178();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale51();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker92();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker170();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness29();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance18();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor33();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker156();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale29();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem33();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker168();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale4();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale54();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Business business10 = serializedObjectSupporter0.deserializeObjectBusiness47();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker82();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(business10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker74();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook10();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fr-FR");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "fr_FR");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter5 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number6 = serializedObjectSupporter5.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter5.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter5.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter5.deserializeObjectFaker52();
        faker2.serializedObjectSupporter = serializedObjectSupporter5;
        com.github.javafaker.Address address11 = faker2.getaddress();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(address11);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook47();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem57();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker128();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale79();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber42();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance21();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions20();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany33();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance17();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions32();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany22();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale16();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany18();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook49();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions26();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker87();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime7();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions11();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker6();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem57();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale92();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions51();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker82();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber58();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness26();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor3();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem53();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name3 = faker2.name();
        com.github.javafaker.Address address4 = faker2.getaddress();
        com.github.javafaker.Lorem lorem5 = faker2.getlorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(name3);
        org.junit.Assert.assertNotNull(address4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Color color5 = faker2.getcolor();
        com.github.javafaker.Lorem lorem6 = faker2.getlorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber48();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions37();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.service.RandomService randomService9 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker32();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        com.github.javafaker.service.RandomService randomService13 = serializedObjectSupporter0.deserializeObjectRandomService3();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNotNull(randomService13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness61();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber16();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale104();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale97();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness30();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany23();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode9();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime50();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        java.util.Random random12 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(random12);
        org.junit.Assert.assertNull(faker13);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale44();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker70();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook24();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness17();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(phoneNumber8);
        org.junit.Assert.assertNotNull(business9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor60();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker130();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem29();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode44();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker74();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany44();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany8();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale29();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.Finance finance12 = serializedObjectSupporter0.deserializeObjectFinance55();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook24();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(book9);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor55();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker142();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale11();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream5 = random2.doubles((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions6();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness19();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker158();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance8();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions7();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.Random random1 = new java.util.Random(100L);
        int int3 = random1.nextInt((int) (short) 1);
        java.util.stream.IntStream intStream5 = random1.ints((long) 'a');
        java.util.stream.IntStream intStream7 = random1.ints((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany27();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem29();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker175();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions29();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker4();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber23();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.PhoneNumber phoneNumber4 = faker2.phoneNumber();
        com.github.javafaker.Book book5 = faker2.getbook();
        com.github.javafaker.Lorem lorem6 = faker2.lorem;
        com.github.javafaker.Color color7 = faker2.color;
        com.github.javafaker.Business business8 = faker2.getbusiness();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(book5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale52();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions28();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions31();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(options8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions44();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem28();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor21();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(random6);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany40();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance31();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany33();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions48();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook57();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem31();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany55();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker22();
        com.github.javafaker.Color color13 = serializedObjectSupporter0.deserializeObjectColor1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber36();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor56();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime1();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode55();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions30();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions26();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber50();
        com.github.javafaker.service.FakeValuesService fakeValuesService11 = serializedObjectSupporter0.deserializeObjectFakeValuesService20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(fakeValuesService11);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany33();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(company2);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions47();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem11();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker88();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance16();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook12();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker42();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.util.Random random1 = new java.util.Random(100L);
        long long2 = random1.nextLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5128016860359238732L) + "'", long2 == (-5128016860359238732L));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Color color12 = serializedObjectSupporter0.deserializeObjectColor50();
        com.github.javafaker.Options options13 = serializedObjectSupporter0.deserializeObjectOptions33();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(options13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness53();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker71();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService35();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode32();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.setDefault(locale4);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService11();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance14();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime52();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber33();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker128();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions28();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale55();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker22();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale50();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker149();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale90();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance53();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker116();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker7();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook44();
        com.github.javafaker.service.FakeValuesService fakeValuesService10 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(fakeValuesService10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode53();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker56();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale102();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness44();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale100();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker87();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem2();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker41();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance13();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Lorem lorem1 = serializedObjectSupporter0.deserializeObjectLorem57();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance21();
        org.junit.Assert.assertNotNull(lorem1);
        org.junit.Assert.assertNotNull(finance2);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem29();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker175();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions42();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker163();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "KOR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale54();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker59();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker66();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook25();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker72();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker50();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker164();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance36();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale100();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor42();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber54();
        com.github.javafaker.Color color9 = serializedObjectSupporter0.deserializeObjectColor41();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(color9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem60();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime14();
        com.github.javafaker.PhoneNumber phoneNumber11 = serializedObjectSupporter0.deserializeObjectPhoneNumber6();
        com.github.javafaker.Company company12 = serializedObjectSupporter0.deserializeObjectCompany56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(phoneNumber11);
        org.junit.Assert.assertNull(company12);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber22();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService24();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem42();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(number7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance7();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(finance4);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale40();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale16();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale46();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker130();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Code code11 = serializedObjectSupporter0.deserializeObjectCode14();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNull(faker9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(code11);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber15();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime23();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(dateAndTime3);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker37();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness53();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker125();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.numerify("fr-FR");
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = faker0.fakeValuesService;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fr-FR" + "'", str2, "fr-FR");
        org.junit.Assert.assertNotNull(fakeValuesService3);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance38();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany8();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness59();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness55();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode33();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness61();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker127();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker9();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode37();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(code7);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        java.util.Locale locale2 = serializedObjectSupporter0.deserializeObjectLocale92();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany44();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions11();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor42();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService10();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.date();
        com.github.javafaker.Color color5 = faker2.getcolor();
        com.github.javafaker.Name name6 = faker2.name();
        com.github.javafaker.Internet internet7 = faker2.getinternet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor14();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber4();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance43();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions48();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale87();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime37();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook11();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale69();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker94();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.Code code5 = faker2.code();
        com.github.javafaker.Business business6 = faker2.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService14();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions32();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany22();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook27();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService24();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber18();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany35();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany4();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem5();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(lorem10);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem29();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode44();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker38();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random2.longs((long) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker116();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber36();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions15();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker73();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor52();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker102();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions7();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        java.util.stream.DoubleStream doubleStream8 = random2.doubles((double) (byte) -1, (double) (short) 1);
        java.util.stream.IntStream intStream11 = random2.ints((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime19();
        com.github.javafaker.Options options11 = serializedObjectSupporter0.deserializeObjectOptions41();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(options11);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale8();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness19();
        com.github.javafaker.DateAndTime dateAndTime7 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany53();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale119();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService11();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode35();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness40();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook39();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale71();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker23();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Code code13 = serializedObjectSupporter0.deserializeObjectCode20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness34();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions13();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance37();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook17();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService42();
        com.github.javafaker.service.RandomService randomService4 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker178();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale40();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale42();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.Name name4 = faker2.name;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter5 = faker2.serializedObjectSupporter;
        com.github.javafaker.Options options6 = faker2.options;
        com.github.javafaker.service.RandomService randomService7 = faker2.randomService;
        com.github.javafaker.Number number8 = faker2.number;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(randomService7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor48();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber14();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale18();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker158();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale108();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber53();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale38();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem30();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode56();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker164();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance52();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor49();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale3();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker110();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Options options2 = serializedObjectSupporter0.deserializeObjectOptions21();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker122();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode20();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker124();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem48();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions52();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale47();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker19();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker87();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale69();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale107();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker139();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance6();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook39();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness49();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor43();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber55();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker84();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance21();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(finance3);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany21();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook37();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(book6);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker118();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker136();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Random random4 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany43();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(random4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker2.fakeValuesService;
        com.github.javafaker.Business business6 = faker2.business();
        com.github.javafaker.Lorem lorem7 = faker2.lorem;
        com.github.javafaker.Lorem lorem8 = faker2.lorem;
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(lorem8);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions22();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker170();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions32();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker161();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale62();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness8();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions56();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions3();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService34();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness13();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem59();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale4();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker101();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale86();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker149();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode26();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale48();
        com.github.javafaker.Number number12 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(number12);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        random2.setSeed((long) (-1139614796));
        long long8 = random2.nextLong();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random2);
        java.util.stream.IntStream intStream10 = random2.ints();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2032033978319052225L) + "'", long8 == (-2032033978319052225L));
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Lorem lorem11 = serializedObjectSupporter0.deserializeObjectLorem56();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(lorem11);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions60();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber5();
        com.github.javafaker.Lorem lorem5 = serializedObjectSupporter0.deserializeObjectLorem46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker37();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker135();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook42();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker41();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.Number number10 = serializedObjectSupporter0.deserializeObjectNumber10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(number10);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany22();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook57();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(options6);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance33();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness61();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker73();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber7();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNull(company6);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter4 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color5 = serializedObjectSupporter4.deserializeObjectColor46();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter4.deserializeObjectFaker157();
        com.github.javafaker.Company company7 = serializedObjectSupporter4.deserializeObjectCompany57();
        com.github.javafaker.Code code8 = serializedObjectSupporter4.deserializeObjectCode53();
        com.github.javafaker.Color color9 = serializedObjectSupporter4.deserializeObjectColor34();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter4.deserializeObjectFaker56();
        java.util.Locale locale11 = serializedObjectSupporter4.deserializeObjectLocale102();
        java.util.Locale.Builder builder12 = builder0.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder0.setUnicodeLocaleKeyword("Chinese (China)", "Chinese (China)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Chinese (China) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "en");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook30();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale121();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode6();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.Number number9 = serializedObjectSupporter0.deserializeObjectNumber31();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker177();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale99();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale21();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker115();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNull(company8);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber46();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker150();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook9();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker153();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany21();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook11();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Lorem lorem13 = serializedObjectSupporter0.deserializeObjectLorem30();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(lorem13);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Lorem lorem4 = serializedObjectSupporter0.deserializeObjectLorem27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(lorem4);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber58();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale71();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor42();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber7();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(number6);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor54();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale104();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode38();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance59();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime4();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(dateAndTime4);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale74();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber61();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker52();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker162();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNull(faker5);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.Lorem lorem2 = serializedObjectSupporter0.deserializeObjectLorem45();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(lorem2);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        java.util.Random random1 = new java.util.Random(100L);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        random1.nextBytes(byteArray6);
        int int9 = random1.nextInt(1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-42, -97, -43, -72]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker94();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber34();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode10();
        com.github.javafaker.Book book9 = serializedObjectSupporter0.deserializeObjectBook33();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNull(book9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor16();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber10();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany18();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale24();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker21();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime30();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale81();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode60();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker111();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook13();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(code5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime52();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode5();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany57();
        com.github.javafaker.Color color4 = serializedObjectSupporter0.deserializeObjectColor19();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.service.RandomService randomService9 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker32();
        com.github.javafaker.DateAndTime dateAndTime12 = serializedObjectSupporter0.deserializeObjectDateAndTime59();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany16();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(dateAndTime12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode35();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness54();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(business5);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService18();
        com.github.javafaker.Finance finance10 = serializedObjectSupporter0.deserializeObjectFinance20();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNull(book11);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor32();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook28();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale95();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions44();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode50();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker69();
        java.util.Locale locale14 = serializedObjectSupporter0.deserializeObjectLocale111();
        com.github.javafaker.Number number15 = serializedObjectSupporter0.deserializeObjectNumber9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(number15);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        java.util.Random random1 = new java.util.Random(100L);
        int int3 = random1.nextInt((int) (short) 1);
        int int4 = random1.nextInt();
        java.util.stream.DoubleStream doubleStream7 = random1.doubles((double) 1.0f, (double) 100L);
        java.util.Random random9 = new java.util.Random(100L);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        random9.nextBytes(byteArray14);
        random1.nextBytes(byteArray14);
        double double17 = random1.nextGaussian();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1139614796) + "'", int4 == (-1139614796));
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[69, -13, -23, 49]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0560180403978943d) + "'", double17 == (-1.0560180403978943d));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem26();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber17();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance37();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber57();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber44();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(number11);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker159();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale78();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.DateAndTime dateAndTime9 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker109();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany27();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness35();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime11();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker71();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale56();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook39();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker137();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        java.util.stream.LongStream longStream4 = random2.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream7 = random2.longs(0L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Lorem lorem6 = serializedObjectSupporter0.deserializeObjectLorem9();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.Company company8 = serializedObjectSupporter0.deserializeObjectCompany44();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany8();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale29();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber25();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode10();
        com.github.javafaker.Code code13 = serializedObjectSupporter0.deserializeObjectCode22();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNull(company8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNotNull(code13);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker89();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode21();
        com.github.javafaker.Finance finance9 = serializedObjectSupporter0.deserializeObjectFinance40();
        com.github.javafaker.Lorem lorem10 = serializedObjectSupporter0.deserializeObjectLorem37();
        com.github.javafaker.Number number11 = serializedObjectSupporter0.deserializeObjectNumber34();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker139();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(lorem10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNull(faker12);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker61();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook51();
        com.github.javafaker.Color color8 = serializedObjectSupporter0.deserializeObjectColor54();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNull(book7);
        org.junit.Assert.assertNotNull(color8);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber8();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness34();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook8();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale69();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness60();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        java.util.Random random1 = new java.util.Random(100L);
        int int3 = random1.nextInt((int) (short) 1);
        int int4 = random1.nextInt();
        java.util.stream.LongStream longStream6 = random1.longs(0L);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random1);
        random1.setSeed((-2032033978319052225L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1139614796) + "'", int4 == (-1139614796));
        org.junit.Assert.assertNotNull(longStream6);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode58();
        com.github.javafaker.Code code5 = serializedObjectSupporter0.deserializeObjectCode36();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(code5);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook22();
        com.github.javafaker.Book book7 = serializedObjectSupporter0.deserializeObjectBook34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(book7);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(book5);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale119();
        com.github.javafaker.Options options8 = serializedObjectSupporter0.deserializeObjectOptions20();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService1();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber17();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.Code code3 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService16();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions6();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(code3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getISO3Language();
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Book book3 = faker2.book;
        com.github.javafaker.DateAndTime dateAndTime4 = faker2.getdateAndTime();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = faker2.fakeValuesService;
        com.github.javafaker.Internet internet6 = faker2.getinternet();
        com.github.javafaker.Code code7 = faker2.code;
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = faker2.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = faker2.resolve("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zho" + "'", str1, "zho");
        org.junit.Assert.assertNotNull(book3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(internet6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.DateAndTime dateAndTime11 = serializedObjectSupporter0.deserializeObjectDateAndTime31();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        com.github.javafaker.Company company13 = serializedObjectSupporter0.deserializeObjectCompany34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(dateAndTime11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNull(company13);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.Finance finance6 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService30();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness45();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode19();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime43();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions2();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker87();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance6();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness40();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(business4);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime25();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber60();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService58();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber3();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService59();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber59();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(phoneNumber7);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale67();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber5();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions38();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(options5);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime60();
        com.github.javafaker.PhoneNumber phoneNumber3 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance50();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker164();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor3();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Faker faker1 = serializedObjectSupporter0.deserializeObjectFaker47();
        com.github.javafaker.Code code2 = serializedObjectSupporter0.deserializeObjectCode46();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService60();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNull(faker1);
        org.junit.Assert.assertNotNull(code2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNull(faker4);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Book book14 = serializedObjectSupporter0.deserializeObjectBook21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNull(book14);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.PhoneNumber phoneNumber1 = serializedObjectSupporter0.deserializeObjectPhoneNumber22();
        com.github.javafaker.Number number2 = serializedObjectSupporter0.deserializeObjectNumber53();
        com.github.javafaker.Finance finance3 = serializedObjectSupporter0.deserializeObjectFinance55();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale87();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany34();
        org.junit.Assert.assertNotNull(phoneNumber1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Color color2 = serializedObjectSupporter0.deserializeObjectColor18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale91();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance60();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor42();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness15();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale44();
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter8 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color9 = serializedObjectSupporter8.deserializeObjectColor46();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter8.deserializeObjectFaker157();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter8.deserializeObjectFaker166();
        com.github.javafaker.Company company12 = serializedObjectSupporter8.deserializeObjectCompany45();
        com.github.javafaker.Business business13 = serializedObjectSupporter8.deserializeObjectBusiness23();
        java.util.Locale locale14 = serializedObjectSupporter8.deserializeObjectLocale74();
        java.lang.String str15 = locale7.getDisplayLanguage(locale14);
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(company12);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        com.github.javafaker.Options options3 = serializedObjectSupporter0.deserializeObjectOptions7();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany28();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(options3);
        org.junit.Assert.assertNull(company4);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService45();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker80();
        com.github.javafaker.Company company11 = serializedObjectSupporter0.deserializeObjectCompany22();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNull(faker10);
        org.junit.Assert.assertNull(company11);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(company9);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale113();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor13();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Finance finance2 = serializedObjectSupporter0.deserializeObjectFinance48();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem53();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker103();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber36();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(finance2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker69();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime17();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService26();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder7 = builder0.setExtension('u', "KOR");
        java.util.Locale.Builder builder9 = builder0.setLanguage("zh");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        com.github.javafaker.service.RandomService randomService9 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color10 = serializedObjectSupporter0.deserializeObjectColor51();
        com.github.javafaker.Book book11 = serializedObjectSupporter0.deserializeObjectBook20();
        com.github.javafaker.PhoneNumber phoneNumber12 = serializedObjectSupporter0.deserializeObjectPhoneNumber2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(randomService9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNull(book11);
        org.junit.Assert.assertNotNull(phoneNumber12);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        java.util.Random random12 = serializedObjectSupporter0.deserializeObjectRandom2();
        com.github.javafaker.PhoneNumber phoneNumber13 = serializedObjectSupporter0.deserializeObjectPhoneNumber28();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNotNull(random12);
        org.junit.Assert.assertNotNull(phoneNumber13);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook38();
        com.github.javafaker.service.FakeValuesService fakeValuesService6 = serializedObjectSupporter0.deserializeObjectFakeValuesService17();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance25();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode10();
        com.github.javafaker.Code code9 = serializedObjectSupporter0.deserializeObjectCode56();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime47();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(fakeValuesService6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(code9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService41();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime48();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(dateAndTime8);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany45();
        com.github.javafaker.Business business5 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime58();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(dateAndTime6);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions49();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber31();
        com.github.javafaker.Number number6 = serializedObjectSupporter0.deserializeObjectNumber47();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness21();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Options options9 = serializedObjectSupporter0.deserializeObjectOptions31();
        com.github.javafaker.Code code10 = serializedObjectSupporter0.deserializeObjectCode6();
        com.github.javafaker.Business business11 = serializedObjectSupporter0.deserializeObjectBusiness2();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertNotNull(business11);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook30();
        com.github.javafaker.Book book4 = serializedObjectSupporter0.deserializeObjectBook17();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNull(book4);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker147();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook30();
        com.github.javafaker.Options options4 = serializedObjectSupporter0.deserializeObjectOptions42();
        com.github.javafaker.Company company5 = serializedObjectSupporter0.deserializeObjectCompany12();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNull(company5);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale78();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber10();
        com.github.javafaker.DateAndTime dateAndTime3 = serializedObjectSupporter0.deserializeObjectDateAndTime1();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber25();
        com.github.javafaker.DateAndTime dateAndTime5 = serializedObjectSupporter0.deserializeObjectDateAndTime12();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(dateAndTime3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(dateAndTime5);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Options options1 = serializedObjectSupporter0.deserializeObjectOptions33();
        com.github.javafaker.PhoneNumber phoneNumber2 = serializedObjectSupporter0.deserializeObjectPhoneNumber37();
        com.github.javafaker.service.FakeValuesService fakeValuesService3 = serializedObjectSupporter0.deserializeObjectFakeValuesService42();
        com.github.javafaker.service.RandomService randomService4 = serializedObjectSupporter0.deserializeObjectRandomService1();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor46();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber15();
        com.github.javafaker.Code code8 = serializedObjectSupporter0.deserializeObjectCode4();
        org.junit.Assert.assertNotNull(options1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(fakeValuesService3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setRegion("");
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("zho");
        java.util.Locale.Builder builder6 = builder0.clear();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        java.util.Locale.Builder builder8 = builder6.setLocale(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setRegion("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService48();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale33();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber19();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber53();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService41();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber52();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany36();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook47();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService4();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale115();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNull(company7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Book book3 = serializedObjectSupporter0.deserializeObjectBook2();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance15();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker49();
        com.github.javafaker.Company company6 = serializedObjectSupporter0.deserializeObjectCompany28();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNull(book3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(company6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.DateAndTime dateAndTime4 = serializedObjectSupporter0.deserializeObjectDateAndTime42();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker19();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook11();
        com.github.javafaker.Business business7 = serializedObjectSupporter0.deserializeObjectBusiness40();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(dateAndTime4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(business7);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Options options5 = serializedObjectSupporter0.deserializeObjectOptions1();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale42();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor2();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker114();
        java.util.Locale locale9 = serializedObjectSupporter0.deserializeObjectLocale51();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker149();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(options5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(faker8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en");
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany31();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany21();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance47();
        com.github.javafaker.Color color6 = serializedObjectSupporter0.deserializeObjectColor23();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker151();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(faker7);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayScript();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale1();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker151();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook35();
        com.github.javafaker.Lorem lorem7 = serializedObjectSupporter0.deserializeObjectLorem6();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(lorem7);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Number number1 = serializedObjectSupporter0.deserializeObjectNumber8();
        com.github.javafaker.DateAndTime dateAndTime2 = serializedObjectSupporter0.deserializeObjectDateAndTime51();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker163();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker143();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale16();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor26();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber54();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService46();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale27();
        org.junit.Assert.assertNotNull(number1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(number8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.service.FakeValuesService fakeValuesService4 = serializedObjectSupporter0.deserializeObjectFakeValuesService23();
        com.github.javafaker.Finance finance5 = serializedObjectSupporter0.deserializeObjectFinance17();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale69();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(fakeValuesService4);
        org.junit.Assert.assertNotNull(finance5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness36();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber29();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor19();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        java.util.Locale locale11 = serializedObjectSupporter0.deserializeObjectLocale6();
        com.github.javafaker.Code code12 = serializedObjectSupporter0.deserializeObjectCode26();
        com.github.javafaker.Faker faker13 = serializedObjectSupporter0.deserializeObjectFaker2();
        com.github.javafaker.Number number14 = serializedObjectSupporter0.deserializeObjectNumber59();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertNotNull(code12);
        org.junit.Assert.assertNull(faker13);
        org.junit.Assert.assertNotNull(number14);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode4();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber40();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode13();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker6();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem57();
        com.github.javafaker.PhoneNumber phoneNumber9 = serializedObjectSupporter0.deserializeObjectPhoneNumber34();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        com.github.javafaker.PhoneNumber phoneNumber10 = serializedObjectSupporter0.deserializeObjectPhoneNumber18();
        com.github.javafaker.Color color11 = serializedObjectSupporter0.deserializeObjectColor1();
        com.github.javafaker.Options options12 = serializedObjectSupporter0.deserializeObjectOptions48();
        java.util.Locale locale13 = serializedObjectSupporter0.deserializeObjectLocale7();
        com.github.javafaker.PhoneNumber phoneNumber14 = serializedObjectSupporter0.deserializeObjectPhoneNumber6();
        java.util.Locale locale15 = serializedObjectSupporter0.deserializeObjectLocale66();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(options12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en");
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker36();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNull(faker6);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance7();
        com.github.javafaker.Faker faker8 = serializedObjectSupporter0.deserializeObjectFaker16();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNull(faker8);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Random random2 = new java.util.Random(100L);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0, random2);
        double double4 = random2.nextDouble();
        java.util.stream.LongStream longStream5 = random2.longs();
        java.util.stream.DoubleStream doubleStream8 = random2.doubles((double) (byte) -1, (double) (short) 1);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7220096548596434d + "'", double4 == 0.7220096548596434d);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        java.util.Locale locale4 = serializedObjectSupporter0.deserializeObjectLocale53();
        com.github.javafaker.service.FakeValuesService fakeValuesService5 = serializedObjectSupporter0.deserializeObjectFakeValuesService31();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale37();
        com.github.javafaker.Number number7 = serializedObjectSupporter0.deserializeObjectNumber7();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en");
        org.junit.Assert.assertNotNull(fakeValuesService5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(number7);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        java.util.Locale locale1 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany56();
        com.github.javafaker.Company company3 = serializedObjectSupporter0.deserializeObjectCompany3();
        com.github.javafaker.PhoneNumber phoneNumber4 = serializedObjectSupporter0.deserializeObjectPhoneNumber47();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker16();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker137();
        com.github.javafaker.Color color7 = serializedObjectSupporter0.deserializeObjectColor30();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook49();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNull(company3);
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(book8);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker51();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance29();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker63();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale93();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions32();
        java.util.Locale locale8 = serializedObjectSupporter0.deserializeObjectLocale47();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en");
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        java.util.Locale locale7 = serializedObjectSupporter0.deserializeObjectLocale34();
        com.github.javafaker.DateAndTime dateAndTime8 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Faker faker9 = serializedObjectSupporter0.deserializeObjectFaker51();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNull(faker9);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Number number3 = serializedObjectSupporter0.deserializeObjectNumber51();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(number3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker54();
        com.github.javafaker.Number number4 = serializedObjectSupporter0.deserializeObjectNumber61();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber16();
        com.github.javafaker.Business business6 = serializedObjectSupporter0.deserializeObjectBusiness30();
        com.github.javafaker.Company company7 = serializedObjectSupporter0.deserializeObjectCompany1();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(number4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(business6);
        org.junit.Assert.assertNull(company7);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber26();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(phoneNumber5);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        com.github.javafaker.Faker faker3 = serializedObjectSupporter0.deserializeObjectFaker166();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance38();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker90();
        com.github.javafaker.Book book6 = serializedObjectSupporter0.deserializeObjectBook36();
        com.github.javafaker.Code code7 = serializedObjectSupporter0.deserializeObjectCode47();
        com.github.javafaker.Book book8 = serializedObjectSupporter0.deserializeObjectBook45();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany50();
        java.util.Locale locale10 = serializedObjectSupporter0.deserializeObjectLocale57();
        com.github.javafaker.Faker faker11 = serializedObjectSupporter0.deserializeObjectFaker172();
        com.github.javafaker.Faker faker12 = serializedObjectSupporter0.deserializeObjectFaker113();
        com.github.javafaker.Color color13 = serializedObjectSupporter0.deserializeObjectColor3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNull(faker3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNull(book6);
        org.junit.Assert.assertNotNull(code7);
        org.junit.Assert.assertNull(book8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertNull(faker11);
        org.junit.Assert.assertNull(faker12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.PhoneNumber phoneNumber5 = serializedObjectSupporter0.deserializeObjectPhoneNumber9();
        java.util.Random random6 = serializedObjectSupporter0.deserializeObjectRandom1();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService41();
        com.github.javafaker.Number number8 = serializedObjectSupporter0.deserializeObjectNumber21();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(random6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Business business9 = serializedObjectSupporter0.deserializeObjectBusiness48();
        com.github.javafaker.Faker faker10 = serializedObjectSupporter0.deserializeObjectFaker112();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(business9);
        org.junit.Assert.assertNull(faker10);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Lorem lorem3 = serializedObjectSupporter0.deserializeObjectLorem14();
        com.github.javafaker.service.RandomService randomService4 = serializedObjectSupporter0.deserializeObjectRandomService3();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor42();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(lorem3);
        org.junit.Assert.assertNotNull(randomService4);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.service.FakeValuesService fakeValuesService2 = serializedObjectSupporter0.deserializeObjectFakeValuesService19();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale60();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance58();
        com.github.javafaker.Color color5 = serializedObjectSupporter0.deserializeObjectColor29();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime57();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker123();
        com.github.javafaker.Finance finance8 = serializedObjectSupporter0.deserializeObjectFinance5();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(fakeValuesService2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(finance8);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale17();
        com.github.javafaker.DateAndTime dateAndTime6 = serializedObjectSupporter0.deserializeObjectDateAndTime24();
        com.github.javafaker.service.FakeValuesService fakeValuesService7 = serializedObjectSupporter0.deserializeObjectFakeValuesService15();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness38();
        com.github.javafaker.Lorem lorem9 = serializedObjectSupporter0.deserializeObjectLorem12();
        com.github.javafaker.Options options10 = serializedObjectSupporter0.deserializeObjectOptions4();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNotNull(dateAndTime6);
        org.junit.Assert.assertNotNull(fakeValuesService7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(lorem9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale117();
        com.github.javafaker.Company company4 = serializedObjectSupporter0.deserializeObjectCompany26();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook18();
        com.github.javafaker.PhoneNumber phoneNumber6 = serializedObjectSupporter0.deserializeObjectPhoneNumber48();
        com.github.javafaker.Faker faker7 = serializedObjectSupporter0.deserializeObjectFaker75();
        com.github.javafaker.service.FakeValuesService fakeValuesService8 = serializedObjectSupporter0.deserializeObjectFakeValuesService37();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNull(company4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNull(faker7);
        org.junit.Assert.assertNotNull(fakeValuesService8);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Faker faker2 = serializedObjectSupporter0.deserializeObjectFaker157();
        java.util.Locale locale3 = serializedObjectSupporter0.deserializeObjectLocale90();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode32();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker125();
        com.github.javafaker.Code code6 = serializedObjectSupporter0.deserializeObjectCode18();
        com.github.javafaker.Finance finance7 = serializedObjectSupporter0.deserializeObjectFinance22();
        com.github.javafaker.PhoneNumber phoneNumber8 = serializedObjectSupporter0.deserializeObjectPhoneNumber39();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(faker2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en");
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Finance finance4 = serializedObjectSupporter0.deserializeObjectFinance24();
        com.github.javafaker.Faker faker5 = serializedObjectSupporter0.deserializeObjectFaker152();
        com.github.javafaker.Options options6 = serializedObjectSupporter0.deserializeObjectOptions9();
        com.github.javafaker.PhoneNumber phoneNumber7 = serializedObjectSupporter0.deserializeObjectPhoneNumber11();
        com.github.javafaker.Business business8 = serializedObjectSupporter0.deserializeObjectBusiness15();
        com.github.javafaker.Company company9 = serializedObjectSupporter0.deserializeObjectCompany34();
        com.github.javafaker.DateAndTime dateAndTime10 = serializedObjectSupporter0.deserializeObjectDateAndTime3();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNull(faker5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNull(company9);
        org.junit.Assert.assertNotNull(dateAndTime10);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Book book2 = serializedObjectSupporter0.deserializeObjectBook14();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor34();
        com.github.javafaker.Business business4 = serializedObjectSupporter0.deserializeObjectBusiness23();
        com.github.javafaker.Number number5 = serializedObjectSupporter0.deserializeObjectNumber35();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(book2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(number5);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Business business2 = serializedObjectSupporter0.deserializeObjectBusiness18();
        com.github.javafaker.Business business3 = serializedObjectSupporter0.deserializeObjectBusiness28();
        com.github.javafaker.Faker faker4 = serializedObjectSupporter0.deserializeObjectFaker144();
        java.util.Locale locale5 = serializedObjectSupporter0.deserializeObjectLocale98();
        com.github.javafaker.Faker faker6 = serializedObjectSupporter0.deserializeObjectFaker61();
        com.github.javafaker.Options options7 = serializedObjectSupporter0.deserializeObjectOptions36();
        com.github.javafaker.Lorem lorem8 = serializedObjectSupporter0.deserializeObjectLorem19();
        com.github.javafaker.service.FakeValuesService fakeValuesService9 = serializedObjectSupporter0.deserializeObjectFakeValuesService9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(business2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNull(faker4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertNull(faker6);
        org.junit.Assert.assertNotNull(options7);
        org.junit.Assert.assertNotNull(lorem8);
        org.junit.Assert.assertNotNull(fakeValuesService9);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        com.github.javafaker.SerializedObjectSupporter serializedObjectSupporter0 = new com.github.javafaker.SerializedObjectSupporter();
        com.github.javafaker.Color color1 = serializedObjectSupporter0.deserializeObjectColor46();
        com.github.javafaker.Company company2 = serializedObjectSupporter0.deserializeObjectCompany59();
        com.github.javafaker.Color color3 = serializedObjectSupporter0.deserializeObjectColor11();
        com.github.javafaker.Code code4 = serializedObjectSupporter0.deserializeObjectCode22();
        com.github.javafaker.Book book5 = serializedObjectSupporter0.deserializeObjectBook61();
        java.util.Locale locale6 = serializedObjectSupporter0.deserializeObjectLocale9();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(company2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(code4);
        org.junit.Assert.assertNull(book5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }
}
