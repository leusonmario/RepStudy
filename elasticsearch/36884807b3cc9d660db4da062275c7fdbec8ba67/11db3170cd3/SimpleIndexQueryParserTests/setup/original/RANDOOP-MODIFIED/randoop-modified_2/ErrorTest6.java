import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3001");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.lang.Object obj11 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList10, obj11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        org.junit.Assert.assertNotSame("tests.slow", obj11, (java.lang.Object) simpleIndexQueryParserTests13);
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("", indexReader27, fields28, fields29, true);
        org.junit.rules.TestRule testRule32 = simpleIndexQueryParserTests13.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3002");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        java.util.Locale locale13 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray14 = new java.lang.Cloneable[] { locale13 };
        java.util.List<java.lang.Cloneable> cloneableList15 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray26);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray14, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray14);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.lang.Object obj48 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList47, obj48);
        java.lang.Iterable[] iterableArray51 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray52 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray51;
        cloneableIterableArray52[0] = cloneableList47;
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        java.lang.Object obj60 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList59, obj60);
        java.lang.Iterable[] iterableArray63 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray64 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray63;
        cloneableIterableArray64[0] = cloneableList59;
        java.lang.Iterable[][] iterableArray68 = new java.lang.Iterable[2][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray69 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray68;
        cloneableIterableArray69[0] = cloneableIterableArray52;
        cloneableIterableArray69[1] = cloneableIterableArray64;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet74 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray69);
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray69);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableIterableArray69);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3003");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling3 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling3);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling3 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling7 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling11 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray13 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling11 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray14 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray5, throttlingArray9, throttlingArray13 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling16 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling16 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling20 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling20);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling20 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling24 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling24 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray18, throttlingArray22, throttlingArray26 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling29 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling29);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray31 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling29 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling33 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling33);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray35 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling33 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling37 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray40 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray31, throttlingArray35, throttlingArray39 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling42 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling46 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling46);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray48 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling46 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling50 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray53 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray44, throttlingArray48, throttlingArray52 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray14, throttlingArray27, throttlingArray40, throttlingArray53 };
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, throttlingArray54);
        java.util.List<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][]> throttlingArrayList56 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, throttlingArray54);
        java.util.concurrent.ExecutorService[] executorServiceArray57 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray54, (java.lang.Object[]) executorServiceArray57);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3004");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '#', (double) (short) -1, (double) 0L);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3005");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3006");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (byte) 100);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10L, 100L);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3008");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields1Builder();
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3009");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray1, simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray5);
        java.util.Set<org.junit.Assert[]> assertArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) simpleIndexQueryParserTestsArray5);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "tests.maxfailures", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "tests.maxfailures", "tests.weekly" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "tests.maxfailures", "tests.weekly" };
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] { charSequenceArray10, charSequenceArray13, charSequenceArray16 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray5, (java.lang.Object[]) charSequenceArray17);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (-1.0d), (double) (byte) 10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3011");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) (short) 10, (double) 5, (double) 2);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3012");
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet4 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray3);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) serializableArray3);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        org.junit.Assert.assertNotNull("", (java.lang.Object) cloneableArray15);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("", (java.lang.Object[]) serializableArray3, (java.lang.Object[]) cloneableArray15);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3013");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 1, (double) (-1));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3014");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests11.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("tests.maxfailures", postingsEnum15, postingsEnum16, false);
        java.lang.String str19 = simpleIndexQueryParserTests11.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) str19);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3015");
        char[] charArray3 = new char[] { '4' };
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[][] charArray10 = new char[][] { charArray3, charArray5, charArray7, charArray9 };
        java.util.Set<char[]> charArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(charArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.lang.Iterable[] iterableArray18 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray19 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray18;
        cloneableIterableArray19[0] = cloneableList16;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet22 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray19);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charArraySet11, (java.lang.Object) cloneableIterableArray19);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray30);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, (java.lang.Comparable<java.lang.String>[]) strArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableIterableArray19, (java.lang.Object[]) strArray30);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (byte) 10, (double) (short) 1, 0.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3017");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = null;
        simpleIndexQueryParserTests3.failureAndSuccessEvents = ruleChain7;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests0, simpleIndexQueryParserTests3, simpleIndexQueryParserTests9 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet14 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray13);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray13);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet16 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray13);
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        java.lang.String str22 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests18.setUp();
        java.lang.String str26 = simpleIndexQueryParserTests18.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests18.assertPositionsSkippingEquals("tests.badapples", indexReader28, (-1), postingsEnum30, postingsEnum31);
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests18.assertDocsEnumEquals("tests.failfast", postingsEnum34, postingsEnum35, true);
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("europarl.lines.txt.gz", indexReader39, terms40, terms41, true);
        simpleIndexQueryParserTests18.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) assertSet17, (java.lang.Object) (short) -1);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3018");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum4, postingsEnum5, false);
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.monster", (int) (byte) 10, numericDocValues12, numericDocValues13);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3019");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3020");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3021");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3022");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("random", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.badapples", indexReader18, 0, postingsEnum20, postingsEnum21, false);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum25, postingsEnum26);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3023");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray11);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, (java.lang.Comparable<java.lang.String>[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus14 = simpleIndexQueryParserTests0.ensureGreen(strArray11);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3024");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3025");
        double[] doubleArray3 = new double[] { 'a', 10.0d };
        double[] doubleArray6 = new double[] { 'a', 10.0d };
        double[] doubleArray9 = new double[] { 'a', 10.0d };
        double[] doubleArray12 = new double[] { 'a', 10.0d };
        double[] doubleArray15 = new double[] { 'a', 10.0d };
        double[][] doubleArray16 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        java.util.List<double[]> doubleArrayList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray16);
        java.util.Set<double[]> doubleArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray16);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray16);
        java.util.concurrent.ExecutorService executorService21 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray22 = new java.util.concurrent.ExecutorService[] { executorService21 };
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray22);
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean31 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray22, (java.lang.Object[]) executorServiceArray27);
        boolean boolean33 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean34 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean35 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        boolean boolean36 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray16, (java.lang.Object[]) executorServiceArray27);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3026");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader10, (int) (byte) 10, postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        java.lang.String str18 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues21 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", (int) (short) 10, numericDocValues21, numericDocValues22);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3027");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3028");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray21);
        java.util.List<java.lang.String> strList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray21);
        java.util.Set<java.lang.String> strSet24 = org.apache.lucene.util.LuceneTestCase.asSet(strArray21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus25 = simpleIndexQueryParserTests0.ensureGreen(strArray21);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (-1L));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3030");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0L, (long) '4');
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3031");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", (int) ' ', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3032");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100.0f, (double) 6);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3033");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests3.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, (-1), postingsEnum11, postingsEnum12);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        simpleIndexQueryParserTests3.setUp();
        java.lang.String str18 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", obj1, (java.lang.Object) simpleIndexQueryParserTests3);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3034");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests5.assertTermsEquals("", indexReader10, terms11, terms12, true);
        java.lang.String str15 = simpleIndexQueryParserTests5.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests5.assertDocValuesEquals("node_s_0", (int) ' ', numericDocValues18, numericDocValues19);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3035");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests11.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests11.assertDocsEnumEquals("", postingsEnum15, postingsEnum16, true);
        simpleIndexQueryParserTests11.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) (byte) 1, numericDocValues24, numericDocValues25);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3036");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3037");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3038");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        java.lang.String str10 = simpleIndexQueryParserTests1.getTestName();
        java.lang.String str11 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.setup();
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3039");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests9.ensureCleanedUp();
        java.lang.String str13 = simpleIndexQueryParserTests9.getTestName();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("europarl.lines.txt.gz", indexReader15, fields16, fields17, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests20.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests20.assertDocsEnumEquals("", postingsEnum24, postingsEnum25, true);
        simpleIndexQueryParserTests20.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests20.failureAndSuccessEvents;
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain29;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain29;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule34 = simpleIndexQueryParserTests32.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str36 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests35.ensureCleanedUp();
        java.lang.String str39 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests35.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.ensureCheckIndexPassed();
        simpleIndexQueryParserTests35.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests32, (java.lang.Object) simpleIndexQueryParserTests35);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain29, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3040");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', 1L);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3041");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray21);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray27, simpleIndexQueryParserTestsArray28, simpleIndexQueryParserTestsArray29, simpleIndexQueryParserTestsArray30 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray31);
        java.util.List<org.junit.Assert[]> assertArrayList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.junit.Assert[][]) simpleIndexQueryParserTestsArray31);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) cloneableArray5, (java.lang.Object[]) simpleIndexQueryParserTestsArray31);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) 10, (long) (byte) 1);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3043");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), (double) (byte) 0);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3044");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3045");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader16, (int) (short) 1, postingsEnum18, postingsEnum19);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        java.lang.String str25 = simpleIndexQueryParserTests21.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, true);
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("tests.nightly", indexReader33, (int) 'a', postingsEnum35, postingsEnum36, false);
        simpleIndexQueryParserTests21.ensureCheckIndexPassed();
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) "enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests21);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3046");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        java.util.Locale[] localeArray15 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet16 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray15);
        java.util.List<java.util.Locale> localeList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, localeArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) localeArray15);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3047");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanContainingQueryBuilder();
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3048");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermWithBoostQueryBuilder();
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3049");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 10, 0.0d, (double) 3);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3050");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray12, charArray14);
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray14);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) charArray3);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3051");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.awaitsfix");
        java.lang.Class<?> wildcardClass3 = locale2.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests4.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("", postingsEnum8, postingsEnum9, true);
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests4.assertDocsEnumEquals("", postingsEnum13, postingsEnum14, false);
        org.junit.rules.TestRule testRule17 = simpleIndexQueryParserTests4.ruleChain;
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests4.assertTermsEquals("random", indexReader20, terms21, terms22, false);
        simpleIndexQueryParserTests4.resetCheckIndexStatus();
        simpleIndexQueryParserTests4.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests4.assertDocsSkippingEquals("", indexReader28, (int) (short) 1, postingsEnum30, postingsEnum31, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests34 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str35 = simpleIndexQueryParserTests34.getTestName();
        simpleIndexQueryParserTests34.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        simpleIndexQueryParserTests34.assertTermsEquals("tests.maxfailures", indexReader38, terms39, terms40, true);
        simpleIndexQueryParserTests34.ensureCheckIndexPassed();
        simpleIndexQueryParserTests34.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain45 = simpleIndexQueryParserTests34.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain45;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) locale2, (java.lang.Object) simpleIndexQueryParserTests4);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3052");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str6 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = null;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests5, simpleIndexQueryParserTests11 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet16 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet19 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray15);
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, simpleIndexQueryParserTestsArray15);
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean27 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean28 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean29 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        boolean boolean30 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str33 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests32.ensureCleanedUp();
        java.lang.String str36 = simpleIndexQueryParserTests32.getTestName();
        simpleIndexQueryParserTests32.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests32.setUp();
        java.lang.String str40 = simpleIndexQueryParserTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests32.assertPositionsSkippingEquals("tests.badapples", indexReader42, (-1), postingsEnum44, postingsEnum45);
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests32.assertDocsEnumEquals("tests.failfast", postingsEnum48, postingsEnum49, true);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Terms terms54 = null;
        org.apache.lucene.index.Terms terms55 = null;
        simpleIndexQueryParserTests32.assertTermsEquals("europarl.lines.txt.gz", indexReader53, terms54, terms55, true);
        org.junit.rules.TestRule testRule58 = simpleIndexQueryParserTests32.ruleChain;
        java.util.concurrent.ExecutorService executorService59 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray60 = new java.util.concurrent.ExecutorService[] { executorService59 };
        boolean boolean61 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertNotSame("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests32, (java.lang.Object) executorServiceArray60);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) executorServiceArray23, (java.lang.Object[]) executorServiceArray60);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        boolean boolean66 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray60);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object[]) simpleIndexQueryParserTestsArray15, (java.lang.Object[]) executorServiceArray60);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3053");
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.maxfailures", indexReader7, terms8, terms9, true);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.maxfailures", indexReader15, terms16, terms17, false);
        java.lang.Class<?> wildcardClass20 = simpleIndexQueryParserTests3.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = null;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain25;
        java.lang.String str27 = simpleIndexQueryParserTests21.getTestName();
        java.lang.Class<?> wildcardClass28 = simpleIndexQueryParserTests21.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str30 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        java.lang.String str33 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests29.setUp();
        java.lang.String str37 = simpleIndexQueryParserTests29.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.badapples", indexReader39, (-1), postingsEnum41, postingsEnum42);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("tests.failfast", postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("europarl.lines.txt.gz", indexReader50, terms51, terms52, true);
        java.lang.Class<?> wildcardClass55 = simpleIndexQueryParserTests29.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str57 = simpleIndexQueryParserTests56.getTestName();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain60 = null;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests56.assertDocsSkippingEquals("tests.nightly", indexReader63, 100, postingsEnum65, postingsEnum66, false);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass70 = simpleIndexQueryParserTests56.getClass();
        java.lang.Class[] classArray72 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass20;
        wildcardClassArray73[1] = wildcardClass28;
        wildcardClassArray73[2] = wildcardClass55;
        wildcardClassArray73[3] = wildcardClass70;
        java.util.Set<java.lang.Class<?>> wildcardClassSet82 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("random", (java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) wildcardClassArray73);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3054");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum6, postingsEnum7);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3055");
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", obj1);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3056");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(10.0d, (double) '4');
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3057");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBooleanParsesFilter();
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3058");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str15 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests14);
        org.junit.rules.RuleChain ruleChain19 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain19;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setUp();
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.lang.Object obj29 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList28, obj29);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        simpleIndexQueryParserTests31.assertFieldsEquals("tests.maxfailures", indexReader33, fields34, fields35, false);
        org.junit.Assert.assertNotSame("tests.slow", obj29, (java.lang.Object) simpleIndexQueryParserTests31);
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests41 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str42 = simpleIndexQueryParserTests41.getTestName();
        simpleIndexQueryParserTests41.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("tests.maxfailures", indexReader45, terms46, terms47, true);
        org.apache.lucene.index.IndexReader indexReader51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        org.apache.lucene.index.Terms terms53 = null;
        simpleIndexQueryParserTests41.assertTermsEquals("tests.failfast", indexReader51, terms52, terms53, false);
        org.apache.lucene.index.IndexReader indexReader57 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum60 = null;
        simpleIndexQueryParserTests41.assertPositionsSkippingEquals("tests.nightly", indexReader57, 4, postingsEnum59, postingsEnum60);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests62 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str63 = simpleIndexQueryParserTests62.getTestName();
        simpleIndexQueryParserTests62.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests62.ensureCleanedUp();
        java.lang.String str66 = simpleIndexQueryParserTests62.getTestName();
        org.apache.lucene.index.IndexReader indexReader68 = null;
        org.apache.lucene.index.Fields fields69 = null;
        org.apache.lucene.index.Fields fields70 = null;
        simpleIndexQueryParserTests62.assertFieldsEquals("europarl.lines.txt.gz", indexReader68, fields69, fields70, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests73 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests73.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum77 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum78 = null;
        simpleIndexQueryParserTests73.assertDocsEnumEquals("", postingsEnum77, postingsEnum78, true);
        simpleIndexQueryParserTests73.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain82 = simpleIndexQueryParserTests73.failureAndSuccessEvents;
        simpleIndexQueryParserTests62.failureAndSuccessEvents = ruleChain82;
        java.lang.Object obj84 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain82, obj84);
        simpleIndexQueryParserTests41.failureAndSuccessEvents = ruleChain82;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain82;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain82;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain82);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3059");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 2, (double) 10.0f);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3060");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) ' ', (double) (short) 0);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3062");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3063");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 100, (-1L));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3065");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3066");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMLTMinimumShouldMatch();
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3067");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryFilter();
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3068");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("enwiki.random.lines.txt", 0, numericDocValues9, numericDocValues10);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3069");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.junit.Assert.assertNotNull("tests.nightly", (java.lang.Object) serializableArray2);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableArray2);
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[] doubleArray19 = new double[] { 'a', 10.0d };
        double[] doubleArray22 = new double[] { 'a', 10.0d };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        java.util.List<double[]> doubleArrayList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray23);
        java.util.List<double[]> doubleArrayList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, doubleArray23);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray2, (java.lang.Object[]) doubleArray23);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3070");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) 100);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3071");
        java.lang.Object[] objArray0 = null;
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray10, (java.lang.Object[]) cloneableArray15);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray10, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) cloneableArray10);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3072");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) ruleChain4);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) "tests.badapples");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3073");
        org.junit.rules.RuleChain[] ruleChainArray1 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet2 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray1);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests13.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray11, (java.lang.Object) simpleIndexQueryParserTests13);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray25);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray48 = new java.lang.Cloneable[] { locale47 };
        java.util.List<java.lang.Cloneable> cloneableList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray43, (java.lang.Object[]) cloneableArray48);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray48);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray48);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray56, (java.lang.Object[]) cloneableArray61);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        java.util.Locale locale72 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray73 = new java.lang.Cloneable[] { locale72 };
        java.util.List<java.lang.Cloneable> cloneableList74 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray73);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray68, (java.lang.Object[]) cloneableArray73);
        java.util.Locale locale78 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray79 = new java.lang.Cloneable[] { locale78 };
        java.util.List<java.lang.Cloneable> cloneableList80 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray79);
        java.util.Locale locale83 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray84 = new java.lang.Cloneable[] { locale83 };
        java.util.List<java.lang.Cloneable> cloneableList85 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray79, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray68, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray61, (java.lang.Object[]) cloneableArray84);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray25, (java.lang.Object[]) cloneableArray61);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray61);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) ruleChainArray1, (java.lang.Object[]) cloneableArray6);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3074");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests4, simpleIndexQueryParserTests10 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet15 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray14);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray14);
        java.lang.Class[][] classArray19 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray20 = (java.lang.Class<?>[][]) classArray19;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) wildcardClassArray20);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3075");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.weekly", postingsEnum29, postingsEnum30);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3076");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) (short) -1);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3077");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests10.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain20;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3078");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray23);
        short[] shortArray37 = new short[] {};
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray39, shortArray40);
        org.junit.Assert.assertArrayEquals("random", shortArray37, shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", shortArray1, shortArray37);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3079");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain11 = null;
        simpleIndexQueryParserTests7.failureAndSuccessEvents = ruleChain11;
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        simpleIndexQueryParserTests7.restoreIndexWriterMaxDocs();
        java.lang.String str16 = simpleIndexQueryParserTests7.getTestName();
        java.lang.String str17 = simpleIndexQueryParserTests7.getTestName();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests7.assertDocsSkippingEquals("tests.monster", indexReader19, (int) (byte) 10, postingsEnum21, postingsEnum22, false);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) false);
        java.lang.String str26 = simpleIndexQueryParserTests1.getTestName();
        java.lang.Object obj27 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str29 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain32 = null;
        simpleIndexQueryParserTests28.failureAndSuccessEvents = ruleChain32;
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain35 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule37 = simpleIndexQueryParserTests28.ruleChain;
        org.junit.Assert.assertNotSame(obj27, (java.lang.Object) simpleIndexQueryParserTests28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, obj27);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3080");
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray5);
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray5, intArray7);
        int[] intArray9 = new int[] {};
        int[] intArray10 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray9, intArray10);
        org.junit.Assert.assertArrayEquals(intArray5, intArray10);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray17);
        org.junit.Assert.assertArrayEquals("random", intArray10, intArray15);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        org.junit.Assert.assertArrayEquals(intArray10, intArray21);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray30, intArray32);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray25, intArray32);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        int[] intArray40 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray38, intArray40);
        int[] intArray42 = new int[] {};
        int[] intArray43 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray42, intArray43);
        org.junit.Assert.assertArrayEquals(intArray38, intArray43);
        int[] intArray47 = new int[] {};
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray47, intArray48);
        int[] intArray50 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray48, intArray50);
        org.junit.Assert.assertArrayEquals("random", intArray43, intArray48);
        int[] intArray53 = new int[] {};
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray53, intArray54);
        org.junit.Assert.assertArrayEquals(intArray43, intArray54);
        int[] intArray58 = new int[] {};
        int[] intArray59 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray58, intArray59);
        int[] intArray61 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray59, intArray61);
        int[] intArray63 = new int[] {};
        int[] intArray64 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray63, intArray64);
        org.junit.Assert.assertArrayEquals(intArray59, intArray64);
        org.junit.Assert.assertArrayEquals(intArray43, intArray64);
        org.junit.Assert.assertArrayEquals(intArray32, intArray43);
        org.junit.Assert.assertArrayEquals("random", intArray10, intArray32);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) intArray10);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3081");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3082");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testEmptyBooleanQuery();
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3083");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.TestRule testRule28 = simpleIndexQueryParserTests0.ruleChain;
        java.lang.String str29 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) '#', numericDocValues32, numericDocValues33);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3084");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray11);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, (java.lang.Comparable<java.lang.String>[]) strArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus14 = simpleIndexQueryParserTests0.ensureGreen(strArray11);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3085");
        java.lang.Object[] objArray1 = null;
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray16);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray11, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray11);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray31);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray42 = new java.lang.Cloneable[] { locale41 };
        java.util.List<java.lang.Cloneable> cloneableList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray37, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray42);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        java.util.Locale locale55 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray56 = new java.lang.Cloneable[] { locale55 };
        java.util.List<java.lang.Cloneable> cloneableList57 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray56);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray56);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        java.util.Locale locale66 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray67 = new java.lang.Cloneable[] { locale66 };
        java.util.List<java.lang.Cloneable> cloneableList68 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray67);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray67);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray62);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray74 = new java.lang.Cloneable[] { locale73 };
        java.util.List<java.lang.Cloneable> cloneableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray74);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray80 = new java.lang.Cloneable[] { locale79 };
        java.util.List<java.lang.Cloneable> cloneableList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray80);
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray85 = new java.lang.Cloneable[] { locale84 };
        java.util.List<java.lang.Cloneable> cloneableList86 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray80, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray80, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray74, (java.lang.Object[]) cloneableArray80);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", objArray1, (java.lang.Object[]) cloneableArray74);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3086");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3087");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray19);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, (java.lang.Comparable<java.lang.String>[]) strArray19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.elasticsearch.action.admin.cluster.health.ClusterHealthStatus clusterHealthStatus22 = simpleIndexQueryParserTests0.ensureGreen(strArray19);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3088");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3089");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, true);
        simpleIndexQueryParserTests13.ensureCheckIndexPassed();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.maxfailures", indexReader25, terms26, terms27, false);
        java.lang.Class<?> wildcardClass30 = simpleIndexQueryParserTests13.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain35 = null;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain35;
        java.lang.String str37 = simpleIndexQueryParserTests31.getTestName();
        java.lang.Class<?> wildcardClass38 = simpleIndexQueryParserTests31.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str40 = simpleIndexQueryParserTests39.getTestName();
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        java.lang.String str43 = simpleIndexQueryParserTests39.getTestName();
        simpleIndexQueryParserTests39.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests39.setUp();
        java.lang.String str47 = simpleIndexQueryParserTests39.getTestName();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests39.assertPositionsSkippingEquals("tests.badapples", indexReader49, (-1), postingsEnum51, postingsEnum52);
        org.apache.lucene.index.PostingsEnum postingsEnum55 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        simpleIndexQueryParserTests39.assertDocsEnumEquals("tests.failfast", postingsEnum55, postingsEnum56, true);
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        simpleIndexQueryParserTests39.assertTermsEquals("europarl.lines.txt.gz", indexReader60, terms61, terms62, true);
        java.lang.Class<?> wildcardClass65 = simpleIndexQueryParserTests39.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests66 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str67 = simpleIndexQueryParserTests66.getTestName();
        simpleIndexQueryParserTests66.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests66.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain70 = null;
        simpleIndexQueryParserTests66.failureAndSuccessEvents = ruleChain70;
        org.apache.lucene.index.IndexReader indexReader73 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum75 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum76 = null;
        simpleIndexQueryParserTests66.assertDocsSkippingEquals("tests.nightly", indexReader73, 100, postingsEnum75, postingsEnum76, false);
        simpleIndexQueryParserTests66.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass80 = simpleIndexQueryParserTests66.getClass();
        java.lang.Class[] classArray82 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray83 = (java.lang.Class<?>[]) classArray82;
        wildcardClassArray83[0] = wildcardClass30;
        wildcardClassArray83[1] = wildcardClass38;
        wildcardClassArray83[2] = wildcardClass65;
        wildcardClassArray83[3] = wildcardClass80;
        java.util.Set<java.lang.Class<?>> wildcardClassSet92 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray83);
        java.util.Set<java.lang.reflect.GenericDeclaration> genericDeclarationSet93 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.reflect.GenericDeclaration[]) wildcardClassArray83);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) wildcardClassArray83);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3090");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3091");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNearQueryBuilder();
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3092");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScoreWithoutQueryGiven();
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3093");
        double[] doubleArray4 = new double[] { 'a', 10.0d };
        double[] doubleArray7 = new double[] { 'a', 10.0d };
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        java.util.List<double[]> doubleArrayList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray17);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("tests.slow", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.weekly", indexReader33, (int) (byte) 1, postingsEnum35, postingsEnum36);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray17, (java.lang.Object) postingsEnum35);
        java.lang.Object[] objArray39 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray17, objArray39);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3094");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1.0d), 0 };
        double[] doubleArray25 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100.0f);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray33, (double) (-1));
        double[] doubleArray42 = new double[] { (-1.0d), 0 };
        double[] doubleArray45 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.failfast", doubleArray7, doubleArray45, (double) (short) 0);
        double[] doubleArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", doubleArray45, doubleArray50, (double) 0L);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3095");
        java.util.Locale locale4 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray5 = new java.lang.Cloneable[] { locale4 };
        java.util.List<java.lang.Cloneable> cloneableList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray5);
        java.util.Locale locale9 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray10 = new java.lang.Cloneable[] { locale9 };
        java.util.List<java.lang.Cloneable> cloneableList11 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray10);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray10);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray5, (java.lang.Object) 0.0f);
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray18 = new java.lang.Cloneable[] { locale17 };
        java.util.List<java.lang.Cloneable> cloneableList19 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray18);
        java.util.Locale locale22 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray23 = new java.lang.Cloneable[] { locale22 };
        java.util.List<java.lang.Cloneable> cloneableList24 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray23);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray18, (java.lang.Object[]) cloneableArray23);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray18);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray36);
        java.util.Locale locale41 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray42 = new java.lang.Cloneable[] { locale41 };
        java.util.List<java.lang.Cloneable> cloneableList43 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray42);
        java.util.Locale locale46 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray47 = new java.lang.Cloneable[] { locale46 };
        java.util.List<java.lang.Cloneable> cloneableList48 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray47);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray42, (java.lang.Object[]) cloneableArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray42);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray5, (java.lang.Object[]) cloneableArray31);
        java.lang.Object[] objArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray31, objArray52);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3096");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) charArray2);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3097");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3098");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray33);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray28);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray51);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray58, (java.lang.Object[]) cloneableArray63);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { locale68 };
        java.util.List<java.lang.Cloneable> cloneableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray69);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray74 = new java.lang.Cloneable[] { locale73 };
        java.util.List<java.lang.Cloneable> cloneableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray69, (java.lang.Object[]) cloneableArray74);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray58, (java.lang.Object[]) cloneableArray74);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray51);
        java.util.Locale locale82 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray83 = new java.lang.Cloneable[] { locale82 };
        java.util.List<java.lang.Cloneable> cloneableList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray83);
        java.util.Locale locale87 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray88 = new java.lang.Cloneable[] { locale87 };
        java.util.List<java.lang.Cloneable> cloneableList89 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray83, (java.lang.Object[]) cloneableArray88);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray51, (java.lang.Object[]) cloneableArray88);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray28);
        double[][][][] doubleArray94 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet95 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray94);
        java.util.Set<java.io.Serializable[]> serializableArraySet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) doubleArray94);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) doubleArray94);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3099");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray1, charArray2);
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray4, charArray5);
        org.junit.Assert.assertArrayEquals(charArray1, charArray5);
        char[] charArray8 = new char[] {};
        char[] charArray9 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray8, charArray9);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals(charArray12, charArray16);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        org.junit.Assert.assertArrayEquals(charArray16, charArray23);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals(charArray29, charArray33);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray38, charArray40);
        org.junit.Assert.assertArrayEquals("random", charArray29, charArray40);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("random", charArray46, charArray57);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray40, charArray46);
        org.junit.Assert.assertArrayEquals("random", charArray16, charArray40);
        org.junit.Assert.assertArrayEquals(charArray9, charArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray1, charArray16);
        char[] charArray66 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray16, charArray66);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3100");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(6);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.Object obj8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1, obj8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3101");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolFilteredQueryBuilder();
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3102");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBuilder();
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3103");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10.0f, (double) 100L, (double) 10.0f);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3104");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0, (-1.0d));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3105");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3106");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3107");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testAndFilteredQueryBuilder();
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3108");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray4, (java.lang.Object) simpleIndexQueryParserTests6);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests6.assertDocsSkippingEquals("tests.failfast", indexReader11, (int) (byte) 100, postingsEnum13, postingsEnum14, true);
        simpleIndexQueryParserTests6.setIndexWriterMaxDocs(10);
        java.util.Locale locale21 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray22 = new java.lang.Cloneable[] { locale21 };
        java.util.List<java.lang.Cloneable> cloneableList23 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray22);
        java.lang.Iterable[] iterableArray25 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray26 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray25;
        cloneableIterableArray26[0] = cloneableList23;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray26);
        org.junit.Assert.assertNotNull((java.lang.Object) cloneableIterableSet29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests6, (java.lang.Object) cloneableIterableSet29);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3109");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray2 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray3 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray2 };
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray4, executorServiceArray5 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray6 };
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray10 };
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray12, executorServiceArray13 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray15 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray14 };
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray16, executorServiceArray17 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray19 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray18 };
        java.util.concurrent.ExecutorService[][][][] executorServiceArray20 = new java.util.concurrent.ExecutorService[][][][] { executorServiceArray3, executorServiceArray7, executorServiceArray11, executorServiceArray15, executorServiceArray19 };
        java.util.Set<java.util.concurrent.ExecutorService[][][]> executorServiceArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) executorServiceArraySet21);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3110");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain14 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsQueryFilter();
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3111");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Terms terms8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.maxfailures", indexReader7, terms8, terms9, true);
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        simpleIndexQueryParserTests3.assertTermsEquals("tests.maxfailures", indexReader15, terms16, terms17, false);
        java.lang.Class<?> wildcardClass20 = simpleIndexQueryParserTests3.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain25 = null;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain25;
        java.lang.String str27 = simpleIndexQueryParserTests21.getTestName();
        java.lang.Class<?> wildcardClass28 = simpleIndexQueryParserTests21.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str30 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        java.lang.String str33 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests29.setUp();
        java.lang.String str37 = simpleIndexQueryParserTests29.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.badapples", indexReader39, (-1), postingsEnum41, postingsEnum42);
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("tests.failfast", postingsEnum45, postingsEnum46, true);
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("europarl.lines.txt.gz", indexReader50, terms51, terms52, true);
        java.lang.Class<?> wildcardClass55 = simpleIndexQueryParserTests29.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str57 = simpleIndexQueryParserTests56.getTestName();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain60 = null;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests56.assertDocsSkippingEquals("tests.nightly", indexReader63, 100, postingsEnum65, postingsEnum66, false);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        java.lang.Class<?> wildcardClass70 = simpleIndexQueryParserTests56.getClass();
        java.lang.Class[] classArray72 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray73 = (java.lang.Class<?>[]) classArray72;
        wildcardClassArray73[0] = wildcardClass20;
        wildcardClassArray73[1] = wildcardClass28;
        wildcardClassArray73[2] = wildcardClass55;
        wildcardClassArray73[3] = wildcardClass70;
        java.util.Set<java.lang.Class<?>> wildcardClassSet82 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray73);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) wildcardClassArray73);
        java.util.List<java.lang.reflect.Type> typeList84 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, (java.lang.reflect.Type[]) wildcardClassArray73);
        java.util.concurrent.ExecutorService executorService85 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] { executorService85 };
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean89 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean90 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean91 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean92 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean93 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        boolean boolean94 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) wildcardClassArray73, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(1.0d, (double) 5);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3113");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3114");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertFalse("tests.awaitsfix", true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3115");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (double) (byte) 1, (double) 4);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3116");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray13 = new java.lang.Cloneable[] { locale12 };
        java.util.List<java.lang.Cloneable> cloneableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray13);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray8, (java.lang.Object[]) cloneableArray13);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray25 = new java.lang.Cloneable[] { locale24 };
        java.util.List<java.lang.Cloneable> cloneableList26 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray25);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray25);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray36);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray20, (java.lang.Object[]) cloneableArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray13, (java.lang.Object[]) cloneableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray13);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray45);
        org.apache.lucene.util.LuceneTestCase[] luceneTestCaseArray49 = new org.apache.lucene.util.LuceneTestCase[] {};
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, luceneTestCaseArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) luceneTestCaseArray49);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3117");
        java.lang.Object obj1 = null;
        long[] longArray4 = new long[] {};
        long[] longArray5 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray4, longArray5);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray5, longArray8);
        long[] longArray12 = new long[] {};
        long[] longArray13 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray12, longArray13);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray13, longArray16);
        org.junit.Assert.assertArrayEquals(longArray8, longArray13);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray26, longArray29);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray22, longArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray8, longArray29);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("node_s_0", obj1, (java.lang.Object) "tests.weekly");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3118");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBuilder();
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3119");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (long) (short) 1, 0L);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3120");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1.0d), 0 };
        double[] doubleArray25 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100.0f);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray33, (double) 100L);
        double[] doubleArray43 = new double[] { (-1.0d), 0 };
        double[] doubleArray46 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray43, doubleArray46, (double) 100.0f);
        double[] doubleArray51 = new double[] { (-1.0d), 0 };
        double[] doubleArray54 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray51, doubleArray54, (double) 100.0f);
        double[] doubleArray59 = new double[] { (-1.0d), 0 };
        double[] doubleArray62 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray59, doubleArray62, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray62, (double) (short) 100);
        double[] doubleArray69 = new double[] { (-1.0d), 0 };
        double[] doubleArray72 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray69, doubleArray72, (double) 100.0f);
        double[] doubleArray77 = new double[] { (-1.0d), 0 };
        double[] doubleArray80 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray77, doubleArray80, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray80, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray54, doubleArray80, (double) (-1));
        org.junit.Assert.assertArrayEquals("tests.weekly", doubleArray43, doubleArray80, (double) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray80, 0.0d);
        org.junit.Assert.assertNotNull((java.lang.Object) doubleArray80);
        double[] doubleArray92 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", doubleArray80, doubleArray92, (double) (byte) 100);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3121");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (-1.0d), 0.0d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3122");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryBuilder();
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3123");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        simpleIndexQueryParserTests16.assertTermsEquals("tests.maxfailures", indexReader20, terms21, terms22, true);
        simpleIndexQueryParserTests16.ensureCheckIndexPassed();
        simpleIndexQueryParserTests16.resetCheckIndexStatus();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests16.assertDocsEnumEquals("random", postingsEnum29, postingsEnum30, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum29);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3124");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3125");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader5, 1, postingsEnum7, postingsEnum8, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        java.lang.Class<?> wildcardClass13 = simpleIndexQueryParserTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3126");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("tests.maxfailures", indexReader15, fields16, fields17, false);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests13.assertFieldsEquals("tests.maxfailures", indexReader22, fields23, fields24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str29 = simpleIndexQueryParserTests28.getTestName();
        simpleIndexQueryParserTests28.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests28);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests28.assertPositionsSkippingEquals("tests.maxfailures", indexReader34, (-1), postingsEnum36, postingsEnum37);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        simpleIndexQueryParserTests28.ensureCleanedUp();
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain42;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain42;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        simpleIndexQueryParserTests45.assertDocsSkippingEquals("tests.awaitsfix", indexReader47, (int) (short) 0, postingsEnum49, postingsEnum50, true);
        org.apache.lucene.index.IndexReader indexReader54 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum57 = null;
        simpleIndexQueryParserTests45.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader54, (int) (byte) -1, postingsEnum56, postingsEnum57, false);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Fields fields62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        simpleIndexQueryParserTests45.assertFieldsEquals("tests.slow", indexReader61, fields62, fields63, true);
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum70 = null;
        simpleIndexQueryParserTests45.assertPositionsSkippingEquals("tests.awaitsfix", indexReader67, 1, postingsEnum69, postingsEnum70);
        simpleIndexQueryParserTests45.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests45);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3127");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures0 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures0);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray2 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures1 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures> testRuleIgnoreAfterMaxFailuresSet3 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray2);
        java.util.Set<org.junit.rules.TestRule> testRuleSet4 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) testRuleIgnoreAfterMaxFailuresArray2);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures6 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures5);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray7 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures6 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures9 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures8);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray10 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures9 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures12 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures11);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures12 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures14 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures15 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures14);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray16 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures15 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray17 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray7, testRuleIgnoreAfterMaxFailuresArray10, testRuleIgnoreAfterMaxFailuresArray13, testRuleIgnoreAfterMaxFailuresArray16 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet18 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray2, (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray17);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3128");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 6, (long) 2);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3129");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray32);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        java.util.Locale locale44 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray45 = new java.lang.Cloneable[] { locale44 };
        java.util.List<java.lang.Cloneable> cloneableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray45);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray40, (java.lang.Object[]) cloneableArray45);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        java.util.Locale locale62 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray63 = new java.lang.Cloneable[] { locale62 };
        java.util.List<java.lang.Cloneable> cloneableList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray63);
        java.util.Locale locale67 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray68 = new java.lang.Cloneable[] { locale67 };
        java.util.List<java.lang.Cloneable> cloneableList69 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray63, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray45, (java.lang.Object[]) cloneableArray68);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray45);
        java.util.concurrent.ExecutorService executorService75 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray76 = new java.util.concurrent.ExecutorService[] { executorService75 };
        boolean boolean77 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean78 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        boolean boolean79 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray76);
        java.util.concurrent.ExecutorService executorService80 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray81 = new java.util.concurrent.ExecutorService[] { executorService80 };
        boolean boolean82 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        boolean boolean83 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        boolean boolean84 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        boolean boolean85 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray76, (java.lang.Object[]) executorServiceArray81);
        boolean boolean87 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray81);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) cloneableArray45, (java.lang.Object[]) executorServiceArray81);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3130");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.Fields fields10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("<unknown>", indexReader9, fields10, fields11, true);
        simpleIndexQueryParserTests2.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule15 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) testRule15);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3131");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanContainingQueryBuilder();
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3132");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3133");
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray4);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray12);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray11, byteArray15);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray15);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray20, byteArray21);
        byte[] byteArray23 = new byte[] {};
        byte[] byteArray24 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray24);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray20, byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str30 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        java.lang.String str33 = simpleIndexQueryParserTests29.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests29);
        simpleIndexQueryParserTests29.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) byteArray20, (java.lang.Object) simpleIndexQueryParserTests29);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3134");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("", postingsEnum16, postingsEnum17);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3135");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (byte) -1);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3136");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.weekly", indexReader8, 0, postingsEnum10, postingsEnum11);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("random", postingsEnum15, postingsEnum16, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        simpleIndexQueryParserTests19.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("hi!", postingsEnum24, postingsEnum25, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests28 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests28.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        simpleIndexQueryParserTests28.assertDocsEnumEquals("", postingsEnum32, postingsEnum33, true);
        simpleIndexQueryParserTests28.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain37 = simpleIndexQueryParserTests28.failureAndSuccessEvents;
        simpleIndexQueryParserTests19.failureAndSuccessEvents = ruleChain37;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) ruleChain37);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3137");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.badapples", indexReader6, fields7, fields8, false);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests13);
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("node_s_0", indexReader19, terms20, terms21, false);
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.monster", indexReader27, terms28, terms29, false);
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain11, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3138");
        short[] shortArray0 = null;
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray3);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray6, shortArray7);
        short[] shortArray10 = new short[] {};
        short[] shortArray11 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray10, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray0, shortArray2);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3139");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testRangeFilteredQueryBuilder();
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3140");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 0L, (long) 3);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3141");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) (short) 1, (double) 0.0f);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3142");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3143");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (double) ' ', (double) (byte) 100, (double) 3);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3144");
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) (short) 100);
        double[] doubleArray24 = new double[] { (-1.0d), 0 };
        double[] doubleArray27 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray24, doubleArray27, (double) 100.0f);
        double[] doubleArray32 = new double[] { (-1.0d), 0 };
        double[] doubleArray35 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray32, doubleArray35, (double) 100.0f);
        double[] doubleArray40 = new double[] { (-1.0d), 0 };
        double[] doubleArray43 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray40, doubleArray43, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray43, (double) (short) 100);
        double[] doubleArray50 = new double[] { (-1.0d), 0 };
        double[] doubleArray53 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100.0f);
        double[] doubleArray58 = new double[] { (-1.0d), 0 };
        double[] doubleArray61 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray58, doubleArray61, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray53, doubleArray61, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray61, (double) 100L);
        org.junit.Assert.assertArrayEquals("", doubleArray27, doubleArray61, (double) 1L);
        double[] doubleArray72 = new double[] { (-1.0d), 0 };
        double[] doubleArray75 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray72, doubleArray75, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray27, doubleArray75, (double) 6);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray75, (double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", doubleArray1, doubleArray75, (double) 100);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3145");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        org.apache.lucene.index.NumericDocValues numericDocValues11 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("europarl.lines.txt.gz", 10, numericDocValues11, numericDocValues12);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3146");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(6);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryQueryBuilder();
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3147");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 3, (double) (byte) 100);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3148");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("<unknown>", postingsEnum5, postingsEnum6, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        simpleIndexQueryParserTests9.assertFieldsEquals("tests.maxfailures", indexReader11, fields12, fields13, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str17 = simpleIndexQueryParserTests16.getTestName();
        simpleIndexQueryParserTests16.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests16.ensureCleanedUp();
        java.lang.String str20 = simpleIndexQueryParserTests16.getTestName();
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        simpleIndexQueryParserTests16.assertFieldsEquals("europarl.lines.txt.gz", indexReader22, fields23, fields24, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests27 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests27.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests27.assertDocsEnumEquals("", postingsEnum31, postingsEnum32, true);
        simpleIndexQueryParserTests27.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain36 = simpleIndexQueryParserTests27.failureAndSuccessEvents;
        simpleIndexQueryParserTests16.failureAndSuccessEvents = ruleChain36;
        java.lang.Object obj38 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain36, obj38);
        simpleIndexQueryParserTests9.failureAndSuccessEvents = ruleChain36;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain36);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain36;
        java.lang.Object obj44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("random", (java.lang.Object) ruleChain36, obj44);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3149");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 4);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3150");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", 10.0d, (double) '4');
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3151");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 0L, (long) (short) -1);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3152");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain8 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3153");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryFilter();
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3154");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3155");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.nightly", indexReader17, 4, postingsEnum19, postingsEnum20);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str23 = simpleIndexQueryParserTests22.getTestName();
        simpleIndexQueryParserTests22.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests22.ensureCleanedUp();
        java.lang.String str26 = simpleIndexQueryParserTests22.getTestName();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("europarl.lines.txt.gz", indexReader28, fields29, fields30, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests33.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        simpleIndexQueryParserTests33.assertDocsEnumEquals("", postingsEnum37, postingsEnum38, true);
        simpleIndexQueryParserTests33.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain42 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        simpleIndexQueryParserTests22.failureAndSuccessEvents = ruleChain42;
        java.lang.Object obj44 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain42, obj44);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain42;
        java.lang.String[] strArray53 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray53);
        java.util.List<java.lang.String> strList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray53);
        java.util.Set<java.lang.String> strSet56 = org.apache.lucene.util.LuceneTestCase.asSet(strArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) strArray53);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3156");
        float[] floatArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests2.setUp();
        java.lang.String str10 = simpleIndexQueryParserTests2.getTestName();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.badapples", indexReader12, (-1), postingsEnum14, postingsEnum15);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        simpleIndexQueryParserTests2.assertFieldsEquals("hi!", indexReader18, fields19, fields20, false);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.weekly", indexReader24, 3, postingsEnum26, postingsEnum27);
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        float[] floatArray35 = new float[] {};
        float[] floatArray36 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray35, floatArray36, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray36, (float) (short) 100);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray36, floatArray42, 10.0f);
        float[] floatArray48 = new float[] {};
        float[] floatArray49 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray49, (float) 100L);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray48, floatArray53, (float) (short) 100);
        float[] floatArray58 = new float[] {};
        float[] floatArray59 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray58, floatArray59, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray53, floatArray59, 10.0f);
        float[] floatArray65 = new float[] {};
        float[] floatArray66 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray66, (float) 100L);
        float[] floatArray69 = new float[] {};
        float[] floatArray70 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray69, floatArray70, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray65, floatArray70, (float) (short) 100);
        float[] floatArray75 = new float[] {};
        float[] floatArray76 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray76, (float) 100L);
        float[] floatArray79 = new float[] {};
        float[] floatArray80 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray79, floatArray80, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray75, floatArray80, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray70, floatArray80, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray53, floatArray70, (float) '#');
        org.junit.Assert.assertArrayEquals(floatArray42, floatArray53, (float) (short) 100);
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) floatArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", floatArray1, floatArray53, (float) 'a');
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3157");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testOrFilteredQueryBuilder();
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3158");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        java.util.Set<java.lang.Object> objSet14 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Object[]) executorServiceArray9);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str18 = simpleIndexQueryParserTests17.getTestName();
        simpleIndexQueryParserTests17.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str21 = simpleIndexQueryParserTests20.getTestName();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain24 = null;
        simpleIndexQueryParserTests20.failureAndSuccessEvents = ruleChain24;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str27 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests17, simpleIndexQueryParserTests20, simpleIndexQueryParserTests26 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet31 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray30);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray30);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet33 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray30);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet34 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray9, (java.lang.Object[]) simpleIndexQueryParserTestsArray30);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3159");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Iterable[] iterableArray7 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray8 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray7;
        cloneableIterableArray8[0] = cloneableList5;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet11 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray8);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) cloneableIterableSet11);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3160");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests15.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests15);
        org.junit.rules.RuleChain ruleChain20 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain20;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, false);
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain29 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests30 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str31 = simpleIndexQueryParserTests30.getTestName();
        simpleIndexQueryParserTests30.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests30.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests30.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests36);
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests36.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain41;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests30, (java.lang.Object) ruleChain41);
        org.junit.rules.TestRule testRule44 = simpleIndexQueryParserTests30.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests30);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3161");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 10, (long) (short) 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3162");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testConstantScoreParsesFilter();
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3163");
        short[] shortArray2 = new short[] {};
        short[] shortArray3 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray2, shortArray3);
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
        short[] shortArray7 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray2, shortArray7);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3164");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader8, terms9, terms10, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.maxfailures", indexReader17, terms18, terms19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("hi!", indexReader23, terms24, terms25, false);
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        simpleIndexQueryParserTests13.assertTermsEquals("tests.badapples", indexReader29, terms30, terms31, true);
        java.lang.String str34 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) terms10, (java.lang.Object) simpleIndexQueryParserTests13);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3165");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray6);
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals("", shortArray3, shortArray12);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray17);
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray21);
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray29, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray25, shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray16, shortArray30);
        short[] shortArray35 = new short[] {};
        short[] shortArray36 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray35, shortArray36);
        short[] shortArray39 = new short[] {};
        short[] shortArray40 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray39, shortArray40);
        short[] shortArray43 = new short[] {};
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray43, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray39, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray35, shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray30);
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray51, shortArray52);
        short[] shortArray55 = new short[] {};
        short[] shortArray56 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray55, shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray56);
        short[] shortArray60 = new short[] {};
        short[] shortArray61 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray60, shortArray61);
        short[] shortArray64 = new short[] {};
        short[] shortArray65 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray64, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray60, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray51, shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray51);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) shortArray51);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3166");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (long) (short) 1, (long) 6);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3167");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3168");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Iterable[] iterableArray6 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray6;
        cloneableIterableArray7[0] = cloneableList4;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet10 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray7);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain15 = null;
        simpleIndexQueryParserTests11.failureAndSuccessEvents = ruleChain15;
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests11.failureAndSuccessEvents;
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Fields fields22 = null;
        org.apache.lucene.index.Fields fields23 = null;
        simpleIndexQueryParserTests11.assertFieldsEquals("tests.nightly", indexReader21, fields22, fields23, false);
        simpleIndexQueryParserTests11.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) cloneableIterableArray7, (java.lang.Object) simpleIndexQueryParserTests11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3169");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain5 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("europarl.lines.txt.gz", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3170");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("random", charArray21, charArray32);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray21, charArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray21);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray61, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray52, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray63);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        org.junit.Assert.assertArrayEquals(charArray44, charArray73);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray77);
        org.junit.Assert.assertArrayEquals(charArray5, charArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str89 = simpleIndexQueryParserTests88.getTestName();
        simpleIndexQueryParserTests88.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests88.ensureCleanedUp();
        java.lang.String str92 = simpleIndexQueryParserTests88.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests88);
        org.junit.rules.TestRule testRule94 = simpleIndexQueryParserTests88.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) charArray13, (java.lang.Object) simpleIndexQueryParserTests88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testTermsFilterQueryBuilder();
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3171");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests13 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str14 = simpleIndexQueryParserTests13.getTestName();
        simpleIndexQueryParserTests13.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests13.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.ensureCleanedUp();
        simpleIndexQueryParserTests13.setIndexWriterMaxDocs(100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests21.ensureCleanedUp();
        java.lang.String str25 = simpleIndexQueryParserTests21.getTestName();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests21.assertFieldsEquals("europarl.lines.txt.gz", indexReader27, fields28, fields29, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests32 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests32.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        simpleIndexQueryParserTests32.assertDocsEnumEquals("", postingsEnum36, postingsEnum37, true);
        simpleIndexQueryParserTests32.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests32.failureAndSuccessEvents;
        simpleIndexQueryParserTests21.failureAndSuccessEvents = ruleChain41;
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain41);
        simpleIndexQueryParserTests13.failureAndSuccessEvents = ruleChain41;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain41;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str47 = simpleIndexQueryParserTests46.getTestName();
        simpleIndexQueryParserTests46.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests46.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests46.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests46.assertDocsEnumEquals("node_s_0", postingsEnum52, postingsEnum53, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests56 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str57 = simpleIndexQueryParserTests56.getTestName();
        simpleIndexQueryParserTests56.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests56.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain60 = null;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain60;
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        simpleIndexQueryParserTests56.assertDocsSkippingEquals("tests.nightly", indexReader63, 100, postingsEnum65, postingsEnum66, false);
        simpleIndexQueryParserTests56.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader71 = null;
        org.apache.lucene.index.Terms terms72 = null;
        org.apache.lucene.index.Terms terms73 = null;
        simpleIndexQueryParserTests56.assertTermsEquals("tests.awaitsfix", indexReader71, terms72, terms73, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests76 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests76.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain78 = simpleIndexQueryParserTests76.failureAndSuccessEvents;
        simpleIndexQueryParserTests56.failureAndSuccessEvents = ruleChain78;
        simpleIndexQueryParserTests46.failureAndSuccessEvents = ruleChain78;
        simpleIndexQueryParserTests46.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain82 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain41, (java.lang.Object) simpleIndexQueryParserTests46);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3172");
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray3, (float) 100L);
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray6, floatArray7, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray2, floatArray7, (float) (short) 100);
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray12, floatArray13, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray2, floatArray13, (float) 3);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (short) 100);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) (short) 100);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals("", floatArray34, floatArray40, 10.0f);
        float[] floatArray46 = new float[] {};
        float[] floatArray47 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray47, (float) 100L);
        float[] floatArray50 = new float[] {};
        float[] floatArray51 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray50, floatArray51, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray46, floatArray51, (float) (short) 100);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 100L);
        float[] floatArray60 = new float[] {};
        float[] floatArray61 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray60, floatArray61, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray61, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray51, floatArray61, (float) 'a');
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray51, (float) '#');
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray34, floatArray71, (float) 1L);
        org.junit.Assert.assertArrayEquals(floatArray23, floatArray71, (float) ' ');
        org.junit.Assert.assertArrayEquals("random", floatArray2, floatArray23, (float) (-1));
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests80 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str81 = simpleIndexQueryParserTests80.getTestName();
        simpleIndexQueryParserTests80.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests80.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain84 = null;
        simpleIndexQueryParserTests80.failureAndSuccessEvents = ruleChain84;
        java.lang.String str86 = simpleIndexQueryParserTests80.getTestName();
        simpleIndexQueryParserTests80.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests80.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "random", (java.lang.Object) simpleIndexQueryParserTests80);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3173");
        short[] shortArray2 = new short[] {};
        short[] shortArray4 = new short[] {};
        short[] shortArray5 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray4, shortArray5);
        org.junit.Assert.assertArrayEquals("random", shortArray2, shortArray5);
        short[] shortArray9 = new short[] {};
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray11, shortArray12);
        org.junit.Assert.assertArrayEquals("random", shortArray9, shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray12);
        short[] shortArray18 = new short[] {};
        short[] shortArray19 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray18, shortArray19);
        short[] shortArray22 = new short[] {};
        short[] shortArray23 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray22, shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray23);
        short[] shortArray27 = new short[] {};
        short[] shortArray28 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray27, shortArray28);
        short[] shortArray31 = new short[] {};
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray31, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray27, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray18, shortArray32);
        short[] shortArray38 = new short[] {};
        short[] shortArray40 = new short[] {};
        short[] shortArray41 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray40, shortArray41);
        org.junit.Assert.assertArrayEquals("random", shortArray38, shortArray41);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray45, shortArray46);
        short[] shortArray49 = new short[] {};
        short[] shortArray50 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray49, shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray50);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray41, shortArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray32, shortArray41);
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray12, shortArray41);
        short[] shortArray57 = new short[] {};
        short[] shortArray58 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray57, shortArray58);
        short[] shortArray61 = new short[] {};
        short[] shortArray62 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray61, shortArray62);
        short[] shortArray64 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray61, shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray58, shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray61);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests68 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str69 = simpleIndexQueryParserTests68.getTestName();
        simpleIndexQueryParserTests68.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests68.ensureCleanedUp();
        java.lang.String str72 = simpleIndexQueryParserTests68.getTestName();
        simpleIndexQueryParserTests68.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests68.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests68.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain78 = simpleIndexQueryParserTests68.failureAndSuccessEvents;
        simpleIndexQueryParserTests68.ensureCheckIndexPassed();
        simpleIndexQueryParserTests68.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum82 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum83 = null;
        simpleIndexQueryParserTests68.assertDocsEnumEquals("tests.awaitsfix", postingsEnum82, postingsEnum83, true);
        simpleIndexQueryParserTests68.setIndexWriterMaxDocs(4);
        java.lang.String str88 = simpleIndexQueryParserTests68.getTestName();
        org.apache.lucene.index.IndexReader indexReader90 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum92 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        simpleIndexQueryParserTests68.assertDocsSkippingEquals("tests.failfast", indexReader90, 5, postingsEnum92, postingsEnum93, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) shortArray61, (java.lang.Object) postingsEnum93);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3174");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3175");
        java.lang.CharSequence[][][] charSequenceArray0 = new java.lang.CharSequence[][][] {};
        java.util.Set<java.lang.CharSequence[][]> charSequenceArraySet1 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray0);
        java.util.Set<java.lang.Cloneable[]> cloneableArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Cloneable[][]) charSequenceArray0);
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[] charArray11 = new char[] { '4' };
        char[][] charArray12 = new char[][] { charArray5, charArray7, charArray9, charArray11 };
        java.util.Set<char[]> charArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(charArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        java.lang.Iterable[] iterableArray20 = new java.lang.Iterable[1];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray21 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray20;
        cloneableIterableArray21[0] = cloneableList18;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet24 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray21);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) charArraySet13, (java.lang.Object) cloneableIterableArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) charSequenceArray0, (java.lang.Object[]) cloneableIterableArray21);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3176");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3177");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 1L);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3178");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain16;
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.nightly", indexReader19, 100, postingsEnum21, postingsEnum22, false);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        simpleIndexQueryParserTests12.assertDocsSkippingEquals("tests.slow", indexReader28, (int) (byte) 10, postingsEnum30, postingsEnum31, true);
        simpleIndexQueryParserTests12.ensureCheckIndexPassed();
        java.lang.String str35 = simpleIndexQueryParserTests12.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests36.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests36.assertDocsEnumEquals("node_s_0", postingsEnum42, postingsEnum43, false);
        simpleIndexQueryParserTests36.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests12, (java.lang.Object) simpleIndexQueryParserTests36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests12);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3179");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(3, (java.lang.Comparable<java.lang.String>[]) strArray7);
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        boolean boolean15 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray12);
        java.util.concurrent.ExecutorService executorService16 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] { executorService16 };
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean19 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean20 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) executorServiceArray17);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        boolean boolean25 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", (java.lang.Object[]) strArray7, (java.lang.Object[]) executorServiceArray17);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3180");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray13 = new java.lang.Cloneable[] { locale12 };
        java.util.List<java.lang.Cloneable> cloneableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray13);
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList14, obj15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        org.junit.Assert.assertNotSame("tests.slow", obj15, (java.lang.Object) simpleIndexQueryParserTests17);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        simpleIndexQueryParserTests17.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests31 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str32 = simpleIndexQueryParserTests31.getTestName();
        simpleIndexQueryParserTests31.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests31.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests31);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests31.assertPositionsSkippingEquals("tests.maxfailures", indexReader37, (-1), postingsEnum39, postingsEnum40);
        simpleIndexQueryParserTests31.resetCheckIndexStatus();
        simpleIndexQueryParserTests31.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        simpleIndexQueryParserTests44.assertTermsEquals("tests.maxfailures", indexReader48, terms49, terms50, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests53 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str54 = simpleIndexQueryParserTests53.getTestName();
        simpleIndexQueryParserTests53.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests53.ensureCleanedUp();
        java.lang.String str57 = simpleIndexQueryParserTests53.getTestName();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        simpleIndexQueryParserTests53.assertFieldsEquals("europarl.lines.txt.gz", indexReader59, fields60, fields61, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests64.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum69 = null;
        simpleIndexQueryParserTests64.assertDocsEnumEquals("", postingsEnum68, postingsEnum69, true);
        simpleIndexQueryParserTests64.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain73 = simpleIndexQueryParserTests64.failureAndSuccessEvents;
        simpleIndexQueryParserTests53.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests44.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests31.failureAndSuccessEvents = ruleChain73;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain73;
        simpleIndexQueryParserTests17.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain73;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3181");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1, (double) 100, (double) (-1L));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3182");
        double[][][][] doubleArray1 = new double[][][][] {};
        java.util.Set<double[][][]> doubleArraySet2 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        java.util.Set<java.io.Serializable[]> serializableArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet((java.io.Serializable[][]) doubleArray1);
        java.util.Set<double[][][]> doubleArraySet4 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray1);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "tests.failfast", "node_s_0", "random" };
        java.util.List<java.lang.Comparable<java.lang.String>> strComparableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, (java.lang.Comparable<java.lang.String>[]) strArray11);
        java.util.List<java.lang.String> strList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(2, strArray11);
        java.util.Set<java.lang.String> strSet14 = org.apache.lucene.util.LuceneTestCase.asSet(strArray11);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) doubleArray1, (java.lang.Object[]) strArray11);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3183");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3184");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3185");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        short[] shortArray23 = new short[] {};
        short[] shortArray25 = new short[] {};
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray25, shortArray26);
        org.junit.Assert.assertArrayEquals("random", shortArray23, shortArray26);
        short[] shortArray30 = new short[] {};
        short[] shortArray31 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray30, shortArray31);
        short[] shortArray34 = new short[] {};
        short[] shortArray35 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray34, shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray30, shortArray35);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray26, shortArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", shortArray17, shortArray26);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray42);
        short[] shortArray45 = new short[] {};
        short[] shortArray46 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray45, shortArray46);
        short[] shortArray48 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray45, shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray45);
        org.junit.Assert.assertArrayEquals("", shortArray26, shortArray42);
        short[] shortArray52 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray42, shortArray52);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3186");
        long[] longArray0 = null;
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray11, longArray14);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray21, longArray24);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        long[] longArray31 = new long[] {};
        long[] longArray32 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray31, longArray32);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray29, longArray32);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray21, longArray32);
        long[] longArray38 = new long[] {};
        long[] longArray39 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray38, longArray39);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray39, longArray42);
        long[] longArray46 = new long[] {};
        long[] longArray47 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray46, longArray47);
        long[] longArray49 = new long[] {};
        long[] longArray50 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray49, longArray50);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray47, longArray50);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray39, longArray50);
        org.junit.Assert.assertArrayEquals(longArray21, longArray50);
        org.junit.Assert.assertArrayEquals(longArray11, longArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray0, longArray21);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3187");
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray3, shortArray4);
        short[] shortArray7 = new short[] {};
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray7, shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray13 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray12, shortArray13);
        short[] shortArray16 = new short[] {};
        short[] shortArray17 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray16, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray12, shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray17);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray24);
        short[] shortArray26 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray26);
        short[] shortArray29 = new short[] {};
        short[] shortArray30 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray29, shortArray30);
        short[] shortArray32 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray29, shortArray32);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray17, shortArray23);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray42);
        short[] shortArray44 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray41, shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray38, shortArray41);
        org.junit.Assert.assertArrayEquals("", shortArray23, shortArray38);
        short[] shortArray49 = new short[] {};
        short[] shortArray51 = new short[] {};
        short[] shortArray52 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray51, shortArray52);
        org.junit.Assert.assertArrayEquals("random", shortArray49, shortArray52);
        short[] shortArray56 = new short[] {};
        short[] shortArray58 = new short[] {};
        short[] shortArray59 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray58, shortArray59);
        org.junit.Assert.assertArrayEquals("random", shortArray56, shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray52, shortArray59);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray23, shortArray59);
        short[] shortArray68 = new short[] { (short) 0, (short) 100, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray23, shortArray68);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3188");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 100, (double) 0.0f);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3189");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(100.0d, (double) 1);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3190");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 10.0d, (double) (-1));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3191");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.nightly", indexReader11, (int) '#', postingsEnum13, postingsEnum14);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("enwiki.random.lines.txt", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader23, terms24, terms25, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.NumericDocValues numericDocValues37 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.nightly", (int) ' ', numericDocValues37, numericDocValues38);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3192");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests14.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain16;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3193");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray4);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale27 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray28 = new java.lang.Cloneable[] { locale27 };
        java.util.List<java.lang.Cloneable> cloneableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray28);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray33);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray28, (java.lang.Object[]) cloneableArray44);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray44);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray62);
        java.util.Locale locale68 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray69 = new java.lang.Cloneable[] { locale68 };
        java.util.List<java.lang.Cloneable> cloneableList70 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray69);
        java.util.Locale locale73 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray74 = new java.lang.Cloneable[] { locale73 };
        java.util.List<java.lang.Cloneable> cloneableList75 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray74);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray69, (java.lang.Object[]) cloneableArray74);
        java.util.Locale locale79 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray80 = new java.lang.Cloneable[] { locale79 };
        java.util.List<java.lang.Cloneable> cloneableList81 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray80);
        java.util.Locale locale84 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray85 = new java.lang.Cloneable[] { locale84 };
        java.util.List<java.lang.Cloneable> cloneableList86 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray80, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray69, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray62, (java.lang.Object[]) cloneableArray85);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray62);
        java.lang.Object[] objArray93 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, objArray93);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3194");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3195");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3196");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4, simpleIndexQueryParserTestsArray5 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray6);
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests9 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str10 = simpleIndexQueryParserTests9.getTestName();
        simpleIndexQueryParserTests9.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = null;
        simpleIndexQueryParserTests12.failureAndSuccessEvents = ruleChain16;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests9, simpleIndexQueryParserTests12, simpleIndexQueryParserTests18 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet23 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray22);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray22);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet25 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray22);
        java.util.Set<org.junit.Assert> assertSet26 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray22);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet27 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) simpleIndexQueryParserTestsArray6, (java.lang.Object[]) simpleIndexQueryParserTestsArray22);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3197");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBuilder();
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3198");
        short[] shortArray2 = new short[] { (short) -1, (short) 100 };
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray12 = new short[] {};
        short[] shortArray14 = new short[] {};
        short[] shortArray15 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray14, shortArray15);
        org.junit.Assert.assertArrayEquals("random", shortArray12, shortArray15);
        short[] shortArray19 = new short[] {};
        short[] shortArray20 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray19, shortArray20);
        short[] shortArray23 = new short[] {};
        short[] shortArray24 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray23, shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray24);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray15, shortArray19);
        short[] shortArray30 = new short[] {};
        short[] shortArray32 = new short[] {};
        short[] shortArray33 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray32, shortArray33);
        org.junit.Assert.assertArrayEquals("random", shortArray30, shortArray33);
        short[] shortArray37 = new short[] {};
        short[] shortArray38 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray37, shortArray38);
        short[] shortArray41 = new short[] {};
        short[] shortArray42 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray41, shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray37, shortArray42);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", shortArray33, shortArray37);
        short[] shortArray48 = new short[] {};
        short[] shortArray49 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray48, shortArray49);
        short[] shortArray51 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray48, shortArray51);
        short[] shortArray54 = new short[] {};
        short[] shortArray55 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray54, shortArray55);
        short[] shortArray57 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray54, shortArray57);
        org.junit.Assert.assertArrayEquals("", shortArray48, shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray57);
        short[] shortArray62 = new short[] {};
        short[] shortArray63 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray62, shortArray63);
        short[] shortArray66 = new short[] {};
        short[] shortArray67 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray66, shortArray67);
        short[] shortArray69 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray66, shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray63, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray33, shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray19, shortArray66);
        org.junit.Assert.assertArrayEquals("tests.weekly", shortArray5, shortArray66);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray2, shortArray5);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3199");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests7 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str8 = simpleIndexQueryParserTests7.getTestName();
        simpleIndexQueryParserTests7.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests7.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests7);
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests7.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain12);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3200");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields2Builder();
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3201");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsFilterWithMultipleFields();
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3202");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3203");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3204");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 10.0f, (double) 1L);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3205");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testFilteredQueryBuilder();
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3206");
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray6 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray4, intArray6);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        org.junit.Assert.assertArrayEquals(intArray4, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        int[] intArray16 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray14, intArray16);
        org.junit.Assert.assertArrayEquals("random", intArray9, intArray14);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray29 = new int[] {};
        int[] intArray30 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray29, intArray30);
        int[] intArray33 = new int[] {};
        int[] intArray34 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray33, intArray34);
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray34, intArray36);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray29, intArray36);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray42, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals(intArray42, intArray47);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray52, intArray54);
        org.junit.Assert.assertArrayEquals("random", intArray47, intArray52);
        int[] intArray57 = new int[] {};
        int[] intArray58 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray57, intArray58);
        org.junit.Assert.assertArrayEquals(intArray47, intArray58);
        int[] intArray62 = new int[] {};
        int[] intArray63 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray62, intArray63);
        int[] intArray65 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray63, intArray65);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        org.junit.Assert.assertArrayEquals(intArray63, intArray68);
        org.junit.Assert.assertArrayEquals(intArray47, intArray68);
        org.junit.Assert.assertArrayEquals(intArray36, intArray47);
        int[] intArray73 = new int[] {};
        int[] intArray74 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray73, intArray74);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray47, intArray74);
        org.junit.Assert.assertArrayEquals("hi!", intArray24, intArray74);
        org.junit.Assert.assertArrayEquals(intArray9, intArray74);
        int[] intArray79 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("", intArray74, intArray79);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3207");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 3, (long) (byte) 10);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3208");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.monster", indexReader4, fields5, fields6, true);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        simpleIndexQueryParserTests10.assertTermsEquals("tests.maxfailures", indexReader14, terms15, terms16, true);
        simpleIndexQueryParserTests10.ensureCheckIndexPassed();
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.setIndexWriterMaxDocs((int) '4');
        simpleIndexQueryParserTests10.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.junit.rules.TestRule testRule25 = simpleIndexQueryParserTests10.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) testRule25);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3209");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests2.assertPositionsSkippingEquals("tests.maxfailures", indexReader8, (-1), postingsEnum10, postingsEnum11);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.lang.Object obj23 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList22, obj23);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests25 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Fields fields28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        simpleIndexQueryParserTests25.assertFieldsEquals("tests.maxfailures", indexReader27, fields28, fields29, false);
        org.junit.Assert.assertNotSame("tests.slow", obj23, (java.lang.Object) simpleIndexQueryParserTests25);
        simpleIndexQueryParserTests25.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain16, (java.lang.Object) simpleIndexQueryParserTests25);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str36 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        org.apache.lucene.index.Terms terms41 = null;
        simpleIndexQueryParserTests35.assertTermsEquals("tests.maxfailures", indexReader39, terms40, terms41, true);
        org.junit.rules.RuleChain ruleChain44 = simpleIndexQueryParserTests35.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests45 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str46 = simpleIndexQueryParserTests45.getTestName();
        simpleIndexQueryParserTests45.resetCheckIndexStatus();
        simpleIndexQueryParserTests45.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests45.ensureCheckIndexPassed();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str51 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        java.lang.String str54 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests50.setUp();
        java.lang.String str58 = simpleIndexQueryParserTests50.getTestName();
        org.apache.lucene.index.IndexReader indexReader60 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum62 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        simpleIndexQueryParserTests50.assertPositionsSkippingEquals("tests.badapples", indexReader60, (-1), postingsEnum62, postingsEnum63);
        java.lang.String str65 = simpleIndexQueryParserTests50.getTestName();
        org.junit.rules.RuleChain ruleChain66 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests45.failureAndSuccessEvents = ruleChain66;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain66;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) ruleChain16, (java.lang.Object) simpleIndexQueryParserTests35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) ruleChain16);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3210");
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        char[][] charArray7 = new char[][] { charArray1, charArray2, charArray3, charArray4, charArray5, charArray6 };
        java.util.Set<char[]> charArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charArray7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        java.lang.Object obj14 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList13, obj14);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.lang.Object obj21 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList20, obj21);
        java.lang.Iterable[] iterableArray24 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray25 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray24;
        cloneableIterableArray25[0] = cloneableList13;
        cloneableIterableArray25[1] = cloneableList20;
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.lang.Object obj35 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList34, obj35);
        java.util.Locale locale39 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray40 = new java.lang.Cloneable[] { locale39 };
        java.util.List<java.lang.Cloneable> cloneableList41 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray40);
        java.lang.Object obj42 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList41, obj42);
        java.lang.Iterable[] iterableArray45 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray46 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray45;
        cloneableIterableArray46[0] = cloneableList34;
        cloneableIterableArray46[1] = cloneableList41;
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray54 = new java.lang.Cloneable[] { locale53 };
        java.util.List<java.lang.Cloneable> cloneableList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray54);
        java.lang.Object obj56 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList55, obj56);
        java.util.Locale locale60 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray61 = new java.lang.Cloneable[] { locale60 };
        java.util.List<java.lang.Cloneable> cloneableList62 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray61);
        java.lang.Object obj63 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList62, obj63);
        java.lang.Iterable[] iterableArray66 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray67 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray66;
        cloneableIterableArray67[0] = cloneableList55;
        cloneableIterableArray67[1] = cloneableList62;
        java.lang.Iterable[][] iterableArray73 = new java.lang.Iterable[3][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray74 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray73;
        cloneableIterableArray74[0] = cloneableIterableArray25;
        cloneableIterableArray74[1] = cloneableIterableArray46;
        cloneableIterableArray74[2] = cloneableIterableArray67;
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>[]> cloneableIterableArraySet81 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) charArray7, (java.lang.Object[]) cloneableIterableArray74);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3211");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanWithinQueryBuilder();
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3212");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, false);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("node_s_0", (java.lang.Object) testRule14);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3213");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testSpanNotQueryBuilder();
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3214");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 100L);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (short) 100);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray19, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray9, floatArray19, (float) 'a');
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray32, (float) (short) 100);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray32, floatArray42, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray19, floatArray32, (float) 3);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray57, (float) (short) 100);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray52, floatArray63, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray19, floatArray63, (float) 10);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray70, (float) (short) 100);
        java.lang.Object obj82 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) (short) 100, obj82);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3215");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) simpleIndexQueryParserTests0);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3216");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 100);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3217");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDisMaxBuilder();
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3218");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray6 = new long[] {};
        long[] longArray7 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray6, longArray7);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray4, longArray7);
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray14 = new long[] {};
        long[] longArray15 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray14, longArray15);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray12, longArray15);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray4, longArray15);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray21, longArray22);
        long[] longArray24 = new long[] {};
        long[] longArray25 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray24, longArray25);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray22, longArray25);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray30, longArray33);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray22, longArray33);
        org.junit.Assert.assertArrayEquals(longArray4, longArray33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str39 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests44);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests38, (java.lang.Object) ruleChain49);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain49;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (java.lang.Object) longArray33, (java.lang.Object) ruleChain49);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3219");
        java.lang.Iterable[][] iterableArray3 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray4 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray3;
        java.lang.Iterable[][] iterableArray6 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray6;
        java.lang.Iterable[][] iterableArray9 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray10 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray9;
        java.lang.Iterable[][] iterableArray12 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray13 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray12;
        java.lang.Iterable[][] iterableArray15 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray16 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray15;
        java.lang.Iterable[][] iterableArray18 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray19 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray18;
        java.lang.Iterable[][][] iterableArray21 = new java.lang.Iterable[6][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][][] cloneableIterableArray22 = (java.lang.Iterable<java.lang.Cloneable>[][][]) iterableArray21;
        cloneableIterableArray22[0] = cloneableIterableArray4;
        cloneableIterableArray22[1] = cloneableIterableArray7;
        cloneableIterableArray22[2] = cloneableIterableArray10;
        cloneableIterableArray22[3] = cloneableIterableArray13;
        cloneableIterableArray22[4] = cloneableIterableArray16;
        cloneableIterableArray22[5] = cloneableIterableArray19;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>[][]> cloneableIterableArrayList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, cloneableIterableArray22);
        org.junit.rules.RuleChain[] ruleChainArray36 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet37 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray36);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableIterableArray22, (java.lang.Object[]) ruleChainArray36);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3220");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.lang.Object obj18 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList17, obj18);
        java.lang.Iterable[] iterableArray21 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray22 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray21;
        cloneableIterableArray22[0] = cloneableList5;
        cloneableIterableArray22[1] = cloneableList12;
        cloneableIterableArray22[2] = cloneableList17;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList29 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray22);
        java.util.Set<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableSet30 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableIterableArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) cloneableIterableSet30);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3221");
        int[] intArray2 = new int[] { (short) 0, (short) 10 };
        int[] intArray5 = new int[] { (short) 0, (short) 10 };
        int[] intArray8 = new int[] { (short) 0, (short) 10 };
        int[] intArray11 = new int[] { (short) 0, (short) 10 };
        int[] intArray14 = new int[] { (short) 0, (short) 10 };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        java.util.Set<int[]> intArraySet16 = org.apache.lucene.util.LuceneTestCase.asSet(intArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) intArraySet16);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3222");
        short[] shortArray6 = new short[] { (short) 1, (short) 100, (byte) 10, (short) 1, (byte) 100, (byte) 100 };
        short[] shortArray9 = new short[] {};
        short[] shortArray10 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray9, shortArray10);
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray9, shortArray12);
        short[] shortArray15 = new short[] {};
        short[] shortArray16 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray15, shortArray16);
        short[] shortArray18 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray15, shortArray18);
        org.junit.Assert.assertArrayEquals("", shortArray9, shortArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray18);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3223");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3224");
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray2, intArray3);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray7, intArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray2, intArray9);
        int[] intArray14 = new int[] {};
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray14, intArray15);
        int[] intArray17 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray15, intArray17);
        int[] intArray19 = new int[] {};
        int[] intArray20 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray19, intArray20);
        org.junit.Assert.assertArrayEquals(intArray15, intArray20);
        int[] intArray24 = new int[] {};
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray24, intArray25);
        int[] intArray27 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray25, intArray27);
        org.junit.Assert.assertArrayEquals("random", intArray20, intArray25);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        org.junit.Assert.assertArrayEquals(intArray20, intArray31);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray36);
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray36, intArray38);
        int[] intArray40 = new int[] {};
        int[] intArray41 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray40, intArray41);
        org.junit.Assert.assertArrayEquals(intArray36, intArray41);
        org.junit.Assert.assertArrayEquals(intArray20, intArray41);
        org.junit.Assert.assertArrayEquals(intArray9, intArray20);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray20, intArray47);
        int[] intArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(intArray47, intArray50);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3225");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBooleanParsesFilter();
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3226");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) longArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3227");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        java.lang.String str8 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.badapples", indexReader10, (-1), postingsEnum12, postingsEnum13);
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.failfast", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.IndexReader indexReader21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("europarl.lines.txt.gz", indexReader21, terms22, terms23, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", (int) (byte) 100, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3228");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0d, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3229");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray9);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray9);
        boolean boolean13 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        java.lang.Object obj22 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList21, obj22);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.lang.Object obj34 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList33, obj34);
        java.lang.Iterable[] iterableArray37 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray38 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray37;
        cloneableIterableArray38[0] = cloneableList21;
        cloneableIterableArray38[1] = cloneableList28;
        cloneableIterableArray38[2] = cloneableList33;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray38);
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList46 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, cloneableIterableArray38);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.lang.Object obj54 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList53, obj54);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        java.util.Locale locale63 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray64 = new java.lang.Cloneable[] { locale63 };
        java.util.List<java.lang.Cloneable> cloneableList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray64);
        java.lang.Object obj66 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList65, obj66);
        java.lang.Iterable[] iterableArray69 = new java.lang.Iterable[3];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[] cloneableIterableArray70 = (java.lang.Iterable<java.lang.Cloneable>[]) iterableArray69;
        cloneableIterableArray70[0] = cloneableList53;
        cloneableIterableArray70[1] = cloneableList60;
        cloneableIterableArray70[2] = cloneableList65;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 1, cloneableIterableArray70);
        java.util.List<java.lang.Iterable<java.lang.Cloneable>> cloneableIterableList78 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, cloneableIterableArray70);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) cloneableIterableArray38, (java.lang.Object[]) cloneableIterableArray70);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) cloneableIterableArray38);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3230");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str9 = simpleIndexQueryParserTests0.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("<unknown>", postingsEnum12, postingsEnum13, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests18 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str19 = simpleIndexQueryParserTests18.getTestName();
        simpleIndexQueryParserTests18.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests18.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests18);
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        simpleIndexQueryParserTests18.assertTermsEquals("node_s_0", indexReader24, terms25, terms26, false);
        simpleIndexQueryParserTests18.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests18.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests18.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain31;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain34 = simpleIndexQueryParserTests33.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain34);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3231");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringBoostsBuilder();
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3232");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3233");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (-1), (long) (byte) 0);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3234");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("random", indexReader16, terms17, terms18, false);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.failfast", postingsEnum24, postingsEnum25);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3235");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray11, longArray14);
        org.junit.Assert.assertArrayEquals(longArray6, longArray11);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray21, longArray24);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray30, longArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray38, longArray41);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray30, longArray41);
        org.junit.Assert.assertArrayEquals("hi!", longArray21, longArray30);
        org.junit.Assert.assertArrayEquals("tests.nightly", longArray6, longArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) longArray6);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3236");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        java.util.concurrent.ExecutorService executorService3 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] { executorService3 };
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray2, executorServiceArray4 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet6 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray5);
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] { charSequenceArray7, charSequenceArray8, charSequenceArray9, charSequenceArray10 };
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray11 };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray17 = new java.lang.CharSequence[][] { charSequenceArray13, charSequenceArray14, charSequenceArray15, charSequenceArray16 };
        java.lang.CharSequence[][][] charSequenceArray18 = new java.lang.CharSequence[][][] { charSequenceArray17 };
        java.lang.CharSequence[][][][] charSequenceArray19 = new java.lang.CharSequence[][][][] { charSequenceArray12, charSequenceArray18 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray19);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals("<unknown>", (java.lang.Object[]) executorServiceArray5, (java.lang.Object[]) charSequenceArray19);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3237");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.lang.String str6 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests2.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        simpleIndexQueryParserTests2.ensureCheckIndexPassed();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2, (java.lang.Object) locale16);
        simpleIndexQueryParserTests2.ensureCleanedUp();
        simpleIndexQueryParserTests2.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests2);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3238");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum10, postingsEnum11, true);
        org.apache.lucene.index.NumericDocValues numericDocValues16 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues17 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.slow", 10, numericDocValues16, numericDocValues17);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3239");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum9, postingsEnum10);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3240");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests4, simpleIndexQueryParserTests10 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet15 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray14);
        java.lang.Class<?> wildcardClass16 = simpleIndexQueryParserTestsSet15.getClass();
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        float[] floatArray22 = new float[] {};
        float[] floatArray23 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray22, floatArray23, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray23, (float) (short) -1);
        float[] floatArray29 = new float[] {};
        float[] floatArray30 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray30, (float) 100L);
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray33, floatArray34, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray34, (float) (short) 100);
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray39, floatArray40, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray29, floatArray40, (float) 3);
        org.junit.Assert.assertArrayEquals("<unknown>", floatArray18, floatArray29, (float) '#');
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) simpleIndexQueryParserTestsSet15, (java.lang.Object) floatArray29);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3241");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19, true);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues32 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("", 2, numericDocValues32, numericDocValues33);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3242");
        java.lang.Iterable[][] iterableArray3 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray4 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray3;
        java.lang.Iterable[][] iterableArray6 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray7 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray6;
        java.lang.Iterable[][] iterableArray9 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray10 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray9;
        java.lang.Iterable[][] iterableArray12 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray13 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray12;
        java.lang.Iterable[][] iterableArray15 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray16 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray15;
        java.lang.Iterable[][] iterableArray18 = new java.lang.Iterable[0][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][] cloneableIterableArray19 = (java.lang.Iterable<java.lang.Cloneable>[][]) iterableArray18;
        java.lang.Iterable[][][] iterableArray21 = new java.lang.Iterable[6][][];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.Cloneable>[][][] cloneableIterableArray22 = (java.lang.Iterable<java.lang.Cloneable>[][][]) iterableArray21;
        cloneableIterableArray22[0] = cloneableIterableArray4;
        cloneableIterableArray22[1] = cloneableIterableArray7;
        cloneableIterableArray22[2] = cloneableIterableArray10;
        cloneableIterableArray22[3] = cloneableIterableArray13;
        cloneableIterableArray22[4] = cloneableIterableArray16;
        cloneableIterableArray22[5] = cloneableIterableArray19;
        java.util.List<java.lang.Iterable<java.lang.Cloneable>[][]> cloneableIterableArrayList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(4, cloneableIterableArray22);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests36 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str37 = simpleIndexQueryParserTests36.getTestName();
        simpleIndexQueryParserTests36.resetCheckIndexStatus();
        simpleIndexQueryParserTests36.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        simpleIndexQueryParserTests36.assertDocsEnumEquals("hi!", postingsEnum41, postingsEnum42, false);
        org.junit.rules.TestRule testRule45 = simpleIndexQueryParserTests36.ruleChain;
        org.apache.lucene.index.IndexReader indexReader47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        org.apache.lucene.index.Terms terms49 = null;
        simpleIndexQueryParserTests36.assertTermsEquals("tests.failfast", indexReader47, terms48, terms49, false);
        org.apache.lucene.index.IndexReader indexReader53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        org.apache.lucene.index.Fields fields55 = null;
        simpleIndexQueryParserTests36.assertFieldsEquals("tests.failfast", indexReader53, fields54, fields55, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", (java.lang.Object) 4, (java.lang.Object) simpleIndexQueryParserTests36);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3243");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader9, 5, postingsEnum11, postingsEnum12);
        java.lang.Class<?> wildcardClass14 = simpleIndexQueryParserTests0.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str16 = simpleIndexQueryParserTests15.getTestName();
        simpleIndexQueryParserTests15.resetCheckIndexStatus();
        simpleIndexQueryParserTests15.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests15);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3244");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 'a', (double) 5, (double) 10L);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3245");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermQueryBuilder();
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3246");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        java.lang.String str7 = simpleIndexQueryParserTests1.getTestName();
        org.junit.rules.TestRule testRule8 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("hi!", postingsEnum11, postingsEnum12, true);
        org.junit.rules.RuleChain ruleChain15 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 4);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3247");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) '#', (long) (byte) 0);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3248");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testTermsFilterQueryBuilder();
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3249");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        org.apache.lucene.index.Fields fields9 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader7, fields8, fields9, false);
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("random", indexReader13, 5, postingsEnum15, postingsEnum16, true);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.maxfailures", postingsEnum21, postingsEnum22);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3250");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0L, (double) 1);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3251");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray11, charArray13);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray13);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals(charArray19, charArray23);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray28, charArray30);
        org.junit.Assert.assertArrayEquals("random", charArray19, charArray30);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray13, charArray19);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray38, charArray40);
        org.junit.Assert.assertArrayEquals(charArray19, charArray38);
        char[] charArray45 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray19, charArray45);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3252");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1.0f), (double) 4);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3253");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) '4', (double) 3, (double) (short) 10);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3254");
        java.lang.Object obj0 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests2);
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        simpleIndexQueryParserTests2.assertTermsEquals("node_s_0", indexReader8, terms9, terms10, false);
        org.junit.rules.TestRule testRule13 = simpleIndexQueryParserTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) testRule13);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3255");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) locale15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBoolQueryBuilder();
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3256");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum5, postingsEnum6, true);
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("", postingsEnum10, postingsEnum11, false);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.nightly", indexReader17, fields18, fields19, true);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Fields fields24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.slow", indexReader23, fields24, fields25, false);
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum30 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum29, postingsEnum30, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str34 = simpleIndexQueryParserTests33.getTestName();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests33.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        simpleIndexQueryParserTests33.assertDocsEnumEquals("node_s_0", postingsEnum39, postingsEnum40, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str45 = simpleIndexQueryParserTests44.getTestName();
        simpleIndexQueryParserTests44.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests44.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests44);
        org.junit.rules.RuleChain ruleChain49 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain49;
        simpleIndexQueryParserTests33.setUp();
        org.junit.rules.TestRule testRule52 = simpleIndexQueryParserTests33.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) testRule52);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3257");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.weekly", (java.lang.Object) simpleIndexQueryParserTests1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testRangeQueryBuilder();
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3258");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader5, 1, postingsEnum7, postingsEnum8, false);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3259");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str12 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWeight1fStillProducesWeighFunction();
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3260");
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray1, intArray2);
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray2, intArray4);
        int[] intArray6 = new int[] {};
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray6, intArray7);
        org.junit.Assert.assertArrayEquals(intArray2, intArray7);
        int[] intArray12 = new int[] {};
        int[] intArray13 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray12, intArray13);
        int[] intArray15 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray13, intArray15);
        int[] intArray17 = new int[] {};
        int[] intArray18 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray17, intArray18);
        org.junit.Assert.assertArrayEquals(intArray13, intArray18);
        int[] intArray22 = new int[] {};
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray22, intArray23);
        int[] intArray25 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray23, intArray25);
        org.junit.Assert.assertArrayEquals("random", intArray18, intArray23);
        int[] intArray28 = new int[] {};
        int[] intArray29 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray28, intArray29);
        org.junit.Assert.assertArrayEquals(intArray18, intArray29);
        org.junit.Assert.assertArrayEquals(intArray7, intArray29);
        int[] intArray34 = new int[] {};
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray34, intArray35);
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray35, intArray37);
        org.junit.Assert.assertArrayEquals(intArray7, intArray35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests40.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        simpleIndexQueryParserTests40.assertDocsEnumEquals("", postingsEnum44, postingsEnum45, true);
        simpleIndexQueryParserTests40.ensureCheckIndexPassed();
        simpleIndexQueryParserTests40.setIndexWriterMaxDocs(10);
        simpleIndexQueryParserTests40.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) intArray7, (java.lang.Object) simpleIndexQueryParserTests40);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3261");
        long[] longArray3 = new long[] {};
        long[] longArray4 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray3, longArray4);
        long[] longArray7 = new long[] {};
        long[] longArray8 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray7, longArray8);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray8, longArray11);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray4, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        org.junit.Assert.assertArrayEquals("", longArray4, longArray15);
        long[] longArray19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray15, longArray19);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3262");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        org.apache.lucene.index.Fields fields8 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("europarl.lines.txt.gz", indexReader6, fields7, fields8, true);
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum12, postingsEnum13, true);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("hi!", indexReader17, terms18, terms19, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str23 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("tests.nightly", postingsEnum25, postingsEnum26, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str30 = simpleIndexQueryParserTests29.getTestName();
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.maxfailures", indexReader33, terms34, terms35, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str39 = simpleIndexQueryParserTests38.getTestName();
        simpleIndexQueryParserTests38.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests38.ensureCleanedUp();
        java.lang.String str42 = simpleIndexQueryParserTests38.getTestName();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.Fields fields45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        simpleIndexQueryParserTests38.assertFieldsEquals("europarl.lines.txt.gz", indexReader44, fields45, fields46, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests49 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests49.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum54 = null;
        simpleIndexQueryParserTests49.assertDocsEnumEquals("", postingsEnum53, postingsEnum54, true);
        simpleIndexQueryParserTests49.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain58 = simpleIndexQueryParserTests49.failureAndSuccessEvents;
        simpleIndexQueryParserTests38.failureAndSuccessEvents = ruleChain58;
        simpleIndexQueryParserTests29.failureAndSuccessEvents = ruleChain58;
        org.apache.lucene.index.IndexReader indexReader62 = null;
        org.apache.lucene.index.Fields fields63 = null;
        org.apache.lucene.index.Fields fields64 = null;
        simpleIndexQueryParserTests29.assertFieldsEquals("tests.weekly", indexReader62, fields63, fields64, false);
        simpleIndexQueryParserTests29.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) false, (java.lang.Object) simpleIndexQueryParserTests29);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3263");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testWildcardQueryBuilder();
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3264");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader5, (int) (short) 100, postingsEnum7, postingsEnum8);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.failfast", indexReader12, fields13, fields14, true);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("<unknown>", indexReader18, terms19, terms20, false);
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str27 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests26.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests26);
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        org.apache.lucene.index.Terms terms34 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("tests.slow", indexReader32, terms33, terms34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum41 = null;
        simpleIndexQueryParserTests26.assertDocsSkippingEquals("tests.monster", indexReader38, 0, postingsEnum40, postingsEnum41, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) postingsEnum41);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3265");
        char[] charArray0 = null;
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", charArray7, charArray14);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        char[] charArray22 = new char[] {};
        char[] charArray23 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray22, charArray23);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray20, charArray22);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray28, charArray29);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray29, charArray31);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray29, charArray35);
        org.junit.Assert.assertArrayEquals(charArray22, charArray35);
        char[] charArray40 = new char[] {};
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray40, charArray41);
        org.junit.Assert.assertArrayEquals(charArray35, charArray40);
        org.junit.Assert.assertArrayEquals(charArray14, charArray35);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray55, charArray57);
        org.junit.Assert.assertArrayEquals("random", charArray46, charArray57);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", charArray14, charArray57);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray0, charArray57);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3266");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3267");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray2 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1 };
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray5 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray4 };
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray8 = new java.util.concurrent.ExecutorService[][] { executorServiceArray6, executorServiceArray7 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray9 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray2, executorServiceArray5, executorServiceArray8 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray9);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray19, (float) (short) 100);
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray25, (float) 100L);
        float[] floatArray28 = new float[] {};
        float[] floatArray29 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray28, floatArray29, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray24, floatArray29, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray19, floatArray29, (float) 'a');
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        float[] floatArray47 = new float[] {};
        float[] floatArray48 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray48, (float) 100L);
        float[] floatArray51 = new float[] {};
        float[] floatArray52 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray51, floatArray52, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray47, floatArray52, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray42, floatArray52, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray29, floatArray42, (float) 3);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        float[] floatArray66 = new float[] {};
        float[] floatArray67 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray66, floatArray67, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray67, (float) (short) 100);
        float[] floatArray72 = new float[] {};
        float[] floatArray73 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray72, floatArray73, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray62, floatArray73, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray29, floatArray73, (float) 10);
        float[] floatArray80 = new float[] {};
        float[] floatArray81 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray81, (float) 100L);
        float[] floatArray84 = new float[] {};
        float[] floatArray85 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray84, floatArray85, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray80, floatArray85, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray29, floatArray80, (float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray9, (java.lang.Object) floatArray80);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3268");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        java.lang.String str6 = simpleIndexQueryParserTests0.getTestName();
        org.apache.lucene.index.NumericDocValues numericDocValues9 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.weekly", (-1), numericDocValues9, numericDocValues10);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3269");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Collection[] collectionArray7 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Cloneable>[] cloneableCollectionArray8 = (java.util.Collection<java.lang.Cloneable>[]) collectionArray7;
        cloneableCollectionArray8[0] = cloneableList5;
        java.util.Set<java.util.Collection<java.lang.Cloneable>> cloneableCollectionSet11 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableCollectionArray8);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests12.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum16, postingsEnum17, true);
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        simpleIndexQueryParserTests12.assertDocsEnumEquals("", postingsEnum21, postingsEnum22, false);
        simpleIndexQueryParserTests12.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableCollectionSet11, (java.lang.Object) simpleIndexQueryParserTests12);
        simpleIndexQueryParserTests12.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("", postingsEnum33, postingsEnum34, true);
        simpleIndexQueryParserTests29.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain38 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader40 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum42 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        simpleIndexQueryParserTests29.assertPositionsSkippingEquals("tests.monster", indexReader40, 10, postingsEnum42, postingsEnum43);
        org.apache.lucene.index.IndexReader indexReader46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        org.apache.lucene.index.Terms terms48 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("tests.maxfailures", indexReader46, terms47, terms48, true);
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum53 = null;
        simpleIndexQueryParserTests29.assertDocsEnumEquals("tests.maxfailures", postingsEnum52, postingsEnum53, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain28, (java.lang.Object) postingsEnum52);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3270");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (byte) 0);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3271");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain3 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        org.junit.rules.TestRule testRule6 = simpleIndexQueryParserTests0.ruleChain;
        org.junit.rules.TestRule testRule7 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMoreLikeThisIds();
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3272");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals(charArray3, charArray7);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray11, charArray12);
        char[] charArray14 = new char[] {};
        char[] charArray15 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray14, charArray15);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray12, charArray14);
        org.junit.Assert.assertArrayEquals("random", charArray3, charArray14);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray21, charArray23);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray30, charArray32);
        char[] charArray36 = new char[] {};
        char[] charArray37 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray36, charArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray30, charArray36);
        org.junit.Assert.assertArrayEquals(charArray23, charArray36);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        org.junit.Assert.assertArrayEquals(charArray36, charArray41);
        org.junit.Assert.assertArrayEquals(charArray14, charArray36);
        char[] charArray46 = new char[] {};
        char[] charArray47 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray46, charArray47);
        char[] charArray49 = new char[] {};
        char[] charArray50 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray49, charArray50);
        org.junit.Assert.assertArrayEquals(charArray46, charArray50);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals(charArray53, charArray57);
        org.junit.Assert.assertArrayEquals(charArray50, charArray57);
        org.junit.Assert.assertArrayEquals(charArray36, charArray50);
        char[] charArray62 = new char[] {};
        char[] charArray63 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray62, charArray63);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", charArray50, charArray63);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        char[] charArray71 = new char[] {};
        char[] charArray72 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray71, charArray72);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray69, charArray71);
        char[] charArray75 = new char[] {};
        char[] charArray76 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray75, charArray76);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray69, charArray75);
        org.junit.Assert.assertArrayEquals("", charArray50, charArray69);
        char[] charArray80 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray50, charArray80);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3273");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 6, (double) (short) -1);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3274");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefiFilteredQueryBuilder();
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3275");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryBuilder();
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3276");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        org.junit.Assert.assertNotNull("", (java.lang.Object) cloneableArray21);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        java.util.Locale locale38 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray39 = new java.lang.Cloneable[] { locale38 };
        java.util.List<java.lang.Cloneable> cloneableList40 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray39);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray39);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        java.util.Locale locale50 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray51 = new java.lang.Cloneable[] { locale50 };
        java.util.List<java.lang.Cloneable> cloneableList52 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray51);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray51);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        java.util.Locale locale61 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray62 = new java.lang.Cloneable[] { locale61 };
        java.util.List<java.lang.Cloneable> cloneableList63 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray57, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray46, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray39, (java.lang.Object[]) cloneableArray62);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray39);
        java.lang.Object obj68 = null;
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) cloneableArray39, obj68);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray39);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) cloneableArray39);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3277");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) 2, (long) ' ');
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3278");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        long[] longArray11 = new long[] {};
        long[] longArray12 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray11, longArray12);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray16, longArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray12, longArray19);
        long[] longArray25 = new long[] {};
        long[] longArray26 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray25, longArray26);
        long[] longArray28 = new long[] {};
        long[] longArray29 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray28, longArray29);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray26, longArray29);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray38, longArray41);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray34, longArray41);
        org.junit.Assert.assertArrayEquals(longArray26, longArray41);
        long[] longArray48 = new long[] {};
        long[] longArray49 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray48, longArray49);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray51, longArray52);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray49, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray59, longArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray57, longArray60);
        org.junit.Assert.assertArrayEquals(longArray52, longArray57);
        long[] longArray65 = new long[] {};
        long[] longArray66 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray65, longArray66);
        long[] longArray69 = new long[] {};
        long[] longArray70 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray69, longArray70);
        long[] longArray72 = new long[] {};
        long[] longArray73 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray72, longArray73);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray70, longArray73);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray66, longArray73);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray52, longArray73);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", longArray26, longArray73);
        org.junit.Assert.assertArrayEquals("tests.slow", longArray12, longArray73);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) longArray12);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3279");
        byte[] byteArray0 = null;
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray2, byteArray6);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray11);
        byte[] byteArray13 = new byte[] {};
        byte[] byteArray14 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray13, byteArray14);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray11, byteArray14);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray22, byteArray26);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray19, byteArray22);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray32);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray32, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray22);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray0, byteArray2);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3280");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 1L, (double) (short) -1);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3281");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 100.0f, (double) (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3282");
        java.lang.Object obj1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain9 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame("tests.awaitsfix", obj1, (java.lang.Object) ruleChain9);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3283");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum15 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum16 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.awaitsfix", postingsEnum15, postingsEnum16, true);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule20;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests22 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests22.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests22.assertDocsEnumEquals("", postingsEnum26, postingsEnum27, true);
        simpleIndexQueryParserTests22.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader32 = null;
        org.apache.lucene.index.Fields fields33 = null;
        org.apache.lucene.index.Fields fields34 = null;
        simpleIndexQueryParserTests22.assertFieldsEquals("tests.failfast", indexReader32, fields33, fields34, true);
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Terms terms39 = null;
        org.apache.lucene.index.Terms terms40 = null;
        simpleIndexQueryParserTests22.assertTermsEquals("random", indexReader38, terms39, terms40, false);
        simpleIndexQueryParserTests22.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) testRule20, (java.lang.Object) simpleIndexQueryParserTests22);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3284");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] {};
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] simpleIndexQueryParserTestsArray5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[][] { simpleIndexQueryParserTestsArray1, simpleIndexQueryParserTestsArray2, simpleIndexQueryParserTestsArray3, simpleIndexQueryParserTestsArray4 };
        java.util.List<org.elasticsearch.index.query.SimpleIndexQueryParserTests[]> simpleIndexQueryParserTestsArrayList6 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, simpleIndexQueryParserTestsArray5);
        java.util.Set<org.junit.Assert[]> assertArraySet7 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[][]) simpleIndexQueryParserTestsArray5);
        java.util.Set<org.apache.lucene.util.LuceneTestCase[]> luceneTestCaseArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet((org.apache.lucene.util.LuceneTestCase[][]) simpleIndexQueryParserTestsArray5);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "tests.maxfailures", "hi!", "tests.weekly", "tests.badapples", "", "tests.slow" };
        java.util.List<java.lang.CharSequence> charSequenceList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charSequenceArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray5, (java.lang.Object[]) charSequenceArray16);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3285");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setUp();
        java.lang.String str9 = simpleIndexQueryParserTests1.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.badapples", indexReader11, (-1), postingsEnum13, postingsEnum14);
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum17, postingsEnum18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.Terms terms23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("europarl.lines.txt.gz", indexReader22, terms23, terms24, true);
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.TestRule testRule29 = simpleIndexQueryParserTests1.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule29;
        int[] intArray32 = new int[] {};
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray32, intArray33);
        int[] intArray35 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray33, intArray35);
        int[] intArray37 = new int[] {};
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray37, intArray38);
        org.junit.Assert.assertArrayEquals(intArray33, intArray38);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str44 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        java.lang.String str47 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests43.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.setUp();
        org.junit.rules.RuleChain ruleChain54 = simpleIndexQueryParserTests43.failureAndSuccessEvents;
        simpleIndexQueryParserTests43.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule56 = simpleIndexQueryParserTests43.ruleChain;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests43);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray33, (java.lang.Object) "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", (java.lang.Object) testRule29, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3286");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testWildcardQueryBuilder();
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3287");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) -1, (long) (short) 0);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3288");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain7 = simpleIndexQueryParserTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray3, (java.lang.Object) simpleIndexQueryParserTests5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests5.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3289");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setUp();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.util.Locale locale12 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray13 = new java.lang.Cloneable[] { locale12 };
        java.util.List<java.lang.Cloneable> cloneableList14 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray13);
        java.lang.Object obj15 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList14, obj15);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests17 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Fields fields20 = null;
        org.apache.lucene.index.Fields fields21 = null;
        simpleIndexQueryParserTests17.assertFieldsEquals("tests.maxfailures", indexReader19, fields20, fields21, false);
        org.junit.Assert.assertNotSame("tests.slow", obj15, (java.lang.Object) simpleIndexQueryParserTests17);
        simpleIndexQueryParserTests17.resetCheckIndexStatus();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Fields fields29 = null;
        org.apache.lucene.index.Fields fields30 = null;
        simpleIndexQueryParserTests26.assertFieldsEquals("tests.maxfailures", indexReader28, fields29, fields30, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests33 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str34 = simpleIndexQueryParserTests33.getTestName();
        simpleIndexQueryParserTests33.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests33.ensureCleanedUp();
        java.lang.String str37 = simpleIndexQueryParserTests33.getTestName();
        org.apache.lucene.index.IndexReader indexReader39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        org.apache.lucene.index.Fields fields41 = null;
        simpleIndexQueryParserTests33.assertFieldsEquals("europarl.lines.txt.gz", indexReader39, fields40, fields41, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests44 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests44.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum49 = null;
        simpleIndexQueryParserTests44.assertDocsEnumEquals("", postingsEnum48, postingsEnum49, true);
        simpleIndexQueryParserTests44.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain53 = simpleIndexQueryParserTests44.failureAndSuccessEvents;
        simpleIndexQueryParserTests33.failureAndSuccessEvents = ruleChain53;
        java.lang.Object obj55 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain53, obj55);
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain53;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain53;
        org.junit.Assert.assertNotSame("random", (java.lang.Object) simpleIndexQueryParserTests17, (java.lang.Object) ruleChain53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) ruleChain53);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3290");
        double[] doubleArray4 = new double[] { 'a', 10.0d };
        double[] doubleArray7 = new double[] { 'a', 10.0d };
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        java.util.List<double[]> doubleArrayList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray17);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str22 = simpleIndexQueryParserTests21.getTestName();
        simpleIndexQueryParserTests21.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        simpleIndexQueryParserTests21.assertDocsSkippingEquals("tests.slow", indexReader25, 0, postingsEnum27, postingsEnum28, true);
        simpleIndexQueryParserTests21.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        simpleIndexQueryParserTests21.assertPositionsSkippingEquals("tests.weekly", indexReader33, (int) (byte) 1, postingsEnum35, postingsEnum36);
        org.junit.Assert.assertNotSame("tests.awaitsfix", (java.lang.Object) doubleArray17, (java.lang.Object) postingsEnum35);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        java.lang.String str44 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests40);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests40.assertPositionsSkippingEquals("random", indexReader49, 3, postingsEnum51, postingsEnum52);
        java.util.concurrent.ExecutorService executorService55 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray56 = new java.util.concurrent.ExecutorService[] { executorService55 };
        boolean boolean57 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean58 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        boolean boolean59 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray56);
        java.util.concurrent.ExecutorService executorService60 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray61 = new java.util.concurrent.ExecutorService[] { executorService60 };
        boolean boolean62 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        boolean boolean63 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        boolean boolean64 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        boolean boolean65 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray56, (java.lang.Object[]) executorServiceArray61);
        boolean boolean67 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        boolean boolean68 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray61);
        org.junit.Assert.assertNotSame((java.lang.Object) postingsEnum51, (java.lang.Object) executorServiceArray61);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) doubleArray17, (java.lang.Object[]) executorServiceArray61);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3291");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (double) 1L, (double) (-1L), (double) 0L);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3292");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("node_s_0", (long) (short) -1, 0L);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3293");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testEmptyBooleanQuery();
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3294");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (double) 10, (double) (byte) -1, (double) (short) 0);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3295");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        simpleIndexQueryParserTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests26 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str27 = simpleIndexQueryParserTests26.getTestName();
        simpleIndexQueryParserTests26.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests26.assertTermsEquals("tests.maxfailures", indexReader30, terms31, terms32, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str36 = simpleIndexQueryParserTests35.getTestName();
        simpleIndexQueryParserTests35.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests35.ensureCleanedUp();
        java.lang.String str39 = simpleIndexQueryParserTests35.getTestName();
        org.apache.lucene.index.IndexReader indexReader41 = null;
        org.apache.lucene.index.Fields fields42 = null;
        org.apache.lucene.index.Fields fields43 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("europarl.lines.txt.gz", indexReader41, fields42, fields43, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests46 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests46.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum50 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        simpleIndexQueryParserTests46.assertDocsEnumEquals("", postingsEnum50, postingsEnum51, true);
        simpleIndexQueryParserTests46.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests46.failureAndSuccessEvents;
        simpleIndexQueryParserTests35.failureAndSuccessEvents = ruleChain55;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain55;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        simpleIndexQueryParserTests26.assertFieldsEquals("tests.weekly", indexReader59, fields60, fields61, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests64 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str65 = simpleIndexQueryParserTests64.getTestName();
        simpleIndexQueryParserTests64.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests64.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests64.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests70 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str71 = simpleIndexQueryParserTests70.getTestName();
        simpleIndexQueryParserTests70.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests70.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests70);
        org.junit.rules.RuleChain ruleChain75 = simpleIndexQueryParserTests70.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests64, (java.lang.Object) ruleChain75);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain75;
        simpleIndexQueryParserTests26.failureAndSuccessEvents = ruleChain75;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) postingsEnum23, (java.lang.Object) simpleIndexQueryParserTests26);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3296");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray2 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray3 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray2 };
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray6 = new java.util.concurrent.ExecutorService[][] { executorServiceArray4, executorServiceArray5 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray6 };
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray10 };
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray13 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray14 = new java.util.concurrent.ExecutorService[][] { executorServiceArray12, executorServiceArray13 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray15 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray14 };
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray17 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray18 = new java.util.concurrent.ExecutorService[][] { executorServiceArray16, executorServiceArray17 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray19 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray18 };
        java.util.concurrent.ExecutorService[][][][] executorServiceArray20 = new java.util.concurrent.ExecutorService[][][][] { executorServiceArray3, executorServiceArray7, executorServiceArray11, executorServiceArray15, executorServiceArray19 };
        java.util.Set<java.util.concurrent.ExecutorService[][][]> executorServiceArraySet21 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray20);
        java.util.Set<java.util.concurrent.ExecutorService[][][]> executorServiceArraySet22 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray20);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray32);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray38, (java.lang.Object[]) cloneableArray43);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray20, (java.lang.Object[]) cloneableArray38);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3297");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3298");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testMatchAllBuilder();
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3299");
        java.lang.Object[] objArray0 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray2 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray1 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray3 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray3 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray5 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray7 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] {};
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] throttlingArray8 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][] { throttlingArray7 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][][] { throttlingArray2, throttlingArray4, throttlingArray6, throttlingArray8 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[][][]> throttlingArraySet10 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray9);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(objArray0, (java.lang.Object[]) throttlingArray9);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3300");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule4 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoolQueryBuilder();
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3301");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray21);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray9, (java.lang.Object[]) cloneableArray32);
        java.util.Locale[] localeArray37 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet38 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.Set<java.util.Locale> localeSet39 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.Set<java.util.Locale> localeSet40 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        java.util.Set<java.util.Locale> localeSet41 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.nightly", (java.lang.Object[]) cloneableArray9, (java.lang.Object[]) localeArray37);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3302");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanNearQueryBuilder();
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3303");
        char[] charArray3 = new char[] { '4' };
        char[] charArray5 = new char[] { '4' };
        char[] charArray7 = new char[] { '4' };
        char[] charArray9 = new char[] { '4' };
        char[][] charArray10 = new char[][] { charArray3, charArray5, charArray7, charArray9 };
        java.util.Set<char[]> charArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(charArray10);
        java.util.List<char[]> charArrayList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charArray10);
        java.util.concurrent.ExecutorService executorService14 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray15 = new java.util.concurrent.ExecutorService[] { executorService14 };
        boolean boolean16 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean17 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        boolean boolean18 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray15);
        java.util.concurrent.ExecutorService executorService19 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray20 = new java.util.concurrent.ExecutorService[] { executorService19 };
        boolean boolean21 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean22 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean23 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        boolean boolean24 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray15, (java.lang.Object[]) executorServiceArray20);
        boolean boolean26 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray20);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) charArray10, (java.lang.Object[]) executorServiceArray20);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3304");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotSame(obj0, obj1);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3305");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        java.util.Set<java.lang.Class<?>[]> wildcardClassArraySet3 = org.apache.lucene.util.LuceneTestCase.asSet(wildcardClassArray2);
        java.util.Locale locale6 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray7 = new java.lang.Cloneable[] { locale6 };
        java.util.List<java.lang.Cloneable> cloneableList8 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray7);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray7, (java.lang.Object[]) cloneableArray12);
        java.util.Locale locale18 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray19 = new java.lang.Cloneable[] { locale18 };
        java.util.List<java.lang.Cloneable> cloneableList20 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray19);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray24);
        java.util.Locale locale29 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray30 = new java.lang.Cloneable[] { locale29 };
        java.util.List<java.lang.Cloneable> cloneableList31 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray30);
        java.util.Locale locale34 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray35 = new java.lang.Cloneable[] { locale34 };
        java.util.List<java.lang.Cloneable> cloneableList36 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray35);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray30, (java.lang.Object[]) cloneableArray35);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray19, (java.lang.Object[]) cloneableArray35);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray12, (java.lang.Object[]) cloneableArray35);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray48 = new java.lang.Cloneable[] { locale47 };
        java.util.List<java.lang.Cloneable> cloneableList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray48);
        java.util.Locale locale52 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray53 = new java.lang.Cloneable[] { locale52 };
        java.util.List<java.lang.Cloneable> cloneableList54 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray53);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray48, (java.lang.Object[]) cloneableArray53);
        java.util.Locale locale59 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray60 = new java.lang.Cloneable[] { locale59 };
        java.util.List<java.lang.Cloneable> cloneableList61 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray60);
        java.util.Locale locale64 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray65 = new java.lang.Cloneable[] { locale64 };
        java.util.List<java.lang.Cloneable> cloneableList66 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray65);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray60, (java.lang.Object[]) cloneableArray65);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        java.util.Locale locale75 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray76 = new java.lang.Cloneable[] { locale75 };
        java.util.List<java.lang.Cloneable> cloneableList77 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray71, (java.lang.Object[]) cloneableArray76);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray60, (java.lang.Object[]) cloneableArray76);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray53, (java.lang.Object[]) cloneableArray76);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray43, (java.lang.Object[]) cloneableArray53);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray35, (java.lang.Object[]) cloneableArray53);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) wildcardClassArray2, (java.lang.Object[]) cloneableArray35);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3306");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.nightly", indexReader7, 100, postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader16, (int) (byte) 10, postingsEnum18, postingsEnum19, true);
        simpleIndexQueryParserTests0.setUp();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Fields fields25 = null;
        org.apache.lucene.index.Fields fields26 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("tests.failfast", indexReader24, fields25, fields26, false);
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.nightly", indexReader30, terms31, terms32, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) indexReader30);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3307");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        org.junit.Assert.assertNotNull("node_s_0", (java.lang.Object) simpleIndexQueryParserTests1);
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule10 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testBooleanParsesFilter();
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3308");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        long[] longArray9 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", longArray6, longArray9);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3309");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.Class<?> wildcardClass10 = simpleIndexQueryParserTests1.getClass();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("europarl.lines.txt.gz", (java.lang.Object) wildcardClass10, (java.lang.Object) "<unknown>");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3310");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testDefaultBooleanQueryMinShouldMatch();
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3311");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", (double) 10.0f, (-1.0d));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3312");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanOrQueryBuilder();
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3313");
        org.junit.rules.RuleChain[] ruleChainArray0 = new org.junit.rules.RuleChain[] {};
        java.util.Set<org.junit.rules.RuleChain> ruleChainSet1 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainArray0);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass3 = simpleIndexQueryParserTests2.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests4.failureAndSuccessEvents;
        simpleIndexQueryParserTests4.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests4.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests4);
        java.lang.Class<?> wildcardClass15 = simpleIndexQueryParserTests4.getClass();
        java.util.Locale locale17 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.lang.Class<?> wildcardClass18 = locale17.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str20 = simpleIndexQueryParserTests19.getTestName();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("tests.maxfailures", indexReader23, terms24, terms25, true);
        simpleIndexQueryParserTests19.ensureCheckIndexPassed();
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        simpleIndexQueryParserTests19.assertTermsEquals("tests.maxfailures", indexReader31, terms32, terms33, false);
        java.lang.Class<?> wildcardClass36 = simpleIndexQueryParserTests19.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray37 = new java.lang.reflect.GenericDeclaration[] { wildcardClass3, wildcardClass15, wildcardClass18, wildcardClass36 };
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests38 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.Class<?> wildcardClass39 = simpleIndexQueryParserTests38.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests40 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str41 = simpleIndexQueryParserTests40.getTestName();
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests40.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain44 = null;
        simpleIndexQueryParserTests40.failureAndSuccessEvents = ruleChain44;
        simpleIndexQueryParserTests40.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain47 = simpleIndexQueryParserTests40.failureAndSuccessEvents;
        simpleIndexQueryParserTests40.restoreIndexWriterMaxDocs();
        java.lang.String str49 = simpleIndexQueryParserTests40.getTestName();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests40);
        java.lang.Class<?> wildcardClass51 = simpleIndexQueryParserTests40.getClass();
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("europarl.lines.txt.gz");
        java.lang.Class<?> wildcardClass54 = locale53.getClass();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests55 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str56 = simpleIndexQueryParserTests55.getTestName();
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        org.apache.lucene.index.Terms terms61 = null;
        simpleIndexQueryParserTests55.assertTermsEquals("tests.maxfailures", indexReader59, terms60, terms61, true);
        simpleIndexQueryParserTests55.ensureCheckIndexPassed();
        simpleIndexQueryParserTests55.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader67 = null;
        org.apache.lucene.index.Terms terms68 = null;
        org.apache.lucene.index.Terms terms69 = null;
        simpleIndexQueryParserTests55.assertTermsEquals("tests.maxfailures", indexReader67, terms68, terms69, false);
        java.lang.Class<?> wildcardClass72 = simpleIndexQueryParserTests55.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = new java.lang.reflect.GenericDeclaration[] { wildcardClass39, wildcardClass51, wildcardClass54, wildcardClass72 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray74 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray37, genericDeclarationArray73 };
        java.util.Set<java.lang.reflect.GenericDeclaration[]> genericDeclarationArraySet75 = org.apache.lucene.util.LuceneTestCase.asSet(genericDeclarationArray74);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) ruleChainArray0, (java.lang.Object[]) genericDeclarationArray74);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3314");
        float[] floatArray4 = new float[] {};
        float[] floatArray5 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray5, (float) 100L);
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray8, floatArray9, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray4, floatArray9, (float) (short) 100);
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray15, (float) 100L);
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray18, floatArray19, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray14, floatArray19, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray9, floatArray19, (float) 'a');
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray28, (float) 100L);
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray31, floatArray32, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray27, floatArray32, (float) (short) 100);
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray38, (float) 100L);
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray41, floatArray42, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray37, floatArray42, (float) (short) 100);
        org.junit.Assert.assertArrayEquals("hi!", floatArray32, floatArray42, (float) 'a');
        org.junit.Assert.assertArrayEquals("tests.maxfailures", floatArray19, floatArray32, (float) 3);
        float[] floatArray52 = new float[] {};
        float[] floatArray53 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray53, (float) 100L);
        float[] floatArray56 = new float[] {};
        float[] floatArray57 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray56, floatArray57, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray52, floatArray57, (float) (short) 100);
        float[] floatArray62 = new float[] {};
        float[] floatArray63 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray62, floatArray63, (float) 100L);
        org.junit.Assert.assertArrayEquals("node_s_0", floatArray52, floatArray63, (float) 3);
        org.junit.Assert.assertArrayEquals("tests.weekly", floatArray19, floatArray63, (float) 10);
        float[] floatArray70 = new float[] {};
        float[] floatArray71 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray71, (float) 100L);
        float[] floatArray74 = new float[] {};
        float[] floatArray75 = new float[] {};
        org.junit.Assert.assertArrayEquals(floatArray74, floatArray75, (float) 100L);
        org.junit.Assert.assertArrayEquals(floatArray70, floatArray75, (float) (short) 100);
        org.junit.Assert.assertArrayEquals(floatArray19, floatArray70, (float) (short) 100);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests82 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str83 = simpleIndexQueryParserTests82.getTestName();
        org.junit.rules.TestRule testRule84 = simpleIndexQueryParserTests82.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum86 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum87 = null;
        simpleIndexQueryParserTests82.assertDocsEnumEquals("tests.maxfailures", postingsEnum86, postingsEnum87, false);
        org.apache.lucene.index.IndexReader indexReader91 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum93 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum94 = null;
        simpleIndexQueryParserTests82.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader91, (int) (byte) 100, postingsEnum93, postingsEnum94, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.maxfailures", (java.lang.Object) floatArray19, (java.lang.Object) simpleIndexQueryParserTests82);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3315");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Fields fields4 = null;
        org.apache.lucene.index.Fields fields5 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.maxfailures", indexReader3, fields4, fields5, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str9 = simpleIndexQueryParserTests8.getTestName();
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        java.lang.String str12 = simpleIndexQueryParserTests8.getTestName();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("europarl.lines.txt.gz", indexReader14, fields15, fields16, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests19 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests19.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        simpleIndexQueryParserTests19.assertDocsEnumEquals("", postingsEnum23, postingsEnum24, true);
        simpleIndexQueryParserTests19.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain28 = simpleIndexQueryParserTests19.failureAndSuccessEvents;
        simpleIndexQueryParserTests8.failureAndSuccessEvents = ruleChain28;
        java.lang.Object obj30 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain28, obj30);
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum35 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.badapples", postingsEnum34, postingsEnum35, true);
        simpleIndexQueryParserTests1.setUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests39 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str40 = simpleIndexQueryParserTests39.getTestName();
        simpleIndexQueryParserTests39.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests39.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests39.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        simpleIndexQueryParserTests39.assertDocsEnumEquals("node_s_0", postingsEnum45, postingsEnum46, false);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str51 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests50);
        org.junit.rules.RuleChain ruleChain55 = simpleIndexQueryParserTests50.failureAndSuccessEvents;
        simpleIndexQueryParserTests39.failureAndSuccessEvents = ruleChain55;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests39);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3316");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 'a', (double) 2);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3317");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testInQuery();
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3318");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotSame("europarl.lines.txt.gz", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) 2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3319");
        short[] shortArray1 = null;
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray14);
        short[] shortArray18 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray21);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("<unknown>", shortArray1, shortArray14);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3320");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3321");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (long) (byte) 1, (long) 3);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3322");
        double[] doubleArray4 = new double[] { 'a', 10.0d };
        double[] doubleArray7 = new double[] { 'a', 10.0d };
        double[] doubleArray10 = new double[] { 'a', 10.0d };
        double[] doubleArray13 = new double[] { 'a', 10.0d };
        double[] doubleArray16 = new double[] { 'a', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        java.util.List<double[]> doubleArrayList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(0, doubleArray17);
        java.util.Set<double[]> doubleArraySet19 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Set<double[]> doubleArraySet20 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray17);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.util.Collection[] collectionArray27 = new java.util.Collection[1];
        @SuppressWarnings("unchecked")
        java.util.Collection<java.lang.Cloneable>[] cloneableCollectionArray28 = (java.util.Collection<java.lang.Cloneable>[]) collectionArray27;
        cloneableCollectionArray28[0] = cloneableList25;
        java.util.Set<java.util.Collection<java.lang.Cloneable>> cloneableCollectionSet31 = org.apache.lucene.util.LuceneTestCase.asSet(cloneableCollectionArray28);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) doubleArray17, (java.lang.Object[]) cloneableCollectionArray28);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3323");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain1 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain2 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("node_s_0", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum11, postingsEnum12);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3324");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.lang.Object[] objArray5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, objArray5);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3325");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) '#');
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3326");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        java.lang.String str3 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testFuzzyQueryWithFieldsBuilder();
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3327");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) ' ', 10.0d, 0.0d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3328");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests4 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str5 = simpleIndexQueryParserTests4.getTestName();
        simpleIndexQueryParserTests4.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests4.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain8 = null;
        simpleIndexQueryParserTests4.failureAndSuccessEvents = ruleChain8;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests1, simpleIndexQueryParserTests4, simpleIndexQueryParserTests10 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet15 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray14);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray14);
        java.util.Set<org.junit.Assert> assertSet17 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray14);
        java.util.List<org.apache.lucene.util.LuceneTestCase> luceneTestCaseList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, (org.apache.lucene.util.LuceneTestCase[]) simpleIndexQueryParserTestsArray14);
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray21 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray26 = new java.lang.CharSequence[][][] { charSequenceArray20, charSequenceArray21, charSequenceArray22, charSequenceArray23, charSequenceArray24, charSequenceArray25 };
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray30 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray33 = new java.lang.CharSequence[][][] { charSequenceArray27, charSequenceArray28, charSequenceArray29, charSequenceArray30, charSequenceArray31, charSequenceArray32 };
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray35 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray38 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray39 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray40 = new java.lang.CharSequence[][][] { charSequenceArray34, charSequenceArray35, charSequenceArray36, charSequenceArray37, charSequenceArray38, charSequenceArray39 };
        java.lang.CharSequence[][][][] charSequenceArray41 = new java.lang.CharSequence[][][][] { charSequenceArray26, charSequenceArray33, charSequenceArray40 };
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray43 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray44 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray45 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray46 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray48 = new java.lang.CharSequence[][][] { charSequenceArray42, charSequenceArray43, charSequenceArray44, charSequenceArray45, charSequenceArray46, charSequenceArray47 };
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray52 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray53 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray54 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray55 = new java.lang.CharSequence[][][] { charSequenceArray49, charSequenceArray50, charSequenceArray51, charSequenceArray52, charSequenceArray53, charSequenceArray54 };
        java.lang.CharSequence[][] charSequenceArray56 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray57 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray59 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray61 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray62 = new java.lang.CharSequence[][][] { charSequenceArray56, charSequenceArray57, charSequenceArray58, charSequenceArray59, charSequenceArray60, charSequenceArray61 };
        java.lang.CharSequence[][][][] charSequenceArray63 = new java.lang.CharSequence[][][][] { charSequenceArray48, charSequenceArray55, charSequenceArray62 };
        java.lang.CharSequence[][][][][] charSequenceArray64 = new java.lang.CharSequence[][][][][] { charSequenceArray41, charSequenceArray63 };
        java.util.List<java.lang.CharSequence[][][][]> charSequenceArrayList65 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf(1, charSequenceArray64);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) simpleIndexQueryParserTestsArray14, (java.lang.Object[]) charSequenceArray64);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3329");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testTermsQueryBuilder();
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3330");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3331");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        java.lang.String str5 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain12 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        java.lang.String str14 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain18 = simpleIndexQueryParserTests16.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain18;
        org.junit.rules.TestRule testRule20 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("hi!", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3332");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues15 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", 3, numericDocValues14, numericDocValues15);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3333");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray19 = new char[] {};
        char[] charArray20 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray19, charArray20);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray13, charArray19);
        char[] charArray23 = new char[] {};
        char[] charArray24 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray23, charArray24);
        char[] charArray26 = new char[] {};
        char[] charArray27 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray26, charArray27);
        org.junit.Assert.assertArrayEquals(charArray23, charArray27);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray33, charArray34);
        org.junit.Assert.assertArrayEquals(charArray30, charArray34);
        org.junit.Assert.assertArrayEquals(charArray27, charArray34);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray19, charArray34);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray5, charArray19);
        char[] charArray41 = new char[] {};
        char[] charArray42 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray41, charArray42);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray42, charArray44);
        char[] charArray50 = new char[] {};
        char[] charArray51 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray50, charArray51);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray51, charArray53);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray57, charArray58);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray51, charArray57);
        org.junit.Assert.assertArrayEquals(charArray44, charArray57);
        org.junit.Assert.assertArrayEquals(charArray19, charArray57);
        char[] charArray65 = new char[] {};
        char[] charArray66 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray65, charArray66);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray68, charArray69);
        org.junit.Assert.assertArrayEquals(charArray65, charArray69);
        char[] charArray73 = new char[] {};
        char[] charArray74 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray73, charArray74);
        char[] charArray76 = new char[] {};
        char[] charArray77 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray76, charArray77);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray74, charArray76);
        org.junit.Assert.assertArrayEquals("random", charArray65, charArray76);
        char[] charArray81 = new char[] {};
        char[] charArray82 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray81, charArray82);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray65, charArray81);
        org.junit.Assert.assertArrayEquals(charArray19, charArray65);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) charArray65);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3334");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain10 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        org.apache.lucene.index.Fields fields16 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("node_s_0", indexReader14, fields15, fields16, false);
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests0.assertPositionsSkippingEquals("tests.failfast", indexReader20, 3, postingsEnum22, postingsEnum23);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.nightly", postingsEnum27, postingsEnum28);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3335");
        int[] intArray1 = null;
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray3, intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray8, intArray9);
        int[] intArray11 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray9, intArray11);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray13, intArray14);
        org.junit.Assert.assertArrayEquals(intArray9, intArray14);
        int[] intArray20 = new int[] {};
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray20, intArray21);
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray21, intArray23);
        int[] intArray25 = new int[] {};
        int[] intArray26 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray25, intArray26);
        org.junit.Assert.assertArrayEquals(intArray21, intArray26);
        int[] intArray30 = new int[] {};
        int[] intArray31 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray30, intArray31);
        int[] intArray33 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray31, intArray33);
        org.junit.Assert.assertArrayEquals("random", intArray26, intArray31);
        int[] intArray36 = new int[] {};
        int[] intArray37 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray36, intArray37);
        org.junit.Assert.assertArrayEquals(intArray26, intArray37);
        int[] intArray41 = new int[] {};
        int[] intArray42 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray41, intArray42);
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray42, intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray47 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray46, intArray47);
        org.junit.Assert.assertArrayEquals(intArray42, intArray47);
        org.junit.Assert.assertArrayEquals(intArray26, intArray47);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray52);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray26, intArray52);
        org.junit.Assert.assertArrayEquals("tests.slow", intArray14, intArray52);
        org.junit.Assert.assertArrayEquals("europarl.lines.txt.gz", intArray3, intArray52);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", intArray1, intArray52);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 1.0f, (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3337");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray3, charArray4);
        char[] charArray6 = new char[] {};
        char[] charArray7 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray6, charArray7);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray4, charArray6);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        char[] charArray16 = new char[] {};
        char[] charArray17 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray16, charArray17);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray14, charArray16);
        char[] charArray20 = new char[] {};
        char[] charArray21 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray20, charArray21);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray14, charArray20);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        org.junit.Assert.assertArrayEquals(charArray24, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray31, charArray32);
        char[] charArray34 = new char[] {};
        char[] charArray35 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray34, charArray35);
        org.junit.Assert.assertArrayEquals(charArray31, charArray35);
        org.junit.Assert.assertArrayEquals(charArray28, charArray35);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray20, charArray35);
        org.junit.Assert.assertArrayEquals("tests.failfast", charArray6, charArray20);
        char[] charArray42 = new char[] {};
        char[] charArray43 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray42, charArray43);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray43, charArray45);
        char[] charArray51 = new char[] {};
        char[] charArray52 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray51, charArray52);
        char[] charArray54 = new char[] {};
        char[] charArray55 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray54, charArray55);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray52, charArray54);
        char[] charArray58 = new char[] {};
        char[] charArray59 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray58, charArray59);
        org.junit.Assert.assertArrayEquals("tests.badapples", charArray52, charArray58);
        org.junit.Assert.assertArrayEquals(charArray45, charArray58);
        org.junit.Assert.assertArrayEquals(charArray20, charArray58);
        char[] charArray64 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", charArray58, charArray64);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3338");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests3.assertDocsAndPositionsEnumEquals("random", postingsEnum19, postingsEnum20);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3339");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray7);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) executorServiceArray7);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        java.util.Locale locale20 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray21 = new java.lang.Cloneable[] { locale20 };
        java.util.List<java.lang.Cloneable> cloneableList22 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray21);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray21, (java.lang.Object[]) cloneableArray26);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray38);
        java.util.Locale locale43 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray44 = new java.lang.Cloneable[] { locale43 };
        java.util.List<java.lang.Cloneable> cloneableList45 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray44);
        java.util.Locale locale48 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray49 = new java.lang.Cloneable[] { locale48 };
        java.util.List<java.lang.Cloneable> cloneableList50 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray44, (java.lang.Object[]) cloneableArray49);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray49);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray49);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray26);
        java.util.Locale locale57 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray58 = new java.lang.Cloneable[] { locale57 };
        java.util.List<java.lang.Cloneable> cloneableList59 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray58);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray16, (java.lang.Object[]) cloneableArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) executorServiceArray2, (java.lang.Object) cloneableArray16);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3340");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.junit.rules.RuleChain ruleChain6 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        simpleIndexQueryParserTests1.ensureCleanedUp();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests1.testQueryStringFields1Builder();
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3341");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) 100, 0.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3342");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain4;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum7, postingsEnum8);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3343");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests2.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain6 = null;
        simpleIndexQueryParserTests2.failureAndSuccessEvents = ruleChain6;
        org.apache.lucene.index.IndexReader indexReader9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        simpleIndexQueryParserTests2.assertDocsSkippingEquals("tests.nightly", indexReader9, 100, postingsEnum11, postingsEnum12, false);
        simpleIndexQueryParserTests2.resetCheckIndexStatus();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests2);
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests2.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull("tests.monster", (java.lang.Object) ruleChain17);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3344");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain5 = null;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain5;
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.nightly", indexReader8, 100, postingsEnum10, postingsEnum11, false);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        simpleIndexQueryParserTests1.assertDocsSkippingEquals("tests.slow", indexReader17, (int) (byte) 10, postingsEnum19, postingsEnum20, true);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTests1);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests29 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests29.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain31 = simpleIndexQueryParserTests29.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableArray27, (java.lang.Object) simpleIndexQueryParserTests29);
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Terms terms35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        simpleIndexQueryParserTests29.assertTermsEquals("", indexReader34, terms35, terms36, true);
        simpleIndexQueryParserTests29.setUp();
        org.junit.rules.TestRule testRule40 = simpleIndexQueryParserTests29.ruleChain;
        org.junit.rules.TestRule testRule41 = simpleIndexQueryParserTests29.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule41;
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) testRule41);
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Fields fields46 = null;
        org.apache.lucene.index.Fields fields47 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.slow", indexReader45, fields46, fields47, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        simpleIndexQueryParserTests50.assertFieldsEquals("tests.maxfailures", indexReader52, fields53, fields54, false);
        simpleIndexQueryParserTests50.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests50.setIndexWriterMaxDocs(0);
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.Terms terms62 = null;
        org.apache.lucene.index.Terms terms63 = null;
        simpleIndexQueryParserTests50.assertTermsEquals("tests.awaitsfix", indexReader61, terms62, terms63, false);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) "tests.slow", (java.lang.Object) "tests.awaitsfix");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3345");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.badapples", indexReader17, terms18, terms19, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs((int) (short) 1);
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests1.assertDocsEnumEquals("tests.failfast", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests1.setIndexWriterMaxDocs(1);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3346");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray3, charArray5);
        char[] charArray12 = new char[] {};
        char[] charArray13 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray12, charArray13);
        char[] charArray15 = new char[] {};
        char[] charArray16 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray15, charArray16);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray13, charArray15);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        char[] charArray24 = new char[] {};
        char[] charArray25 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray24, charArray25);
        org.junit.Assert.assertArrayEquals(charArray21, charArray25);
        char[] charArray29 = new char[] {};
        char[] charArray30 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray29, charArray30);
        char[] charArray32 = new char[] {};
        char[] charArray33 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray32, charArray33);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray30, charArray32);
        org.junit.Assert.assertArrayEquals("random", charArray21, charArray32);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray37, charArray38);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray21, charArray37);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray21);
        char[] charArray44 = new char[] {};
        char[] charArray45 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray44, charArray45);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray52 = new char[] {};
        char[] charArray53 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray52, charArray53);
        char[] charArray55 = new char[] {};
        char[] charArray56 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray55, charArray56);
        org.junit.Assert.assertArrayEquals(charArray52, charArray56);
        char[] charArray60 = new char[] {};
        char[] charArray61 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray60, charArray61);
        char[] charArray63 = new char[] {};
        char[] charArray64 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray63, charArray64);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray61, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray52, charArray63);
        org.junit.Assert.assertArrayEquals("random", charArray44, charArray63);
        char[] charArray69 = new char[] {};
        char[] charArray70 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray69, charArray70);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        org.junit.Assert.assertArrayEquals(charArray44, charArray73);
        char[] charArray77 = new char[] {};
        char[] charArray78 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray77, charArray78);
        char[] charArray80 = new char[] {};
        char[] charArray81 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray80, charArray81);
        org.junit.Assert.assertArrayEquals(charArray77, charArray81);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray73, charArray77);
        org.junit.Assert.assertArrayEquals("", charArray13, charArray77);
        org.junit.Assert.assertArrayEquals(charArray5, charArray13);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests88 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str89 = simpleIndexQueryParserTests88.getTestName();
        simpleIndexQueryParserTests88.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests88.ensureCleanedUp();
        java.lang.String str92 = simpleIndexQueryParserTests88.getTestName();
        org.junit.Assert.assertNotNull("tests.slow", (java.lang.Object) simpleIndexQueryParserTests88);
        org.junit.rules.TestRule testRule94 = simpleIndexQueryParserTests88.ruleChain;
        org.junit.Assert.assertNotSame("tests.failfast", (java.lang.Object) charArray13, (java.lang.Object) simpleIndexQueryParserTests88);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests88.testMoreLikeThisBuilder();
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3347");
        java.util.Locale locale2 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray3 = new java.lang.Cloneable[] { locale2 };
        java.util.List<java.lang.Cloneable> cloneableList4 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray3);
        java.util.Locale locale7 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray8 = new java.lang.Cloneable[] { locale7 };
        java.util.List<java.lang.Cloneable> cloneableList9 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray8);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray3, (java.lang.Object[]) cloneableArray8);
        float[] floatArray17 = new float[] { 100, 6, ' ', 2, 5, 100L };
        float[] floatArray24 = new float[] { 100, 6, ' ', 2, 5, 100L };
        float[][] floatArray25 = new float[][] { floatArray17, floatArray24 };
        java.util.Set<float[]> floatArraySet26 = org.apache.lucene.util.LuceneTestCase.asSet(floatArray25);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) cloneableArray8, (java.lang.Object) floatArray25);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3348");
        short[] shortArray5 = new short[] {};
        short[] shortArray6 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray5, shortArray6);
        short[] shortArray8 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray5, shortArray8);
        short[] shortArray11 = new short[] {};
        short[] shortArray12 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray11, shortArray12);
        short[] shortArray14 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray11, shortArray14);
        org.junit.Assert.assertArrayEquals("", shortArray5, shortArray14);
        short[] shortArray18 = new short[] {};
        short[] shortArray20 = new short[] {};
        short[] shortArray21 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray20, shortArray21);
        org.junit.Assert.assertArrayEquals("random", shortArray18, shortArray21);
        org.junit.Assert.assertArrayEquals("tests.monster", shortArray14, shortArray21);
        short[] shortArray26 = new short[] {};
        short[] shortArray28 = new short[] {};
        short[] shortArray29 = new short[] {};
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", shortArray28, shortArray29);
        org.junit.Assert.assertArrayEquals("random", shortArray26, shortArray29);
        org.junit.Assert.assertArrayEquals("node_s_0", shortArray14, shortArray29);
        short[] shortArray33 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", shortArray14, shortArray33);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3349");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray15 = new long[] {};
        long[] longArray16 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray15, longArray16);
        long[] longArray18 = new long[] {};
        long[] longArray19 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray18, longArray19);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray16, longArray19);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray26, longArray27);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray24, longArray27);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray16, longArray27);
        long[] longArray33 = new long[] {};
        long[] longArray34 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray33, longArray34);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray36, longArray37);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray34, longArray37);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray41, longArray42);
        long[] longArray44 = new long[] {};
        long[] longArray45 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray44, longArray45);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray42, longArray45);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray34, longArray45);
        org.junit.Assert.assertArrayEquals(longArray16, longArray45);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray51, longArray52);
        long[] longArray56 = new long[] {};
        long[] longArray57 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray56, longArray57);
        long[] longArray59 = new long[] {};
        long[] longArray60 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray59, longArray60);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray57, longArray60);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray64, longArray65);
        long[] longArray67 = new long[] {};
        long[] longArray68 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray67, longArray68);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray65, longArray68);
        org.junit.Assert.assertArrayEquals(longArray60, longArray65);
        long[] longArray73 = new long[] {};
        long[] longArray74 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray73, longArray74);
        long[] longArray77 = new long[] {};
        long[] longArray78 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray77, longArray78);
        long[] longArray80 = new long[] {};
        long[] longArray81 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray80, longArray81);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray78, longArray81);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray74, longArray81);
        org.junit.Assert.assertArrayEquals("tests.weekly", longArray60, longArray81);
        org.junit.Assert.assertArrayEquals("tests.failfast", longArray51, longArray60);
        org.junit.Assert.assertArrayEquals(longArray16, longArray60);
        org.junit.Assert.assertArrayEquals("tests.monster", longArray10, longArray16);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray16);
        long[] longArray90 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray3, longArray90);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3350");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests1);
        org.apache.lucene.index.IndexReader indexReader7 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader7, (-1), postingsEnum9, postingsEnum10);
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        simpleIndexQueryParserTests1.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("random", indexReader16, fields17, fields18, true);
        org.junit.rules.TestRule testRule21 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.overrideTestDefaultQueryCache();
        simpleIndexQueryParserTests1.setUp();
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray26);
        byte[] byteArray29 = new byte[] {};
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray30);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray29, byteArray33);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray26, byteArray29);
        byte[] byteArray38 = new byte[] {};
        byte[] byteArray39 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray39);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray38, byteArray42);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray45, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray38, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray38);
        byte[] byteArray51 = new byte[] {};
        byte[] byteArray52 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray51, byteArray52);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray55, byteArray59);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray52, byteArray55);
        byte[] byteArray64 = new byte[] {};
        byte[] byteArray65 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray65);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray64, byteArray68);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray71, byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray64, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray52, byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray26, byteArray71);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) byteArray26);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3351");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.setup();
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3352");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((-1.0d), (double) '4');
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3353");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader34, fields35, fields36, false);
        simpleIndexQueryParserTests1.setUp();
        simpleIndexQueryParserTests1.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain41 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests42 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests42.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        simpleIndexQueryParserTests42.assertDocsEnumEquals("", postingsEnum46, postingsEnum47, true);
        simpleIndexQueryParserTests42.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader52 = null;
        org.apache.lucene.index.Fields fields53 = null;
        org.apache.lucene.index.Fields fields54 = null;
        simpleIndexQueryParserTests42.assertFieldsEquals("tests.failfast", indexReader52, fields53, fields54, true);
        org.apache.lucene.index.IndexReader indexReader58 = null;
        org.apache.lucene.index.Terms terms59 = null;
        org.apache.lucene.index.Terms terms60 = null;
        simpleIndexQueryParserTests42.assertTermsEquals("random", indexReader58, terms59, terms60, false);
        org.apache.lucene.index.IndexReader indexReader64 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        simpleIndexQueryParserTests42.assertPositionsSkippingEquals("tests.slow", indexReader64, (int) (short) 10, postingsEnum66, postingsEnum67);
        simpleIndexQueryParserTests42.resetCheckIndexStatus();
        java.lang.String str70 = simpleIndexQueryParserTests42.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) simpleIndexQueryParserTests1, (java.lang.Object) simpleIndexQueryParserTests42);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3354");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray4 = new double[][] { doubleArray3 };
        double[] doubleArray8 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        double[] doubleArray13 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        double[] doubleArray18 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray23 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray28 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[][][] doubleArray30 = new double[][][] { doubleArray4, doubleArray9, doubleArray14, doubleArray19, doubleArray24, doubleArray29 };
        java.util.Set<double[][]> doubleArraySet31 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray30);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling32 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling34 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling37 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling32, throttling34, throttling37 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling40 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling42 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling42);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling45 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling40, throttling42, throttling45 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling48 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling50 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling50);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling throttling53 = org.apache.lucene.util.LuceneTestCase.TEST_THROTTLING;
        org.junit.Assert.assertNotNull("", (java.lang.Object) throttling53);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray55 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] { throttling48, throttling50, throttling53 };
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] throttlingArray56 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[][] { throttlingArray39, throttlingArray47, throttlingArray55 };
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling[]> throttlingArraySet57 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray56);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) doubleArray30, (java.lang.Object[]) throttlingArray56);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3355");
        char[] charArray2 = new char[] {};
        char[] charArray3 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray2, charArray3);
        char[] charArray5 = new char[] {};
        char[] charArray6 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray5, charArray6);
        org.junit.Assert.assertArrayEquals(charArray2, charArray6);
        char[] charArray10 = new char[] {};
        char[] charArray11 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray10, charArray11);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray13, charArray14);
        org.junit.Assert.assertArrayEquals(charArray10, charArray14);
        char[] charArray18 = new char[] {};
        char[] charArray19 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray19);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray21, charArray22);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray19, charArray21);
        org.junit.Assert.assertArrayEquals("random", charArray10, charArray21);
        org.junit.Assert.assertArrayEquals("random", charArray2, charArray21);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray27, charArray28);
        char[] charArray30 = new char[] {};
        char[] charArray31 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray30, charArray31);
        org.junit.Assert.assertArrayEquals(charArray27, charArray31);
        org.junit.Assert.assertArrayEquals(charArray2, charArray31);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray35, charArray36);
        char[] charArray38 = new char[] {};
        char[] charArray39 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray38, charArray39);
        org.junit.Assert.assertArrayEquals(charArray35, charArray39);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", charArray31, charArray35);
        char[] charArray45 = new char[] {};
        char[] charArray46 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray45, charArray46);
        char[] charArray48 = new char[] {};
        char[] charArray49 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray48, charArray49);
        org.junit.Assert.assertArrayEquals(charArray45, charArray49);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray53, charArray54);
        char[] charArray56 = new char[] {};
        char[] charArray57 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray56, charArray57);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray54, charArray56);
        org.junit.Assert.assertArrayEquals("random", charArray45, charArray56);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray61, charArray62);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray45, charArray61);
        org.junit.Assert.assertArrayEquals(charArray35, charArray45);
        int[] intArray67 = new int[] {};
        int[] intArray68 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray67, intArray68);
        int[] intArray70 = new int[] {};
        org.junit.Assert.assertArrayEquals("tests.monster", intArray68, intArray70);
        int[] intArray72 = new int[] {};
        int[] intArray73 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray72, intArray73);
        org.junit.Assert.assertArrayEquals(intArray68, intArray73);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray68);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests78 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str79 = simpleIndexQueryParserTests78.getTestName();
        simpleIndexQueryParserTests78.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests78.ensureCleanedUp();
        java.lang.String str82 = simpleIndexQueryParserTests78.getTestName();
        simpleIndexQueryParserTests78.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests78.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests78.resetCheckIndexStatus();
        simpleIndexQueryParserTests78.setUp();
        org.junit.rules.RuleChain ruleChain89 = simpleIndexQueryParserTests78.failureAndSuccessEvents;
        simpleIndexQueryParserTests78.restoreIndexWriterMaxDocs();
        org.junit.rules.TestRule testRule91 = simpleIndexQueryParserTests78.ruleChain;
        org.junit.Assert.assertNotNull("tests.failfast", (java.lang.Object) simpleIndexQueryParserTests78);
        org.junit.Assert.assertNotSame((java.lang.Object) intArray68, (java.lang.Object) "tests.failfast");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) charArray35, (java.lang.Object) intArray68);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3356");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.badapples", (java.lang.Object) byteArray1);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3357");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] { executorService0 };
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray1);
        java.util.Locale locale10 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray11 = new java.lang.Cloneable[] { locale10 };
        java.util.List<java.lang.Cloneable> cloneableList12 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray11);
        java.util.Locale locale15 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray16 = new java.lang.Cloneable[] { locale15 };
        java.util.List<java.lang.Cloneable> cloneableList17 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray16);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray16);
        org.junit.Assert.assertNotSame((java.lang.Object) 10L, (java.lang.Object) cloneableArray11);
        java.util.Locale locale23 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray24 = new java.lang.Cloneable[] { locale23 };
        java.util.List<java.lang.Cloneable> cloneableList25 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray24);
        java.util.Locale locale28 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray29 = new java.lang.Cloneable[] { locale28 };
        java.util.List<java.lang.Cloneable> cloneableList30 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray29);
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray34 = new java.lang.Cloneable[] { locale33 };
        java.util.List<java.lang.Cloneable> cloneableList35 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray34);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray29, (java.lang.Object[]) cloneableArray34);
        java.util.Locale locale40 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray41 = new java.lang.Cloneable[] { locale40 };
        java.util.List<java.lang.Cloneable> cloneableList42 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray41);
        java.util.Locale locale45 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray46 = new java.lang.Cloneable[] { locale45 };
        java.util.List<java.lang.Cloneable> cloneableList47 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray46);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray46);
        java.util.Locale locale51 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray52 = new java.lang.Cloneable[] { locale51 };
        java.util.List<java.lang.Cloneable> cloneableList53 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray52);
        java.util.Locale locale56 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray57 = new java.lang.Cloneable[] { locale56 };
        java.util.List<java.lang.Cloneable> cloneableList58 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray52, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray41, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray24, (java.lang.Object[]) cloneableArray34);
        java.util.Locale locale65 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray66 = new java.lang.Cloneable[] { locale65 };
        java.util.List<java.lang.Cloneable> cloneableList67 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray66);
        java.util.Locale locale70 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray71 = new java.lang.Cloneable[] { locale70 };
        java.util.List<java.lang.Cloneable> cloneableList72 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray66, (java.lang.Object[]) cloneableArray71);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray34, (java.lang.Object[]) cloneableArray71);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray11, (java.lang.Object[]) cloneableArray34);
        // during test generation this statement threw an exception of type org.junit.internal.ArrayComparisonFailure in error
        org.junit.Assert.assertEquals((java.lang.Object[]) executorServiceArray1, (java.lang.Object[]) cloneableArray34);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3358");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("hi!", postingsEnum5, postingsEnum6, false);
        org.junit.rules.TestRule testRule9 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.awaitsfix", 10, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3359");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        java.lang.String str7 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests3.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests3.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = simpleIndexQueryParserTests3.failureAndSuccessEvents;
        simpleIndexQueryParserTests3.ensureCheckIndexPassed();
        simpleIndexQueryParserTests3.ensureCleanedUp();
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) simpleIndexQueryParserTests3);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.maxfailures", indexReader18, (int) (byte) 1, postingsEnum20, postingsEnum21, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("random", postingsEnum26, postingsEnum27, false);
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.failfast", (int) (byte) 1, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3360");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] { executorService9 };
        boolean boolean11 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        boolean boolean12 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray10);
        org.junit.Assert.assertEquals("node_s_0", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) executorServiceArray10);
        boolean boolean14 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray3);
        java.util.Locale[] localeArray16 = new java.util.Locale[] {};
        java.util.Set<java.util.Locale> localeSet17 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        java.util.List<java.util.Locale> localeList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, localeArray16);
        java.util.Set<java.util.Locale> localeSet19 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) executorServiceArray3, (java.lang.Object[]) localeArray16);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3361");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (byte) 1);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) (short) 1);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.setUp();
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        java.lang.String str13 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.junit.rules.RuleChain ruleChain16 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain17 = simpleIndexQueryParserTests15.failureAndSuccessEvents;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain17;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testSpanFirstQueryBuilder();
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3362");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        simpleIndexQueryParserTests0.assertDocsSkippingEquals("tests.slow", indexReader4, 1, postingsEnum6, postingsEnum7, false);
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues13 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues14 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("tests.badapples", 0, numericDocValues13, numericDocValues14);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3363");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) 0.0f, (double) 100.0f, 0.0d);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3364");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) (short) 1, (double) 5);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3365");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests1 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str2 = simpleIndexQueryParserTests1.getTestName();
        simpleIndexQueryParserTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        simpleIndexQueryParserTests1.assertTermsEquals("tests.maxfailures", indexReader5, terms6, terms7, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests10 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str11 = simpleIndexQueryParserTests10.getTestName();
        simpleIndexQueryParserTests10.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests10.ensureCleanedUp();
        java.lang.String str14 = simpleIndexQueryParserTests10.getTestName();
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Fields fields17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        simpleIndexQueryParserTests10.assertFieldsEquals("europarl.lines.txt.gz", indexReader16, fields17, fields18, true);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests21 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests21.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        simpleIndexQueryParserTests21.assertDocsEnumEquals("", postingsEnum25, postingsEnum26, true);
        simpleIndexQueryParserTests21.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain30 = simpleIndexQueryParserTests21.failureAndSuccessEvents;
        simpleIndexQueryParserTests10.failureAndSuccessEvents = ruleChain30;
        simpleIndexQueryParserTests1.failureAndSuccessEvents = ruleChain30;
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.Fields fields35 = null;
        org.apache.lucene.index.Fields fields36 = null;
        simpleIndexQueryParserTests1.assertFieldsEquals("tests.weekly", indexReader34, fields35, fields36, false);
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.RuleChain ruleChain40 = simpleIndexQueryParserTests1.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule41 = simpleIndexQueryParserTests1.ruleChain;
        simpleIndexQueryParserTests1.setUp();
        org.junit.rules.TestRule testRule43 = simpleIndexQueryParserTests1.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) simpleIndexQueryParserTests1);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3366");
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures1 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures2 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures1);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray3 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures2 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures4 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures5 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures4);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray6 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures5 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures7 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures8 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures7);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray9 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures8 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures10 = null;
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures testRuleIgnoreAfterMaxFailures11 = org.apache.lucene.util.LuceneTestCase.replaceMaxFailureRule(testRuleIgnoreAfterMaxFailures10);
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] testRuleIgnoreAfterMaxFailuresArray12 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[] { testRuleIgnoreAfterMaxFailures11 };
        org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] testRuleIgnoreAfterMaxFailuresArray13 = new org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[][] { testRuleIgnoreAfterMaxFailuresArray3, testRuleIgnoreAfterMaxFailuresArray6, testRuleIgnoreAfterMaxFailuresArray9, testRuleIgnoreAfterMaxFailuresArray12 };
        java.util.Set<org.apache.lucene.util.TestRuleIgnoreAfterMaxFailures[]> testRuleIgnoreAfterMaxFailuresArraySet14 = org.apache.lucene.util.LuceneTestCase.asSet(testRuleIgnoreAfterMaxFailuresArray13);
        double[] doubleArray20 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray20 };
        double[] doubleArray25 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        double[] doubleArray30 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray31 = new double[][] { doubleArray30 };
        double[] doubleArray35 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray36 = new double[][] { doubleArray35 };
        double[] doubleArray40 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        double[] doubleArray45 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray46 = new double[][] { doubleArray45 };
        double[][][] doubleArray47 = new double[][][] { doubleArray21, doubleArray26, doubleArray31, doubleArray36, doubleArray41, doubleArray46 };
        java.util.Set<double[][]> doubleArraySet48 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray47);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests50 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str51 = simpleIndexQueryParserTests50.getTestName();
        simpleIndexQueryParserTests50.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests50.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests50);
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum58 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum59 = null;
        simpleIndexQueryParserTests50.assertPositionsSkippingEquals("tests.maxfailures", indexReader56, (-1), postingsEnum58, postingsEnum59);
        simpleIndexQueryParserTests50.resetCheckIndexStatus();
        simpleIndexQueryParserTests50.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) doubleArray47, (java.lang.Object) simpleIndexQueryParserTests50);
        java.util.List<double[][]> doubleArrayList64 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 0, doubleArray47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) testRuleIgnoreAfterMaxFailuresArray13, (java.lang.Object[]) doubleArray47);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3367");
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] { (byte) 0 };
        java.util.Set<java.io.Serializable> serializableSet2 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray1);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests3 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str4 = simpleIndexQueryParserTests3.getTestName();
        simpleIndexQueryParserTests3.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain10 = null;
        simpleIndexQueryParserTests6.failureAndSuccessEvents = ruleChain10;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray16 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests3, simpleIndexQueryParserTests6, simpleIndexQueryParserTests12 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet17 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray16);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray16);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet19 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray16);
        java.util.Set<org.junit.Assert> assertSet20 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.Assert[]) simpleIndexQueryParserTestsArray16);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray1, (java.lang.Object[]) simpleIndexQueryParserTestsArray16);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3368");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) 10.0f, (double) 1.0f);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3369");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] { executorService1 };
        boolean boolean3 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean4 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean5 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean6 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean7 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean8 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean9 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        boolean boolean10 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray2);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests14 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str15 = simpleIndexQueryParserTests14.getTestName();
        simpleIndexQueryParserTests14.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests14.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain18 = null;
        simpleIndexQueryParserTests14.failureAndSuccessEvents = ruleChain18;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests20 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str21 = simpleIndexQueryParserTests20.getTestName();
        simpleIndexQueryParserTests20.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests20.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray24 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests11, simpleIndexQueryParserTests14, simpleIndexQueryParserTests20 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet25 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray24);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet26 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray24);
        java.util.Set<org.elasticsearch.test.ElasticsearchSingleNodeTest> elasticsearchSingleNodeTestSet27 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchSingleNodeTest[]) simpleIndexQueryParserTestsArray24);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.awaitsfix", (java.lang.Object[]) executorServiceArray2, (java.lang.Object[]) simpleIndexQueryParserTestsArray24);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3370");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray6, byteArray7);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray9, byteArray10);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray6, byteArray10);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray3, byteArray6);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray16);
        byte[] byteArray18 = new byte[] {};
        byte[] byteArray19 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray18, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray15, byteArray19);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray15);
        byte[] byteArray28 = new byte[] {};
        byte[] byteArray29 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray29);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray29, byteArray32);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray41, byteArray45);
        byte[] byteArray48 = new byte[] {};
        byte[] byteArray49 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray29, byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray48);
        byte[] byteArray55 = new byte[] {};
        byte[] byteArray56 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray56);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray56, byteArray59);
        byte[] byteArray63 = new byte[] {};
        byte[] byteArray64 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray64);
        byte[] byteArray67 = new byte[] {};
        byte[] byteArray68 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray68);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray67, byteArray71);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray64, byteArray67);
        byte[] byteArray76 = new byte[] {};
        byte[] byteArray77 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray77);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray77, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray59, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray48, byteArray67);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) byteArray48);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3371");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.util.Locale locale8 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray9 = new java.lang.Cloneable[] { locale8 };
        java.util.List<java.lang.Cloneable> cloneableList10 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray9);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray9);
        java.util.Locale locale14 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray15 = new java.lang.Cloneable[] { locale14 };
        java.util.List<java.lang.Cloneable> cloneableList16 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray15);
        java.util.Locale locale19 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray20 = new java.lang.Cloneable[] { locale19 };
        java.util.List<java.lang.Cloneable> cloneableList21 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray20);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) cloneableArray4, (java.lang.Object[]) cloneableArray15);
        java.util.Locale locale26 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray27 = new java.lang.Cloneable[] { locale26 };
        java.util.List<java.lang.Cloneable> cloneableList28 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray27);
        java.util.Locale locale32 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray33 = new java.lang.Cloneable[] { locale32 };
        java.util.List<java.lang.Cloneable> cloneableList34 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray33);
        java.util.Locale locale37 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray38 = new java.lang.Cloneable[] { locale37 };
        java.util.List<java.lang.Cloneable> cloneableList39 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray38);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray33, (java.lang.Object[]) cloneableArray38);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray33, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray27, (java.lang.Object[]) cloneableArray33);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) cloneableArray27);
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray50 = new java.lang.CharSequence[][] { charSequenceArray46, charSequenceArray47, charSequenceArray48, charSequenceArray49 };
        java.lang.CharSequence[][][] charSequenceArray51 = new java.lang.CharSequence[][][] { charSequenceArray50 };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray53 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray56 = new java.lang.CharSequence[][] { charSequenceArray52, charSequenceArray53, charSequenceArray54, charSequenceArray55 };
        java.lang.CharSequence[][][] charSequenceArray57 = new java.lang.CharSequence[][][] { charSequenceArray56 };
        java.lang.CharSequence[][][][] charSequenceArray58 = new java.lang.CharSequence[][][][] { charSequenceArray51, charSequenceArray57 };
        java.util.Set<java.lang.CharSequence[][][]> charSequenceArraySet59 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray58);
        java.util.List<java.lang.CharSequence[][][]> charSequenceArrayList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (short) 1, charSequenceArray58);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray15, (java.lang.Object[]) charSequenceArray58);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3372");
        long[] longArray2 = new long[] {};
        long[] longArray3 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray2, longArray3);
        long[] longArray5 = new long[] {};
        long[] longArray6 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray5, longArray6);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray3, longArray6);
        long[] longArray10 = new long[] {};
        long[] longArray11 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray10, longArray11);
        long[] longArray13 = new long[] {};
        long[] longArray14 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray13, longArray14);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray11, longArray14);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray3, longArray14);
        long[] longArray20 = new long[] {};
        long[] longArray21 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray20, longArray21);
        long[] longArray23 = new long[] {};
        long[] longArray24 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray23, longArray24);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray21, longArray24);
        long[] longArray29 = new long[] {};
        long[] longArray30 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray29, longArray30);
        long[] longArray32 = new long[] {};
        long[] longArray33 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray32, longArray33);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray30, longArray33);
        long[] longArray37 = new long[] {};
        long[] longArray38 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray37, longArray38);
        long[] longArray40 = new long[] {};
        long[] longArray41 = new long[] {};
        org.junit.Assert.assertArrayEquals(longArray40, longArray41);
        org.junit.Assert.assertArrayEquals("tests.badapples", longArray38, longArray41);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", longArray30, longArray41);
        org.junit.Assert.assertArrayEquals("hi!", longArray21, longArray30);
        org.junit.Assert.assertArrayEquals(longArray14, longArray30);
        long[] longArray47 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(longArray14, longArray47);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3373");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        simpleIndexQueryParserTests8.ensureAllSearchContextsReleased();
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests8.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum18, postingsEnum19);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3374");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean1 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        boolean boolean2 = org.elasticsearch.test.ElasticsearchTestCase.terminate(executorServiceArray0);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray12, (java.lang.Object[]) cloneableArray17);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray12, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray12);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale31 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray32 = new java.lang.Cloneable[] { locale31 };
        java.util.List<java.lang.Cloneable> cloneableList33 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray32);
        java.util.Locale locale36 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray37 = new java.lang.Cloneable[] { locale36 };
        java.util.List<java.lang.Cloneable> cloneableList38 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray37);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray32, (java.lang.Object[]) cloneableArray37);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray32, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray32);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray12, (java.lang.Object[]) cloneableArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray0, (java.lang.Object[]) cloneableArray26);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3375");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(4);
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testBoostingQueryBuilder();
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3376");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", (double) 10, (double) (byte) 100);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3377");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain4 = simpleIndexQueryParserTests0.failureAndSuccessEvents;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testCustomBoostFactorQueryBuilder_withFunctionScore();
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3378");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs((int) ' ');
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum4, postingsEnum5, true);
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum10 = null;
        simpleIndexQueryParserTests0.assertDocsEnumEquals("", postingsEnum9, postingsEnum10, false);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        org.apache.lucene.util.LuceneTestCase.classRules = testRule14;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) testRule14);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3379");
        java.lang.Object[] objArray1 = null;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests2 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str3 = simpleIndexQueryParserTests2.getTestName();
        simpleIndexQueryParserTests2.ensureAllSearchContextsReleased();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests5 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str6 = simpleIndexQueryParserTests5.getTestName();
        simpleIndexQueryParserTests5.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests5.ensureCleanedUp();
        org.junit.rules.RuleChain ruleChain9 = null;
        simpleIndexQueryParserTests5.failureAndSuccessEvents = ruleChain9;
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests11 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str12 = simpleIndexQueryParserTests11.getTestName();
        simpleIndexQueryParserTests11.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests11.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests[] simpleIndexQueryParserTestsArray15 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests[] { simpleIndexQueryParserTests2, simpleIndexQueryParserTests5, simpleIndexQueryParserTests11 };
        java.util.Set<org.elasticsearch.index.query.SimpleIndexQueryParserTests> simpleIndexQueryParserTestsSet16 = org.apache.lucene.util.LuceneTestCase.asSet(simpleIndexQueryParserTestsArray15);
        org.junit.Assert.assertNotNull((java.lang.Object) simpleIndexQueryParserTestsArray15);
        java.util.Set<org.elasticsearch.test.ElasticsearchTestCase> elasticsearchTestCaseSet18 = org.apache.lucene.util.LuceneTestCase.asSet((org.elasticsearch.test.ElasticsearchTestCase[]) simpleIndexQueryParserTestsArray15);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", objArray1, (java.lang.Object[]) simpleIndexQueryParserTestsArray15);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3380");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 100, (long) (byte) 0);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3381");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        simpleIndexQueryParserTests0.setIndexWriterMaxDocs(100);
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryWithUnknownField();
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3382");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("europarl.lines.txt.gz", (long) (-1), (long) 100);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3383");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray6);
        byte[] byteArray8 = new byte[] {};
        byte[] byteArray9 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray9);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray5, byteArray9);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray2, byteArray5);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray15);
        byte[] byteArray17 = new byte[] {};
        byte[] byteArray18 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray18);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray15, byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray15);
        byte[] byteArray24 = new byte[] {};
        byte[] byteArray25 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray25);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray28);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray24, byteArray28);
        byte[] byteArray32 = new byte[] {};
        byte[] byteArray33 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray32, byteArray33);
        byte[] byteArray35 = new byte[] {};
        byte[] byteArray36 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray35, byteArray36);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray32, byteArray36);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", byteArray24, byteArray36);
        byte[] byteArray41 = new byte[] {};
        byte[] byteArray42 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray42);
        byte[] byteArray44 = new byte[] {};
        byte[] byteArray45 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray44, byteArray45);
        org.junit.Assert.assertArrayEquals("tests.nightly", byteArray42, byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray24, byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray15, byteArray42);
        byte[] byteArray50 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray42, byteArray50);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3384");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests0.restoreIndexWriterMaxDocs();
        simpleIndexQueryParserTests0.ensureCleanedUp();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests6 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str7 = simpleIndexQueryParserTests6.getTestName();
        simpleIndexQueryParserTests6.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests6.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests6);
        org.junit.rules.RuleChain ruleChain11 = simpleIndexQueryParserTests6.failureAndSuccessEvents;
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain11;
        org.junit.Assert.assertNotSame((java.lang.Object) simpleIndexQueryParserTests0, (java.lang.Object) ruleChain11);
        org.junit.rules.TestRule testRule14 = simpleIndexQueryParserTests0.ruleChain;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testQueryStringFields3Builder();
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3385");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        org.junit.rules.RuleChain ruleChain2 = null;
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain2;
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Fields fields6 = null;
        org.apache.lucene.index.Fields fields7 = null;
        simpleIndexQueryParserTests0.assertFieldsEquals("<unknown>", indexReader5, fields6, fields7, false);
        java.lang.String str10 = simpleIndexQueryParserTests0.getTestName();
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests12 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str13 = simpleIndexQueryParserTests12.getTestName();
        simpleIndexQueryParserTests12.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests12);
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        simpleIndexQueryParserTests12.assertPositionsSkippingEquals("tests.maxfailures", indexReader18, (-1), postingsEnum20, postingsEnum21);
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        simpleIndexQueryParserTests12.ensureCleanedUp();
        simpleIndexQueryParserTests12.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain26 = simpleIndexQueryParserTests12.failureAndSuccessEvents;
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.lang.Object obj33 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList32, obj33);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests35 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        simpleIndexQueryParserTests35.assertFieldsEquals("tests.maxfailures", indexReader37, fields38, fields39, false);
        org.junit.Assert.assertNotSame("tests.slow", obj33, (java.lang.Object) simpleIndexQueryParserTests35);
        simpleIndexQueryParserTests35.resetCheckIndexStatus();
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain26, (java.lang.Object) simpleIndexQueryParserTests35);
        simpleIndexQueryParserTests0.failureAndSuccessEvents = ruleChain26;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum47, postingsEnum48);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3386");
        double[] doubleArray4 = new double[] { (-1.0d), 0 };
        double[] doubleArray7 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray4, doubleArray7, (double) 100.0f);
        double[] doubleArray12 = new double[] { (-1.0d), 0 };
        double[] doubleArray15 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray15, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray15, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1.0d), 0 };
        double[] doubleArray25 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray22, doubleArray25, (double) 100.0f);
        double[] doubleArray30 = new double[] { (-1.0d), 0 };
        double[] doubleArray33 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray30, doubleArray33, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray33, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray33, (double) 100L);
        double[] doubleArray42 = new double[] { (-1.0d), 0 };
        double[] doubleArray45 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray42, doubleArray45, (double) 100.0f);
        double[] doubleArray50 = new double[] { (-1.0d), 0 };
        double[] doubleArray53 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray53, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray53, (double) (short) 100);
        double[] doubleArray60 = new double[] { (-1.0d), 0 };
        double[] doubleArray63 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray63, (double) 100.0f);
        double[] doubleArray68 = new double[] { (-1.0d), 0 };
        double[] doubleArray71 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray71, (double) 100.0f);
        org.junit.Assert.assertArrayEquals(doubleArray63, doubleArray71, (double) (short) 100);
        org.junit.Assert.assertArrayEquals(doubleArray45, doubleArray71, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray7, doubleArray45, (double) (short) 10);
        double[] doubleArray82 = new double[] { (-1.0d), 0 };
        double[] doubleArray85 = new double[] { 10L, 'a' };
        org.junit.Assert.assertArrayEquals(doubleArray82, doubleArray85, (double) 100.0f);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", doubleArray7, doubleArray82, 100.0d);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.awaitsfix", (java.lang.Object) 100.0d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3387");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.util.Locale locale5 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray6 = new java.lang.Cloneable[] { locale5 };
        java.util.List<java.lang.Cloneable> cloneableList7 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray6);
        java.util.Locale locale11 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray12 = new java.lang.Cloneable[] { locale11 };
        java.util.List<java.lang.Cloneable> cloneableList13 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray12);
        java.util.Locale locale16 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray17 = new java.lang.Cloneable[] { locale16 };
        java.util.List<java.lang.Cloneable> cloneableList18 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray17);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray12, (java.lang.Object[]) cloneableArray17);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) cloneableArray12, (java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray6, (java.lang.Object[]) cloneableArray12);
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray26 = new java.lang.Cloneable[] { locale25 };
        java.util.List<java.lang.Cloneable> cloneableList27 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray26);
        java.util.Locale locale30 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray31 = new java.lang.Cloneable[] { locale30 };
        java.util.List<java.lang.Cloneable> cloneableList32 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray31);
        java.util.Locale locale35 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray36 = new java.lang.Cloneable[] { locale35 };
        java.util.List<java.lang.Cloneable> cloneableList37 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray36);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray31, (java.lang.Object[]) cloneableArray36);
        java.util.Locale locale42 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray43 = new java.lang.Cloneable[] { locale42 };
        java.util.List<java.lang.Cloneable> cloneableList44 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray43);
        java.util.Locale locale47 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray48 = new java.lang.Cloneable[] { locale47 };
        java.util.List<java.lang.Cloneable> cloneableList49 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray48);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray43, (java.lang.Object[]) cloneableArray48);
        java.util.Locale locale53 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray54 = new java.lang.Cloneable[] { locale53 };
        java.util.List<java.lang.Cloneable> cloneableList55 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray54);
        java.util.Locale locale58 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray59 = new java.lang.Cloneable[] { locale58 };
        java.util.List<java.lang.Cloneable> cloneableList60 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray54, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertEquals("tests.slow", (java.lang.Object[]) cloneableArray43, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray36, (java.lang.Object[]) cloneableArray59);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) cloneableArray26, (java.lang.Object[]) cloneableArray36);
        org.junit.Assert.assertEquals((java.lang.Object[]) cloneableArray12, (java.lang.Object[]) cloneableArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) cloneableArray26);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3388");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule2 = simpleIndexQueryParserTests0.ruleChain;
        simpleIndexQueryParserTests0.ensureCheckIndexPassed();
        java.lang.String str4 = simpleIndexQueryParserTests0.getTestName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        simpleIndexQueryParserTests0.testPrefixQueryBoostQueryBuilder();
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3389");
        java.util.Locale locale3 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        java.lang.Cloneable[] cloneableArray4 = new java.lang.Cloneable[] { locale3 };
        java.util.List<java.lang.Cloneable> cloneableList5 = org.elasticsearch.test.ElasticsearchTestCase.randomSubsetOf((int) (byte) 0, cloneableArray4);
        java.lang.Object obj6 = null;
        org.junit.Assert.assertNotSame((java.lang.Object) cloneableList5, obj6);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests8 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Fields fields11 = null;
        org.apache.lucene.index.Fields fields12 = null;
        simpleIndexQueryParserTests8.assertFieldsEquals("tests.maxfailures", indexReader10, fields11, fields12, false);
        org.junit.Assert.assertNotSame("tests.slow", obj6, (java.lang.Object) simpleIndexQueryParserTests8);
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        simpleIndexQueryParserTests8.resetCheckIndexStatus();
        simpleIndexQueryParserTests8.ensureCleanedUp();
        simpleIndexQueryParserTests8.overrideTestDefaultQueryCache();
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        simpleIndexQueryParserTests8.assertDocsEnumEquals("enwiki.random.lines.txt", postingsEnum22, postingsEnum23, false);
        java.lang.String str26 = simpleIndexQueryParserTests8.getTestName();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) str26);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3390");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) 0, (double) 4, 0.0d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3391");
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests0 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str1 = simpleIndexQueryParserTests0.getTestName();
        simpleIndexQueryParserTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.maxfailures", indexReader4, terms5, terms6, true);
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        simpleIndexQueryParserTests0.assertTermsEquals("tests.failfast", indexReader10, terms11, terms12, false);
        simpleIndexQueryParserTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        simpleIndexQueryParserTests0.assertDocValuesEquals("node_s_0", (int) (short) 0, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3392");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("", (double) (byte) -1, (double) 4, (double) (-1.0f));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3393");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "random", "europarl.lines.txt.gz", "tests.slow", "tests.nightly", "tests.badapples" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.util.Set<java.lang.CharSequence[]> charSequenceArraySet8 = org.apache.lucene.util.LuceneTestCase.asSet(charSequenceArray7);
        double[] doubleArray13 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        double[] doubleArray18 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        double[] doubleArray23 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray23 };
        double[] doubleArray28 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        double[] doubleArray33 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray34 = new double[][] { doubleArray33 };
        double[] doubleArray38 = new double[] { 0.0f, (short) 10, 100.0f };
        double[][] doubleArray39 = new double[][] { doubleArray38 };
        double[][][] doubleArray40 = new double[][][] { doubleArray14, doubleArray19, doubleArray24, doubleArray29, doubleArray34, doubleArray39 };
        java.util.Set<double[][]> doubleArraySet41 = org.apache.lucene.util.LuceneTestCase.asSet(doubleArray40);
        org.elasticsearch.index.query.SimpleIndexQueryParserTests simpleIndexQueryParserTests43 = new org.elasticsearch.index.query.SimpleIndexQueryParserTests();
        java.lang.String str44 = simpleIndexQueryParserTests43.getTestName();
        simpleIndexQueryParserTests43.ensureAllSearchContextsReleased();
        simpleIndexQueryParserTests43.ensureCleanedUp();
        org.junit.Assert.assertNotNull("<unknown>", (java.lang.Object) simpleIndexQueryParserTests43);
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        simpleIndexQueryParserTests43.assertPositionsSkippingEquals("tests.maxfailures", indexReader49, (-1), postingsEnum51, postingsEnum52);
        simpleIndexQueryParserTests43.resetCheckIndexStatus();
        simpleIndexQueryParserTests43.ensureCheckIndexPassed();
        org.junit.Assert.assertNotSame("tests.monster", (java.lang.Object) doubleArray40, (java.lang.Object) simpleIndexQueryParserTests43);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("node_s_0", (java.lang.Object[]) charSequenceArray7, (java.lang.Object[]) doubleArray40);
    }
}

