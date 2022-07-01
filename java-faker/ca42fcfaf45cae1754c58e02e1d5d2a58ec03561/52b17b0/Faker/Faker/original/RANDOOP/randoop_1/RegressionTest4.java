import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleAttributes();
        java.util.Locale.FilteringMode filteringMode27 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26, filteringMode27);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap29 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList30 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap29);
        java.util.Locale locale31 = java.util.Locale.CHINESE;
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = locale32.getScript();
        java.lang.String str34 = locale32.getDisplayCountry();
        java.lang.String str35 = locale32.toLanguageTag();
        java.util.Locale locale36 = locale32.stripExtensions();
        java.lang.String str37 = locale31.getDisplayName(locale32);
        java.util.Set<java.lang.String> strSet38 = locale32.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList40 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet38, filteringMode39);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(locale25);
// flaky:         org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + filteringMode27 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode27.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeList30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Cina" + "'", str34, "Cina");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "zh-CN" + "'", str35, "zh-CN");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u4e2d\u6587" + "'", str37, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList40);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.util.Random random14 = new java.util.Random();
        java.util.stream.IntStream intStream15 = random14.ints();
        java.util.stream.LongStream longStream18 = random14.longs((long) 1, (long) 100);
        boolean boolean19 = random14.nextBoolean();
        java.util.stream.DoubleStream doubleStream23 = random14.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream27 = random14.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream29 = random14.longs((long) (short) 0);
        java.util.stream.DoubleStream doubleStream30 = random14.doubles();
        java.util.stream.LongStream longStream32 = random14.longs(5689803982665130262L);
        com.github.javafaker.Faker faker33 = new com.github.javafaker.Faker(locale1, random14);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = random14.nextInt((-1881330214));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cinese" + "'", str4, "cinese");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleStream23);
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(longStream29);
        org.junit.Assert.assertNotNull(doubleStream30);
        org.junit.Assert.assertNotNull(longStream32);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("taiwan");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("CHN", strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList12, filteringMode14);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList36, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = locale55.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.lang.String str60 = locale59.toLanguageTag();
        java.util.Locale locale61 = locale59.stripExtensions();
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale62);
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale66 = java.util.Locale.UK;
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.getScript();
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale52, locale53, locale54, locale57, locale58, locale61, locale62, locale64, locale66, locale67, locale70 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet78 = locale77.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet79 = locale77.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode80 = null;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet79, filteringMode80);
        java.lang.String str82 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet79);
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet85 = locale83.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet85);
        java.util.Locale.Builder builder87 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder88 = builder87.clear();
        java.util.Locale locale89 = builder88.build();
        java.util.Locale locale90 = java.util.Locale.CHINA;
        java.lang.String str91 = locale90.getVariant();
        java.util.Locale.Builder builder92 = builder88.setLocale(locale90);
        java.util.Locale.Builder builder94 = builder92.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale locale95 = builder94.build();
        java.util.Set<java.lang.String> strSet96 = locale95.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList97 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet96);
        java.lang.String str98 = java.util.Locale.lookupTag(languageRangeList1, (java.util.Collection<java.lang.String>) strSet96);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "zh-CN" + "'", str60, "zh-CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh-CN" + "'", str65, "zh-CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh-CN" + "'", str68, "zh-CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(locale89);
        org.junit.Assert.assertEquals(locale89.toString(), "");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(locale95);
        org.junit.Assert.assertEquals(locale95.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet96);
        org.junit.Assert.assertNotNull(strList97);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        java.util.Locale locale7 = null;
        java.lang.String str8 = null; // flaky: locale3.getDisplayScript(locale7);
        java.lang.String str9 = locale3.getDisplayScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Color color18 = faker17.color();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleKeys();
        java.lang.String str6 = locale0.getDisplayName();
        java.lang.String str7 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str6, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        double double5 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8251257542452275d + "'", double2 == 0.8251257542452275d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.957579974456909d + "'", double5 == 0.957579974456909d);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles((long) 216977560);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder10 = builder7.clearExtensions();
        java.util.Locale.Builder builder12 = builder7.removeUnicodeLocaleAttribute("France");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder14 = builder7.setScript("\uc774\ud0c8\ub9ac\uc544\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ??????????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale9 = locale2.stripExtensions();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        java.util.Locale locale12 = builder1.build();
        java.util.Locale.Builder builder14 = builder1.setLanguageTag("CAN");
        java.util.Locale.Builder builder16 = builder1.addUnicodeLocaleAttribute("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder1.setUnicodeLocaleKeyword("\u53f0\u7063", "French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder2.addUnicodeLocaleAttribute("zh-TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: zh-TW [at index 0]");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        java.util.stream.IntStream intStream14 = random1.ints(0L);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str16 = locale15.getDisplayLanguage();
        java.util.Locale.setDefault(locale15);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale15);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale19.getCountry();
        java.lang.String str21 = locale19.toLanguageTag();
        java.lang.String str22 = locale19.getLanguage();
        java.lang.String str23 = locale15.getDisplayName(locale19);
        java.util.Random random24 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream27 = random24.doubles((double) (byte) 0, (double) '#');
        double double28 = random24.nextGaussian();
        java.util.stream.DoubleStream doubleStream29 = random24.doubles();
        double double30 = random24.nextDouble();
        java.util.stream.IntStream intStream34 = random24.ints(100L, (-1), (int) (byte) 0);
        double double35 = random24.nextGaussian();
        java.util.stream.IntStream intStream36 = random24.ints();
        java.util.stream.LongStream longStream37 = random24.longs();
        random24.setSeed(100L);
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale19, random24);
        java.util.Random random41 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream44 = random41.doubles((double) (byte) 0, (double) '#');
        double double45 = random41.nextGaussian();
        java.util.stream.DoubleStream doubleStream46 = random41.doubles();
        double double47 = random41.nextDouble();
        java.util.Random random48 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream51 = random48.doubles((double) (byte) 0, (double) '#');
        double double52 = random48.nextGaussian();
        java.util.stream.DoubleStream doubleStream53 = random48.doubles();
        java.util.stream.IntStream intStream56 = random48.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker57 = new com.github.javafaker.Faker(random48);
        java.util.stream.LongStream longStream58 = random48.longs();
        java.util.Random random59 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream62 = random59.doubles((double) (byte) 0, (double) '#');
        double double63 = random59.nextGaussian();
        java.util.stream.DoubleStream doubleStream64 = random59.doubles();
        java.util.stream.IntStream intStream67 = random59.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream68 = random59.doubles();
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random59.nextBytes(byteArray72);
        random48.nextBytes(byteArray72);
        random41.nextBytes(byteArray72);
        random24.nextBytes(byteArray72);
        random1.nextBytes(byteArray72);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.13308561723611634d + "'", double11 == 0.13308561723611634d);
        org.junit.Assert.assertNotNull(intStream14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GB" + "'", str20, "GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "en-GB" + "'", str21, "en-GB");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinese (Taiwan)" + "'", str23, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream27);
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.5713497244015812d) + "'", double28 == (-0.5713497244015812d));
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.4179613944453283d + "'", double30 == 0.4179613944453283d);
        org.junit.Assert.assertNotNull(intStream34);
// flaky:         org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.009731887694409d + "'", double35 == 1.009731887694409d);
        org.junit.Assert.assertNotNull(intStream36);
        org.junit.Assert.assertNotNull(longStream37);
        org.junit.Assert.assertNotNull(doubleStream44);
// flaky:         org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.22078617485094557d) + "'", double45 == (-0.22078617485094557d));
        org.junit.Assert.assertNotNull(doubleStream46);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.1748204234333316d + "'", double47 == 0.1748204234333316d);
        org.junit.Assert.assertNotNull(doubleStream51);
// flaky:         org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.7680547810070645d + "'", double52 == 0.7680547810070645d);
        org.junit.Assert.assertNotNull(doubleStream53);
        org.junit.Assert.assertNotNull(intStream56);
        org.junit.Assert.assertNotNull(longStream58);
        org.junit.Assert.assertNotNull(doubleStream62);
// flaky:         org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.3934193007055253d + "'", double63 == 0.3934193007055253d);
        org.junit.Assert.assertNotNull(doubleStream64);
        org.junit.Assert.assertNotNull(intStream67);
        org.junit.Assert.assertNotNull(doubleStream68);
        org.junit.Assert.assertNotNull(byteArray72);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[88, -112, -63]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long14 = random0.nextLong();
        java.util.stream.LongStream longStream15 = random0.longs();
        long long16 = random0.nextLong();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2943087432386090193L + "'", long14 == 2943087432386090193L);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8798739376365725895L + "'", long16 == 8798739376365725895L);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        java.util.Locale.Builder builder9 = builder5.setVariant("anglais");
        java.util.Locale.Builder builder11 = builder9.setScript("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder13 = builder11.setRegion("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale10.getScript();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale4.getDisplayName(locale10);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale16.getDisplayVariant(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale20.getDisplayName(locale23);
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = locale23.getISO3Language();
        java.lang.String str27 = locale10.getDisplayLanguage(locale23);
        java.lang.String str29 = locale10.getExtension('u');
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u97d3\u6587" + "'", str15, "\u97d3\u6587");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u570b" + "'", str21, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese (China)" + "'", str24, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Franz\366sisch (Kanada)", (double) 4141605534691042142L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.1416055346910423E18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Address address6 = faker4.address();
        com.github.javafaker.Company company7 = faker4.company();
        com.github.javafaker.PhoneNumber phoneNumber8 = faker4.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(company7);
        org.junit.Assert.assertNotNull(phoneNumber8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("zh");
        com.github.javafaker.Lorem lorem12 = faker3.lorem();
        com.github.javafaker.Hacker hacker13 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertNotNull(lorem12);
        org.junit.Assert.assertNotNull(hacker13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getDisplayCountry();
        java.lang.String str9 = locale5.getDisplayScript();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getScript();
        java.lang.String str14 = locale5.getDisplayName(locale10);
        java.util.Locale locale15 = java.util.Locale.UK;
        java.lang.String str16 = locale15.getCountry();
        java.lang.String str17 = locale15.toLanguageTag();
        java.lang.String str18 = locale15.getVariant();
        java.lang.String str19 = locale15.toLanguageTag();
        java.lang.String str20 = locale10.getDisplayScript(locale15);
        java.util.Set<java.lang.Character> charSet21 = locale15.getExtensionKeys();
        java.lang.String str22 = locale15.getScript();
        java.lang.String str23 = locale0.getDisplayName(locale15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u570b" + "'", str7, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u570b" + "'", str8, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u570b" + "'", str12, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GB" + "'", str16, "GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en-GB" + "'", str19, "en-GB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinese (China)" + "'", str23, "Chinese (China)");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587");
        java.lang.String str2 = locale1.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet3 = locale1.getExtensionKeys();
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str7 = locale5.getDisplayLanguage();
        boolean boolean8 = locale1.equals((java.lang.Object) locale5);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587" + "'", str6, "\u6cd5\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587" + "'", str7, "\u6cd5\u6587");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        java.lang.String str5 = faker0.bothify("\u4e2d\u56fd");
        com.github.javafaker.Number number6 = faker0.number();
        com.github.javafaker.App app7 = faker0.app();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(app7);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = locale4.getDisplayName();
        java.lang.String str10 = locale4.getDisplayLanguage();
        java.lang.String str11 = locale4.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u570b" + "'", str5, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str9, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587" + "'", str10, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh_CN" + "'", str11, "zh_CN");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        double double15 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random11.doubles();
        java.util.stream.IntStream intStream19 = random11.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream20 = random11.doubles();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random11.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.LongStream longStream27 = random0.longs();
        int int28 = random0.nextInt();
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = faker29.resolve("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9792723458844871d + "'", double4 == 0.9792723458844871d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6171915771778888d + "'", double15 == 0.6171915771778888d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-107, -112, -46]");
        org.junit.Assert.assertNotNull(longStream27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1393951382) + "'", int28 == (-1393951382));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale0.getUnicodeLocaleType("\u6cd5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Code code11 = faker10.code();
        com.github.javafaker.Color color12 = faker10.color();
        com.github.javafaker.PhoneNumber phoneNumber13 = faker10.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(phoneNumber13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.IntStream intStream5 = random0.ints(10L);
        double double6 = random0.nextDouble();
        int int8 = random0.nextInt(1638965069);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1002479776165969d) + "'", double2 == (-0.1002479776165969d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.32438476436871366d + "'", double6 == 0.32438476436871366d);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 571759387 + "'", int8 == 571759387);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setScript("de-DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: de-DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("CN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap4);
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.lang.String str7 = locale6.getVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale6);
        java.util.Set<java.lang.String> strSet9 = locale6.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags(languageRangeList5, (java.util.Collection<java.lang.String>) strSet9);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale0.getUnicodeLocaleType("ko");
        java.lang.String str3 = locale0.getScript();
        java.lang.String str5 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale8.toLanguageTag();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream15 = random0.longs((long) (short) 0);
        double double16 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-0.9418461176995775d) + "'", double16 == (-0.9418461176995775d));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale.setDefault(locale18);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale18);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale22.toLanguageTag();
        java.lang.String str25 = locale22.getLanguage();
        java.lang.String str26 = locale18.getDisplayName(locale22);
        java.lang.String str27 = locale11.getDisplayScript(locale22);
        java.util.Locale locale28 = locale11.stripExtensions();
        java.lang.String str29 = locale11.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (Taiwan)" + "'", str14, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GB" + "'", str23, "GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-GB" + "'", str24, "en-GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese (Taiwan)" + "'", str26, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.IntStream intStream16 = random0.ints(4668688544456269390L);
        java.util.stream.DoubleStream doubleStream18 = random0.doubles(637006123862331954L);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = random0.nextInt((-1040156708));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.6126778558589674d + "'", double4 == 1.6126778558589674d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.820236678872502d + "'", double6 == 0.820236678872502d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.8792859060669416d) + "'", double11 == (-0.8792859060669416d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale locale4 = locale0.stripExtensions();
        java.lang.String str5 = locale0.getVariant();
        boolean boolean7 = locale0.equals((java.lang.Object) 0.73096776f);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale6);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u570b" + "'", str4, "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str5, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.util.Locale.setDefault(locale2);
        java.util.Locale locale5 = locale2.stripExtensions();
        java.lang.String str6 = locale5.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale0.getDisplayScript(locale9);
        java.lang.String str12 = locale9.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinesisch" + "'", str1, "Chinesisch");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (Taiwan)" + "'", str8, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ko-KR" + "'", str10, "ko-KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u97d3\u6587\u5357\u97d3)" + "'", str12, "\u97d3\u6587\u5357\u97d3)");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u6cd5\u6587\u52a0\u62ff\u5927", (-2.0571482941989285d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-2.0571482941989285");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.getDefault(category0);
        java.util.Locale locale6 = new java.util.Locale("fran\347ais");
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale10 = new java.util.Locale("English", "fran\347ais (Canada)");
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale12.getDisplayName();
        java.lang.String str14 = locale12.getVariant();
        java.util.Locale.setDefault(category0, locale12);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals(locale6.toString(), "fran\347ais");
        org.junit.Assert.assertEquals(locale10.toString(), "english_FRAN\347AIS (CANADA)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str13, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        double double12 = random8.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random8.doubles();
        java.util.stream.IntStream intStream16 = random8.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = random8.doubles();
        long long18 = random8.nextLong();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale7, random8);
        java.util.stream.LongStream longStream21 = random8.longs((long) 1272557603);
        double double22 = random8.nextGaussian();
        java.util.stream.LongStream longStream23 = random8.longs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream26 = random8.longs(5271697340533654850L, (-48397131539201648L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u53f0\u7063" + "'", str6, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.560564024633873d) + "'", double12 == (-0.560564024633873d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3465067998196619639L + "'", long18 == 3465067998196619639L);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.38797598907501335d + "'", double22 == 0.38797598907501335d);
        org.junit.Assert.assertNotNull(longStream23);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587", 0.3805888390976703d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.Random random1 = new java.util.Random((long) (byte) 0);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Book book3 = faker2.book();
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        int int8 = random0.nextInt((int) (short) 1);
        long long9 = random0.nextLong();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random0);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5900502852199868d + "'", double4 == 0.5900502852199868d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-6208724237938652390L) + "'", long9 == (-6208724237938652390L));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayCountry();
        java.lang.String str14 = locale10.getDisplayName();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = builder9.setLocale(locale10);
        java.lang.String str17 = locale2.getDisplayScript(locale10);
        java.lang.String str18 = locale2.getLanguage();
        java.util.Set<java.lang.String> strSet19 = locale2.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u570b" + "'", str12, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u570b" + "'", str13, "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u570b)" + "'", str14, "\u4e2d\u6587\u4e2d\u570b)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        java.util.Locale locale10 = builder7.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        java.lang.String str3 = faker0.letterify("zho");
        java.lang.String str5 = faker0.letterify("zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str5, "zh-cn (CHINESISCH (CHINA))");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Number number9 = faker3.number();
        com.github.javafaker.Options options10 = faker3.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(options10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.regexify("French (Canada)");
        com.github.javafaker.Book book8 = faker3.book();
        com.github.javafaker.PhoneNumber phoneNumber9 = faker3.phoneNumber();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French Canada" + "'", str7, "French Canada");
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertNotNull(phoneNumber9);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        java.util.Locale.Builder builder8 = builder0.setLanguageTag("CAN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setVariant("\u7f8e\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        random0.setSeed((long) 352608531);
        java.util.stream.IntStream intStream11 = random0.ints((-1227287091), 176374748);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9714523897715346d + "'", double4 == 0.9714523897715346d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6450027449199085516L + "'", long5 == 6450027449199085516L);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Internet internet2 = faker1.internet();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        com.github.javafaker.Color color4 = faker1.color();
        com.github.javafaker.Internet internet5 = faker1.internet();
        com.github.javafaker.Lorem lorem6 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(internet2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(internet5);
        org.junit.Assert.assertNotNull(lorem6);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.util.Random random1 = new java.util.Random(8557027715680151209L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream14 = random0.longs((long) (short) -1, 5438035133075299180L);
        java.util.stream.LongStream longStream16 = random0.longs(0L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.48872269001749424d + "'", double4 == 0.48872269001749424d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream16);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        com.github.javafaker.Business business8 = faker3.business();
        com.github.javafaker.Number number9 = faker3.number();
        com.github.javafaker.Finance finance10 = faker3.finance();
        com.github.javafaker.Finance finance11 = faker3.finance();
        com.github.javafaker.Options options12 = faker3.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertNotNull(business8);
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(finance10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Options options2 = faker0.options();
        com.github.javafaker.Color color3 = faker0.color();
        com.github.javafaker.Number number4 = faker0.number();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(options2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(number4);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.IntStream intStream16 = random6.ints(3376856765316790501L, 0, (int) 'x');
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random6);
        java.util.stream.LongStream longStream18 = random6.longs();
        java.util.Random random19 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream22 = random19.doubles((double) (byte) 0, (double) '#');
        double double23 = random19.nextGaussian();
        java.util.stream.DoubleStream doubleStream24 = random19.doubles();
        double double25 = random19.nextDouble();
        java.util.Random random26 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream29 = random26.doubles((double) (byte) 0, (double) '#');
        double double30 = random26.nextGaussian();
        java.util.stream.DoubleStream doubleStream31 = random26.doubles();
        java.util.stream.IntStream intStream34 = random26.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(random26);
        java.util.stream.LongStream longStream36 = random26.longs();
        java.util.Random random37 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles((double) (byte) 0, (double) '#');
        double double41 = random37.nextGaussian();
        java.util.stream.DoubleStream doubleStream42 = random37.doubles();
        java.util.stream.IntStream intStream45 = random37.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream46 = random37.doubles();
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random37.nextBytes(byteArray50);
        random26.nextBytes(byteArray50);
        random19.nextBytes(byteArray50);
        random6.nextBytes(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream58 = random6.longs((long) 2078819689, (long) (-1248874590), (-2506914755829807295L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (Taiwan)" + "'", str4, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(longStream18);
        org.junit.Assert.assertNotNull(doubleStream22);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9219630484060056d + "'", double23 == 0.9219630484060056d);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.15164617442034722d + "'", double25 == 0.15164617442034722d);
        org.junit.Assert.assertNotNull(doubleStream29);
// flaky:         org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.5759923705634964d) + "'", double30 == (-1.5759923705634964d));
        org.junit.Assert.assertNotNull(doubleStream31);
        org.junit.Assert.assertNotNull(intStream34);
        org.junit.Assert.assertNotNull(longStream36);
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.44234419914601364d + "'", double41 == 0.44234419914601364d);
        org.junit.Assert.assertNotNull(doubleStream42);
        org.junit.Assert.assertNotNull(intStream45);
        org.junit.Assert.assertNotNull(doubleStream46);
        org.junit.Assert.assertNotNull(byteArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[60, -50, -55]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.getDisplayVariant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale12.toLanguageTag();
        java.lang.String str15 = locale12.getLanguage();
        java.lang.String str16 = locale12.getDisplayLanguage();
        java.lang.String str17 = locale12.toLanguageTag();
        java.util.Locale.setDefault(category0, locale12);
        java.util.Locale locale19 = java.util.Locale.getDefault(category0);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.util.Locale locale23 = java.util.Locale.CHINA;
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale23.getScript();
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str29 = locale23.getDisplayLanguage(locale27);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale30.getVariant();
        java.lang.String str32 = locale23.getDisplayVariant(locale30);
        java.util.Locale locale36 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str37 = locale23.getDisplayName(locale36);
        java.lang.String str38 = locale22.getDisplayVariant(locale23);
        java.util.Locale.setDefault(category0, locale22);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u570b" + "'", str4, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u570b" + "'", str5, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GB" + "'", str13, "GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "en" + "'", str15, "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u6587" + "'", str16, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "en-GB" + "'", str17, "en-GB");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr-CA" + "'", str21, "fr-CA");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587" + "'", str29, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertEquals(locale36.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Chinese (China)" + "'", str37, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Lorem lorem6 = faker3.lorem();
        com.github.javafaker.Book book7 = faker3.book();
        com.github.javafaker.Code code8 = faker3.code();
        com.github.javafaker.DateAndTime dateAndTime9 = faker3.date();
        java.lang.String str11 = faker3.bothify("ita");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(lorem6);
        org.junit.Assert.assertNotNull(book7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ita" + "'", str11, "ita");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.getCountry();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale1.getISO3Country();
        java.lang.String str5 = locale1.toLanguageTag();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CHN" + "'", str4, "CHN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "USA" + "'", str1, "USA");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.lang.String str8 = faker6.letterify("fra");
        com.github.javafaker.Number number9 = faker6.number();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker6.phoneNumber();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7605875466611283d) + "'", double2 == (-0.7605875466611283d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1854196926056642962L) + "'", long4 == (-1854196926056642962L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.2595492334204104d + "'", double5 == 2.2595492334204104d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fra" + "'", str8, "fra");
        org.junit.Assert.assertNotNull(number9);
        org.junit.Assert.assertNotNull(phoneNumber10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('#', "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.IntStream intStream6 = random5.ints();
        java.util.stream.LongStream longStream9 = random5.longs((long) 1, (long) 100);
        boolean boolean10 = random5.nextBoolean();
        java.util.stream.DoubleStream doubleStream14 = random5.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double15 = random5.nextDouble();
        double double16 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream17 = random5.doubles();
        double double18 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream19 = random5.doubles();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale2, random5);
        boolean boolean21 = locale2.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9074809902329058d + "'", double15 == 0.9074809902329058d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.29230786093326433d + "'", double16 == 0.29230786093326433d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0888869785831411d + "'", double18 == 0.0888869785831411d);
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) 383222448, 0.0d, (double) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles();
        int int13 = random0.nextInt(685563167);
        java.util.stream.LongStream longStream14 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.8529186372004068d) + "'", double4 == (-0.8529186372004068d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 8091548769161640202L + "'", long5 == 8091548769161640202L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8047277f + "'", float6 == 0.8047277f);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 540503325 + "'", int13 == 540503325);
        org.junit.Assert.assertNotNull(longStream14);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        java.lang.String str9 = faker3.bothify("zh-CN");
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        com.github.javafaker.Finance finance11 = faker3.finance();
        com.github.javafaker.Finance finance12 = faker3.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertNotNull(finance12);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.IntStream intStream15 = random0.ints(1272557603, 1824728183);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream19 = random0.ints((long) 1272557603, 505847642, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0327735704730583d) + "'", double4 == (-1.0327735704730583d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5008983603771936d) + "'", double11 == (-0.5008983603771936d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getCountry();
        java.lang.String str2 = locale0.toLanguageTag();
        java.lang.String str3 = locale0.getVariant();
        java.lang.String str4 = locale0.toLanguageTag();
        java.lang.String str5 = locale0.getISO3Country();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale0);
        java.lang.Object obj8 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GB" + "'", str1, "GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-GB" + "'", str2, "en-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en-GB" + "'", str4, "en-GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GBR" + "'", str5, "GBR");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "en_GB");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.getISO3Language();
        java.lang.String str4 = locale1.getExtension('a');
        java.lang.Object obj5 = locale1.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eng" + "'", str2, "eng");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "en_GB");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "en_GB");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "en_GB");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles(0.0d, 0.3092635852231792d);
        double double7 = random0.nextDouble();
        java.util.stream.IntStream intStream11 = random0.ints((long) 1790226314, (-728403410), 64845235);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2195806008182741d) + "'", double2 == (-0.2195806008182741d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2050118064676586d + "'", double7 == 0.2050118064676586d);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder6.setRegion("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Locale locale3 = new java.util.Locale("", "\u7fa9\u5927\u5229\u6587", "\u5fb7\u6587");
        java.lang.String str4 = locale3.getLanguage();
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleKeys();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u7fa9\u5927\u5229\u6587\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.lang.String str8 = locale5.getScript();
        java.lang.String str9 = locale0.getDisplayName(locale5);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale10.getCountry();
        java.lang.String str12 = locale10.toLanguageTag();
        java.lang.String str13 = locale10.getVariant();
        java.lang.String str14 = locale10.toLanguageTag();
        java.lang.String str15 = locale5.getDisplayScript(locale10);
        java.util.Set<java.lang.Character> charSet16 = locale10.getExtensionKeys();
        java.lang.String str17 = locale10.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "China" + "'", str7, "China");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str9, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GB" + "'", str11, "GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en-GB" + "'", str12, "en-GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(charSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GBR" + "'", str17, "GBR");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        float float10 = random0.nextFloat();
        double double11 = random0.nextGaussian();
        long long12 = random0.nextLong();
        float float13 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs((-992460362189845646L), 6604187400076253514L, (long) 792642830);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.4964562152273733d) + "'", double4 == (-1.4964562152273733d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.08979553f + "'", float10 == 0.08979553f);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.6229984629905343d + "'", double11 == 0.6229984629905343d);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-8046563526255314818L) + "'", long12 == (-8046563526255314818L));
// flaky:         org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.517705f + "'", float13 == 0.517705f);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setVariant("\u97d3\u6587\u5357\u97d3)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("English (United States)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(unitedstates)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Lorem lorem5 = faker4.lorem();
        com.github.javafaker.Color color6 = faker4.color();
        com.github.javafaker.Color color7 = faker4.color();
        java.lang.String str9 = faker4.letterify("South Korea");
        com.github.javafaker.Company company10 = faker4.company();
        com.github.javafaker.Code code11 = faker4.code();
        com.github.javafaker.Hacker hacker12 = faker4.hacker();
        com.github.javafaker.Business business13 = faker4.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str3, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "South Korea" + "'", str9, "South Korea");
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(business13);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime5 = faker4.date();
        java.lang.String str7 = faker4.letterify("GBR");
        com.github.javafaker.Address address8 = faker4.address();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GBR" + "'", str7, "GBR");
        org.junit.Assert.assertNotNull(address8);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale9.getDisplayLanguage(locale13);
        java.lang.String str16 = locale13.getScript();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale0.getDisplayName(locale13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number20 = faker19.number();
        com.github.javafaker.Color color21 = faker19.color();
        com.github.javafaker.Options options22 = faker19.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str8, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese (China)" + "'", str18, "Chinese (China)");
        org.junit.Assert.assertNotNull(number20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(options22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale locale6 = builder5.build();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale8.getISO3Language();
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale locale13 = locale11.stripExtensions();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getDisplayCountry();
        java.lang.String str17 = locale11.getDisplayVariant(locale15);
        java.lang.String str18 = locale8.getDisplayScript(locale15);
        java.util.Locale locale19 = locale8.stripExtensions();
        java.lang.String str20 = locale6.getDisplayLanguage(locale19);
        java.lang.String str21 = locale6.getVariant();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "kor" + "'", str10, "kor");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints(7975027329722967446L);
        java.util.stream.DoubleStream doubleStream15 = random0.doubles((-0.863637277266428d), 2.4362021770009714d);
        long long16 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.6394654417488594d) + "'", double4 == (-0.6394654417488594d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.1276670819077128d) + "'", double10 == (-1.1276670819077128d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 8542312139775082004L + "'", long16 == 8542312139775082004L);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.util.Locale locale1 = new java.util.Locale("\uc911\uad6d\uc5b4\ub300\ub9cc)");
        java.lang.String str2 = locale1.getDisplayName();
        org.junit.Assert.assertEquals(locale1.toString(), "\uc911\uad6d\uc5b4\ub300\ub9cc)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc911\uad6d\uc5b4\ub300\ub9cc)" + "'", str2, "\uc911\uad6d\uc5b4\ub300\ub9cc)");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles((double) 216977560, (double) 8201082619402513103L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.27525095155740653d + "'", double4 == 0.27525095155740653d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream15 = random0.doubles(0.9429242861759843d, 1.1210334075853046d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5903172551026371d) + "'", double4 == (-0.5903172551026371d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream15);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        java.util.Locale.Builder builder9 = builder5.setVariant("anglais");
        java.util.Locale.Builder builder11 = builder9.setScript("");
        java.util.Locale.Builder builder13 = builder9.setVariant("coreano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder9.setExtension('4', "Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder6 = builder4.setVariant("");
        java.util.Locale.Builder builder8 = builder4.setLanguage("");
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = locale11.getDisplayName();
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.getDefault(category13);
        java.lang.String str15 = locale11.getDisplayLanguage(locale14);
        java.util.Random random16 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream19 = random16.doubles((double) (byte) 0, (double) '#');
        double double20 = random16.nextGaussian();
        java.util.stream.DoubleStream doubleStream21 = random16.doubles();
        double double22 = random16.nextDouble();
        java.util.stream.IntStream intStream26 = random16.ints(100L, (-1), (int) (byte) 0);
        double double27 = random16.nextGaussian();
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale11, random16);
        java.lang.String str29 = locale10.getDisplayName(locale11);
        java.lang.String str30 = locale10.getScript();
        java.lang.String str31 = locale1.getDisplayLanguage(locale10);
        java.util.Locale.Builder builder32 = new java.util.Locale.Builder();
        java.util.Locale locale33 = builder32.build();
        java.util.Locale.Builder builder34 = builder32.clear();
        java.util.Locale locale35 = builder34.build();
        java.lang.String str36 = locale35.getDisplayName();
        java.lang.String str37 = locale35.getDisplayCountry();
        java.lang.String str38 = locale35.getDisplayVariant();
        java.lang.String str39 = locale35.getDisplayScript();
        java.lang.String str40 = locale35.getISO3Language();
        java.lang.String str41 = locale1.getDisplayName(locale35);
        java.lang.String str42 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "French (Canada)" + "'", str12, "French (Canada)");
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "French" + "'", str15, "French");
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.286339208210935d) + "'", double20 == (-1.286339208210935d));
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9182955446213673d + "'", double22 == 0.9182955446213673d);
        org.junit.Assert.assertNotNull(intStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08420997272020382d + "'", double27 == 0.08420997272020382d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese" + "'", str31, "Chinese");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Chinese (China)" + "'", str41, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "CHN" + "'", str42, "CHN");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u56fd");
        java.util.Locale locale3 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str4 = locale1.getDisplayLanguage(locale3);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream7 = random0.ints();
        random0.setSeed((-289425093418369874L));
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.27707973949453013d + "'", double2 == 0.27707973949453013d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-7370314258419351782L) + "'", long4 == (-7370314258419351782L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-0.852296017032781d) + "'", double5 == (-0.852296017032781d));
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.util.Locale locale1 = new java.util.Locale("\u82f1\u6587\u7f8e\u56fd)");
        org.junit.Assert.assertEquals(locale1.toString(), "\u82f1\u6587\u7f8e\u56fd)");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.util.Random random1 = new java.util.Random((-2715822492754316906L));
        int int3 = random1.nextInt(94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        double double13 = random0.nextDouble();
        java.util.Random random14 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream17 = random14.doubles((double) (byte) 0, (double) '#');
        double double18 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream19 = random14.doubles();
        java.util.stream.LongStream longStream23 = random14.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream25 = random14.doubles(1133475767620805068L);
        java.util.Random random26 = new java.util.Random();
        java.util.stream.IntStream intStream27 = random26.ints();
        java.util.stream.LongStream longStream30 = random26.longs((long) 1, (long) 100);
        boolean boolean31 = random26.nextBoolean();
        java.util.stream.DoubleStream doubleStream33 = random26.doubles(0L);
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random26.nextBytes(byteArray37);
        random14.nextBytes(byteArray37);
        random0.nextBytes(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream42 = random0.longs((-8559505624165683602L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.922738340197202d + "'", double10 == 0.922738340197202d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.4161165637540777d + "'", double11 == 0.4161165637540777d);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9156945754031844d + "'", double13 == 0.9156945754031844d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.1777904172401594d) + "'", double18 == (-1.1777904172401594d));
        org.junit.Assert.assertNotNull(doubleStream19);
        org.junit.Assert.assertNotNull(longStream23);
        org.junit.Assert.assertNotNull(doubleStream25);
        org.junit.Assert.assertNotNull(intStream27);
        org.junit.Assert.assertNotNull(longStream30);
// flaky:         org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleStream33);
        org.junit.Assert.assertNotNull(byteArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[-122, -71, 126]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getScript();
        java.lang.String str10 = locale7.getDisplayCountry(locale8);
        java.lang.String str11 = locale4.getDisplayCountry(locale7);
        java.lang.String str12 = locale2.getDisplayScript(locale4);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale13);
        java.util.Random random18 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream21 = random18.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(random18);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale13, random18);
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.lang.String str25 = locale24.getVariant();
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        java.lang.String str27 = locale24.getDisplayName(locale26);
        boolean boolean28 = locale24.hasExtensions();
        java.lang.String str29 = locale13.getDisplayLanguage(locale24);
        java.lang.String str30 = locale4.getDisplayVariant(locale24);
        java.lang.String str31 = locale4.getISO3Country();
        java.lang.String str32 = locale4.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "French (Canada)" + "'", str1, "French (Canada)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u82f1\u56fd" + "'", str11, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str16, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str27, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "English" + "'", str29, "English");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GBR" + "'", str31, "GBR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.LongStream longStream9 = random0.longs((long) 'a', (long) 401882126);
        float float10 = random0.nextFloat();
        double double11 = random0.nextGaussian();
        long long12 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((long) 138015862, 7314277685815190040L, (-4297802166191359158L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.10928069765163201d) + "'", double4 == (-0.10928069765163201d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.044726253f + "'", float10 == 0.044726253f);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.07758732260172008d + "'", double11 == 0.07758732260172008d);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-4615798121995712192L) + "'", long12 == (-4615798121995712192L));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.lang.String str18 = locale11.getDisplayVariant();
        java.lang.String str19 = locale11.getCountry();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale11.getDisplayName(locale21);
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale24.getISO3Language();
        java.lang.String str28 = locale24.getDisplayLanguage();
        java.lang.String str29 = locale11.getDisplayLanguage(locale24);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str3, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str14, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "English" + "'", str16, "English");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GB" + "'", str19, "GB");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "English (United Kingdom)" + "'", str23, "English (United Kingdom)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese" + "'", str28, "Chinese");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u82f1\u6587" + "'", str29, "\u82f1\u6587");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Chinese", 0.6533317665942538d);
        double double3 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6533317665942538d + "'", double3 == 0.6533317665942538d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.Random random1 = new java.util.Random((-3019054096168434161L));
        java.util.stream.IntStream intStream2 = random1.ints();
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder3 = builder1.clear();
        java.util.Locale locale4 = builder1.build();
        java.util.Locale locale5 = builder1.build();
        java.util.Locale.Builder builder6 = builder1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder1.setExtension('x', "\u7fa9\u5927\u5229\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: ???? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        long long4 = random0.nextLong();
        java.util.stream.DoubleStream doubleStream8 = random0.doubles(1067457148952475140L, (-0.20754668089627434d), 0.3252228646145482d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3842822050640285343L) + "'", long4 == (-3842822050640285343L));
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.Hacker hacker6 = faker3.hacker();
        java.lang.String str8 = faker3.letterify("Chine");
        com.github.javafaker.Name name9 = faker3.name();
        com.github.javafaker.Book book10 = faker3.book();
        java.lang.String str12 = faker3.regexify("en");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(hacker6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chine" + "'", str8, "Chine");
        org.junit.Assert.assertNotNull(name9);
        org.junit.Assert.assertNotNull(book10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "en" + "'", str12, "en");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        com.github.javafaker.Company company6 = faker5.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        int int20 = random0.nextInt(383222448);
        java.util.stream.IntStream intStream24 = random0.ints((long) 65, (int) '#', 180995420);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream28 = random0.doubles((long) 383222448, 0.09955878232094262d, (-0.20570205772601152d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 282343484 + "'", int20 == 282343484);
        org.junit.Assert.assertNotNull(intStream24);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale4);
        java.util.Locale.Builder builder15 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder16 = builder15.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder15.setUnicodeLocaleKeyword("\u6cd5\u6587\u52a0\u62ff\u5927", "Royaume-Uni");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Englisch (Vereinigtes K\366nigreich)" + "'", str7, "Englisch (Vereinigtes K\366nigreich)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "French (Canada)" + "'", str10, "French (Canada)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Royaume-Uni" + "'", str13, "Royaume-Uni");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        double double7 = random3.nextGaussian();
        java.util.stream.IntStream intStream8 = random3.ints();
        double double9 = random3.nextDouble();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random3);
        java.util.stream.LongStream longStream13 = random3.longs(0L, (long) 1928882472);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\uc774\ud0c8\ub9ac\uc544\uc5b4" + "'", str2, "\uc774\ud0c8\ub9ac\uc544\uc5b4");
        org.junit.Assert.assertNotNull(doubleStream6);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7289899878301664d + "'", double7 == 0.7289899878301664d);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.806833096808003d + "'", double9 == 0.806833096808003d);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        random0.setSeed((-1840454305244486890L));
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        double double12 = random8.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random8.doubles();
        java.util.stream.IntStream intStream16 = random8.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = random8.doubles();
        long long18 = random8.nextLong();
        long long19 = random8.nextLong();
        java.util.stream.DoubleStream doubleStream20 = random8.doubles();
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 0, (double) '#');
        double double25 = random21.nextGaussian();
        java.util.stream.DoubleStream doubleStream26 = random21.doubles();
        java.util.stream.IntStream intStream29 = random21.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(random21);
        java.util.stream.LongStream longStream31 = random21.longs();
        java.util.Random random32 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream35 = random32.doubles((double) (byte) 0, (double) '#');
        double double36 = random32.nextGaussian();
        java.util.stream.DoubleStream doubleStream37 = random32.doubles();
        java.util.stream.IntStream intStream40 = random32.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream41 = random32.doubles();
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random32.nextBytes(byteArray45);
        random21.nextBytes(byteArray45);
        random8.nextBytes(byteArray45);
        random0.nextBytes(byteArray45);
        java.lang.Class<?> wildcardClass50 = random0.getClass();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1313755292951455d) + "'", double2 == (-0.1313755292951455d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.41897139106825143d) + "'", double12 == (-0.41897139106825143d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 5610084966218005886L + "'", long18 == 5610084966218005886L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-7341713555571497109L) + "'", long19 == (-7341713555571497109L));
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(doubleStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.8062224452039771d + "'", double25 == 0.8062224452039771d);
        org.junit.Assert.assertNotNull(doubleStream26);
        org.junit.Assert.assertNotNull(intStream29);
        org.junit.Assert.assertNotNull(longStream31);
        org.junit.Assert.assertNotNull(doubleStream35);
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.571526047272214d + "'", double36 == 0.571526047272214d);
        org.junit.Assert.assertNotNull(doubleStream37);
        org.junit.Assert.assertNotNull(intStream40);
        org.junit.Assert.assertNotNull(doubleStream41);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[85, -20, 40]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setExtension('#', "zh_CN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("zh-TW", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale locale15 = java.util.Locale.getDefault();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Locale locale22 = java.util.Locale.CHINA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale25);
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.CHINA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = locale30.stripExtensions();
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.lang.String str34 = locale33.getScript();
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale15, locale16, locale17, locale20, locale21, locale24, locale25, locale27, locale29, locale30, locale33 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale locale39 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.util.Locale.FilteringMode filteringMode47 = null;
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.lang.String>) strList45, filteringMode47);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = locale52.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.KOREAN;
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.lang.String str57 = locale56.toLanguageTag();
        java.util.Locale locale58 = locale56.stripExtensions();
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale59);
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = java.util.Locale.UK;
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale66 = locale64.stripExtensions();
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.getScript();
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale49, locale50, locale51, locale54, locale55, locale58, locale59, locale61, locale63, locale64, locale67 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.List<java.util.Locale> localeList73 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList75 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strMap74);
        java.util.Collection<java.lang.String> strCollection76 = null;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, strCollection76);
        java.util.Locale.Builder builder78 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder80 = builder78.setVariant("");
        java.util.Locale.Builder builder82 = builder78.setLanguage("");
        java.util.Locale locale83 = builder82.build();
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet84);
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList2, (java.util.Collection<java.lang.String>) strList85);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh-CN" + "'", str23, "zh-CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh-CN" + "'", str31, "zh-CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ko");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-CN" + "'", str57, "zh-CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh-CN" + "'", str65, "zh-CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNotNull(localeList73);
        org.junit.Assert.assertNotNull(languageRangeList75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(strList86);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.lang.String str11 = locale0.getDisplayName(locale2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale0.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale22 = new java.util.Locale("Chine");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale22.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayName(locale22);
        java.lang.String str27 = locale0.getDisplayName(locale22);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale0);
        java.lang.String str29 = locale0.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "chine");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chine" + "'", str25, "chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United States)" + "'", str26, "English (United States)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "zh-CN" + "'", str29, "zh-CN");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        int int10 = random0.nextInt(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream13 = random0.ints((-1343604109), (-1565762321));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        int int10 = random0.nextInt(163231460);
        boolean boolean11 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles(176644252576367991L);
        double double14 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.043218045725835104d) + "'", double4 == (-0.043218045725835104d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65600117 + "'", int10 == 65600117);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8733285421332285d + "'", double14 == 0.8733285421332285d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        java.lang.String str6 = faker1.numerify("China");
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.Code code8 = faker1.code();
        com.github.javafaker.Lorem lorem9 = faker1.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(code8);
        org.junit.Assert.assertNotNull(lorem9);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.lang.String str11 = locale8.getDisplayName(locale9);
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.Builder builder13 = builder7.setLocale(locale9);
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale14);
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "zh-CN" + "'", str10, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str11, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setScript("en-gb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: en-gb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        boolean boolean6 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((double) (-4711220549636234721L), 0.04702830040266232d);
        boolean boolean10 = random0.nextBoolean();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random0);
        long long12 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((-8376390204840979484L), (long) (-1547643230), (long) (-1166459951));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.13624193257245648d + "'", double4 == 0.13624193257245648d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-2295870672491006174L) + "'", long12 == (-2295870672491006174L));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str2 = locale0.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        boolean boolean4 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.Locale locale1 = new java.util.Locale("French");
        java.util.Locale locale2 = java.util.Locale.CHINESE;
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.toLanguageTag();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale2.getDisplayName(locale3);
        java.lang.String str9 = locale2.getDisplayVariant();
        java.util.Locale.setDefault(locale2);
        java.lang.String str11 = locale1.getDisplayLanguage(locale2);
        org.junit.Assert.assertEquals(locale1.toString(), "french");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "french" + "'", str11, "french");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = faker5.resolve("chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u5fb7\u56fd", (-0.7908986182119387d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.7908986182119387");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder3.setLanguageTag("");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Empty subtag [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        int int14 = random0.nextInt();
        random0.setSeed((-2902042412286228963L));
        random0.setSeed((-7992033312183365925L));
        int int20 = random0.nextInt((int) (byte) 10);
        random0.setSeed((long) 1272557603);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream26 = random0.doubles((long) 2078819689, (double) 0.95368934f, 0.33754362010275896d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.5507876353843143d) + "'", double4 == (-0.5507876353843143d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1301414851 + "'", int14 == 1301414851);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        double double12 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.9450516176171396d + "'", double4 == 0.9450516176171396d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.32765906100651054d + "'", double9 == 0.32765906100651054d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1086982404) + "'", int10 == (-1086982404));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.4015385199264467d + "'", double11 == 1.4015385199264467d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.8872597386021555d) + "'", double12 == (-1.8872597386021555d));
        org.junit.Assert.assertNotNull(doubleStream13);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream16 = random0.doubles((-3134175886536839531L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.2035411866530759d + "'", double4 == 1.2035411866530759d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-690348696) + "'", int14 == (-690348696));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream17 = random0.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream21 = random0.doubles(1847242113680462994L, (double) 1, (double) 100);
        java.util.stream.IntStream intStream23 = random0.ints((long) 2109552831);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream27 = random0.ints((-1261761752931187247L), 399703984, (-39381540));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(intStream23);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("fr-FR");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        double double12 = random0.nextGaussian();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream14 = random0.ints((long) (-1155869325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.09580205108151536d) + "'", double4 == (-0.09580205108151536d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.3885687058297192d) + "'", double9 == (-0.3885687058297192d));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 766509491 + "'", int10 == 766509491);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2971377314381816d + "'", double11 == 0.2971377314381816d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0003449798233852d) + "'", double12 == (-1.0003449798233852d));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str5 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = locale3.getUnicodeLocaleType("Cina");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Cina");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!" + "'", str4, "HI!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.IntStream intStream4 = random0.ints();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles((-0.6239664916583075d), (double) 'x');
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream9 = random0.doubles((-48397131539201648L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5077919770300414d) + "'", double2 == (-0.5077919770300414d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(intStream4);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.util.Random random1 = new java.util.Random((-2715822492754316906L));
        random1.setSeed(4417417182883005686L);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        java.lang.String str6 = faker1.numerify("China");
        com.github.javafaker.App app7 = faker1.app();
        com.github.javafaker.App app8 = faker1.app();
        com.github.javafaker.Hacker hacker9 = faker1.hacker();
        com.github.javafaker.App app10 = faker1.app();
        java.lang.String str12 = faker1.regexify("TWN");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(app8);
        org.junit.Assert.assertNotNull(hacker9);
        org.junit.Assert.assertNotNull(app10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TWN" + "'", str12, "TWN");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder3.clearExtensions();
        java.util.Locale.Builder builder5 = builder4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setScript("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??(????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("coreano");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setVariant("English United States");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: English United States [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayVariant();
        java.lang.String str2 = locale0.getDisplayScript();
        java.util.Random random3 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream6 = random3.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random3);
        java.util.stream.DoubleStream doubleStream10 = random3.doubles((-1.0d), 0.028145596690574037d);
        double double11 = random3.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random3);
        java.util.stream.LongStream longStream13 = random3.longs();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(doubleStream6);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.3525841390182234d + "'", double11 == 0.3525841390182234d);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale9.getDisplayName(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale16.toLanguageTag();
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet22 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getVariant();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayName(locale29);
        java.util.Locale.setDefault(category0, locale29);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str12, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GB" + "'", str17, "GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-GB" + "'", str18, "en-GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-GB" + "'", str20, "en-GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GBR" + "'", str21, "GBR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale27);
// flaky:         org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinesisch (China)" + "'", str30, "Chinesisch (China)");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.Locale locale2 = new java.util.Locale("South Korea", "chine");
        java.util.Locale locale4 = new java.util.Locale("\u53f0\u7063");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str6 = locale2.getDisplayScript(locale5);
        java.lang.String str7 = locale5.getISO3Country();
        org.junit.Assert.assertEquals(locale2.toString(), "south korea_CHINE");
        org.junit.Assert.assertEquals(locale4.toString(), "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(category0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("chinois");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: chinois");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = null; // flaky: new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company11 = null; // flaky: faker10.company();
        com.github.javafaker.Business business12 = null; // flaky: faker10.business();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertNotNull(company11);
// flaky:         org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getISO3Language();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = locale8.getISO3Country();
        java.util.Locale.Builder builder10 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder11 = builder10.clear();
        java.util.Locale locale12 = builder11.build();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale.Builder builder15 = builder11.setLocale(locale13);
        java.lang.String str16 = locale13.toLanguageTag();
        java.lang.String str17 = locale13.getDisplayScript();
        java.lang.String str18 = locale8.getDisplayName(locale13);
        java.lang.String str19 = locale4.getDisplayLanguage(locale8);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale8);
        com.github.javafaker.Finance finance21 = faker20.finance();
        com.github.javafaker.Hacker hacker22 = faker20.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zho" + "'", str7, "zho");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u5fb7\u6587" + "'", str18, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinesisch" + "'", str19, "Chinesisch");
        org.junit.Assert.assertNotNull(finance21);
        org.junit.Assert.assertNotNull(hacker22);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)");
        java.lang.String str2 = locale1.getDisplayLanguage();
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str2, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("CAN");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "can");
        org.junit.Assert.assertNotNull(charSet2);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale10.getVariant();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet12 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = locale14.stripExtensions();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale14);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str20 = locale14.getDisplayVariant(locale18);
        java.util.Locale locale21 = locale14.stripExtensions();
        java.lang.String str22 = locale21.getCountry();
        java.lang.String str23 = locale21.getLanguage();
        java.lang.String str24 = locale2.getDisplayName(locale21);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u56fd" + "'", str19, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CN" + "'", str22, "CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zh" + "'", str23, "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str24, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Number number6 = faker1.number();
        com.github.javafaker.DateAndTime dateAndTime7 = faker1.date();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = faker1.resolve("\uc911\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertNotNull(dateAndTime7);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.removeUnicodeLocaleAttribute("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.Locale locale1 = new java.util.Locale("\u53f0\u7063");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale2.getDisplayName(locale4);
        org.junit.Assert.assertEquals(locale1.toString(), "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "\u53f0\u7063");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u53f0\u7063" + "'", str3, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u56fd" + "'", str5, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u53f0\u7063" + "'", str6, "\u53f0\u7063");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        com.github.javafaker.App app5 = faker1.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale1.getDisplayLanguage();
        java.util.Random random5 = new java.util.Random((long) (-1480715465));
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale1, random5);
        java.util.stream.IntStream intStream7 = random5.ints();
        long long8 = random5.nextLong();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u6587" + "'", str3, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-7303031303361208694L) + "'", long8 == (-7303031303361208694L));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.addUnicodeLocaleAttribute("en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.getScript();
        java.lang.String str20 = locale18.getDisplayCountry();
        java.lang.String str21 = locale18.getDisplayCountry();
        java.lang.String str22 = locale18.getDisplayScript();
        java.util.Locale.setDefault(category0, locale18);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u4e2d\u56fd" + "'", str20, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.Random random1 = new java.util.Random((-8760364856787578239L));
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
        com.github.javafaker.Internet internet3 = faker2.internet();
        org.junit.Assert.assertNotNull(internet3);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        int int15 = random0.nextInt(2109552831);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.042010255282264326d) + "'", double4 == (-0.042010255282264326d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.040429240611845496d + "'", double6 == 0.040429240611845496d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.3270264806385568d + "'", double11 == 1.3270264806385568d);
        org.junit.Assert.assertNotNull(intStream12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1643907849 + "'", int15 == 1643907849);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("ITA");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("french");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.removeUnicodeLocaleAttribute("\u6cd5\u6587\u6cd5\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale14 = new java.util.Locale("\uc911\uad6d\uc5b4\uc911\uad6d)", "us", "\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str15 = locale10.getDisplayVariant(locale14);
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale.Category category17 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale18 = java.util.Locale.getDefault(category17);
        java.util.Locale locale19 = java.util.Locale.getDefault(category17);
        java.util.Locale locale20 = java.util.Locale.getDefault(category17);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale21.getDisplayCountry();
        java.lang.String str24 = locale21.getDisplayScript();
        java.util.Locale.setDefault(category17, locale21);
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.lang.String str29 = locale26.getDisplayName(locale27);
        java.lang.String str30 = locale27.getDisplayLanguage();
        java.util.Locale.setDefault(category17, locale27);
        java.util.Locale locale32 = java.util.Locale.getDefault(category17);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.lang.String str34 = locale33.getCountry();
        java.lang.String str35 = locale33.toLanguageTag();
        java.lang.String str36 = locale33.getVariant();
        java.lang.String str37 = locale33.toLanguageTag();
        java.lang.String str38 = locale33.getISO3Country();
        java.util.Set<java.lang.String> strSet39 = locale33.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category17, locale33);
        java.util.Locale.setDefault(category0, locale33);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
// flaky:         org.junit.Assert.assertEquals(locale14.toString(), "\uc911\uad6d\uc5b4\uc911\uad6d\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.FORMAT + "'", category17.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd" + "'", str23, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "zh-CN" + "'", str28, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str29, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GB" + "'", str34, "GB");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "en-GB" + "'", str35, "en-GB");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "en-GB" + "'", str37, "en-GB");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "GBR" + "'", str38, "GBR");
        org.junit.Assert.assertNotNull(strSet39);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CN" + "'", str2, "CN");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        java.lang.String str4 = languageRange1.getRange();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        java.util.Locale.Builder builder7 = builder6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("fran\347ais (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: franc?ais (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        double double15 = random0.nextDouble();
        com.github.javafaker.Faker faker16 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream17 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream20 = random0.doubles(0.6533317665942538d, (double) 0.6444387f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.20842051591179778d + "'", double15 == 0.20842051591179778d);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = locale1.stripExtensions();
        java.lang.String str13 = locale12.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u671d\u9c9c\u6587" + "'", str13, "\u671d\u9c9c\u6587");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setScript("fran\347ais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: franc?ais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        random1.setSeed(5845723148199264369L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream7 = random1.ints(352608531, 352608531);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.util.Random random1 = new java.util.Random((-8364737658423095890L));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app7 = faker6.app();
        java.lang.String str9 = faker6.bothify("hi! (HI!,hi!)");
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16738665574126013d) + "'", double2 == (-0.16738665574126013d));
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (HI!,hi!)" + "'", str9, "hi! (HI!,hi!)");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale3);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream10 = random0.ints(4994824200130427554L, (int) (byte) 0, (int) ' ');
        java.util.stream.LongStream longStream13 = random0.longs((-4601747285168096166L), (long) 366253072);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = random0.nextInt((-548720354));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6699530341554031d + "'", double2 == 0.6699530341554031d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2921732057692699832L + "'", long4 == 2921732057692699832L);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.7756968951532774d + "'", double5 == 0.7756968951532774d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getScript();
        java.lang.String str14 = locale0.getDisplayCountry();
        java.lang.String str15 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u56fd" + "'", str14, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (-1.0202396595732854d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0202396595732854");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = null; // flaky: new com.github.javafaker.Faker(locale0, random5);
        random5.setSeed((-5207369092277348264L));
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = null; // flaky: new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str19 = locale18.getDisplayLanguage();
        java.util.Locale.setDefault(locale18);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale18);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = locale22.toLanguageTag();
        java.lang.String str25 = locale22.getLanguage();
        java.lang.String str26 = locale18.getDisplayName(locale22);
        java.lang.String str27 = locale11.getDisplayScript(locale22);
        java.lang.String str28 = locale22.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
// flaky:         org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587" + "'", str19, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GB" + "'", str23, "GB");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-GB" + "'", str24, "en-GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Chinese (Taiwan)" + "'", str26, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "en-GB" + "'", str28, "en-GB");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) 963875490);
        java.util.stream.LongStream longStream8 = random0.longs();
        double double9 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.20200116169494817d) + "'", double4 == (-0.20200116169494817d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.575658094984674d + "'", double9 == 0.575658094984674d);
        org.junit.Assert.assertNotNull(intStream10);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale.setDefault(category0, locale1);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Locale.Builder builder3 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder3.setVariant("");
        java.util.Locale.Builder builder8 = builder5.setExtension('u', "zh");
        java.util.Locale.Builder builder9 = builder8.clear();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.getScript();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale10.getDisplayCountry();
        java.lang.String str14 = locale10.getDisplayName();
        java.lang.String str15 = locale10.getDisplayLanguage();
        java.util.Locale.Builder builder16 = builder9.setLocale(locale10);
        java.lang.String str17 = locale2.getDisplayScript(locale10);
        java.lang.Object obj18 = locale10.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "China" + "'", str12, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "China" + "'", str13, "China");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinese (China)" + "'", str14, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Chinese" + "'", str15, "Chinese");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "zh_CN");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("TWN", strMap1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList2, strMap3);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeList4);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random0.doubles((-0.035559016193634d), 0.13051402953139332d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.34363510972020206d + "'", double4 == 0.34363510972020206d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.690405068241567d + "'", double9 == 0.690405068241567d);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-362842000) + "'", int10 == (-362842000));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.20280875960661107d + "'", double11 == 0.20280875960661107d);
        org.junit.Assert.assertNotNull(doubleStream14);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.Random random1 = new java.util.Random(0L);
        long long2 = random1.nextLong();
        java.util.stream.LongStream longStream5 = random1.longs((-4601747285168096166L), 8651399998613895826L);
        java.util.stream.IntStream intStream8 = random1.ints(163231460, 1301414851);
        java.util.stream.LongStream longStream9 = random1.longs();
        java.util.stream.IntStream intStream12 = random1.ints((-1343604109), 366253072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4962768465676381896L) + "'", long2 == (-4962768465676381896L));
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Englisch (Vereinigtes K\366nigreich)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=englisch (vereinigtes ko?nigreich)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder7 = builder2.setRegion("");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale9.getDisplayLanguage(locale13);
        java.util.Locale.Builder builder16 = builder7.setLocale(locale13);
        java.util.Locale.Builder builder17 = builder16.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setScript("\u4e2d\u570b");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = null; // flaky: new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = null; // flaky: new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Hacker hacker13 = faker12.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (Taiwan)" + "'", str4, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(hacker13);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = null; // flaky: new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = null; // flaky: new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company11 = null; // flaky: faker10.company();
        java.lang.String str13 = null; // flaky: faker10.bothify("Franz\366sisch (Frankreich)");
        com.github.javafaker.Company company14 = null; // flaky: faker10.company();
        com.github.javafaker.Book book15 = null; // flaky: faker10.book();
        com.github.javafaker.Company company16 = null; // flaky: faker10.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
// flaky:         org.junit.Assert.assertNotNull(company11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
// flaky:         org.junit.Assert.assertNotNull(company14);
// flaky:         org.junit.Assert.assertNotNull(book15);
// flaky:         org.junit.Assert.assertNotNull(company16);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale9.getDisplayName(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str18 = locale16.toLanguageTag();
        java.lang.String str19 = locale16.getVariant();
        java.lang.String str20 = locale16.toLanguageTag();
        java.lang.String str21 = locale16.getISO3Country();
        java.util.Set<java.lang.String> strSet22 = locale16.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale16);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.util.Locale.setDefault(category0, locale24);
        java.util.Locale locale27 = java.util.Locale.getDefault(category0);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u570b" + "'", str5, "\u4e2d\u570b");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u570b" + "'", str6, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str12, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GB" + "'", str17, "GB");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-GB" + "'", str18, "en-GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-GB" + "'", str20, "en-GB");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "GBR" + "'", str21, "GBR");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\uc77c\ubcf8\uc5b4\uc77c\ubcf8)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???????? (??????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.LongStream longStream3 = random0.longs();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        java.util.stream.IntStream intStream7 = random0.ints((long) (byte) 10);
        java.util.stream.LongStream longStream10 = random0.longs((long) 50, 6964981429732325894L);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5362374820195908d + "'", double2 == 0.5362374820195908d);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-425688940) + "'", int5 == (-425688940));
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinesisch(taiwan)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getLanguage();
        java.util.Random random14 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream17 = random14.doubles((double) (byte) 0, (double) '#');
        double double18 = random14.nextGaussian();
        java.util.stream.DoubleStream doubleStream19 = random14.doubles();
        double double20 = random14.nextDouble();
        java.util.stream.IntStream intStream24 = random14.ints(100L, (-1), (int) (byte) 0);
        double double25 = random14.nextGaussian();
        java.util.stream.IntStream intStream26 = random14.ints();
        java.util.stream.DoubleStream doubleStream27 = random14.doubles();
        java.util.stream.LongStream longStream28 = random14.longs();
        java.util.stream.IntStream intStream30 = random14.ints(4668688544456269390L);
        java.util.stream.DoubleStream doubleStream32 = random14.doubles(637006123862331954L);
        long long33 = random14.nextLong();
        java.util.stream.DoubleStream doubleStream34 = random14.doubles();
        com.github.javafaker.Faker faker35 = null; // flaky: new com.github.javafaker.Faker(locale0, random14);
        int int37 = random14.nextInt(325848842);
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Taiwan" + "'", str9, "Taiwan");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str12, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9366400216349865d + "'", double18 == 0.9366400216349865d);
        org.junit.Assert.assertNotNull(doubleStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9379852883428915d + "'", double20 == 0.9379852883428915d);
        org.junit.Assert.assertNotNull(intStream24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0621263383523967d) + "'", double25 == (-1.0621263383523967d));
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(doubleStream27);
        org.junit.Assert.assertNotNull(longStream28);
        org.junit.Assert.assertNotNull(intStream30);
        org.junit.Assert.assertNotNull(doubleStream32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-5808278507127081106L) + "'", long33 == (-5808278507127081106L));
        org.junit.Assert.assertNotNull(doubleStream34);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 45258894 + "'", int37 == 45258894);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguageTag("Taiwan");
        java.util.Locale.Builder builder9 = builder5.setVariant("anglais");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setScript("Chinese China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Color color10 = faker9.color();
        com.github.javafaker.Name name11 = faker9.name();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5872474735955328d + "'", double4 == 0.5872474735955328d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(name11);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder9 = builder7.setLanguageTag("TW");
        java.util.Locale.Builder builder11 = builder9.setLanguageTag("CAN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.Locale locale3 = new java.util.Locale("deu", "Chinese (Taiwan)", "chinois (Chine)");
        org.junit.Assert.assertEquals(locale3.toString(), "deu_CHINESE (TAIWAN)_chinois (Chine)");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        com.github.javafaker.Options options11 = faker9.options();
        java.lang.String str13 = faker9.regexify("\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.12359805007480519d) + "'", double4 == (-0.12359805007480519d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(options11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str13, "\u53f0\u6e7e\u5730\u533a");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", 1.3319403132324843d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.3319403132324843");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Deutsch", 0.8524037872100242d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        com.github.javafaker.Faker faker6 = null; // flaky: new com.github.javafaker.Faker(locale4);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder9 = builder3.clearExtensions();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        double double14 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream17 = random0.longs(6964981429732325894L, (-289425093418369874L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.9041249308068862d + "'", double4 == 1.9041249308068862d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6775239205156846d + "'", double6 == 0.6775239205156846d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.5444529046936991d) + "'", double11 == (-0.5444529046936991d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8536462129810007d + "'", double14 == 0.8536462129810007d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.LongStream longStream13 = random0.longs();
        random0.setSeed((long) 163231460);
        int int17 = random0.nextInt(68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs((-3116814522583863011L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.14906507726159043d) + "'", double4 == (-0.14906507726159043d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.3757129219538595d + "'", double6 == 0.3757129219538595d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.21536024052395442d) + "'", double11 == (-0.21536024052395442d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getDisplayVariant();
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale3);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("de-DE", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Lorem lorem2 = faker0.lorem();
        com.github.javafaker.Book book3 = faker0.book();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(lorem2);
        org.junit.Assert.assertNotNull(book3);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        com.github.javafaker.Faker faker10 = null; // flaky: new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Color color11 = null; // flaky: faker10.color();
        com.github.javafaker.Options options12 = null; // flaky: faker10.options();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (Canada)" + "'", str6, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "France" + "'", str9, "France");
// flaky:         org.junit.Assert.assertNotNull(color11);
// flaky:         org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setVariant("FRANZ\366SISCH");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: FRANZo?SISCH [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        double double5 = random0.nextGaussian();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt(2109552831);
        java.util.stream.LongStream longStream11 = random0.longs((long) 1643907849, 2591451324191929656L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.5668953755396582d) + "'", double5 == (-1.5668953755396582d));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 389593865 + "'", int8 == 389593865);
        org.junit.Assert.assertNotNull(longStream11);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguage("GBR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.addUnicodeLocaleAttribute("de_DE");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: de_DE [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale0);
        java.lang.String str2 = locale0.getDisplayLanguage();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getScript();
        java.lang.String str7 = locale0.getDisplayName(locale3);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale12 = new java.util.Locale("CAN", "CN", "en-gb");
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Locale.setDefault(category8, locale13);
        java.lang.String str16 = locale13.getExtension('u');
        java.lang.String str17 = locale0.getDisplayLanguage(locale13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = locale13.getUnicodeLocaleType("\u82f1\u6587\u7f8e\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (??)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais" + "'", str2, "fran\347ais");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str7, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale12.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "French" + "'", str17, "French");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.lang.String str18 = locale1.getDisplayName();
        java.util.Locale.setDefault(locale1);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-643578146549242070L) + "'", long16 == (-643578146549242070L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Chinese (China)" + "'", str18, "Chinese (China)");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale0.getExtension('a');
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale9.getDisplayName(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale9);
        java.util.Random random14 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream17 = random14.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale9, random14);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = faker21.resolve("South Korea");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinesisch (China)" + "'", str12, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random0.nextBytes(byteArray11);
        double double13 = random0.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = faker14.resolve("GBR");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[13, -121, -69]");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.5215567399761538d) + "'", double13 == (-0.5215567399761538d));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("CN", "TW", "en-GB");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.lang.String str7 = locale5.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CAN" + "'", str1, "CAN");
        org.junit.Assert.assertEquals(locale5.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (Canada)" + "'", str6, "French (Canada)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cn_TW_en-GB" + "'", str7, "cn_TW_en-GB");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-TW", (double) 0.27772975f);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("FRA");
        java.util.Locale locale5 = builder4.build();
        boolean boolean7 = locale5.equals((java.lang.Object) (-2715822492754316906L));
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("South Korea");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        java.util.Random random15 = new java.util.Random();
        java.util.stream.IntStream intStream16 = random15.ints();
        double double17 = random15.nextGaussian();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles();
        long long19 = random15.nextLong();
        double double20 = random15.nextGaussian();
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(random15);
        java.util.stream.IntStream intStream22 = random15.ints();
        java.util.stream.LongStream longStream24 = random15.longs(7975027329722967446L);
        java.util.Random random25 = new java.util.Random();
        java.util.stream.IntStream intStream26 = random25.ints();
        java.util.stream.LongStream longStream29 = random25.longs((long) 1, (long) 100);
        boolean boolean30 = random25.nextBoolean();
        java.util.stream.DoubleStream doubleStream32 = random25.doubles(0L);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random25.nextBytes(byteArray36);
        random15.nextBytes(byteArray36);
        random0.nextBytes(byteArray36);
        float float40 = random0.nextFloat();
        double double41 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.08788142049866182d) + "'", double4 == (-0.08788142049866182d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 196408407 + "'", int14 == 196408407);
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.8538623537395524d) + "'", double17 == (-1.8538623537395524d));
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5708350221652391345L + "'", long19 == 5708350221652391345L);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.2546285294232574d) + "'", double20 == (-0.2546285294232574d));
        org.junit.Assert.assertNotNull(intStream22);
        org.junit.Assert.assertNotNull(longStream24);
        org.junit.Assert.assertNotNull(intStream26);
        org.junit.Assert.assertNotNull(longStream29);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleStream32);
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[79, -19, -43]");
// flaky:         org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.16649866f + "'", float40 == 0.16649866f);
// flaky:         org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.4098170469716222d + "'", double41 == 1.4098170469716222d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app5 = faker4.app();
        com.github.javafaker.Business business6 = faker4.business();
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(app5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Franz\366sisch (Frankreich)", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.toLanguageTag();
        java.lang.String str2 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.IntStream intStream11 = random0.ints(1426876149034384144L, (-858120823), 1875692351);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.3212927184465353d) + "'", double4 == (-2.3212927184465353d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-84897791701708969L) + "'", long5 == (-84897791701708969L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.45506895f + "'", float6 == 0.45506895f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder2.setVariant("");
        java.util.Locale.Builder builder8 = builder2.clearExtensions();
        java.util.Locale.Builder builder9 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder2.addUnicodeLocaleAttribute("cn (ZHO,Chine)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: cn (ZHO,Chine) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str2 = locale0.getExtension('u');
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("fr-FR");
        java.util.Locale.Category category5 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale6 = java.util.Locale.getDefault(category5);
        java.util.Locale locale7 = java.util.Locale.getDefault(category5);
        java.util.Locale locale8 = java.util.Locale.getDefault(category5);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getDisplayCountry();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getDisplayScript();
        java.util.Locale.setDefault(category5, locale9);
        java.util.Locale locale14 = java.util.Locale.getDefault(category5);
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale15);
        java.lang.String str17 = locale15.getDisplayCountry();
        java.util.Locale.setDefault(category5, locale15);
        java.lang.String str19 = locale4.getDisplayScript(locale15);
        java.lang.String str20 = locale4.toLanguageTag();
        java.lang.String str21 = locale0.getDisplayScript(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = locale4.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + category5 + "' != '" + java.util.Locale.Category.FORMAT + "'", category5.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "France" + "'", str17, "France");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr-FR" + "'", str20, "fr-FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.App app5 = faker3.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(app5);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        random0.setSeed((-6429587024962493419L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream16 = random0.longs((long) (-2000885012), (-5006752208278450259L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4979031668491059d + "'", double4 == 0.4979031668491059d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.6105982673610468d) + "'", double11 == (-1.6105982673610468d));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getDisplayName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random1 = new java.util.Random();
        java.util.stream.IntStream intStream2 = random1.ints();
        java.util.stream.LongStream longStream5 = random1.longs((long) 1, (long) 100);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream10 = random1.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double11 = random1.nextDouble();
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random1);
        boolean boolean13 = random1.nextBoolean();
        java.util.stream.LongStream longStream17 = random1.longs(3422989099713268259L, 1L, (long) 68);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream2);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.20112748944095837d + "'", double11 == 0.20112748944095837d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(longStream17);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("KR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ?? (????)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "kr");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs();
        boolean boolean9 = random0.nextBoolean();
        double double10 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1950074285031744d + "'", double4 == 1.1950074285031744d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 225158982980797414L + "'", long5 == 225158982980797414L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.32835996f + "'", float6 == 0.32835996f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.6097321228293052d) + "'", double10 == (-0.6097321228293052d));
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt((int) (short) 10);
        boolean boolean9 = random0.nextBoolean();
        double double10 = random0.nextGaussian();
        long long11 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.30588582124040137d) + "'", double4 == (-0.30588582124040137d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-6785803313256261432L) + "'", long5 == (-6785803313256261432L));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.6595200777962568d + "'", double10 == 0.6595200777962568d);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-7703961699269429341L) + "'", long11 == (-7703961699269429341L));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.Locale locale3 = new java.util.Locale("kor", "zh_CN", "ITA");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "kor_ZH_CN_ITA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "kor_ZH_CN_ITA" + "'", str4, "kor_ZH_CN_ITA");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.util.Locale locale3 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)", "\u4e2d\u56fd", "zh_CN");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.lang.String str6 = locale4.getLanguage();
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        org.junit.Assert.assertNotNull(locale4);
// flaky:         org.junit.Assert.assertEquals(locale4.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Code code11 = faker10.code();
        com.github.javafaker.Hacker hacker12 = faker10.hacker();
        com.github.javafaker.Finance finance13 = faker10.finance();
        com.github.javafaker.Code code14 = faker10.code();
        com.github.javafaker.PhoneNumber phoneNumber15 = faker10.phoneNumber();
        com.github.javafaker.App app16 = faker10.app();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(hacker12);
        org.junit.Assert.assertNotNull(finance13);
        org.junit.Assert.assertNotNull(code14);
        org.junit.Assert.assertNotNull(phoneNumber15);
        org.junit.Assert.assertNotNull(app16);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        java.lang.String str2 = faker0.letterify("GBR");
        com.github.javafaker.Address address3 = faker0.address();
        com.github.javafaker.Color color4 = faker0.color();
        java.lang.String str6 = faker0.letterify("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GBR" + "'", str2, "GBR");
        org.junit.Assert.assertNotNull(address3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.util.Locale locale1 = new java.util.Locale("chinois (Chine)");
        java.lang.String str2 = locale1.getDisplayVariant();
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleAttributes();
        org.junit.Assert.assertEquals(locale1.toString(), "chinois (chine)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Color color8 = faker0.color();
        com.github.javafaker.Company company9 = faker0.company();
        com.github.javafaker.App app10 = faker0.app();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(company9);
        org.junit.Assert.assertNotNull(app10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.lang.String str18 = locale11.getDisplayVariant();
        boolean boolean19 = locale11.hasExtensions();
        java.util.Set<java.lang.String> strSet20 = locale11.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "fran\347ais" + "'", str16, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        float float5 = random0.nextFloat();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((-4221668444904202442L), (long) (-956599304), 2735277389973397399L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.12363005f + "'", float5 == 0.12363005f);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        java.lang.String str7 = faker3.bothify("fr-CA");
        java.lang.String str9 = faker3.bothify("zh-CN");
        com.github.javafaker.DateAndTime dateAndTime10 = faker3.date();
        com.github.javafaker.Finance finance11 = faker3.finance();
        java.lang.String str13 = faker3.regexify("kor_ZH_CN_ITA");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fr-CA" + "'", str7, "fr-CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zh-CN" + "'", str9, "zh-CN");
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(finance11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "kor_ZH_CN_ITA" + "'", str13, "kor_ZH_CN_ITA");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.PhoneNumber phoneNumber16 = faker15.phoneNumber();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7078618672493423d + "'", double4 == 0.7078618672493423d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-641617458) + "'", int14 == (-641617458));
        org.junit.Assert.assertNotNull(phoneNumber16);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-GB");
        java.lang.String str2 = languageRange1.getRange();
        java.lang.String str3 = languageRange1.getRange();
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker();
        java.lang.String str6 = faker4.letterify("GBR");
        com.github.javafaker.Address address7 = faker4.address();
        com.github.javafaker.DateAndTime dateAndTime8 = faker4.date();
        com.github.javafaker.Finance finance9 = faker4.finance();
        com.github.javafaker.Code code10 = faker4.code();
        boolean boolean11 = languageRange1.equals((java.lang.Object) faker4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-gb" + "'", str2, "en-gb");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en-gb" + "'", str3, "en-gb");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GBR" + "'", str6, "GBR");
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(finance9);
        org.junit.Assert.assertNotNull(code10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.Locale locale2 = new java.util.Locale("zh-TW", "\u82f1\u6587");
        java.util.Locale.setDefault(locale2);
        java.lang.String str4 = locale2.getCountry();
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u82f1\u6587" + "'", str4, "\u82f1\u6587");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setVariant("TWN");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: TWN [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random12 = new java.util.Random();
        java.util.stream.IntStream intStream13 = random12.ints();
        java.util.stream.LongStream longStream16 = random12.longs((long) 1, (long) 100);
        boolean boolean17 = random12.nextBoolean();
        java.util.stream.DoubleStream doubleStream21 = random12.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream25 = random12.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long26 = random12.nextLong();
        com.github.javafaker.Faker faker27 = new com.github.javafaker.Faker(locale11, random12);
        java.lang.String str28 = locale11.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale11);
        java.util.Set<java.lang.Character> charSet30 = locale11.getExtensionKeys();
        java.lang.String str31 = locale11.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinese (China)" + "'", str5, "Chinese (China)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(longStream16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(longStream25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 5588509160743100619L + "'", long26 == 5588509160743100619L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(charSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "zh_CN" + "'", str31, "zh_CN");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.IntStream intStream16 = random0.ints(4668688544456269390L);
        java.util.stream.DoubleStream doubleStream18 = random0.doubles(637006123862331954L);
        long long19 = random0.nextLong();
        java.util.stream.LongStream longStream22 = random0.longs((-1525526210113119355L), 5270493142417067156L);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6797680767847426d + "'", double4 == 0.6797680767847426d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.7584873200780137d + "'", double6 == 0.7584873200780137d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.269201805857176d + "'", double11 == 0.269201805857176d);
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2115161864631733793L + "'", long19 == 2115161864631733793L);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        com.github.javafaker.Address address18 = faker17.address();
        com.github.javafaker.Name name19 = faker17.name();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-8608050731152961353L) + "'", long16 == (-8608050731152961353L));
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertNotNull(name19);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 2084832918, 0.6102434496259569d, (double) 963875490);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.11374367883350392d) + "'", double4 == (-0.11374367883350392d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\uc911\uad6d");
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.Locale locale1 = new java.util.Locale("ko");
        java.util.Locale locale3 = new java.util.Locale("Chinesisch China");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale1.getDisplayName(locale3);
        boolean boolean6 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals(locale3.toString(), "chinesisch china");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Korean" + "'", str5, "Korean");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.Color color3 = faker1.color();
        com.github.javafaker.Options options4 = faker1.options();
        com.github.javafaker.Number number5 = faker1.number();
        com.github.javafaker.Finance finance6 = faker1.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(number5);
        org.junit.Assert.assertNotNull(finance6);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Locale.setDefault(locale0);
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.UK;
        java.lang.String str5 = locale4.getCountry();
        java.lang.String str6 = locale4.toLanguageTag();
        java.lang.String str7 = locale4.getLanguage();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Random random9 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream12 = random9.doubles((double) (byte) 0, (double) '#');
        double double13 = random9.nextGaussian();
        java.util.stream.DoubleStream doubleStream14 = random9.doubles();
        double double15 = random9.nextDouble();
        java.util.stream.IntStream intStream19 = random9.ints(100L, (-1), (int) (byte) 0);
        double double20 = random9.nextGaussian();
        java.util.stream.IntStream intStream21 = random9.ints();
        java.util.stream.LongStream longStream22 = random9.longs();
        random9.setSeed(100L);
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(locale4, random9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream29 = random9.longs((-1514298327416684656L), 0L, (long) 451064779);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en-GB" + "'", str6, "en-GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (Taiwan)" + "'", str8, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.6504677041105532d) + "'", double13 == (-0.6504677041105532d));
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6814566131862292d + "'", double15 == 0.6814566131862292d);
        org.junit.Assert.assertNotNull(intStream19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.2639143008354645d + "'", double20 == 1.2639143008354645d);
        org.junit.Assert.assertNotNull(intStream21);
        org.junit.Assert.assertNotNull(longStream22);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale9 = locale2.stripExtensions();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        java.util.Locale locale12 = builder1.build();
        java.util.Locale.Builder builder14 = builder1.setLanguageTag("CAN");
        java.util.Locale.Builder builder16 = builder1.addUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder18 = builder1.setLanguageTag("en-gb");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.addUnicodeLocaleAttribute("US");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: US [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u570b" + "'", str7, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.numerify("US");
        com.github.javafaker.Number number8 = faker3.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "US" + "'", str7, "US");
        org.junit.Assert.assertNotNull(number8);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Language();
        java.lang.String str5 = locale0.getLanguage();
        java.util.Locale locale6 = java.util.Locale.ROOT;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker(locale0);
        java.lang.String str10 = faker8.numerify("und");
        com.github.javafaker.Hacker hacker11 = faker8.hacker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = faker8.resolve("fran\347ais (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u570b" + "'", str2, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u570b" + "'", str3, "\u4e2d\u570b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh" + "'", str5, "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "und" + "'", str10, "und");
        org.junit.Assert.assertNotNull(hacker11);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.util.stream.LongStream longStream13 = random6.longs();
        random6.setSeed(5689803982665130262L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getDisplayCountry();
        java.lang.String str6 = locale3.getDisplayVariant();
        java.util.Locale locale7 = locale3.stripExtensions();
        java.lang.String str8 = locale3.getScript();
        java.lang.String str9 = locale3.getVariant();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Random random15 = new java.util.Random();
        java.util.stream.IntStream intStream16 = random15.ints();
        double double17 = random15.nextGaussian();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles();
        java.util.stream.LongStream longStream19 = random15.longs();
        java.util.stream.DoubleStream doubleStream20 = random15.doubles();
        int int21 = random15.nextInt();
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale8, random15);
        java.lang.Object obj23 = locale8.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(intStream16);
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-0.4259622329945596d) + "'", double17 == (-0.4259622329945596d));
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(longStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1460051921) + "'", int21 == (-1460051921));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "zh_CN");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.PhoneNumber phoneNumber7 = faker3.phoneNumber();
        com.github.javafaker.Internet internet8 = faker3.internet();
        java.lang.String str10 = faker3.bothify("Chinese (China)");
        java.lang.String str12 = faker3.numerify("\u5fb7\u56fd");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(phoneNumber7);
        org.junit.Assert.assertNotNull(internet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (China)" + "'", str10, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u5fb7\u56fd" + "'", str12, "\u5fb7\u56fd");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getISO3Language();
        java.lang.String str14 = locale0.getISO3Language();
        java.lang.String str15 = locale0.getISO3Country();
        java.lang.String str16 = locale0.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zho" + "'", str13, "zho");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CHN" + "'", str15, "CHN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Color color8 = faker0.color();
        com.github.javafaker.Options options9 = faker0.options();
        com.github.javafaker.Book book10 = faker0.book();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(book10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale1.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.Locale locale2 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for ?? (??)_??_zh_cn");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.Random random1 = new java.util.Random((long) (-1460051921));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = faker3.bothify("GB");
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Lorem lorem7 = faker3.lorem();
        java.lang.String str9 = faker3.regexify("CHINESISCH (CHINA)");
        com.github.javafaker.Code code10 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GB" + "'", str5, "GB");
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(lorem7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CHINESISCH CHINA" + "'", str9, "CHINESISCH CHINA");
        org.junit.Assert.assertNotNull(code10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.numerify("GB");
        com.github.javafaker.Internet internet9 = faker0.internet();
        com.github.javafaker.Finance finance10 = faker0.finance();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GB" + "'", str8, "GB");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(finance10);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale6);
        java.lang.String str8 = locale6.getDisplayLanguage();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale9.getScript();
        java.lang.String str13 = locale6.getDisplayName(locale9);
        java.lang.String str14 = locale6.getDisplayCountry();
        java.lang.String str15 = locale6.getDisplayVariant();
        java.util.Locale.Builder builder16 = builder4.setLocale(locale6);
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale17);
        java.lang.String str21 = locale17.getDisplayLanguage();
        java.util.Locale.Builder builder22 = builder16.setLocale(locale17);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fran\347ais" + "'", str8, "fran\347ais");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Chine" + "'", str11, "Chine");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "France" + "'", str14, "France");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "chinois" + "'", str21, "chinois");
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        int int5 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = random0.nextInt((-622915045));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1213727879) + "'", int5 == (-1213727879));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.util.Locale locale4 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getScript();
        java.lang.String str7 = locale4.getDisplayCountry(locale5);
        java.lang.String str8 = locale0.getDisplayCountry(locale4);
        java.lang.String str9 = locale0.getISO3Language();
        java.lang.String str10 = locale0.getCountry();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.util.Locale locale16 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str17 = locale16.getDisplayName();
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        java.lang.String str20 = locale11.getDisplayCountry(locale16);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.lang.String str23 = locale11.getDisplayCountry(locale21);
        java.lang.String str24 = locale11.getScript();
        java.lang.String str25 = locale0.getDisplayVariant(locale11);
        java.util.Locale.setDefault(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u56fd" + "'", str8, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "zho" + "'", str9, "zho");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CN" + "'", str10, "CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str14, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "fran\347ais (Canada)" + "'", str17, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "France" + "'", str20, "France");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u56fd" + "'", str23, "\u6cd5\u56fd");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.Locale locale2 = new java.util.Locale("zh-cn", "\uc911\uad6d\uc5b4");
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.util.Locale locale5 = locale1.stripExtensions();
        java.lang.String str6 = locale0.getDisplayName(locale1);
        java.lang.String str7 = locale0.getDisplayVariant();
        java.util.Locale.setDefault(locale0);
        java.lang.String str9 = locale0.getScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Locale locale9 = java.util.Locale.getDefault(category7);
        java.util.Locale locale10 = java.util.Locale.getDefault(category7);
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale11.getDisplayCountry();
        java.lang.String str14 = locale11.getDisplayScript();
        java.util.Locale.setDefault(category7, locale11);
        java.util.Locale locale16 = java.util.Locale.getDefault(category7);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale17.getDisplayCountry();
        java.util.Locale.setDefault(category7, locale17);
        java.util.Locale locale21 = java.util.Locale.getDefault(category7);
        java.util.Locale locale22 = java.util.Locale.getDefault(category7);
        boolean boolean23 = locale1.equals((java.lang.Object) locale22);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd" + "'", str13, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "France" + "'", str19, "France");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        com.github.javafaker.DateAndTime dateAndTime5 = faker1.date();
        com.github.javafaker.Finance finance6 = faker1.finance();
        java.lang.String str8 = faker1.letterify("\u53f0\u7063");
        java.lang.Class<?> wildcardClass9 = faker1.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertNotNull(finance6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u53f0\u7063" + "'", str8, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        java.lang.String str4 = locale2.getVariant();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.IntStream intStream6 = random5.ints();
        java.util.stream.LongStream longStream9 = random5.longs((long) 1, (long) 100);
        boolean boolean10 = random5.nextBoolean();
        java.util.stream.DoubleStream doubleStream14 = random5.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double15 = random5.nextDouble();
        double double16 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream17 = random5.doubles();
        double double18 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream19 = random5.doubles();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale2, random5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream24 = random5.longs((long) (byte) 0, 7829883033568541535L, (long) (-1155869325));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.16886386473138915d + "'", double15 == 0.16886386473138915d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1867513894838594d + "'", double16 == 0.1867513894838594d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.6561415086993203d + "'", double18 == 0.6561415086993203d);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.Random random1 = new java.util.Random((-7103792676836336750L));
        int int2 = random1.nextInt();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1697525579) + "'", int2 == (-1697525579));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale9 = locale2.stripExtensions();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        java.util.Locale locale12 = builder1.build();
        java.lang.String str13 = locale12.getCountry();
        java.util.Locale locale14 = locale12.stripExtensions();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(locale14);
        com.github.javafaker.PhoneNumber phoneNumber16 = faker15.phoneNumber();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chine" + "'", str7, "Chine");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "CN" + "'", str13, "CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber16);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        java.util.stream.IntStream intStream8 = random0.ints();
        int int10 = random0.nextInt(1);
        float float11 = random0.nextFloat();
        int int12 = random0.nextInt();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.94271207f + "'", float11 == 0.94271207f);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2069789440) + "'", int12 == (-2069789440));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category3);
        java.lang.String str7 = locale0.getDisplayLanguage(locale6);
        java.lang.String str8 = locale6.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chine" + "'", str1, "Chine");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Chine" + "'", str2, "Chine");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "chinois" + "'", str7, "chinois");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "fr-FR" + "'", str8, "fr-FR");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str5 = locale4.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet6 = locale4.getExtensionKeys();
        java.lang.String str7 = locale4.getCountry();
        java.util.Set<java.lang.Character> charSet8 = locale4.getExtensionKeys();
        java.lang.String str9 = locale2.getDisplayCountry(locale4);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.lang.String str11 = locale10.getVariant();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale10.getDisplayName(locale12);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale10);
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(random15);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale10, random15);
        java.util.Locale locale21 = java.util.Locale.getDefault();
        java.lang.String str22 = locale21.getVariant();
        java.util.Locale locale23 = java.util.Locale.GERMANY;
        java.lang.String str24 = locale21.getDisplayName(locale23);
        boolean boolean25 = locale21.hasExtensions();
        java.lang.String str26 = locale10.getDisplayLanguage(locale21);
        java.lang.String str27 = locale21.getScript();
        java.util.Set<java.lang.Character> charSet28 = locale21.getExtensionKeys();
        java.lang.String str29 = locale4.getDisplayCountry(locale21);
        java.lang.String str30 = locale4.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "chinois" + "'", str5, "chinois");
        org.junit.Assert.assertNotNull(charSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TW" + "'", str7, "TW");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u570b" + "'", str9, "\u4e2d\u570b");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream18);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str24, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais" + "'", str26, "fran\347ais");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(charSet28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Taiwan" + "'", str29, "Taiwan");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-TW" + "'", str30, "zh-TW");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.Locale locale3 = new java.util.Locale("fr-CA", "Franz\366sisch", "ko-KR");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        boolean boolean5 = locale3.hasExtensions();
        org.junit.Assert.assertEquals(locale3.toString(), "fr-ca_FRANZ\366SISCH_ko-KR");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Business business6 = faker3.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(business6);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.util.Locale locale3 = new java.util.Locale("\u5fb7\u6587", "\uc774\ud0c8\ub9ac\uc544\uc5b4", "us_EN-GB");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u5fb7\u6587\uc774\ud0c8\ub9ac\uc544\uc5b4_us_EN-GB");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder1.setLanguageTag("\uc911\uad6d\uc5b4");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ???????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.util.Locale locale1 = new java.util.Locale("fr_FR");
        org.junit.Assert.assertEquals(locale1.toString(), "fr_fr");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("United Kingdom", "Chinese China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        java.lang.String str7 = locale4.getDisplayVariant();
        java.lang.String str8 = locale0.getDisplayName(locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale9.getScript();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale9.getDisplayLanguage(locale13);
        java.lang.String str16 = locale13.getScript();
        java.util.Set<java.lang.String> strSet17 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str18 = locale0.getDisplayName(locale13);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Finance finance20 = faker19.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str8, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "chinois" + "'", str15, "chinois");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "chinois (Chine)" + "'", str18, "chinois (Chine)");
        org.junit.Assert.assertNotNull(finance20);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Book book11 = faker10.book();
        com.github.javafaker.Company company12 = faker10.company();
        com.github.javafaker.Company company13 = faker10.company();
        com.github.javafaker.Business business14 = faker10.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str3, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(company12);
        org.junit.Assert.assertNotNull(company13);
        org.junit.Assert.assertNotNull(business14);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale5 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str6 = locale0.getDisplayVariant(locale5);
        java.util.Locale locale10 = new java.util.Locale("hi!", "hi!", "hi!");
        java.lang.String str11 = locale10.getDisplayCountry();
        java.lang.String str12 = locale10.getVariant();
        java.util.Locale locale13 = locale10.stripExtensions();
        java.util.Locale.setDefault(locale10);
        java.lang.String str15 = locale5.getDisplayName(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale5.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!" + "'", str11, "HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!_HI!_hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd))" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd))");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder8.setLanguage("en");
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder8.setRegion("South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: South Korea [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Country();
        java.util.Locale locale5 = new java.util.Locale("CN", "TW", "en-GB");
        java.lang.String str6 = locale0.getDisplayName(locale5);
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale7.getScript();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str13 = locale7.getDisplayLanguage(locale11);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.lang.String str15 = locale14.getVariant();
        java.lang.String str16 = locale7.getDisplayVariant(locale14);
        java.lang.String str17 = locale5.getDisplayScript(locale14);
        java.lang.String str18 = locale5.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CAN" + "'", str1, "CAN");
        org.junit.Assert.assertEquals(locale5.toString(), "cn_TW_en-GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "French (Canada)" + "'", str6, "French (Canada)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chinese" + "'", str13, "Chinese");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "cn-TW" + "'", str18, "cn-TW");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.toLanguageTag();
        java.lang.String str5 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.String> strSet6 = locale0.getUnicodeLocaleKeys();
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 0, (double) '#');
        double double11 = random7.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random7.doubles();
        double double13 = random7.nextDouble();
        java.util.stream.IntStream intStream17 = random7.ints(100L, (-1), (int) (byte) 0);
        double double18 = random7.nextGaussian();
        java.util.stream.IntStream intStream19 = random7.ints();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random7);
        java.util.stream.IntStream intStream23 = random7.ints((-1), 988840192);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale0, random7);
        com.github.javafaker.Book book25 = faker24.book();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(doubleStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.49330361876609d + "'", double11 == 0.49330361876609d);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8646384860131813d + "'", double13 == 0.8646384860131813d);
        org.junit.Assert.assertNotNull(intStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0165953186383696d + "'", double18 == 1.0165953186383696d);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(intStream23);
        org.junit.Assert.assertNotNull(book25);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.regexify("");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.LongStream longStream6 = random0.longs();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream11 = random0.ints((-2658270867485180180L), (-1139614796), 176374748);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longStream6);
        org.junit.Assert.assertNotNull(doubleStream7);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale9);
        java.lang.String str13 = locale9.getISO3Language();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "China" + "'", str5, "China");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "China" + "'", str11, "China");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zho" + "'", str13, "zho");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = builder0.build();
        java.util.Locale locale6 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setRegion("\u82f1\u6587\u7f8e\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("zh-CN", 0.004160056601813511d);
        boolean boolean4 = languageRange2.equals((java.lang.Object) (-0.8747031030797259d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "German" + "'", str2, "German");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(random0);
        double double14 = random0.nextGaussian();
        int int16 = random0.nextInt(399703984);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.7584872821932697d + "'", double10 == 0.7584872821932697d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5988723428214572d + "'", double11 == 0.5988723428214572d);
        org.junit.Assert.assertNotNull(doubleStream12);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.8029525207950865d + "'", double14 == 0.8029525207950865d);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 357802362 + "'", int16 == 357802362);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder4.clear();
        java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("taiwan");
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = locale12.getCountry();
        java.lang.String str14 = locale12.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.getScript();
        java.lang.String str18 = locale15.getDisplayCountry(locale16);
        java.lang.String str19 = locale12.getDisplayCountry(locale15);
        java.util.Locale.Builder builder20 = builder9.setLocale(locale12);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GB" + "'", str13, "GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-GB" + "'", str14, "en-GB");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u82f1\u56fd" + "'", str19, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream12 = random0.doubles();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        random0.setSeed(145336230785902186L);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.058890679277033d + "'", double4 == 2.058890679277033d);
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.49089045317594937d + "'", double6 == 0.49089045317594937d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.4372614059437351d) + "'", double11 == (-0.4372614059437351d));
        org.junit.Assert.assertNotNull(doubleStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        float float13 = random0.nextFloat();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        java.util.stream.DoubleStream doubleStream16 = random0.doubles((long) 144490656);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7754321039179429d + "'", double4 == 0.7754321039179429d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.3030092f + "'", float13 == 0.3030092f);
        org.junit.Assert.assertNotNull(doubleStream16);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayScript();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.toLanguageTag();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "China" + "'", str3, "China");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4" + "'", str9, "\uc911\uad6d\uc5b4");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles(6307568806413226336L, (double) (-2749219625107083836L), (double) 300217312);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 664035792 + "'", int5 == 664035792);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.String str3 = locale0.toLanguageTag();
        java.util.Locale.setDefault(locale0);
        java.util.Locale.setDefault(locale0);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale7 = builder6.build();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.toLanguageTag();
        java.lang.String str13 = locale10.getDisplayName(locale11);
        java.lang.String str14 = locale10.getDisplayScript();
        java.util.Locale.Builder builder15 = builder6.setLocale(locale10);
        java.lang.String str16 = locale0.getDisplayVariant(locale10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Chinese" + "'", str1, "Chinese");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-TW" + "'", str3, "zh-TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh-CN" + "'", str12, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str13, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        java.util.stream.LongStream longStream6 = random0.longs();
        int int8 = random0.nextInt((int) (short) 10);
        boolean boolean9 = random0.nextBoolean();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream13 = random0.doubles((-4481357915018277824L), (-0.28099094103901257d), (-0.17172212624309557d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.36946308251804527d) + "'", double4 == (-0.36946308251804527d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-5111347718301354679L) + "'", long5 == (-5111347718301354679L));
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("French");
        java.util.Locale locale4 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.removeUnicodeLocaleAttribute("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder15 = builder0.setLanguageTag("USA");
        java.util.Locale.Builder builder17 = builder0.setRegion("");
        java.util.Locale.Builder builder19 = builder17.setLanguage("us");
        java.util.Locale.Builder builder20 = builder17.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder20.setLanguage("\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("chinese");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "chinese");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        com.github.javafaker.PhoneNumber phoneNumber2 = faker0.phoneNumber();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker0.phoneNumber();
        java.lang.String str5 = faker0.bothify("can_CN_en-gb");
        com.github.javafaker.Company company6 = faker0.company();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertNotNull(phoneNumber2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "can_CN_en-gb" + "'", str5, "can_CN_en-gb");
        org.junit.Assert.assertNotNull(company6);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.Random random1 = new java.util.Random((-992460362189845646L));
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.Random random1 = new java.util.Random((long) (-1480715465));
        java.util.stream.LongStream longStream3 = random1.longs(0L);
        java.util.stream.DoubleStream doubleStream5 = random1.doubles(8651399998613895826L);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream5);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Code code11 = faker10.code();
        java.lang.String str13 = faker10.numerify("Franz\366sisch (Frankreich)");
        com.github.javafaker.DateAndTime dateAndTime14 = faker10.date();
        com.github.javafaker.DateAndTime dateAndTime15 = faker10.date();
        com.github.javafaker.Name name16 = faker10.name();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (Taiwan)" + "'", str3, "Chinesisch (Taiwan)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(dateAndTime14);
        org.junit.Assert.assertNotNull(dateAndTime15);
        org.junit.Assert.assertNotNull(name16);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.Random random1 = new java.util.Random((long) (-1480715465));
        java.util.stream.LongStream longStream3 = random1.longs(0L);
        java.util.stream.LongStream longStream4 = random1.longs();
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(longStream4);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getISO3Language();
        java.util.Random random5 = new java.util.Random();
        java.util.stream.IntStream intStream6 = random5.ints();
        java.util.stream.LongStream longStream9 = random5.longs((long) 1, (long) 100);
        boolean boolean10 = random5.nextBoolean();
        java.util.stream.DoubleStream doubleStream14 = random5.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double15 = random5.nextDouble();
        double double16 = random5.nextDouble();
        java.util.stream.DoubleStream doubleStream17 = random5.doubles();
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random5);
        double double19 = random5.nextGaussian();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company21 = faker20.company();
        com.github.javafaker.Finance finance22 = faker20.finance();
        com.github.javafaker.DateAndTime dateAndTime23 = faker20.date();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zho" + "'", str4, "zho");
        org.junit.Assert.assertNotNull(intStream6);
        org.junit.Assert.assertNotNull(longStream9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1949428217348793d + "'", double15 == 0.1949428217348793d);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.877490999373123d + "'", double16 == 0.877490999373123d);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.5632116427111745d + "'", double19 == 0.5632116427111745d);
        org.junit.Assert.assertNotNull(company21);
        org.junit.Assert.assertNotNull(finance22);
        org.junit.Assert.assertNotNull(dateAndTime23);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        com.github.javafaker.PhoneNumber phoneNumber3 = faker1.phoneNumber();
        java.lang.String str5 = faker1.regexify("\u82f1\u6587");
        java.lang.String str7 = faker1.letterify("en");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(phoneNumber3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u82f1\u6587" + "'", str5, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en" + "'", str7, "en");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.IntStream intStream17 = random0.ints((long) 2109552831, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream21 = random0.doubles(1847242113680462994L, (double) 1, (double) 100);
        double double22 = random0.nextDouble();
        double double23 = random0.nextGaussian();
        double double24 = random0.nextDouble();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(doubleStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.11813886340686197d + "'", double22 == 0.11813886340686197d);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.101635510138105d + "'", double23 == 1.101635510138105d);
// flaky:         org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.3048624817904827d + "'", double24 == 0.3048624817904827d);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.App app4 = faker0.app();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Address address6 = faker0.address();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(app4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(address6);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        boolean boolean7 = random0.nextBoolean();
        java.util.stream.LongStream longStream8 = random0.longs();
        boolean boolean9 = random0.nextBoolean();
        double double10 = random0.nextDouble();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.17036713799441305d + "'", double4 == 0.17036713799441305d);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6870010314150539921L + "'", long5 == 6870010314150539921L);
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8316042f + "'", float6 == 0.8316042f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.29487733726375753d + "'", double10 == 0.29487733726375753d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.Locale locale3 = new java.util.Locale("CN", "zho", "Chine");
        java.util.Locale locale4 = locale3.stripExtensions();
        java.lang.String str5 = locale3.getVariant();
        org.junit.Assert.assertEquals(locale3.toString(), "cn_ZHO_Chine");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "cn_ZHO_Chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chine" + "'", str5, "Chine");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        float float10 = random0.nextFloat();
        java.util.stream.IntStream intStream12 = random0.ints(0L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.46829486f + "'", float10 == 0.46829486f);
        org.junit.Assert.assertNotNull(intStream12);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.lang.String str4 = locale3.getDisplayCountry();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale3.getCountry();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "China" + "'", str4, "China");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CN" + "'", str6, "CN");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("CHN", strMap1);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = null;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        java.util.Locale.FilteringMode filteringMode25 = null;
        java.util.List<java.lang.String> strList26 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList23, filteringMode25);
        java.util.List<java.lang.String> strList27 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList23);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap31 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList32 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, strMap31);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags(languageRangeList32, (java.util.Collection<java.lang.String>) strList35);
        java.lang.String str38 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList37);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.lang.String str52 = locale51.toLanguageTag();
        java.util.Locale locale53 = locale51.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = locale55.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.toLanguageTag();
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.getScript();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale48, locale49, locale50, locale53, locale54, locale57, locale58, locale60, locale62, locale63, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale locale71 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet74 = locale73.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet75 = locale73.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode76 = null;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strSet75, filteringMode76);
        java.lang.String str78 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet75);
        java.util.Locale locale79 = java.util.Locale.getDefault();
        java.lang.String str80 = locale79.getVariant();
        java.util.Set<java.lang.String> strSet81 = locale79.getUnicodeLocaleKeys();
        java.lang.String str82 = java.util.Locale.lookupTag(languageRangeList2, (java.util.Collection<java.lang.String>) strSet81);
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + filteringMode16 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode16.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(languageRangeList32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
// flaky:         org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh-CN" + "'", str52, "zh-CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh-CN" + "'", str64, "zh-CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strSet81);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder7 = builder3.addUnicodeLocaleAttribute("French");
        java.util.Locale.Builder builder8 = builder7.clear();
        java.util.Locale.Builder builder9 = builder8.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setRegion("Chinese China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        java.util.stream.IntStream intStream13 = random0.ints((int) (byte) 1, (int) ' ');
        java.util.stream.IntStream intStream15 = random0.ints(1133475767620805068L);
        java.util.stream.IntStream intStream17 = random0.ints(6604187400076253514L);
        java.lang.Class<?> wildcardClass18 = random0.getClass();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-2.0164409176195726d) + "'", double4 == (-2.0164409176195726d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8044922766916202d + "'", double6 == 0.8044922766916202d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream15);
        org.junit.Assert.assertNotNull(intStream17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.Random random1 = new java.util.Random(5919081647118974530L);
        java.util.stream.LongStream longStream2 = random1.longs();
        org.junit.Assert.assertNotNull(longStream2);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale2.getDisplayScript(locale4);
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.lang.String str12 = locale2.getScript();
        java.lang.String str13 = locale2.getISO3Language();
        java.lang.String str14 = locale2.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "eng" + "'", str13, "eng");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u6587" + "'", str14, "\u82f1\u6587");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        long long5 = random0.nextLong();
        float float6 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream10 = random0.doubles((long) 383222448, 0.0d, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream12 = random0.longs((-4737254369196149287L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.2752031210525332d) + "'", double4 == (-1.2752031210525332d));
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-7420677458856293099L) + "'", long5 == (-7420677458856293099L));
// flaky:         org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.9496981f + "'", float6 == 0.9496981f);
        org.junit.Assert.assertNotNull(doubleStream10);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        double double11 = random0.nextDouble();
        int int12 = random0.nextInt();
        java.util.stream.IntStream intStream13 = random0.ints();
        random0.setSeed(8438480684970442663L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5817727671562533d + "'", double10 == 0.5817727671562533d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9812087299757644d + "'", double11 == 0.9812087299757644d);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-362367002) + "'", int12 == (-362367002));
        org.junit.Assert.assertNotNull(intStream13);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.util.Locale locale3 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale3.getDisplayCountry(locale4);
        java.lang.String str7 = locale2.getDisplayScript(locale4);
        com.github.javafaker.Faker faker8 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address9 = faker8.address();
        com.github.javafaker.Number number10 = faker8.number();
        com.github.javafaker.Hacker hacker11 = faker8.hacker();
        java.lang.String str13 = faker8.regexify("en-gb");
        boolean boolean14 = locale2.equals((java.lang.Object) faker8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(address9);
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(hacker11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-gb" + "'", str13, "en-gb");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.getDisplayCountry();
        java.lang.String str4 = locale0.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet5 = locale0.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        com.github.javafaker.Internet internet7 = faker0.internet();
        com.github.javafaker.Color color8 = faker0.color();
        com.github.javafaker.Options options9 = faker0.options();
        com.github.javafaker.PhoneNumber phoneNumber10 = faker0.phoneNumber();
        com.github.javafaker.Name name11 = faker0.name();
        java.lang.String str13 = faker0.letterify("fr");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(options9);
        org.junit.Assert.assertNotNull(phoneNumber10);
        org.junit.Assert.assertNotNull(name11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr" + "'", str13, "fr");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
        java.util.Locale locale6 = new java.util.Locale("zh_TW", "\u6cd5\u6587\u6cd5\u56fd)", "");
        java.lang.String str7 = locale1.getDisplayVariant(locale6);
        java.lang.String str8 = locale1.getISO3Country();
        java.util.Set<java.lang.String> strSet9 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CHN" + "'", str8, "CHN");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Set<java.lang.String> strSet12 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet13 = locale2.getUnicodeLocaleAttributes();
        java.lang.Class<?> wildcardClass14 = strSet13.getClass();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.App app16 = faker15.app();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.7267154518634258d + "'", double4 == 0.7267154518634258d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1757492664 + "'", int14 == 1757492664);
        org.junit.Assert.assertNotNull(app16);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        java.util.stream.LongStream longStream4 = random0.longs();
        double double5 = random0.nextDouble();
        java.util.stream.LongStream longStream9 = random0.longs(606167875098546778L, (-4445700532534197469L), (long) (short) 0);
        java.util.stream.IntStream intStream11 = random0.ints(8133817034288133054L);
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.32526498336959486d + "'", double2 == 0.32526498336959486d);
        org.junit.Assert.assertNotNull(doubleStream3);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6333610536307298d + "'", double5 == 0.6333610536307298d);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(intStream11);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getDisplayName();
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale0.getISO3Country();
        java.lang.String str5 = locale0.getDisplayCountry();
        java.lang.String str6 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str1, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CAN" + "'", str4, "CAN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u52a0\u62ff\u5927" + "'", str5, "\u52a0\u62ff\u5927");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fra" + "'", str6, "fra");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.Locale locale1 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(locale1);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: ?? ?? could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "\u6cd5\u6587\u6cd5\u56fd");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale11.getScript();
        java.lang.String str18 = locale11.getDisplayVariant();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.lang.String str20 = locale19.getScript();
        java.lang.String str21 = locale19.getDisplayCountry();
        java.lang.String str22 = locale19.toLanguageTag();
        java.lang.String str23 = locale19.getVariant();
        java.lang.String str24 = locale19.getDisplayVariant();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.getScript();
        java.lang.String str28 = locale26.getDisplayCountry();
        java.lang.String str29 = locale26.getDisplayCountry();
        java.lang.String str30 = locale26.getISO3Language();
        java.lang.String str31 = locale25.getDisplayLanguage(locale26);
        java.lang.String str32 = locale19.getDisplayLanguage(locale26);
        java.util.Locale locale33 = locale19.stripExtensions();
        java.lang.String str34 = locale11.getDisplayCountry(locale19);
        java.lang.String str35 = locale19.getDisplayName();
        java.lang.String str36 = locale19.getCountry();
        java.util.Random random37 = new java.util.Random();
        java.util.stream.IntStream intStream38 = random37.ints();
        double double39 = random37.nextGaussian();
        java.util.stream.DoubleStream doubleStream40 = random37.doubles();
        long long41 = random37.nextLong();
        double double42 = random37.nextGaussian();
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(random37);
        java.util.stream.IntStream intStream44 = random37.ints();
        java.util.stream.LongStream longStream46 = random37.longs(7975027329722967446L);
        double double47 = random37.nextDouble();
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(locale19, random37);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u4e2d\u56fd" + "'", str28, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u56fd" + "'", str29, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zho" + "'", str30, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u82f1\u6587" + "'", str31, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u4e2d\u56fd" + "'", str34, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str35, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "CN" + "'", str36, "CN");
        org.junit.Assert.assertNotNull(intStream38);
// flaky:         org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.5029157041180018d + "'", double39 == 0.5029157041180018d);
        org.junit.Assert.assertNotNull(doubleStream40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-358691161302765681L) + "'", long41 == (-358691161302765681L));
// flaky:         org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.4412442648582057d + "'", double42 == 0.4412442648582057d);
        org.junit.Assert.assertNotNull(intStream44);
        org.junit.Assert.assertNotNull(longStream46);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.08470206408384151d + "'", double47 == 0.08470206408384151d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale1.getDisplayCountry();
        java.lang.String str4 = locale1.getDisplayCountry();
        java.lang.String str5 = locale1.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getVariant();
        java.lang.String str8 = locale1.getDisplayScript(locale6);
        java.util.Locale.setDefault(category0, locale6);
        java.lang.String str10 = locale6.getDisplayName();
        java.lang.String str11 = locale6.getScript();
        java.lang.Object obj12 = locale6.clone();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str5, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str10, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "zh_CN");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        java.util.Locale.Builder builder9 = builder5.setLanguage("GBR");
        java.util.Locale.Builder builder11 = builder9.addUnicodeLocaleAttribute("und");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fra");
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        java.lang.String str5 = locale3.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fra" + "'", str5, "fra");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        com.github.javafaker.Color color5 = faker3.color();
        com.github.javafaker.Options options6 = faker3.options();
        com.github.javafaker.Finance finance7 = faker3.finance();
        com.github.javafaker.Code code8 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(options6);
        org.junit.Assert.assertNotNull(finance7);
        org.junit.Assert.assertNotNull(code8);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.Random random1 = new java.util.Random(4141253966330920663L);
        java.util.stream.LongStream longStream5 = random1.longs((long) 1790226314, (long) 'u', 520842913875285284L);
        boolean boolean6 = random1.nextBoolean();
        java.util.stream.DoubleStream doubleStream8 = random1.doubles((long) 108279374);
        org.junit.Assert.assertNotNull(longStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleStream8);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Code code6 = faker0.code();
        java.lang.String str8 = faker0.letterify("ITA");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ITA" + "'", str8, "ITA");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguageTag("\u82f1\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh" + "'", str1, "zh");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("Deutsch (Deutschland)");
        java.util.Locale.Builder builder2 = new java.util.Locale.Builder();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.Builder builder5 = builder2.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = locale6.getDisplayName(locale7);
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Locale.Builder builder11 = builder2.setLocale(locale6);
        java.lang.String str12 = locale1.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "zh-CN" + "'", str8, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str9, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Random random6 = new java.util.Random();
        java.util.stream.IntStream intStream7 = random6.ints();
        java.util.stream.LongStream longStream10 = random6.longs((long) 1, (long) 100);
        boolean boolean11 = random6.nextBoolean();
        java.util.stream.DoubleStream doubleStream15 = random6.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double16 = random6.nextDouble();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale5, random6);
        java.util.stream.DoubleStream doubleStream20 = random6.doubles((double) (-2506914755829807295L), (double) 100.0f);
        double double21 = random6.nextDouble();
        boolean boolean22 = random6.nextBoolean();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        random6.nextBytes(byteArray29);
        long long31 = random6.nextLong();
        boolean boolean32 = languageRange1.equals((java.lang.Object) random6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "chinese" + "'", str2, "chinese");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(intStream7);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleStream15);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9397265377431328d + "'", double16 == 0.9397265377431328d);
        org.junit.Assert.assertNotNull(doubleStream20);
// flaky:         org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.633342333986704d + "'", double21 == 0.633342333986704d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[29, 118, 91, -24, 105, 13]");
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 8888814282553885089L + "'", long31 == 8888814282553885089L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.lang.String str6 = locale2.getISO3Language();
        java.lang.String str7 = locale2.getLanguage();
        java.util.Locale locale8 = java.util.Locale.ROOT;
        java.lang.String str9 = locale2.getDisplayScript(locale8);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale2);
        java.util.Locale.setDefault(category0, locale2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale13.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale13);
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = locale18.getExtension('u');
        com.github.javafaker.Faker faker21 = new com.github.javafaker.Faker(locale18);
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale25 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale26.getDisplayName();
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale30.getCountry();
        java.lang.String str32 = locale30.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale34 = java.util.Locale.CHINA;
        java.lang.String str35 = locale34.getScript();
        java.lang.String str36 = locale33.getDisplayCountry(locale34);
        java.lang.String str37 = locale30.getDisplayCountry(locale33);
        java.lang.String str38 = locale28.getDisplayScript(locale30);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale39.getVariant();
        java.util.Locale locale41 = java.util.Locale.GERMANY;
        java.lang.String str42 = locale39.getDisplayName(locale41);
        com.github.javafaker.Faker faker43 = new com.github.javafaker.Faker(locale39);
        java.util.Random random44 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream47 = random44.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker48 = new com.github.javafaker.Faker(random44);
        com.github.javafaker.Faker faker49 = new com.github.javafaker.Faker(locale39, random44);
        java.util.Locale locale50 = java.util.Locale.getDefault();
        java.lang.String str51 = locale50.getVariant();
        java.util.Locale locale52 = java.util.Locale.GERMANY;
        java.lang.String str53 = locale50.getDisplayName(locale52);
        boolean boolean54 = locale50.hasExtensions();
        java.lang.String str55 = locale39.getDisplayLanguage(locale50);
        java.lang.String str56 = locale30.getDisplayVariant(locale50);
        java.lang.String str57 = locale25.getDisplayName(locale30);
        java.lang.String str58 = locale25.getDisplayVariant();
        java.util.Locale.setDefault(category0, locale25);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh" + "'", str7, "zh");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals(locale25.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str27, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GB" + "'", str31, "GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "en-GB" + "'", str32, "en-GB");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u56fd" + "'", str36, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\u82f1\u56fd" + "'", str37, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Chinesisch (China)" + "'", str42, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream47);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Chinesisch (China)" + "'", str53, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\u4e2d\u6587" + "'", str55, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str57, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Address address5 = faker0.address();
        java.lang.String str7 = faker0.letterify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        com.github.javafaker.Business business8 = faker0.business();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(address5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str7, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder7 = builder5.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder7.setLanguage("fran\347ais (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: franc?ais (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.IntStream intStream16 = random0.ints((long) 863273936);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(intStream16);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u53f0\u6e7e\u5730\u533a", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.util.Random random1 = new java.util.Random(4141253966330920663L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream3 = random1.longs((long) (-739135946));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("eng");
        java.util.Locale.Builder builder9 = builder7.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.removeUnicodeLocaleAttribute("\u53f0\u7063");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale.Builder builder9 = builder5.setExtension('u', "");
        java.util.Locale.Builder builder10 = builder5.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setVariant("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: fr-CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.toLanguageTag();
        java.util.Locale locale4 = locale2.stripExtensions();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale2);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.lang.String str7 = locale6.getDisplayCountry();
        java.lang.String str8 = locale2.getDisplayVariant(locale6);
        java.util.Locale locale9 = locale2.stripExtensions();
        java.util.Locale.Builder builder10 = builder1.setLocale(locale9);
        java.util.Locale.Builder builder11 = builder1.clearExtensions();
        java.util.Locale locale12 = builder1.build();
        java.util.Locale.Builder builder14 = builder1.setLanguageTag("CAN");
        java.util.Locale.Builder builder16 = builder1.addUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder18 = builder1.setLanguageTag("en-gb");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setRegion("Chinese China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinese China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.lang.String str3 = locale2.getScript();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.toLanguageTag();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.lang.String str7 = locale1.getDisplayName(locale2);
        java.lang.String str8 = locale2.getScript();
        java.lang.String str9 = locale2.getScript();
        java.lang.String str10 = locale2.getDisplayCountry();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u56fd" + "'", str4, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str7, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextDouble();
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream6 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4947868302460166d + "'", double2 == 1.4947868302460166d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.21767786700686353d + "'", double4 == 0.21767786700686353d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream6);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        java.util.stream.LongStream longStream10 = random0.longs();
        double double11 = random0.nextGaussian();
        java.util.stream.LongStream longStream12 = random0.longs();
        java.util.stream.LongStream longStream13 = random0.longs();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.4493945945933422d + "'", double4 == 1.4493945945933422d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.26906778555727023d) + "'", double11 == (-0.26906778555727023d));
        org.junit.Assert.assertNotNull(longStream12);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Code code11 = faker10.code();
        com.github.javafaker.PhoneNumber phoneNumber12 = faker10.phoneNumber();
        com.github.javafaker.Book book13 = faker10.book();
        com.github.javafaker.Company company14 = faker10.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(code11);
        org.junit.Assert.assertNotNull(phoneNumber12);
        org.junit.Assert.assertNotNull(book13);
        org.junit.Assert.assertNotNull(company14);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.util.Locale locale14 = locale12.stripExtensions();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        java.util.Locale locale19 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale19);
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = locale24.stripExtensions();
        java.util.Locale locale27 = java.util.Locale.CHINA;
        java.lang.String str28 = locale27.getScript();
        java.util.Locale[] localeArray29 = new java.util.Locale[] { locale9, locale10, locale11, locale14, locale15, locale18, locale19, locale21, locale23, locale24, locale27 };
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.Locale locale32 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList30);
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        java.util.Locale.FilteringMode filteringMode40 = null;
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList38, filteringMode40);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.List<java.lang.String> strList48 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList47);
        java.util.Collection<java.util.Locale> localeCollection49 = null;
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection49);
        java.util.Collection<java.util.Locale> localeCollection51 = null;
        java.util.Locale locale52 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, localeCollection51);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh-CN" + "'", str13, "zh-CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zh-CN" + "'", str25, "zh-CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode46.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNull(locale52);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("TWN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList3 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList1, strMap2);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.parse("CHN", strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.Locale.FilteringMode filteringMode14 = null;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList12, filteringMode14);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList18 = new java.util.ArrayList<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList18, strArray17);
        java.util.Locale.FilteringMode filteringMode20 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList21 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList18, filteringMode20);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        java.util.Locale.FilteringMode filteringMode29 = null;
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.lang.String>) strList27, filteringMode29);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList27);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList33 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList33, languageRangeArray32);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList33, strMap35);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags(languageRangeList36, (java.util.Collection<java.lang.String>) strList39);
        java.lang.String str42 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strList41);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.Locale.FilteringMode filteringMode50 = null;
        java.util.List<java.lang.String> strList51 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList48, filteringMode50);
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = locale55.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.KOREAN;
        java.util.Locale locale59 = java.util.Locale.CHINA;
        java.lang.String str60 = locale59.toLanguageTag();
        java.util.Locale locale61 = locale59.stripExtensions();
        java.util.Locale locale62 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale62);
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.toLanguageTag();
        java.util.Locale locale66 = java.util.Locale.UK;
        java.util.Locale locale67 = java.util.Locale.CHINA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = locale67.stripExtensions();
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.getScript();
        java.util.Locale[] localeArray72 = new java.util.Locale[] { locale52, locale53, locale54, locale57, locale58, locale61, locale62, locale64, locale66, locale67, locale70 };
        java.util.ArrayList<java.util.Locale> localeList73 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList73, localeArray72);
        java.util.Locale locale75 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale76 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.util.Locale>) localeList73);
        java.util.Locale locale77 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet78 = locale77.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet79 = locale77.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode80 = null;
        java.util.List<java.lang.String> strList81 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet79, filteringMode80);
        java.lang.String str82 = java.util.Locale.lookupTag(languageRangeList6, (java.util.Collection<java.lang.String>) strSet79);
        java.util.Locale locale83 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet84 = locale83.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet85 = locale83.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList86 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet85);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap87 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList88 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList6, strMap87);
        java.util.Locale locale90 = java.util.Locale.forLanguageTag("fra");
        java.util.Set<java.lang.Character> charSet91 = locale90.getExtensionKeys();
        java.util.Locale locale92 = locale90.stripExtensions();
        java.util.Set<java.lang.String> strSet93 = locale92.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList94 = java.util.Locale.filterTags(languageRangeList6, (java.util.Collection<java.lang.String>) strSet93);
        java.lang.String str95 = java.util.Locale.lookupTag(languageRangeList3, (java.util.Collection<java.lang.String>) strList94);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeList3);
        org.junit.Assert.assertNotNull(languageRangeList6);
        org.junit.Assert.assertNotNull(languageRangeArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + filteringMode20 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode20.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "zh-CN" + "'", str60, "zh-CN");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "zh-CN" + "'", str65, "zh-CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zh-CN" + "'", str68, "zh-CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(localeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNull(locale75);
        org.junit.Assert.assertNull(locale76);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet78);
        org.junit.Assert.assertNotNull(strSet79);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet84);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(languageRangeList88);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "fra");
        org.junit.Assert.assertNotNull(charSet91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "fra");
        org.junit.Assert.assertNotNull(strSet93);
        org.junit.Assert.assertNotNull(strList94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.lang.String str18 = locale1.getISO3Country();
        java.lang.String str19 = locale1.getISO3Country();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2786136017667551334L + "'", long16 == 2786136017667551334L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CHN" + "'", str18, "CHN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CHN" + "'", str19, "CHN");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder8.setLanguage("en");
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale11);
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleAttributes();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getDisplayCountry();
        java.util.Locale locale7 = locale0.stripExtensions();
        java.util.Random random8 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream11 = random8.doubles((double) (byte) 0, (double) '#');
        double double12 = random8.nextGaussian();
        java.util.stream.DoubleStream doubleStream13 = random8.doubles();
        java.util.stream.IntStream intStream16 = random8.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream17 = random8.doubles();
        long long18 = random8.nextLong();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale7, random8);
        java.util.stream.LongStream longStream21 = random8.longs((long) 1272557603);
        double double22 = random8.nextGaussian();
        double double23 = random8.nextDouble();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.3372316191290566d) + "'", double12 == (-0.3372316191290566d));
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(intStream16);
        org.junit.Assert.assertNotNull(doubleStream17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 7374027936914206806L + "'", long18 == 7374027936914206806L);
        org.junit.Assert.assertNotNull(longStream21);
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.276774605350225d + "'", double22 == 3.276774605350225d);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9552749778280064d + "'", double23 == 0.9552749778280064d);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.Locale locale1 = new java.util.Locale("zh_TW");
        org.junit.Assert.assertEquals(locale1.toString(), "zh_tw");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Company company1 = faker0.company();
        java.lang.String str3 = faker0.numerify("GB");
        java.lang.String str5 = faker0.bothify("\u6cd5\u6587\u6cd5\u56fd)");
        com.github.javafaker.Code code6 = faker0.code();
        com.github.javafaker.Company company7 = faker0.company();
        org.junit.Assert.assertNotNull(company1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GB" + "'", str3, "GB");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertNotNull(code6);
        org.junit.Assert.assertNotNull(company7);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u4e2d\u6587\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles();
        int int12 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.010273068631346225d) + "'", double4 == (-0.010273068631346225d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.6158289473216537d + "'", double6 == 0.6158289473216537d);
        org.junit.Assert.assertNotNull(intStream10);
        org.junit.Assert.assertNotNull(doubleStream11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1768373182 + "'", int12 == 1768373182);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        random0.setSeed((long) 'u');
        boolean boolean14 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3008942074562775d) + "'", double4 == (-0.3008942074562775d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.PhoneNumber phoneNumber5 = faker0.phoneNumber();
        com.github.javafaker.Address address6 = faker0.address();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.Business business8 = faker0.business();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(phoneNumber5);
        org.junit.Assert.assertNotNull(address6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(business8);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.bothify("English (United States)");
        com.github.javafaker.Hacker hacker7 = faker0.hacker();
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "English (United States)" + "'", str6, "English (United States)");
        org.junit.Assert.assertNotNull(hacker7);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale locale4 = new java.util.Locale("Chine");
        java.lang.String str5 = locale0.getDisplayScript(locale4);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        java.util.stream.DoubleStream doubleStream10 = random6.doubles();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Company company13 = faker12.company();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals(locale4.toString(), "chine");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(company13);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale3.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayScript(locale7);
        java.lang.String str10 = locale7.toLanguageTag();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "it-IT" + "'", str10, "it-IT");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale5);
        java.util.Locale.Category category14 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayCountry();
        java.lang.String str18 = locale15.getDisplayCountry();
        java.lang.String str19 = locale15.getDisplayName();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.getVariant();
        java.lang.String str22 = locale15.getDisplayScript(locale20);
        java.util.Locale.setDefault(category14, locale20);
        java.util.Locale locale26 = new java.util.Locale("US", "en-GB");
        java.util.Locale.setDefault(category14, locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder28 = builder13.setLocale(locale26);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: EN-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + category14 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category14.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u56fd" + "'", str18, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str19, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals(locale26.toString(), "us_EN-GB");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags(languageRangeList9, (java.util.Collection<java.lang.String>) strList12);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.Locale.LanguageRange[] languageRangeArray30 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList31 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList31, languageRangeArray30);
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        java.util.Locale.FilteringMode filteringMode37 = null;
        java.util.List<java.lang.String> strList38 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList31, (java.util.Collection<java.lang.String>) strList35, filteringMode37);
        java.util.List<java.lang.String> strList39 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList35);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, strMap43);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        java.util.List<java.lang.String> strList49 = java.util.Locale.filterTags(languageRangeList44, (java.util.Collection<java.lang.String>) strList47);
        java.lang.String str50 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList49);
        java.util.Locale.LanguageRange[] languageRangeArray51 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList52 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList52, languageRangeArray51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        java.util.Locale.FilteringMode filteringMode61 = null;
        java.util.List<java.lang.String> strList62 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.lang.String>) strList59, filteringMode61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = locale66.stripExtensions();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        java.util.Locale locale70 = java.util.Locale.CHINA;
        java.lang.String str71 = locale70.toLanguageTag();
        java.util.Locale locale72 = locale70.stripExtensions();
        java.util.Locale locale73 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale73);
        java.util.Locale locale75 = java.util.Locale.CHINA;
        java.lang.String str76 = locale75.toLanguageTag();
        java.util.Locale locale77 = java.util.Locale.UK;
        java.util.Locale locale78 = java.util.Locale.CHINA;
        java.lang.String str79 = locale78.toLanguageTag();
        java.util.Locale locale80 = locale78.stripExtensions();
        java.util.Locale locale81 = java.util.Locale.CHINA;
        java.lang.String str82 = locale81.getScript();
        java.util.Locale[] localeArray83 = new java.util.Locale[] { locale63, locale64, locale65, locale68, locale69, locale72, locale73, locale75, locale77, locale78, locale81 };
        java.util.ArrayList<java.util.Locale> localeList84 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList84, localeArray83);
        java.util.Locale locale86 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList55, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale87 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList52, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale88 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale89 = java.util.Locale.lookup(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.List<java.util.Locale> localeList90 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList84);
        java.util.Locale locale93 = new java.util.Locale("French", "Chinesisch (China)");
        java.util.Set<java.lang.String> strSet94 = locale93.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList95 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(languageRangeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(languageRangeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(languageRangeList44);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(languageRangeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "zh-CN" + "'", str67, "zh-CN");
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "ko");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "zh-CN" + "'", str71, "zh-CN");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "zh-CN" + "'", str76, "zh-CN");
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale78);
        org.junit.Assert.assertEquals(locale78.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "zh-CN" + "'", str79, "zh-CN");
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(localeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNull(locale87);
        org.junit.Assert.assertNull(locale88);
        org.junit.Assert.assertNull(locale89);
        org.junit.Assert.assertNotNull(localeList90);
        org.junit.Assert.assertEquals(locale93.toString(), "french_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(strSet94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.KOREAN;
        java.util.Locale.Builder builder5 = builder3.setLocale(locale4);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale10.getScript();
        java.util.Set<java.lang.String> strSet14 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale4.getDisplayName(locale10);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale16.getDisplayVariant(locale20);
        java.util.Locale locale23 = java.util.Locale.ENGLISH;
        java.lang.String str24 = locale20.getDisplayName(locale23);
        boolean boolean25 = locale23.hasExtensions();
        java.lang.String str26 = locale23.getISO3Language();
        java.lang.String str27 = locale10.getDisplayLanguage(locale23);
        java.util.Locale locale29 = new java.util.Locale("zh_CN");
        boolean boolean30 = locale29.hasExtensions();
        java.lang.String str31 = locale10.getDisplayName(locale29);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u671d\u9c9c\u6587" + "'", str15, "\u671d\u9c9c\u6587");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Chinese (China)" + "'", str24, "Chinese (China)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "eng" + "'", str26, "eng");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese" + "'", str27, "Chinese");
        org.junit.Assert.assertEquals(locale29.toString(), "zh_cn");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese (China)" + "'", str31, "Chinese (China)");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Chinese China");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese china");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = builder2.build();
        java.util.Locale.Builder builder6 = builder2.setVariant("China");
        java.util.Locale locale7 = builder2.build();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        long long10 = random0.nextLong();
        java.util.stream.IntStream intStream11 = random0.ints();
        java.util.stream.IntStream intStream15 = random0.ints((long) 1, (-1), 1780165113);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.81113583173124d + "'", double4 == 0.81113583173124d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3518257555709684912L + "'", long10 == 3518257555709684912L);
        org.junit.Assert.assertNotNull(intStream11);
        org.junit.Assert.assertNotNull(intStream15);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.Locale locale2 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale3.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getCountry();
        java.lang.String str9 = locale7.toLanguageTag();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale11 = java.util.Locale.CHINA;
        java.lang.String str12 = locale11.getScript();
        java.lang.String str13 = locale10.getDisplayCountry(locale11);
        java.lang.String str14 = locale7.getDisplayCountry(locale10);
        java.lang.String str15 = locale5.getDisplayScript(locale7);
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.lang.String str17 = locale16.getVariant();
        java.util.Locale locale18 = java.util.Locale.GERMANY;
        java.lang.String str19 = locale16.getDisplayName(locale18);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale16);
        java.util.Random random21 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream24 = random21.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker25 = new com.github.javafaker.Faker(random21);
        com.github.javafaker.Faker faker26 = new com.github.javafaker.Faker(locale16, random21);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.lang.String str28 = locale27.getVariant();
        java.util.Locale locale29 = java.util.Locale.GERMANY;
        java.lang.String str30 = locale27.getDisplayName(locale29);
        boolean boolean31 = locale27.hasExtensions();
        java.lang.String str32 = locale16.getDisplayLanguage(locale27);
        java.lang.String str33 = locale7.getDisplayVariant(locale27);
        java.lang.String str34 = locale2.getDisplayName(locale7);
        java.lang.String str35 = locale2.getDisplayVariant();
        java.util.Locale locale37 = new java.util.Locale("ko");
        java.lang.String str38 = locale37.getISO3Language();
        java.lang.String str39 = locale2.getDisplayCountry(locale37);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale40.getISO3Country();
        java.util.Set<java.lang.String> strSet42 = locale40.getUnicodeLocaleKeys();
        java.lang.String str43 = locale2.getDisplayCountry(locale40);
        org.junit.Assert.assertEquals(locale2.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str4, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GB" + "'", str8, "GB");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "en-GB" + "'", str9, "en-GB");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u56fd" + "'", str13, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u82f1\u56fd" + "'", str14, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Chinesisch (China)" + "'", str19, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream24);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Chinesisch (China)" + "'", str30, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u6587" + "'", str32, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str34, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals(locale37.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "kor" + "'", str38, "kor");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "CHINESISCH (CHINA)" + "'", str39, "CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "CAN" + "'", str41, "CAN");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "CHINESISCH (CHINA)" + "'", str43, "CHINESISCH (CHINA)");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.App app7 = faker3.app();
        com.github.javafaker.DateAndTime dateAndTime8 = faker3.date();
        com.github.javafaker.Number number9 = faker3.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(app7);
        org.junit.Assert.assertNotNull(dateAndTime8);
        org.junit.Assert.assertNotNull(number9);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.LongStream longStream3 = random0.longs();
        java.util.stream.DoubleStream doubleStream4 = random0.doubles();
        int int5 = random0.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream9 = random0.ints(1409958607731658842L, 863273936, 863273936);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6837020902821382d + "'", double2 == 0.6837020902821382d);
        org.junit.Assert.assertNotNull(longStream3);
        org.junit.Assert.assertNotNull(doubleStream4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1943001040) + "'", int5 == (-1943001040));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.lang.String str12 = locale11.getVariant();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = locale11.getDisplayName(locale13);
        boolean boolean15 = locale11.hasExtensions();
        java.lang.String str16 = locale0.getDisplayLanguage(locale11);
        java.lang.String str17 = locale0.getISO3Country();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.util.Locale locale19 = java.util.Locale.US;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale22 = new java.util.Locale("Chine");
        java.util.Locale locale23 = java.util.Locale.ROOT;
        java.lang.String str24 = locale23.getDisplayLanguage();
        java.lang.String str25 = locale22.getDisplayName(locale23);
        java.lang.String str26 = locale19.getDisplayName(locale22);
        java.lang.String str27 = locale0.getDisplayName(locale22);
        com.github.javafaker.Faker faker28 = new com.github.javafaker.Faker(locale0);
        java.lang.Object obj29 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chinesisch (China)" + "'", str14, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587" + "'", str16, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "CHN" + "'", str17, "CHN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals(locale22.toString(), "chine");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "chine" + "'", str25, "chine");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English (United States)" + "'", str26, "English (United States)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Chinese (China)" + "'", str27, "Chinese (China)");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "zh_CN");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Code code6 = faker3.code();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = faker3.resolve("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getVariant();
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale3);
        java.lang.String str6 = locale2.getDisplayLanguage(locale3);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale7.getLanguage();
        java.lang.String str9 = locale7.getDisplayScript();
        java.util.Locale locale11 = new java.util.Locale("\u6cd5\u6587\u6cd5\u56fd)");
        java.lang.String str12 = locale7.getDisplayScript(locale11);
        boolean boolean13 = locale3.equals((java.lang.Object) locale11);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
// flaky:         org.junit.Assert.assertEquals(locale1.toString(), "us");
        org.junit.Assert.assertNotNull(locale2);
// flaky:         org.junit.Assert.assertEquals(locale2.toString(), "us");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "us" + "'", str6, "us");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals(locale11.toString(), "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.DateAndTime dateAndTime5 = faker3.date();
        java.lang.String str7 = faker3.regexify("French (Canada)");
        java.lang.String str9 = faker3.regexify("\u6cd5\u56fd");
        com.github.javafaker.Options options10 = faker3.options();
        com.github.javafaker.Number number11 = faker3.number();
        com.github.javafaker.Address address12 = faker3.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(dateAndTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "French Canada" + "'", str7, "French Canada");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u56fd" + "'", str9, "\u6cd5\u56fd");
        org.junit.Assert.assertNotNull(options10);
        org.junit.Assert.assertNotNull(number11);
        org.junit.Assert.assertNotNull(address12);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.DateAndTime dateAndTime1 = faker0.date();
        com.github.javafaker.Address address2 = faker0.address();
        com.github.javafaker.Business business3 = faker0.business();
        com.github.javafaker.Finance finance4 = faker0.finance();
        com.github.javafaker.Lorem lorem5 = faker0.lorem();
        com.github.javafaker.Color color6 = faker0.color();
        com.github.javafaker.Name name7 = faker0.name();
        com.github.javafaker.Book book8 = faker0.book();
        java.lang.String str10 = faker0.regexify("\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
        org.junit.Assert.assertNotNull(dateAndTime1);
        org.junit.Assert.assertNotNull(address2);
        org.junit.Assert.assertNotNull(business3);
        org.junit.Assert.assertNotNull(finance4);
        org.junit.Assert.assertNotNull(lorem5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(name7);
        org.junit.Assert.assertNotNull(book8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN" + "'", str10, "\u6cd5\u6587\u6cd5\u56fd\u4e2d\u56fd_zh_CN");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale locale6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder5.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("French");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        int int15 = random0.nextInt();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.1417979165370302d) + "'", double4 == (-0.1417979165370302d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.21344507747206598d + "'", double6 == 0.21344507747206598d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-0.3315035333345336d) + "'", double11 == (-0.3315035333345336d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1182305032) + "'", int15 == (-1182305032));
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.parse("CN");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList12, strMap13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags(languageRangeList12, (java.util.Collection<java.lang.String>) strList26);
        java.util.List<java.lang.String> strList31 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strList30);
        java.util.Locale.LanguageRange[] languageRangeArray32 = new java.util.Locale.LanguageRange[] {};
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
        java.util.Locale.FilteringMode filteringMode44 = null;
        java.util.List<java.lang.String> strList45 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.lang.String>) strList42, filteringMode44);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.util.Locale locale49 = java.util.Locale.CHINA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.CHINA;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.util.Locale locale56 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale56);
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.lang.String str59 = locale58.toLanguageTag();
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Locale locale61 = java.util.Locale.CHINA;
        java.lang.String str62 = locale61.toLanguageTag();
        java.util.Locale locale63 = locale61.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.CHINA;
        java.lang.String str65 = locale64.getScript();
        java.util.Locale[] localeArray66 = new java.util.Locale[] { locale46, locale47, locale48, locale51, locale52, locale55, locale56, locale58, locale60, locale61, locale64 };
        java.util.ArrayList<java.util.Locale> localeList67 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList67, localeArray66);
        java.util.Locale locale69 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList38, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale locale70 = java.util.Locale.lookup(languageRangeList36, (java.util.Collection<java.util.Locale>) localeList67);
        java.util.Locale locale71 = java.util.Locale.GERMAN;
        java.lang.String str72 = locale71.getISO3Country();
        java.util.Set<java.lang.String> strSet73 = locale71.getUnicodeLocaleKeys();
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList36, (java.util.Collection<java.lang.String>) strSet73);
        java.util.Locale.FilteringMode filteringMode75 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList76 = java.util.Locale.filterTags(languageRangeList10, (java.util.Collection<java.lang.String>) strList74, filteringMode75);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap77 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList78 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap77);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + filteringMode28 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode28.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(languageRangeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeList36);
        org.junit.Assert.assertNotNull(languageRangeArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "ko");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "zh-CN" + "'", str50, "zh-CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "zh-CN" + "'", str54, "zh-CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "zh-CN" + "'", str59, "zh-CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "zh-CN" + "'", str62, "zh-CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(localeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(locale69);
        org.junit.Assert.assertNull(locale70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "de");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertTrue("'" + filteringMode75 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode75.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(languageRangeList78);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.setRegion("CA");
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("French Canada");
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale.Builder builder13 = builder9.setLocale(locale11);
        java.lang.String str14 = locale11.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertNotNull(charSet12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "can_CN_en-gb");
        java.util.Locale.Builder builder6 = builder5.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder5.addUnicodeLocaleAttribute("\u5fb7\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e2d\u6587\u4e2d\u56fd", (-0.37652635359331943d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-0.37652635359331943");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder15 = builder0.setLanguageTag("USA");
        java.util.Locale.Builder builder17 = builder0.setRegion("");
        java.util.Locale.Builder builder19 = builder17.setLanguage("us");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder19.setRegion("French (Canada)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: French (Canada) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Business business4 = faker0.business();
        com.github.javafaker.Company company5 = faker0.company();
        com.github.javafaker.Name name6 = faker0.name();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(business4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(name6);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.Locale locale3 = new java.util.Locale("taiwan", "Royaume-Uni", "ITA");
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        boolean boolean9 = random4.nextBoolean();
        java.util.stream.DoubleStream doubleStream13 = random4.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream17 = random4.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream18 = random4.longs();
        double double19 = random4.nextDouble();
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(random4);
        java.util.stream.IntStream intStream22 = random4.ints(1162426200426189844L);
        int int23 = random4.nextInt();
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale3, random4);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: taiwan_ROYAUME-UNI_ITA could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "taiwan_ROYAUME-UNI_ITA");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream17);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.23152042274953288d + "'", double19 == 0.23152042274953288d);
        org.junit.Assert.assertNotNull(intStream22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1158837503) + "'", int23 == (-1158837503));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random0.nextBytes(byteArray13);
        float float15 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.19891134232391033d + "'", double4 == 0.19891134232391033d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[91, -88, 121]");
// flaky:         org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.44267398f + "'", float15 == 0.44267398f);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        java.lang.String str3 = locale2.getLanguage();
        java.lang.String str4 = locale2.getDisplayScript();
        java.lang.String str6 = locale2.getExtension('u');
        java.util.List<java.util.Locale.LanguageRange> languageRangeList8 = java.util.Locale.LanguageRange.parse("CAN");
        boolean boolean9 = locale2.equals((java.lang.Object) languageRangeList8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(languageRangeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker1 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Number number2 = faker1.number();
        java.lang.String str4 = faker1.bothify("zh");
        java.lang.String str6 = faker1.numerify("China");
        com.github.javafaker.Internet internet7 = faker1.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "China" + "'", str6, "China");
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\u53f0\u7063", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        double double15 = random0.nextDouble();
        java.util.stream.DoubleStream doubleStream17 = random0.doubles(2801011361845611510L);
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.12738358365869495d + "'", double15 == 0.12738358365869495d);
        org.junit.Assert.assertNotNull(doubleStream17);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Random random2 = new java.util.Random();
        java.util.stream.IntStream intStream3 = random2.ints();
        java.util.stream.LongStream longStream6 = random2.longs((long) 1, (long) 100);
        boolean boolean7 = random2.nextBoolean();
        java.util.stream.DoubleStream doubleStream11 = random2.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream15 = random2.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        long long16 = random2.nextLong();
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(locale1, random2);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = locale18.stripExtensions();
        java.lang.String str21 = locale20.getLanguage();
        java.lang.String str22 = locale1.getDisplayLanguage(locale20);
        java.util.Set<java.lang.Character> charSet23 = locale20.getExtensionKeys();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(intStream3);
        org.junit.Assert.assertNotNull(longStream6);
// flaky:         org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-6992502712298584570L) + "'", long16 == (-6992502712298584570L));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh" + "'", str21, "zh");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u6587" + "'", str22, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(charSet23);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.getScript();
        java.lang.String str3 = locale0.getDisplayCountry(locale1);
        java.lang.String str4 = locale1.getLanguage();
        boolean boolean5 = locale1.hasExtensions();
        java.lang.String str6 = locale1.getVariant();
        java.lang.String str7 = locale1.toLanguageTag();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale.Builder builder11 = builder8.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder12 = builder8.clearExtensions();
        java.util.Locale locale13 = builder8.build();
        java.util.Locale locale14 = builder8.build();
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale1.getDisplayCountry(locale14);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u4e2d\u56fd" + "'", str3, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "China" + "'", str16, "China");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale2.getDisplayScript(locale4);
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale12.getDisplayName(locale13);
        java.lang.String str16 = locale2.getDisplayLanguage(locale13);
        java.lang.String str17 = locale2.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str15, "\u6cd5\u6587\u6cd5\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u82f1\u6587" + "'", str16, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eng" + "'", str17, "eng");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Company company4 = faker3.company();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.PhoneNumber phoneNumber6 = faker3.phoneNumber();
        com.github.javafaker.Internet internet7 = faker3.internet();
        java.lang.String str9 = faker3.numerify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        com.github.javafaker.Name name10 = faker3.name();
        com.github.javafaker.Company company11 = faker3.company();
        com.github.javafaker.Business business12 = faker3.business();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(company4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(phoneNumber6);
        org.junit.Assert.assertNotNull(internet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d)" + "'", str9, "\uc911\uad6d\uc5b4\uc911\uad6d)");
        org.junit.Assert.assertNotNull(name10);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertNotNull(business12);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.String str14 = locale1.getDisplayName();
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 0, (double) '#');
        long long19 = random15.nextLong();
        java.util.stream.DoubleStream doubleStream21 = random15.doubles(1793234513106471552L);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale1, random15);
        com.github.javafaker.Hacker hacker23 = faker22.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-718833230991295814L) + "'", long19 == (-718833230991295814L));
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(hacker23);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.UK;
        java.lang.String str10 = locale4.getDisplayName(locale9);
        java.lang.String str11 = locale9.getDisplayVariant();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (China)" + "'", str10, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        double double9 = random0.nextGaussian();
        int int10 = random0.nextInt();
        double double11 = random0.nextGaussian();
        double double12 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream15 = random0.longs((long) 1768373182, (-8905925878746769806L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.07106140958381918d + "'", double4 == 0.07106140958381918d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.2222076030285323d) + "'", double9 == (-1.2222076030285323d));
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1992015609) + "'", int10 == (-1992015609));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1640634530245925d + "'", double11 == 0.1640634530245925d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.5726044325369005d + "'", double12 == 0.5726044325369005d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList10, strMap13);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertNotNull(languageRangeList12);
        org.junit.Assert.assertNotNull(languageRangeList14);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale4);
        java.util.Locale.Builder builder15 = builder1.setLocale(locale4);
        java.util.Locale.Builder builder17 = builder15.setLanguageTag("kor");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setLanguage("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (China)" + "'", str7, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str10, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.Locale locale1 = new java.util.Locale("Chinesisch China");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for chinesisch china");
        } catch (java.util.MissingResourceException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "chinesisch china");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.util.Locale locale3 = new java.util.Locale("fran\347ais", "CN", "English (United States)");
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str5 = locale4.getDisplayName();
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale4.getDisplayVariant(locale6);
        java.lang.String str8 = locale4.getISO3Country();
        java.lang.String str9 = locale4.getDisplayCountry();
        java.lang.String str10 = locale3.getDisplayName(locale4);
        java.lang.String str11 = locale4.getScript();
        java.util.Locale locale12 = locale4.stripExtensions();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale13.getDisplayName(locale14);
        java.lang.String str17 = locale14.getDisplayLanguage();
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale14.getDisplayVariant(locale18);
        java.lang.String str20 = locale4.getDisplayLanguage(locale18);
        org.junit.Assert.assertEquals(locale3.toString(), "fran\347ais_CN_English (United States)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str5, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CAN" + "'", str8, "CAN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u52a0\u62ff\u5927" + "'", str9, "\u52a0\u62ff\u5927");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fran\347ais (Chine,English (United States))" + "'", str10, "fran\347ais (Chine,English (United States))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str16, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587" + "'", str17, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "francese" + "'", str20, "francese");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        double double5 = random0.nextGaussian();
        java.util.stream.IntStream intStream8 = random0.ints(0, 173393359);
        java.util.stream.DoubleStream doubleStream9 = random0.doubles();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5122752875467571d + "'", double5 == 0.5122752875467571d);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(doubleStream9);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        random0.setSeed((long) (short) 1);
        random0.setSeed((-4476219991092281892L));
        float float13 = random0.nextFloat();
        java.util.stream.LongStream longStream14 = random0.longs();
        float float15 = random0.nextFloat();
        java.util.stream.DoubleStream doubleStream19 = random0.doubles(125069947552364732L, 0.6047640181605781d, 0.8035335603095086d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.177217255298161d + "'", double4 == 2.177217255298161d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.3030092f + "'", float13 == 0.3030092f);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.09412557f + "'", float15 == 0.09412557f);
        org.junit.Assert.assertNotNull(doubleStream19);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.Random random1 = new java.util.Random((long) 1757492664);
        com.github.javafaker.Faker faker2 = new com.github.javafaker.Faker(random1);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.util.Locale locale1 = new java.util.Locale("zh-cn (CHINESISCH (CHINA))");
        java.util.Locale locale2 = java.util.Locale.getDefault();
        java.lang.String str3 = locale2.getVariant();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(locale2);
        java.util.Random random7 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream10 = random7.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(random7);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale2, random7);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = locale13.getVariant();
        java.util.Locale locale15 = java.util.Locale.GERMANY;
        java.lang.String str16 = locale13.getDisplayName(locale15);
        boolean boolean17 = locale13.hasExtensions();
        java.lang.String str18 = locale2.getDisplayLanguage(locale13);
        java.lang.String str19 = locale13.getScript();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = locale20.getDisplayLanguage();
        java.util.Locale.setDefault(locale20);
        com.github.javafaker.Faker faker23 = new com.github.javafaker.Faker(locale20);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.lang.String str25 = locale24.getCountry();
        java.lang.String str26 = locale24.toLanguageTag();
        java.lang.String str27 = locale24.getLanguage();
        java.lang.String str28 = locale20.getDisplayName(locale24);
        java.lang.String str29 = locale13.getDisplayScript(locale24);
        java.util.Locale locale30 = locale13.stripExtensions();
        java.lang.String str31 = locale1.getDisplayVariant(locale13);
        org.junit.Assert.assertEquals(locale1.toString(), "zh-cn (chinesisch (china))");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Chinesisch (China)" + "'", str5, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Chinesisch (China)" + "'", str16, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u6587" + "'", str21, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GB" + "'", str25, "GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "en-GB" + "'", str26, "en-GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en" + "'", str27, "en");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinese (Taiwan)" + "'", str28, "Chinese (Taiwan)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.PhoneNumber phoneNumber4 = faker3.phoneNumber();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Name name6 = faker3.name();
        com.github.javafaker.DateAndTime dateAndTime7 = faker3.date();
        java.lang.String str9 = faker3.letterify("de-DE");
        com.github.javafaker.Number number10 = faker3.number();
        com.github.javafaker.Internet internet11 = faker3.internet();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(phoneNumber4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(name6);
        org.junit.Assert.assertNotNull(dateAndTime7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "de-DE" + "'", str9, "de-DE");
        org.junit.Assert.assertNotNull(number10);
        org.junit.Assert.assertNotNull(internet11);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Hacker hacker7 = faker6.hacker();
        com.github.javafaker.Company company8 = faker6.company();
        com.github.javafaker.DateAndTime dateAndTime9 = faker6.date();
        com.github.javafaker.Name name10 = faker6.name();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04710980303215361d + "'", double2 == 0.04710980303215361d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-6640350749462996734L) + "'", long4 == (-6640350749462996734L));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.30603856469365553d + "'", double5 == 0.30603856469365553d);
        org.junit.Assert.assertNotNull(hacker7);
        org.junit.Assert.assertNotNull(company8);
        org.junit.Assert.assertNotNull(dateAndTime9);
        org.junit.Assert.assertNotNull(name10);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("\u6cd5\u6587\u6cd5\u56fd))");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Hacker hacker1 = faker0.hacker();
        com.github.javafaker.DateAndTime dateAndTime2 = faker0.date();
        com.github.javafaker.App app3 = faker0.app();
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Hacker hacker5 = faker0.hacker();
        org.junit.Assert.assertNotNull(hacker1);
        org.junit.Assert.assertNotNull(dateAndTime2);
        org.junit.Assert.assertNotNull(app3);
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(hacker5);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("chinois");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        java.util.Locale.FilteringMode filteringMode12 = null;
        java.util.List<java.lang.String> strList13 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.lang.String>) strList10, filteringMode12);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = locale17.stripExtensions();
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.util.Locale locale21 = java.util.Locale.CHINA;
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Locale locale23 = locale21.stripExtensions();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale24);
        java.util.Locale locale26 = java.util.Locale.CHINA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = locale29.stripExtensions();
        java.util.Locale locale32 = java.util.Locale.CHINA;
        java.lang.String str33 = locale32.getScript();
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale14, locale15, locale16, locale19, locale20, locale23, locale24, locale26, locale28, locale29, locale32 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale locale37 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale locale38 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList35);
        java.util.Locale.LanguageRange[] languageRangeArray39 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList40 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList40, languageRangeArray39);
        java.lang.String[] strArray43 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        java.util.Locale.FilteringMode filteringMode46 = null;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.lang.String>) strList44, filteringMode46);
        java.util.Locale locale48 = java.util.Locale.getDefault();
        java.util.Locale locale49 = java.util.Locale.KOREAN;
        java.util.Locale locale50 = java.util.Locale.KOREAN;
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.lang.String str52 = locale51.toLanguageTag();
        java.util.Locale locale53 = locale51.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.KOREAN;
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.lang.String str56 = locale55.toLanguageTag();
        java.util.Locale locale57 = locale55.stripExtensions();
        java.util.Locale locale58 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale58);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.toLanguageTag();
        java.util.Locale locale65 = locale63.stripExtensions();
        java.util.Locale locale66 = java.util.Locale.CHINA;
        java.lang.String str67 = locale66.getScript();
        java.util.Locale[] localeArray68 = new java.util.Locale[] { locale48, locale49, locale50, locale53, locale54, locale57, locale58, locale60, locale62, locale63, locale66 };
        java.util.ArrayList<java.util.Locale> localeList69 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList69, localeArray68);
        java.util.Locale locale71 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList40, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.List<java.util.Locale> localeList72 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList69);
        java.util.Locale locale73 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList69);
        org.junit.Assert.assertNotNull(languageRangeList1);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zh-CN" + "'", str18, "zh-CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "zh-CN" + "'", str30, "zh-CN");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(localeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNotNull(languageRangeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "zh-CN" + "'", str52, "zh-CN");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "ko");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "zh-CN" + "'", str56, "zh-CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "zh-CN" + "'", str64, "zh-CN");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(localeArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(localeList72);
        org.junit.Assert.assertNull(locale73);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("TW", strMap1);
        org.junit.Assert.assertNotNull(languageRangeList2);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Korean");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale locale8 = builder7.build();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale locale5 = java.util.Locale.UK;
        java.lang.String str6 = locale5.getCountry();
        java.lang.String str7 = locale5.toLanguageTag();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale8.getDisplayCountry(locale9);
        java.lang.String str12 = locale5.getDisplayCountry(locale8);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale5);
        java.util.Locale.Builder builder15 = builder0.setLanguageTag("USA");
        java.util.Locale.Builder builder17 = builder0.setRegion("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder17.setRegion("Chinesisch China");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Chinesisch China [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GB" + "'", str6, "GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en-GB" + "'", str7, "en-GB");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u56fd" + "'", str12, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("zh");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        double double5 = languageRange1.getWeight();
        double double6 = languageRange1.getWeight();
        double double7 = languageRange1.getWeight();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh" + "'", str3, "zh");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh" + "'", str4, "zh");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale4.getDisplayCountry(locale14);
        java.lang.String str17 = locale4.getDisplayScript();
        java.util.Locale.Builder builder18 = builder2.setLocale(locale4);
        java.util.Locale.Builder builder19 = builder2.clear();
        java.util.Locale.Builder builder21 = builder19.setLanguage("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder23 = builder21.setLanguage("Deutsch (Deutschland)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Deutsch (Deutschland) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (China)" + "'", str7, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str10, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        double double15 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random11.doubles();
        java.util.stream.IntStream intStream19 = random11.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream20 = random11.doubles();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random11.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.IntStream intStream27 = random0.ints();
        long long28 = random0.nextLong();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.1756728701533092d + "'", double4 == 1.1756728701533092d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.6020421210169824d + "'", double15 == 0.6020421210169824d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[13, -39, 48]");
        org.junit.Assert.assertNotNull(intStream27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 4588402558924444080L + "'", long28 == 4588402558924444080L);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        long long4 = random0.nextLong();
        double double5 = random0.nextGaussian();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream7 = random0.ints();
        long long8 = random0.nextLong();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.DoubleStream doubleStream12 = random0.doubles((-246768450226620793L), 0.3810503450167802d, 0.7463457510663756d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.21412513871384628d) + "'", double2 == (-0.21412513871384628d));
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5624837060647987350L + "'", long4 == 5624837060647987350L);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.31545421968427767d + "'", double5 == 0.31545421968427767d);
        org.junit.Assert.assertNotNull(intStream7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2226985458339997787L) + "'", long8 == (-2226985458339997787L));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder6.clearExtensions();
        java.util.Locale.Builder builder9 = builder6.removeUnicodeLocaleAttribute("taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder9.setLanguageTag("French Canada");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: French Canada [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        java.lang.String str14 = faker12.regexify("fr-CA");
        com.github.javafaker.Finance finance15 = faker12.finance();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr-CA" + "'", str14, "fr-CA");
        org.junit.Assert.assertNotNull(finance15);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getLanguage();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.lang.String str6 = locale3.getDisplayName(locale4);
        java.lang.String str7 = locale4.getDisplayLanguage();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.lang.String str9 = locale4.getDisplayVariant(locale8);
        java.lang.String str10 = locale2.getDisplayScript(locale4);
        java.lang.String str11 = locale0.getDisplayCountry(locale2);
        java.lang.String str12 = locale0.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str6, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "South Korea" + "'", str11, "South Korea");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "KR" + "'", str12, "KR");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.clear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.toLanguageTag();
        java.util.Locale.Builder builder8 = builder3.setLocale(locale4);
        java.util.Locale.Builder builder10 = builder8.setLanguage("en");
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale13);
        java.lang.String str15 = locale11.getDisplayVariant(locale13);
        java.util.Locale.Builder builder16 = builder8.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder16.clearExtensions();
        java.util.Locale locale18 = builder16.build();
        java.util.Locale locale19 = builder16.build();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "zh-CN" + "'", str7, "zh-CN");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.Locale locale2 = new java.util.Locale("US", "en-GB");
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet4 = locale2.getExtensionKeys();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.lang.String str6 = locale5.getDisplayCountry();
        java.lang.String str7 = locale5.getDisplayCountry();
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault(category8);
        java.util.Locale locale10 = java.util.Locale.getDefault(category8);
        java.util.Locale locale11 = java.util.Locale.getDefault(category8);
        java.lang.String str12 = locale5.getDisplayLanguage(locale11);
        java.util.Set<java.lang.String> strSet13 = locale11.getUnicodeLocaleKeys();
        java.lang.String str14 = locale2.getDisplayScript(locale11);
        org.junit.Assert.assertEquals(locale2.toString(), "us_EN-GB");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "us" + "'", str3, "us");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u56fd" + "'", str7, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("Koreanisch");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Koreanisch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.util.Locale locale2 = java.util.Locale.FRANCE;
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.toLanguageTag();
        java.lang.String str5 = locale2.getDisplayName(locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = locale3.getDisplayVariant(locale7);
        java.lang.String str9 = locale1.getDisplayScript(locale3);
        java.util.Locale.Builder builder10 = builder0.setLocale(locale3);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str13 = locale11.getUnicodeLocaleType("zh");
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(locale11);
        java.lang.String str15 = locale11.toLanguageTag();
        java.util.Locale.Builder builder16 = builder0.setLocale(locale11);
        java.util.Locale.Builder builder17 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder19 = builder0.setScript("French");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: French [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "zh-CN" + "'", str4, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str5, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-TW" + "'", str15, "zh-TW");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.lang.String str6 = locale1.getDisplayVariant(locale5);
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale5);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getVariant();
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.util.Locale locale12 = java.util.Locale.getDefault(category10);
        java.util.Locale locale13 = java.util.Locale.getDefault(category10);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.getDisplayCountry();
        java.lang.String str16 = locale14.getDisplayCountry();
        java.lang.String str17 = locale14.getDisplayScript();
        java.util.Locale.setDefault(category10, locale14);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.lang.String str22 = locale19.getDisplayName(locale20);
        java.lang.String str23 = locale20.getDisplayLanguage();
        java.util.Locale.setDefault(category10, locale20);
        java.lang.String str25 = locale8.getDisplayVariant(locale20);
        java.lang.String str26 = locale8.getISO3Language();
        boolean boolean27 = locale5.equals((java.lang.Object) str26);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str22, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587" + "'", str23, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "zho" + "'", str26, "zho");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Locale locale5 = java.util.Locale.getDefault(category3);
        java.util.Locale locale6 = java.util.Locale.getDefault(category3);
        java.lang.String str7 = locale0.getDisplayLanguage(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u56fd" + "'", str1, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u4e2d\u56fd" + "'", str2, "\u4e2d\u56fd");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.lang.String str10 = locale9.getScript();
        java.lang.String str11 = locale9.getDisplayCountry();
        java.util.Locale.setDefault(category0, locale9);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = locale14.stripExtensions();
        java.lang.String str17 = locale13.getDisplayVariant(locale14);
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(locale14);
        java.util.Locale locale19 = locale14.stripExtensions();
        java.util.Locale.setDefault(locale14);
        java.util.Locale.setDefault(category0, locale14);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("zh-CN");
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str25 = locale24.getScript();
        java.lang.String str26 = locale24.getDisplayCountry();
        java.lang.String str27 = locale24.toLanguageTag();
        java.util.Locale locale28 = locale24.stripExtensions();
        java.lang.String str29 = locale23.getDisplayName(locale24);
        java.lang.String str30 = locale24.getScript();
        java.lang.String str31 = locale24.getScript();
        java.lang.String str32 = locale14.getDisplayCountry(locale24);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u56fd" + "'", str11, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zh-CN" + "'", str27, "zh-CN");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str29, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u4e2d\u56fd" + "'", str32, "\u4e2d\u56fd");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str2 = locale0.getUnicodeLocaleType("ko");
        java.lang.String str3 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DEU" + "'", str3, "DEU");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        double double15 = random0.nextDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.LongStream longStream19 = random0.longs(0L, 8651399998613895826L, (long) 1027445918);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9771777670545884d + "'", double15 == 0.9771777670545884d);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale0.getDisplayCountry(locale10);
        java.lang.String str13 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet14 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u56fd" + "'", str12, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zho" + "'", str13, "zho");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u6587" + "'", str15, "\u4e2d\u6587");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder1.setLanguageTag("coreano");
        java.util.Locale.Builder builder4 = builder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setScript("English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: English [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        java.util.Locale.Builder builder6 = builder5.clear();
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayCountry();
        java.lang.String str11 = locale7.getDisplayName();
        java.lang.String str12 = locale7.getDisplayLanguage();
        java.util.Locale.Builder builder13 = builder6.setLocale(locale7);
        java.util.Locale.Builder builder15 = builder6.addUnicodeLocaleAttribute("CHN");
        java.util.Locale locale16 = builder15.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder15.setScript("zh-cn");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: zh-cn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u4e2d\u56fd" + "'", str10, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str11, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN_#u-chn");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        double double6 = random0.nextDouble();
        java.util.stream.IntStream intStream10 = random0.ints(100L, (-1), (int) (byte) 0);
        double double11 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints();
        java.util.stream.DoubleStream doubleStream13 = random0.doubles();
        java.util.stream.LongStream longStream14 = random0.longs();
        random0.setSeed(3376856765316790501L);
        com.github.javafaker.Faker faker17 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Lorem lorem18 = faker17.lorem();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0652184363931874d) + "'", double4 == (-1.0652184363931874d));
        org.junit.Assert.assertNotNull(doubleStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.8620779640516917d + "'", double6 == 0.8620779640516917d);
        org.junit.Assert.assertNotNull(intStream10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.8073099470734564d) + "'", double11 == (-1.8073099470734564d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(doubleStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(lorem18);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream5 = random0.longs();
        double double6 = random0.nextGaussian();
        double double7 = random0.nextGaussian();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
        org.junit.Assert.assertNotNull(longStream5);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.2736350137006252d + "'", double6 == 1.2736350137006252d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08362412200137112d + "'", double7 == 0.08362412200137112d);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.lang.String str8 = locale0.getExtension('a');
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = locale9.getVariant();
        java.util.Locale locale11 = java.util.Locale.GERMANY;
        java.lang.String str12 = locale9.getDisplayName(locale11);
        com.github.javafaker.Faker faker13 = new com.github.javafaker.Faker(locale9);
        java.util.Random random14 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream17 = random14.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker18 = new com.github.javafaker.Faker(random14);
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale9, random14);
        com.github.javafaker.Faker faker20 = new com.github.javafaker.Faker(locale0, random14);
        com.github.javafaker.Color color21 = faker20.color();
        com.github.javafaker.Address address22 = faker20.address();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Chinesisch (China)" + "'", str12, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream17);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(address22);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream7 = random0.longs((long) 963875490);
        float float8 = random0.nextFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream12 = random0.ints((long) 352608531, 664035792, (-1693540704));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be greater than origin");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.07984112110911872d + "'", double4 == 0.07984112110911872d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5198652f + "'", float8 == 0.5198652f);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.Locale locale1 = new java.util.Locale("\u7fa9\u5927\u5229\u6587");
        org.junit.Assert.assertEquals(locale1.toString(), "\u7fa9\u5927\u5229\u6587");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale4.getDisplayScript();
        java.util.Locale.setDefault(category0, locale4);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.lang.String str12 = locale9.getDisplayName(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale.setDefault(category0, locale10);
        java.util.Locale locale15 = java.util.Locale.getDefault(category0);
        java.util.Locale locale16 = java.util.Locale.CHINA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = locale16.stripExtensions();
        com.github.javafaker.Faker faker19 = new com.github.javafaker.Faker(locale16);
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.lang.String str22 = locale16.getDisplayVariant(locale20);
        java.lang.String str24 = locale16.getExtension('a');
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.lang.String str26 = locale25.getVariant();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = locale25.getDisplayName(locale27);
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(locale25);
        java.util.Random random30 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream33 = random30.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker34 = new com.github.javafaker.Faker(random30);
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale25, random30);
        com.github.javafaker.Faker faker36 = new com.github.javafaker.Faker(locale16, random30);
        com.github.javafaker.Faker faker37 = new com.github.javafaker.Faker(locale16);
        java.util.Locale.setDefault(category0, locale16);
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-CN" + "'", str11, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str12, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zh-CN" + "'", str17, "zh-CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u4e2d\u56fd" + "'", str21, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Chinesisch (China)" + "'", str28, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream33);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale.Builder builder4 = builder2.clear();
        java.util.Locale.Builder builder5 = builder2.clearExtensions();
        java.util.Locale.Builder builder7 = builder2.setVariant("");
        java.util.Locale.Builder builder8 = builder2.clearExtensions();
        java.util.Locale locale9 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder11 = builder8.setLanguage("chinois Chine");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: chinois Chine [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Random random2 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream5 = random2.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random2);
        java.util.stream.DoubleStream doubleStream9 = random2.doubles((-1.0d), 0.028145596690574037d);
        double double10 = random2.nextDouble();
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale0, random2);
        com.github.javafaker.Options options12 = faker11.options();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u82f1\u56fd" + "'", str1, "\u82f1\u56fd");
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2567638852929005d + "'", double10 == 0.2567638852929005d);
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        java.util.stream.LongStream longStream13 = random0.longs((long) (short) 0, (long) (short) -1, (long) (short) 0);
        java.util.stream.LongStream longStream14 = random0.longs();
        java.util.stream.LongStream longStream18 = random0.longs(5288735684466769752L, 1L, (long) 100);
        int int20 = random0.nextInt(383222448);
        java.util.stream.IntStream intStream23 = random0.ints((-1987686354), (int) '4');
        boolean boolean24 = random0.nextBoolean();
        double double25 = random0.nextGaussian();
        java.util.stream.IntStream intStream29 = random0.ints((long) 'a', 0, 1638965069);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = random0.nextInt((-20357948));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: bound must be positive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(longStream13);
        org.junit.Assert.assertNotNull(longStream14);
        org.junit.Assert.assertNotNull(longStream18);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 185101247 + "'", int20 == 185101247);
        org.junit.Assert.assertNotNull(intStream23);
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.972118449296514d) + "'", double25 == (-0.972118449296514d));
        org.junit.Assert.assertNotNull(intStream29);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.util.Locale locale3 = new java.util.Locale("CAN", "CN", "en-gb");
        // The following exception was thrown during execution in test generation
        try {
            com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale3);
            org.junit.Assert.fail("Expected exception of type com.github.javafaker.service.LocaleDoesNotExistException; message: can_CN_en-gb could not be found, does not have a corresponding yaml file");
        } catch (com.github.javafaker.service.LocaleDoesNotExistException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "can_CN_en-gb");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.util.Locale locale2 = new java.util.Locale("English", "fran\347ais (Canada)");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("hi!");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder8 = builder6.setVariant("");
        java.util.Locale.Builder builder11 = builder8.setExtension('u', "zh");
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.getScript();
        java.lang.String str15 = locale13.getDisplayCountry();
        java.lang.String str16 = locale13.getDisplayCountry();
        java.lang.String str17 = locale13.getDisplayName();
        java.lang.String str18 = locale13.getDisplayLanguage();
        java.util.Locale.Builder builder19 = builder12.setLocale(locale13);
        java.lang.String str20 = locale5.getDisplayScript(locale13);
        java.lang.String str21 = locale5.getLanguage();
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = locale22.getDisplayName();
        java.util.Locale locale24 = java.util.Locale.US;
        java.lang.String str25 = locale22.getDisplayVariant(locale24);
        java.lang.String str26 = locale24.getCountry();
        java.lang.String str27 = locale5.getDisplayName(locale24);
        java.lang.String str28 = locale2.getDisplayScript(locale5);
        org.junit.Assert.assertEquals(locale2.toString(), "english_FRAN\347AIS (CANADA)");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u4e2d\u56fd" + "'", str15, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str17, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u4e2d\u6587" + "'", str18, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str23, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "US" + "'", str26, "US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = locale5.getDisplayName();
        java.util.Locale locale7 = java.util.Locale.US;
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.lang.String str9 = locale0.getDisplayCountry(locale5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Address address11 = faker10.address();
        java.lang.String str13 = faker10.regexify("South Korea");
        java.lang.String str15 = faker10.numerify("eng");
        com.github.javafaker.App app16 = faker10.app();
        com.github.javafaker.Number number17 = faker10.number();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str6, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Chine" + "'", str9, "Chine");
        org.junit.Assert.assertNotNull(address11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "South Korea" + "'", str13, "South Korea");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(number17);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.lang.String str6 = locale3.toLanguageTag();
        java.lang.String str7 = locale3.getScript();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh-CN" + "'", str6, "zh-CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        java.util.stream.LongStream longStream10 = random0.longs();
        java.util.Random random11 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream14 = random11.doubles((double) (byte) 0, (double) '#');
        double double15 = random11.nextGaussian();
        java.util.stream.DoubleStream doubleStream16 = random11.doubles();
        java.util.stream.IntStream intStream19 = random11.ints((int) (byte) 10, (int) '#');
        java.util.stream.DoubleStream doubleStream20 = random11.doubles();
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 100 };
        random11.nextBytes(byteArray24);
        random0.nextBytes(byteArray24);
        java.util.stream.LongStream longStream27 = random0.longs();
        java.util.stream.IntStream intStream30 = random0.ints(0, 591147);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.17123344133295368d) + "'", double4 == (-0.17123344133295368d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(longStream10);
        org.junit.Assert.assertNotNull(doubleStream14);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.10526810078161342d + "'", double15 == 0.10526810078161342d);
        org.junit.Assert.assertNotNull(doubleStream16);
        org.junit.Assert.assertNotNull(intStream19);
        org.junit.Assert.assertNotNull(doubleStream20);
        org.junit.Assert.assertNotNull(byteArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[86, -72, 24]");
        org.junit.Assert.assertNotNull(longStream27);
        org.junit.Assert.assertNotNull(intStream30);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u6587");
        java.lang.String str2 = locale1.getCountry();
        java.lang.String str3 = locale1.toLanguageTag();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "und" + "'", str3, "und");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.App app6 = faker0.app();
        java.lang.String str8 = faker0.numerify("\u4e2d\u6587");
        com.github.javafaker.Color color9 = faker0.color();
        java.lang.String str11 = faker0.regexify("ITA");
        java.lang.String str13 = faker0.numerify("fran\347ais (Canada)");
        com.github.javafaker.Options options14 = faker0.options();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u4e2d\u6587" + "'", str8, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fran\347ais (Canada)" + "'", str13, "fran\347ais (Canada)");
        org.junit.Assert.assertNotNull(options14);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.Locale locale1 = new java.util.Locale("\u4e2d\u570b");
        java.util.Locale.Category category2 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale6 = new java.util.Locale("CAN", "CN", "en-gb");
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale.setDefault(category2, locale7);
        java.lang.String str10 = locale7.getExtension('u');
        java.lang.String str11 = locale1.getDisplayScript(locale7);
        java.lang.String str12 = locale1.getISO3Country();
        org.junit.Assert.assertEquals(locale1.toString(), "\u4e2d\u570b");
        org.junit.Assert.assertTrue("'" + category2 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category2.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertEquals(locale6.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "can_CN_en-gb");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder2 = builder0.clear();
        java.util.Locale locale3 = builder2.build();
        java.lang.String str4 = locale3.getDisplayName();
        java.lang.String str5 = locale3.getCountry();
        java.lang.Object obj6 = locale3.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        double double10 = random0.nextGaussian();
        java.util.stream.IntStream intStream12 = random0.ints(7975027329722967446L);
        java.util.stream.IntStream intStream15 = random0.ints((int) (short) 10, 352608531);
        float float16 = random0.nextFloat();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.05012395533932044d) + "'", double4 == (-0.05012395533932044d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.5412281757974264d) + "'", double10 == (-0.5412281757974264d));
        org.junit.Assert.assertNotNull(intStream12);
        org.junit.Assert.assertNotNull(intStream15);
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.23725957f + "'", float16 == 0.23725957f);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale locale2 = builder1.build();
        java.util.Locale locale3 = java.util.Locale.CHINA;
        java.lang.String str4 = locale3.getVariant();
        java.util.Locale.Builder builder5 = builder1.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder5.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder8 = builder7.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder7.removeUnicodeLocaleAttribute("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: United Kingdom [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayCountry();
        java.lang.String str3 = locale0.toLanguageTag();
        java.lang.String str4 = locale0.getVariant();
        java.lang.String str5 = locale0.getDisplayVariant();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale7.getDisplayCountry();
        java.lang.String str10 = locale7.getDisplayCountry();
        java.lang.String str11 = locale7.getISO3Language();
        java.lang.String str12 = locale6.getDisplayLanguage(locale7);
        java.lang.String str13 = locale0.getDisplayLanguage(locale7);
        java.util.Locale.setDefault(locale7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "China" + "'", str2, "China");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh-CN" + "'", str3, "zh-CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "China" + "'", str9, "China");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "China" + "'", str10, "China");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u82f1\u6587" + "'", str12, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.IntStream intStream8 = random0.ints((int) (byte) 10, (int) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.DateAndTime dateAndTime10 = faker9.date();
        com.github.javafaker.Book book11 = faker9.book();
        com.github.javafaker.Internet internet12 = faker9.internet();
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.44250803509461684d) + "'", double4 == (-0.44250803509461684d));
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(intStream8);
        org.junit.Assert.assertNotNull(dateAndTime10);
        org.junit.Assert.assertNotNull(book11);
        org.junit.Assert.assertNotNull(internet12);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("fran\347ais (Chine,English (United States))", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=franc?ais(chine");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream9 = random0.doubles((long) (byte) 100, 0.0d, (double) (short) 100);
        double double10 = random0.nextDouble();
        java.util.stream.IntStream intStream13 = random0.ints((-1504576282), (-1155869325));
        java.util.stream.IntStream intStream14 = random0.ints();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream9);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0599582544617695d + "'", double10 == 0.0599582544617695d);
        org.junit.Assert.assertNotNull(intStream13);
        org.junit.Assert.assertNotNull(intStream14);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.lang.String str4 = locale0.getDisplayName();
        java.lang.String str5 = locale0.getDisplayScript();
        java.lang.String str6 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str4, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zh" + "'", str6, "zh");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.Locale locale2 = new java.util.Locale("us_EN-GB", "fr_CA");
        java.lang.String str3 = locale2.getCountry();
        org.junit.Assert.assertEquals(locale2.toString(), "us_en-gb_FR_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FR_CA" + "'", str3, "FR_CA");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextDouble();
        boolean boolean5 = random0.nextBoolean();
        com.github.javafaker.Faker faker6 = new com.github.javafaker.Faker(random0);
        java.util.stream.IntStream intStream8 = random0.ints((long) 'a');
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0358954539756209d + "'", double2 == 1.0358954539756209d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.04435470990739476d + "'", double4 == 0.04435470990739476d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        float float8 = random0.nextFloat();
        boolean boolean9 = random0.nextBoolean();
        java.util.stream.LongStream longStream13 = random0.longs(3422989099713268259L, (-246768450226620793L), 145336230785902186L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.IntStream intStream17 = random0.ints((-2340538979381485881L), 65, (-1565762321));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size must be non-negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
// flaky:         org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.866997f + "'", float8 == 0.866997f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(longStream13);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder5 = builder0.setExtension('a', "fra");
        java.util.Locale.Builder builder7 = builder5.setLanguage("GBR");
        java.util.Locale.Builder builder8 = builder5.clear();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getScript();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str6 = locale0.getDisplayLanguage(locale4);
        java.lang.String str7 = locale4.getScript();
        java.util.Set<java.lang.String> strSet8 = locale4.getUnicodeLocaleAttributes();
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(locale4);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        double double2 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles();
        double double4 = random0.nextGaussian();
        float float5 = random0.nextFloat();
        boolean boolean6 = random0.nextBoolean();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(random0);
        com.github.javafaker.Name name8 = faker7.name();
        org.junit.Assert.assertNotNull(intStream1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2782380703765224d + "'", double2 == 1.2782380703765224d);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-0.3774416956520335d) + "'", double4 == (-0.3774416956520335d));
// flaky:         org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.38048452f + "'", float5 == 0.38048452f);
// flaky:         org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(name8);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder4 = builder0.setLanguage("");
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder8 = builder5.setExtension('a', "Royaume-Uni");
        java.util.Locale locale10 = new java.util.Locale("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = locale13.stripExtensions();
        java.lang.String str16 = locale12.getDisplayVariant(locale13);
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = locale17.getDisplayName(locale18);
        java.lang.String str21 = locale18.getDisplayScript();
        java.lang.String str22 = locale18.getDisplayCountry();
        java.lang.String str23 = locale13.getDisplayCountry(locale18);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = locale24.getDisplayName();
        java.lang.String str26 = locale24.getVariant();
        java.lang.String str27 = locale13.getDisplayLanguage(locale24);
        java.lang.String str28 = locale10.getDisplayVariant(locale24);
        java.util.Locale locale29 = locale10.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder30 = builder8.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ?? (???) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals(locale10.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "und" + "'", str11, "und");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zh-CN" + "'", str14, "zh-CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "zh-CN" + "'", str19, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str20, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u56fd" + "'", str22, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u56fd" + "'", str23, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str25, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "chinois" + "'", str27, "chinois");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        com.github.javafaker.Hacker hacker5 = faker3.hacker();
        com.github.javafaker.Code code6 = faker3.code();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertNotNull(hacker5);
        org.junit.Assert.assertNotNull(code6);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        java.lang.String str2 = locale1.getVariant();
        java.util.Locale locale3 = java.util.Locale.GERMANY;
        java.lang.String str4 = locale1.getDisplayName(locale3);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Random random6 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream9 = random6.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(random6);
        com.github.javafaker.Faker faker11 = new com.github.javafaker.Faker(locale1, random6);
        com.github.javafaker.Faker faker12 = new com.github.javafaker.Faker(locale0, random6);
        com.github.javafaker.Business business13 = faker12.business();
        com.github.javafaker.PhoneNumber phoneNumber14 = faker12.phoneNumber();
        com.github.javafaker.Lorem lorem15 = faker12.lorem();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Chinesisch (China)" + "'", str4, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream9);
        org.junit.Assert.assertNotNull(business13);
        org.junit.Assert.assertNotNull(phoneNumber14);
        org.junit.Assert.assertNotNull(lorem15);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Options options4 = faker0.options();
        java.lang.String str6 = faker0.bothify("GBR");
        com.github.javafaker.Address address7 = faker0.address();
        java.lang.Class<?> wildcardClass8 = faker0.getClass();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GBR" + "'", str6, "GBR");
        org.junit.Assert.assertNotNull(address7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("CHN");
        java.util.Locale.Builder builder4 = builder0.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.setLanguage("Chine");
        java.util.Locale.Builder builder7 = builder4.clearExtensions();
        java.util.Locale.Builder builder9 = builder7.removeUnicodeLocaleAttribute("France");
        java.util.Locale.Builder builder10 = builder7.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder12 = builder10.setLanguageTag("Chinesisch (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: Chinesisch (Taiwan) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        java.lang.String str3 = faker0.numerify("");
        com.github.javafaker.Lorem lorem4 = faker0.lorem();
        com.github.javafaker.Name name5 = faker0.name();
        com.github.javafaker.Number number6 = faker0.number();
        java.lang.String str8 = faker0.numerify("GB");
        com.github.javafaker.Internet internet9 = faker0.internet();
        com.github.javafaker.Company company10 = faker0.company();
        java.lang.String str12 = faker0.numerify("kor");
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(lorem4);
        org.junit.Assert.assertNotNull(name5);
        org.junit.Assert.assertNotNull(number6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GB" + "'", str8, "GB");
        org.junit.Assert.assertNotNull(internet9);
        org.junit.Assert.assertNotNull(company10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "kor" + "'", str12, "kor");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Name name4 = faker3.name();
        java.lang.String str6 = faker3.bothify("\u4e2d\u56fd");
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = faker3.bothify("\u6cd5\u6587\u52a0\u62ff\u5927)");
        java.lang.String str11 = faker3.letterify("zh");
        java.lang.String str13 = faker3.regexify("fr-CA");
        com.github.javafaker.Options options14 = faker3.options();
        com.github.javafaker.App app15 = faker3.app();
        com.github.javafaker.App app16 = faker3.app();
        com.github.javafaker.App app17 = faker3.app();
        java.lang.String str19 = faker3.regexify("hi!");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(name4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u56fd" + "'", str6, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(business7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str9, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh" + "'", str11, "zh");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fr-CA" + "'", str13, "fr-CA");
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(app15);
        org.junit.Assert.assertNotNull(app16);
        org.junit.Assert.assertNotNull(app17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Random random4 = new java.util.Random();
        java.util.stream.IntStream intStream5 = random4.ints();
        java.util.stream.LongStream longStream8 = random4.longs((long) 1, (long) 100);
        java.util.stream.LongStream longStream9 = random4.longs();
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random4);
        java.lang.String str11 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(intStream5);
        org.junit.Assert.assertNotNull(longStream8);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.util.Random random1 = new java.util.Random((-3019054096168434161L));
        java.util.stream.DoubleStream doubleStream2 = random1.doubles();
        double double3 = random1.nextGaussian();
        org.junit.Assert.assertNotNull(doubleStream2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1627958081085985d) + "'", double3 == (-1.1627958081085985d));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale1.getISO3Language();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.toLanguageTag();
        java.util.Locale locale6 = locale4.stripExtensions();
        com.github.javafaker.Faker faker7 = new com.github.javafaker.Faker(locale4);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.lang.String str10 = locale4.getDisplayVariant(locale8);
        java.lang.String str11 = locale1.getDisplayScript(locale8);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = locale8.getDisplayScript(locale12);
        java.util.Locale locale16 = java.util.Locale.forLanguageTag("\u7f8e\u56fd");
        java.lang.String str17 = locale8.getDisplayScript(locale16);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kor" + "'", str3, "kor");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zh-CN" + "'", str5, "zh-CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u4e2d\u56fd" + "'", str9, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ko-KR" + "'", str13, "ko-KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder5 = builder2.setExtension('u', "zh");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder2.setVariant("cn_TW_en-GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: cn_TW_en-GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.getLanguage();
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleAttributes();
        java.lang.String str5 = locale0.getExtension('x');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh" + "'", str2, "zh");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.github.javafaker.Faker faker0 = new com.github.javafaker.Faker();
        com.github.javafaker.Address address1 = faker0.address();
        com.github.javafaker.Number number2 = faker0.number();
        com.github.javafaker.Finance finance3 = faker0.finance();
        com.github.javafaker.Options options4 = faker0.options();
        com.github.javafaker.Business business5 = faker0.business();
        com.github.javafaker.Company company6 = faker0.company();
        com.github.javafaker.Internet internet7 = faker0.internet();
        org.junit.Assert.assertNotNull(address1);
        org.junit.Assert.assertNotNull(number2);
        org.junit.Assert.assertNotNull(finance3);
        org.junit.Assert.assertNotNull(options4);
        org.junit.Assert.assertNotNull(business5);
        org.junit.Assert.assertNotNull(company6);
        org.junit.Assert.assertNotNull(internet7);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("Taiwan", 0.6866727861559659d);
        double double3 = languageRange2.getWeight();
        double double4 = languageRange2.getWeight();
        double double5 = languageRange2.getWeight();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6866727861559659d + "'", double3 == 0.6866727861559659d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.6866727861559659d + "'", double4 == 0.6866727861559659d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.6866727861559659d + "'", double5 == 0.6866727861559659d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setVariant("");
        java.util.Locale.Builder builder3 = builder2.clear();
        java.util.Locale locale4 = java.util.Locale.getDefault();
        java.lang.String str5 = locale4.getVariant();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.lang.String str7 = locale4.getDisplayName(locale6);
        boolean boolean8 = locale4.hasExtensions();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getDisplayName();
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        java.lang.String str13 = locale4.getDisplayCountry(locale9);
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.lang.String str16 = locale4.getDisplayCountry(locale14);
        java.lang.String str17 = locale4.getDisplayScript();
        java.util.Locale.Builder builder18 = builder2.setLocale(locale4);
        java.util.Locale locale19 = builder18.build();
        java.util.Locale locale20 = builder18.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder22 = builder18.setVariant("Englisch (Vereinigtes K\366nigreich)");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: Englisch (Vereinigtes Ko?nigreich) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Chinesisch (China)" + "'", str7, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str10, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Chine" + "'", str13, "Chine");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "zh-CN" + "'", str15, "zh-CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u56fd" + "'", str16, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        com.github.javafaker.Hacker hacker4 = faker3.hacker();
        com.github.javafaker.Company company5 = faker3.company();
        com.github.javafaker.App app6 = faker3.app();
        com.github.javafaker.Business business7 = faker3.business();
        java.lang.String str9 = null; // flaky: faker3.regexify("\uc911\uad6d\uc5b4\uc911\uad6d)");
        java.lang.String str11 = faker3.bothify("italiano");
        com.github.javafaker.Hacker hacker12 = faker3.hacker();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(hacker4);
        org.junit.Assert.assertNotNull(company5);
        org.junit.Assert.assertNotNull(app6);
        org.junit.Assert.assertNotNull(business7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\uc911\uad6d\uc5b4\uc911\uad6d" + "'", str9, "\uc911\uad6d\uc5b4\uc911\uad6d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "italiano" + "'", str11, "italiano");
        org.junit.Assert.assertNotNull(hacker12);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Locale locale3 = locale1.stripExtensions();
        java.lang.String str4 = locale0.getDisplayVariant(locale1);
        com.github.javafaker.Faker faker5 = new com.github.javafaker.Faker(locale1);
        java.util.Locale locale6 = locale1.stripExtensions();
        java.lang.String str7 = locale6.getCountry();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CN" + "'", str7, "CN");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = locale0.stripExtensions();
        com.github.javafaker.Faker faker3 = new com.github.javafaker.Faker(locale0);
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.lang.String str5 = locale4.getDisplayCountry();
        java.lang.String str6 = locale0.getDisplayVariant(locale4);
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale4.getDisplayName(locale7);
        java.lang.String str9 = locale7.getDisplayScript();
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.lang.String str13 = locale7.getDisplayVariant(locale11);
        java.lang.Object obj14 = locale7.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u4e2d\u56fd" + "'", str5, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinese (China)" + "'", str8, "Chinese (China)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(charSet10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "en");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "en");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "en");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.lang.String str3 = locale0.getDisplayName(locale1);
        java.lang.String str4 = locale1.getDisplayLanguage();
        java.util.Locale.setDefault(locale1);
        java.util.Locale locale6 = java.util.Locale.CHINA;
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getScript();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleAttributes();
        java.lang.String str12 = locale6.getDisplayLanguage(locale10);
        java.lang.String str13 = locale1.getDisplayName(locale6);
        java.lang.String str14 = locale1.getDisplayName();
        java.util.Random random15 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream18 = random15.doubles((double) (byte) 0, (double) '#');
        long long19 = random15.nextLong();
        java.util.stream.DoubleStream doubleStream21 = random15.doubles(1793234513106471552L);
        com.github.javafaker.Faker faker22 = new com.github.javafaker.Faker(locale1, random15);
        java.util.Random random23 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream26 = random23.doubles((double) (byte) 0, (double) '#');
        double double27 = random23.nextGaussian();
        java.util.stream.DoubleStream doubleStream28 = random23.doubles();
        boolean boolean29 = random23.nextBoolean();
        java.util.stream.LongStream longStream32 = random23.longs((long) 'a', (long) 401882126);
        float float33 = random23.nextFloat();
        double double34 = random23.nextGaussian();
        com.github.javafaker.Faker faker35 = new com.github.javafaker.Faker(locale1, random23);
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clear();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale locale39 = java.util.Locale.CHINA;
        com.github.javafaker.Faker faker40 = new com.github.javafaker.Faker(locale39);
        java.util.Locale.Builder builder41 = builder38.setLocale(locale39);
        java.lang.String str42 = locale39.getDisplayCountry();
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = locale43.getCountry();
        java.lang.String str45 = locale43.toLanguageTag();
        java.lang.String str46 = locale43.getLanguage();
        java.lang.String str47 = locale43.getDisplayLanguage();
        java.lang.String str48 = locale43.toLanguageTag();
        java.lang.String str49 = locale39.getDisplayLanguage(locale43);
        java.lang.String str50 = locale1.getDisplayVariant(locale43);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh-CN" + "'", str2, "zh-CN");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u6cd5\u6587\u6cd5\u56fd)" + "'", str3, "\u6cd5\u6587\u6cd5\u56fd)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u4e2d\u6587" + "'", str4, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u4e2d\u6587" + "'", str12, "\u4e2d\u6587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str13, "\u4e2d\u6587\u4e2d\u56fd)");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str14, "\u4e2d\u6587\u4e2d\u56fd)");
        org.junit.Assert.assertNotNull(doubleStream18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8299313697544275857L + "'", long19 == 8299313697544275857L);
        org.junit.Assert.assertNotNull(doubleStream21);
        org.junit.Assert.assertNotNull(doubleStream26);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.542442496823285d + "'", double27 == 0.542442496823285d);
        org.junit.Assert.assertNotNull(doubleStream28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(longStream32);
// flaky:         org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.7626632f + "'", float33 == 0.7626632f);
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.8695738641171564d) + "'", double34 == (-0.8695738641171564d));
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u56fd" + "'", str42, "\u4e2d\u56fd");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "GB" + "'", str44, "GB");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en-GB" + "'", str45, "en-GB");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "en" + "'", str46, "en");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\u82f1\u6587" + "'", str47, "\u82f1\u6587");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "en-GB" + "'", str48, "en-GB");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Chinese" + "'", str49, "Chinese");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.setVariant("");
        java.util.Locale.Builder builder5 = builder1.clearExtensions();
        java.util.Locale.Builder builder6 = builder1.clearExtensions();
        java.util.Locale.Builder builder8 = builder1.addUnicodeLocaleAttribute("German");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.util.Locale locale3 = new java.util.Locale("hi!", "hi!", "hi!");
        boolean boolean4 = locale3.hasExtensions();
        java.lang.String str5 = locale3.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale3.getDisplayScript();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_HI!_hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        com.github.javafaker.Faker faker4 = new com.github.javafaker.Faker(locale0);
        java.util.Random random5 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream8 = random5.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker9 = new com.github.javafaker.Faker(random5);
        com.github.javafaker.Faker faker10 = new com.github.javafaker.Faker(locale0, random5);
        com.github.javafaker.Company company11 = faker10.company();
        java.lang.String str13 = faker10.bothify("Franz\366sisch (Frankreich)");
        com.github.javafaker.Company company14 = faker10.company();
        com.github.javafaker.Name name15 = faker10.name();
        com.github.javafaker.Business business16 = faker10.business();
        java.lang.Class<?> wildcardClass17 = business16.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream8);
        org.junit.Assert.assertNotNull(company11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Franz\366sisch (Frankreich)" + "'", str13, "Franz\366sisch (Frankreich)");
        org.junit.Assert.assertNotNull(company14);
        org.junit.Assert.assertNotNull(name15);
        org.junit.Assert.assertNotNull(business16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList5, strArray4);
        java.util.Locale.FilteringMode filteringMode7 = null;
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList5, filteringMode7);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.util.Locale.FilteringMode filteringMode13 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList11, filteringMode13);
        java.util.Locale.LanguageRange[] languageRangeArray15 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList16 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList16, languageRangeArray15);
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.util.Locale.FilteringMode filteringMode22 = null;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList16, (java.util.Collection<java.lang.String>) strList20, filteringMode22);
        java.util.List<java.lang.String> strList24 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap28 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList29 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, strMap28);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags(languageRangeList29, (java.util.Collection<java.lang.String>) strList32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.Locale.FilteringMode filteringMode43 = null;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList41, filteringMode43);
        java.util.Locale locale45 = java.util.Locale.getDefault();
        java.util.Locale locale46 = java.util.Locale.KOREAN;
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Locale locale48 = java.util.Locale.CHINA;
        java.lang.String str49 = locale48.toLanguageTag();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = locale52.stripExtensions();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale.setDefault(locale55);
        java.util.Locale locale57 = java.util.Locale.CHINA;
        java.lang.String str58 = locale57.toLanguageTag();
        java.util.Locale locale59 = java.util.Locale.UK;
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.lang.String str61 = locale60.toLanguageTag();
        java.util.Locale locale62 = locale60.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.CHINA;
        java.lang.String str64 = locale63.getScript();
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale45, locale46, locale47, locale50, locale51, locale54, locale55, locale57, locale59, locale60, locale63 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        java.util.Locale locale68 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        java.util.Locale.FilteringMode filteringMode76 = null;
        java.util.List<java.lang.String> strList77 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.lang.String>) strList74, filteringMode76);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        java.util.Locale.FilteringMode filteringMode82 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList83 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.lang.String>) strList80, filteringMode82);
        java.util.List<java.lang.String> strList84 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList83);
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList83);
        java.util.Locale locale86 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet87 = locale86.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.String> strSet88 = locale86.getUnicodeLocaleKeys();
        java.lang.String str89 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet88);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap90 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList91 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap90);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + filteringMode13 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode13.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(languageRangeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(languageRangeList29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "zh-CN" + "'", str49, "zh-CN");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "zh-CN" + "'", str53, "zh-CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "zh-CN" + "'", str58, "zh-CN");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "zh-CN" + "'", str61, "zh-CN");
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + filteringMode82 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode82.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNotNull(strList84);
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet87);
        org.junit.Assert.assertNotNull(strSet88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(languageRangeList91);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream3 = random0.doubles((double) (byte) 0, (double) '#');
        double double4 = random0.nextGaussian();
        java.util.stream.DoubleStream doubleStream5 = random0.doubles();
        java.util.stream.LongStream longStream9 = random0.longs(100L, (long) (short) 1, (long) (short) 10);
        java.util.stream.DoubleStream doubleStream11 = random0.doubles(1133475767620805068L);
        java.util.stream.LongStream longStream13 = random0.longs(4668688544456269390L);
        int int14 = random0.nextInt();
        com.github.javafaker.Faker faker15 = new com.github.javafaker.Faker(random0);
        float float16 = random0.nextFloat();
        int int18 = random0.nextInt(45258894);
        org.junit.Assert.assertNotNull(doubleStream3);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.4969107359217617d + "'", double4 == 0.4969107359217617d);
        org.junit.Assert.assertNotNull(doubleStream5);
        org.junit.Assert.assertNotNull(longStream9);
        org.junit.Assert.assertNotNull(doubleStream11);
        org.junit.Assert.assertNotNull(longStream13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1117952690) + "'", int14 == (-1117952690));
// flaky:         org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.59917647f + "'", float16 == 0.59917647f);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14651007 + "'", int18 == 14651007);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.util.Random random0 = new java.util.Random();
        java.util.stream.IntStream intStream1 = random0.ints();
        java.util.stream.LongStream longStream4 = random0.longs((long) 1, (long) 100);
        boolean boolean5 = random0.nextBoolean();
        java.util.stream.DoubleStream doubleStream7 = random0.doubles(0L);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 10, (byte) 10 };
        random0.nextBytes(byteArray11);
        double double13 = random0.nextGaussian();
        com.github.javafaker.Faker faker14 = new com.github.javafaker.Faker(random0);
        boolean boolean15 = random0.nextBoolean();
        org.junit.Assert.assertNotNull(intStream1);
        org.junit.Assert.assertNotNull(longStream4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleStream7);
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[26, -25, -122]");
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.495557511447864d + "'", double13 == 0.495557511447864d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clearExtensions();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        java.util.Locale.Builder builder5 = builder2.setLanguageTag("CN");
        java.util.Locale.Builder builder8 = builder2.setExtension('a', "ko-KR");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder8.setVariant("zh_TW");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: zh_TW [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.getVariant();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayName(locale2);
        boolean boolean4 = locale0.hasExtensions();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getVariant();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = locale5.getDisplayName(locale7);
        boolean boolean9 = locale5.hasExtensions();
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = locale10.getDisplayName();
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        java.lang.String str14 = locale5.getDisplayCountry(locale10);
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.toLanguageTag();
        java.lang.String str17 = locale5.getDisplayCountry(locale15);
        java.lang.String str18 = locale0.getDisplayScript(locale5);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.lang.String str21 = locale20.toLanguageTag();
        java.util.Locale locale22 = locale20.stripExtensions();
        java.lang.String str23 = locale19.getDisplayVariant(locale20);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale20);
        java.util.Locale locale25 = locale20.stripExtensions();
        java.lang.String str26 = locale0.getDisplayCountry(locale25);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Chinesisch (China)" + "'", str3, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Chinesisch (China)" + "'", str8, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str11, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Chine" + "'", str14, "Chine");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u4e2d\u56fd" + "'", str26, "\u4e2d\u56fd");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.util.Locale locale3 = locale0.stripExtensions();
        java.util.Locale locale6 = new java.util.Locale("zh-CN", "Chinesisch (China)");
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str8 = locale7.getDisplayName();
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getCountry();
        java.lang.String str13 = locale11.toLanguageTag();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale14.getDisplayCountry(locale15);
        java.lang.String str18 = locale11.getDisplayCountry(locale14);
        java.lang.String str19 = locale9.getDisplayScript(locale11);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getVariant();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = locale20.getDisplayName(locale22);
        com.github.javafaker.Faker faker24 = new com.github.javafaker.Faker(locale20);
        java.util.Random random25 = new java.util.Random();
        java.util.stream.DoubleStream doubleStream28 = random25.doubles((double) (byte) 0, (double) '#');
        com.github.javafaker.Faker faker29 = new com.github.javafaker.Faker(random25);
        com.github.javafaker.Faker faker30 = new com.github.javafaker.Faker(locale20, random25);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale31.getVariant();
        java.util.Locale locale33 = java.util.Locale.GERMANY;
        java.lang.String str34 = locale31.getDisplayName(locale33);
        boolean boolean35 = locale31.hasExtensions();
        java.lang.String str36 = locale20.getDisplayLanguage(locale31);
        java.lang.String str37 = locale11.getDisplayVariant(locale31);
        java.lang.String str38 = locale6.getDisplayName(locale11);
        java.lang.String str39 = locale6.getDisplayVariant();
        java.lang.String str40 = locale6.getDisplayCountry();
        java.lang.String str41 = locale0.getDisplayCountry(locale6);
        java.lang.String str42 = locale0.getDisplayLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals(locale6.toString(), "zh-cn_CHINESISCH (CHINA)");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str8, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GB" + "'", str12, "GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-GB" + "'", str13, "en-GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u4e2d\u56fd" + "'", str17, "\u4e2d\u56fd");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u82f1\u56fd" + "'", str18, "\u82f1\u56fd");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Chinesisch (China)" + "'", str23, "Chinesisch (China)");
        org.junit.Assert.assertNotNull(doubleStream28);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Chinesisch (China)" + "'", str34, "Chinesisch (China)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u4e2d\u6587" + "'", str36, "\u4e2d\u6587");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "zh-cn (CHINESISCH (CHINA))" + "'", str38, "zh-cn (CHINESISCH (CHINA))");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "CHINESISCH (CHINA)" + "'", str40, "CHINESISCH (CHINA)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "China" + "'", str41, "China");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e2d\u6587" + "'", str42, "\u4e2d\u6587");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("\u6cd5\u6587\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? ??? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }
}
