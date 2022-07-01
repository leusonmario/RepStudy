import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5001");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (double) 10, 0.0d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5002");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (long) 0, (long) 4);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5003");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule1 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.PostingsEnum postingsEnum3 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum4 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.failfast", postingsEnum3, postingsEnum4, true);
        org.apache.lucene.index.PostingsEnum postingsEnum8 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum9 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.failfast", postingsEnum8, postingsEnum9, false);
        java.lang.String str12 = kuromojiAnalysisTests0.getTestName();
        java.lang.Object obj13 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) kuromojiAnalysisTests0, obj13);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5004");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray5 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet6 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray5);
        java.io.Serializable[] serializableArray8 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet9 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray8);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray10 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet11 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray10);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray8, (java.lang.Object[]) throttlingArray10);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) serializableArray8);
        org.junit.Assert.assertArrayEquals("tests.badapples", (java.lang.Object[]) serializableArray2, (java.lang.Object[]) throttlingArray5);
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray16);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray18 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet19 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray18);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray16, (java.lang.Object[]) throttlingArray18);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray5, (java.lang.Object[]) serializableArray16);
        java.util.Locale locale24 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.monster");
        java.util.Locale[] localeArray25 = new java.util.Locale[] { locale24 };
        java.util.Locale[][] localeArray26 = new java.util.Locale[][] { localeArray25 };
        java.util.List<java.util.Locale[]> localeArrayList27 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, localeArray26);
        java.util.Set<java.util.Locale[]> localeArraySet28 = org.apache.lucene.util.LuceneTestCase.asSet(localeArray26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object[]) throttlingArray5, (java.lang.Object[]) localeArray26);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5005");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) '4', (double) '4');
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5006");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "europarl.lines.txt.gz");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5007");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) (byte) 10, 0L);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5008");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) '4', (-1.0f), 10.0f);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5009");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.slow", (double) 100.0f, (double) (short) -1, (double) 10L);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5010");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(0.0d, (double) '4', (double) '4');
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5011");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.apache.lucene.index.IndexReader indexReader5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        org.apache.lucene.index.Terms terms7 = null;
        kuromojiAnalysisTests2.assertTermsEquals("tests.failfast", indexReader5, terms6, terms7, false);
        org.junit.rules.RuleChain ruleChain10 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        kuromojiAnalysisTests2.ensureCleanedUp();
        kuromojiAnalysisTests2.tearDown();
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet14 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray13);
        org.junit.Assert.assertNotEquals("europarl.lines.txt.gz", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) serializableArray13);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5012");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray2, (double) '#');
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray5, doubleArray6, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray1, doubleArray6, (double) 0.0f);
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray12, (double) '#');
        double[] doubleArray15 = new double[] {};
        double[] doubleArray16 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray15, doubleArray16, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray15, (double) 3);
        double[] doubleArray21 = new double[] {};
        double[] doubleArray22 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray22, (double) '#');
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray25, doubleArray26, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray25, (double) 3);
        org.junit.Assert.assertArrayEquals(doubleArray11, doubleArray21, (double) 100L);
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray21, (double) '4');
        double[] doubleArray35 = new double[] {};
        double[] doubleArray36 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray36, (double) '#');
        double[] doubleArray39 = new double[] {};
        double[] doubleArray40 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray39, doubleArray40, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray39, (double) 3);
        double[] doubleArray46 = new double[] {};
        double[] doubleArray47 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray47, (double) '#');
        double[] doubleArray50 = new double[] {};
        double[] doubleArray51 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray50, doubleArray51, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray46, doubleArray51, (double) 0.0f);
        double[] doubleArray56 = new double[] {};
        double[] doubleArray57 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray57, (double) '#');
        double[] doubleArray60 = new double[] {};
        double[] doubleArray61 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray60, doubleArray61, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray56, doubleArray61, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray46, doubleArray61, (double) 1);
        double[] doubleArray68 = new double[] {};
        double[] doubleArray69 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray68, doubleArray69, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray61, doubleArray69, (double) 2);
        org.junit.Assert.assertArrayEquals(doubleArray35, doubleArray69, (double) (short) -1);
        org.junit.Assert.assertArrayEquals(doubleArray21, doubleArray35, (double) 100L);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(doubleArray0, doubleArray21, (double) (-1L));
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5013");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule3 = kuromojiAnalysisTests2.ruleChain;
        org.junit.rules.TestRule testRule4 = null;
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule(testRule4);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        org.junit.rules.TestRule testRule7 = null;
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule(testRule7);
        org.junit.rules.RuleChain ruleChain9 = ruleChain5.around((org.junit.rules.TestRule) ruleChain8);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        kuromojiAnalysisTests2.failureAndSuccessEvents = ruleChain5;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests12 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests12.tearDown();
        org.apache.lucene.index.IndexReader indexReader15 = null;
        org.apache.lucene.index.Terms terms16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        kuromojiAnalysisTests12.assertTermsEquals("tests.failfast", indexReader15, terms16, terms17, false);
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests12.failureAndSuccessEvents;
        org.junit.runners.model.Statement statement21 = null;
        org.junit.runner.Description description22 = null;
        org.junit.runners.model.Statement statement23 = ruleChain20.apply(statement21, description22);
        org.junit.rules.RuleChain ruleChain24 = ruleChain5.around((org.junit.rules.TestRule) ruleChain20);
        org.junit.Assert.assertNotNull((java.lang.Object) ruleChain5);
        java.io.Serializable[] serializableArray26 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet27 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray26);
        java.io.Serializable[] serializableArray28 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet29 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray28);
        java.io.Serializable[] serializableArray30 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet31 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray30);
        java.util.Set[] setArray33 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray34 = (java.util.Set<java.io.Serializable>[]) setArray33;
        serializableSetArray34[0] = serializableSet27;
        serializableSetArray34[1] = serializableSet29;
        serializableSetArray34[2] = serializableSet31;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet41 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray34);
        org.junit.Assert.assertNotSame("<unknown>", (java.lang.Object) ruleChain5, (java.lang.Object) serializableSetArray34);
        java.io.Serializable[] serializableArray44 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet45 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray44);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet47 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray46);
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet49 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray48);
        java.util.Set[] setArray51 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray52 = (java.util.Set<java.io.Serializable>[]) setArray51;
        serializableSetArray52[0] = serializableSet45;
        serializableSetArray52[1] = serializableSet47;
        serializableSetArray52[2] = serializableSet49;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet59 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray52);
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet60 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray52);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet61 = org.apache.lucene.util.LuceneTestCase.asSet((java.util.Collection<java.io.Serializable>[]) serializableSetArray52);
        java.util.List<java.util.Set<java.io.Serializable>> serializableSetList62 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, serializableSetArray52);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableSetArray34, (java.lang.Object[]) serializableSetArray52);
        java.io.Serializable[] serializableArray67 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet68 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray67);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray69 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet70 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray69);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) throttlingArray69);
        java.io.Serializable[] serializableArray73 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet74 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray73);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray75 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet76 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray75);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) throttlingArray75);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet80 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray79);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray81 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet82 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray81);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray79, (java.lang.Object[]) throttlingArray81);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray73, (java.lang.Object[]) serializableArray79);
        org.junit.Assert.assertEquals("tests.badapples", (java.lang.Object[]) serializableArray67, (java.lang.Object[]) serializableArray73);
        java.util.concurrent.ExecutorService[] executorServiceArray86 = new java.util.concurrent.ExecutorService[] {};
        boolean boolean87 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        boolean boolean88 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray86);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", (java.lang.Object[]) serializableArray73, (java.lang.Object[]) executorServiceArray86);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.slow", (java.lang.Object[]) serializableSetArray52, (java.lang.Object[]) executorServiceArray86);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5014");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 'a', (float) (-1), (float) (byte) 1);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5015");
        byte[] byteArray1 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray1, byteArray7);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5016");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 3, (long) 5);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5017");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((float) 10, (float) 0L, 0.0f);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 5, (long) (byte) 10);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5019");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray11 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet12 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray11);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) throttlingArray16);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray11, (java.lang.Object[]) serializableArray14);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray11);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray22 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet23 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray22);
        java.io.Serializable[] serializableArray25 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet26 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray25);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray27 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet28 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray27);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray25, (java.lang.Object[]) throttlingArray27);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray22, (java.lang.Object[]) serializableArray25);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray11, (java.lang.Object[]) serializableArray25);
        java.lang.Object[] objArray32 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray25, objArray32);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5020");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests1.assertTermsEquals("hi!", indexReader11, terms12, terms13, true);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.maxfailures");
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        kuromojiAnalysisTests20.assertPathHasBeenCleared("hi!");
        org.junit.Assert.assertNotEquals("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests20);
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("tests.nightly", indexReader26, (int) (short) 100, postingsEnum28, postingsEnum29, true);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests33, (java.lang.Object) "");
        java.lang.String str37 = kuromojiAnalysisTests33.getTestName();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests20, (java.lang.Object) str37);
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain40 = null;
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain40;
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader44 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum46 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader44, (int) (short) 1, postingsEnum46, postingsEnum47, false);
        org.junit.rules.TestRule testRule50 = kuromojiAnalysisTests20.ruleChain;
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.NumericDocValues numericDocValues54 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues55 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests20.assertDocValuesEquals("tests.slow", 10, numericDocValues54, numericDocValues55);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5021");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader31, (int) (short) 1, postingsEnum33, postingsEnum34);
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("hi!", postingsEnum37, postingsEnum38);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5022");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        java.lang.String str5 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader11, 0, postingsEnum13, postingsEnum14, false);
        kuromojiAnalysisTests1.ensureAllSearchContextsReleased();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader19, 1, postingsEnum21, postingsEnum22);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotNull((java.lang.Object) postingsEnum21);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5023");
        java.lang.String[] strArray2 = new java.lang.String[] { "tests.slow", "tests.weekly" };
        java.util.Set<java.lang.String> strSet3 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        java.util.Set<java.lang.String> strSet4 = org.apache.lucene.util.LuceneTestCase.asSet(strArray2);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        kuromojiAnalysisTests5.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests5.setIndexWriterMaxDocs((-1));
        org.junit.rules.RuleChain ruleChain17 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame((java.lang.Object) strSet4, (java.lang.Object) kuromojiAnalysisTests5);
        kuromojiAnalysisTests5.ensureAllSearchContextsReleased();
        org.junit.rules.RuleChain ruleChain20 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues23 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues24 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests5.assertDocValuesEquals("tests.monster", (int) 'a', numericDocValues23, numericDocValues24);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5024");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule2 = kuromojiAnalysisTests1.ruleChain;
        kuromojiAnalysisTests1.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests5 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests5.tearDown();
        org.apache.lucene.index.IndexReader indexReader8 = null;
        org.apache.lucene.index.Terms terms9 = null;
        org.apache.lucene.index.Terms terms10 = null;
        kuromojiAnalysisTests5.assertTermsEquals("tests.failfast", indexReader8, terms9, terms10, false);
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests5.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain13, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) ruleChain13);
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum19 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("tests.monster", postingsEnum18, postingsEnum19, true);
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.nightly", indexReader24, 100, postingsEnum26, postingsEnum27);
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.awaitsfix");
        java.util.Locale locale33 = org.apache.lucene.util.LuceneTestCase.localeForName("hi!");
        org.apache.lucene.search.QueryCachingPolicy queryCachingPolicy34 = org.apache.lucene.util.LuceneTestCase.MAYBE_CACHE_POLICY;
        org.junit.rules.TestRule testRule35 = null;
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.outerRule(testRule35);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain36;
        org.junit.rules.TestRule testRule38 = null;
        org.junit.rules.RuleChain ruleChain39 = org.junit.rules.RuleChain.outerRule(testRule38);
        org.junit.rules.RuleChain ruleChain40 = ruleChain36.around((org.junit.rules.TestRule) ruleChain39);
        org.junit.Assert.assertNotSame((java.lang.Object) queryCachingPolicy34, (java.lang.Object) ruleChain40);
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.junit.rules.RuleChain ruleChain44 = ruleChain40.around((org.junit.rules.TestRule) ruleChain42);
        org.junit.Assert.assertNotSame((java.lang.Object) locale33, (java.lang.Object) ruleChain40);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests46 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests46.tearDown();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.Terms terms50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        kuromojiAnalysisTests46.assertTermsEquals("tests.failfast", indexReader49, terms50, terms51, false);
        kuromojiAnalysisTests46.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests46.assertTermsEquals("hi!", indexReader56, terms57, terms58, true);
        java.lang.String str61 = kuromojiAnalysisTests46.getTestName();
        org.apache.lucene.index.IndexReader indexReader63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum65 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum66 = null;
        kuromojiAnalysisTests46.assertDocsSkippingEquals("", indexReader63, (int) (byte) 0, postingsEnum65, postingsEnum66, false);
        kuromojiAnalysisTests46.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain70 = kuromojiAnalysisTests46.failureAndSuccessEvents;
        kuromojiAnalysisTests46.tearDown();
        org.junit.Assert.assertNotSame((java.lang.Object) locale33, (java.lang.Object) kuromojiAnalysisTests46);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) locale33);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5025");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray3);
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray7, byteArray8);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray11, byteArray12);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray8, byteArray12);
        byte[] byteArray16 = new byte[] {};
        byte[] byteArray17 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray16, byteArray17);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray20, byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray17, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray8, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray8);
        byte[] byteArray27 = new byte[] {};
        byte[] byteArray28 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray27, byteArray28);
        byte[] byteArray31 = new byte[] {};
        byte[] byteArray32 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray31, byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray28, byteArray31);
        byte[] byteArray36 = new byte[] {};
        byte[] byteArray37 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray36, byteArray37);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray40);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray47);
        byte[] byteArray52 = new byte[] {};
        byte[] byteArray53 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray52, byteArray53);
        byte[] byteArray56 = new byte[] {};
        byte[] byteArray57 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray56, byteArray57);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray53, byteArray57);
        byte[] byteArray62 = new byte[] {};
        byte[] byteArray63 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray62, byteArray63);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray66, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray63, byteArray66);
        byte[] byteArray71 = new byte[] {};
        byte[] byteArray72 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray71, byteArray72);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray75, byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray72, byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray66, byteArray75);
        byte[] byteArray82 = new byte[] {};
        byte[] byteArray83 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray82, byteArray83);
        byte[] byteArray86 = new byte[] {};
        byte[] byteArray87 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray86, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray83, byteArray87);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray66, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray57, byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray40, byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray57);
        byte[] byteArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray57, byteArray94);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5026");
        org.junit.rules.TestRule testRule4 = null;
        org.junit.rules.RuleChain ruleChain5 = org.junit.rules.RuleChain.outerRule(testRule4);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain5;
        org.junit.rules.TestRule testRule7 = null;
        org.junit.rules.RuleChain ruleChain8 = org.junit.rules.RuleChain.outerRule(testRule7);
        org.junit.rules.RuleChain ruleChain9 = ruleChain5.around((org.junit.rules.TestRule) ruleChain8);
        org.junit.rules.TestRule testRule10 = null;
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.outerRule(testRule10);
        org.junit.rules.TestRule testRule12 = null;
        org.junit.rules.RuleChain ruleChain13 = org.junit.rules.RuleChain.outerRule(testRule12);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain13;
        org.junit.rules.TestRule testRule15 = null;
        org.junit.rules.RuleChain ruleChain16 = org.junit.rules.RuleChain.outerRule(testRule15);
        org.junit.rules.RuleChain ruleChain17 = ruleChain13.around((org.junit.rules.TestRule) ruleChain16);
        org.junit.rules.TestRule testRule18 = null;
        org.junit.rules.RuleChain ruleChain19 = org.junit.rules.RuleChain.outerRule(testRule18);
        org.junit.rules.RuleChain[] ruleChainArray20 = new org.junit.rules.RuleChain[] { ruleChain5, ruleChain11, ruleChain13, ruleChain19 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList21 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray20);
        org.junit.rules.TestRule testRule23 = null;
        org.junit.rules.RuleChain ruleChain24 = org.junit.rules.RuleChain.outerRule(testRule23);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain24;
        org.junit.rules.TestRule testRule26 = null;
        org.junit.rules.RuleChain ruleChain27 = org.junit.rules.RuleChain.outerRule(testRule26);
        org.junit.rules.RuleChain ruleChain28 = ruleChain24.around((org.junit.rules.TestRule) ruleChain27);
        org.junit.rules.TestRule testRule29 = null;
        org.junit.rules.RuleChain ruleChain30 = org.junit.rules.RuleChain.outerRule(testRule29);
        org.junit.rules.TestRule testRule31 = null;
        org.junit.rules.RuleChain ruleChain32 = org.junit.rules.RuleChain.outerRule(testRule31);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain32;
        org.junit.rules.TestRule testRule34 = null;
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.outerRule(testRule34);
        org.junit.rules.RuleChain ruleChain36 = ruleChain32.around((org.junit.rules.TestRule) ruleChain35);
        org.junit.rules.TestRule testRule37 = null;
        org.junit.rules.RuleChain ruleChain38 = org.junit.rules.RuleChain.outerRule(testRule37);
        org.junit.rules.RuleChain[] ruleChainArray39 = new org.junit.rules.RuleChain[] { ruleChain24, ruleChain30, ruleChain32, ruleChain38 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray39);
        org.junit.rules.TestRule testRule42 = null;
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule(testRule42);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain43;
        org.junit.rules.TestRule testRule45 = null;
        org.junit.rules.RuleChain ruleChain46 = org.junit.rules.RuleChain.outerRule(testRule45);
        org.junit.rules.RuleChain ruleChain47 = ruleChain43.around((org.junit.rules.TestRule) ruleChain46);
        org.junit.rules.TestRule testRule48 = null;
        org.junit.rules.RuleChain ruleChain49 = org.junit.rules.RuleChain.outerRule(testRule48);
        org.junit.rules.TestRule testRule50 = null;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule(testRule50);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain51;
        org.junit.rules.TestRule testRule53 = null;
        org.junit.rules.RuleChain ruleChain54 = org.junit.rules.RuleChain.outerRule(testRule53);
        org.junit.rules.RuleChain ruleChain55 = ruleChain51.around((org.junit.rules.TestRule) ruleChain54);
        org.junit.rules.TestRule testRule56 = null;
        org.junit.rules.RuleChain ruleChain57 = org.junit.rules.RuleChain.outerRule(testRule56);
        org.junit.rules.RuleChain[] ruleChainArray58 = new org.junit.rules.RuleChain[] { ruleChain43, ruleChain49, ruleChain51, ruleChain57 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList59 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray58);
        org.junit.rules.TestRule testRule61 = null;
        org.junit.rules.RuleChain ruleChain62 = org.junit.rules.RuleChain.outerRule(testRule61);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain62;
        org.junit.rules.TestRule testRule64 = null;
        org.junit.rules.RuleChain ruleChain65 = org.junit.rules.RuleChain.outerRule(testRule64);
        org.junit.rules.RuleChain ruleChain66 = ruleChain62.around((org.junit.rules.TestRule) ruleChain65);
        org.junit.rules.TestRule testRule67 = null;
        org.junit.rules.RuleChain ruleChain68 = org.junit.rules.RuleChain.outerRule(testRule67);
        org.junit.rules.TestRule testRule69 = null;
        org.junit.rules.RuleChain ruleChain70 = org.junit.rules.RuleChain.outerRule(testRule69);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain70;
        org.junit.rules.TestRule testRule72 = null;
        org.junit.rules.RuleChain ruleChain73 = org.junit.rules.RuleChain.outerRule(testRule72);
        org.junit.rules.RuleChain ruleChain74 = ruleChain70.around((org.junit.rules.TestRule) ruleChain73);
        org.junit.rules.TestRule testRule75 = null;
        org.junit.rules.RuleChain ruleChain76 = org.junit.rules.RuleChain.outerRule(testRule75);
        org.junit.rules.RuleChain[] ruleChainArray77 = new org.junit.rules.RuleChain[] { ruleChain62, ruleChain68, ruleChain70, ruleChain76 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList78 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray77);
        java.util.List[] listArray80 = new java.util.List[4];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray81 = (java.util.List<org.junit.rules.RuleChain>[]) listArray80;
        ruleChainListArray81[0] = ruleChainList21;
        ruleChainListArray81[1] = ruleChainList40;
        ruleChainListArray81[2] = ruleChainList59;
        ruleChainListArray81[3] = ruleChainList78;
        java.util.List<java.util.List<org.junit.rules.RuleChain>> ruleChainListList90 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, ruleChainListArray81);
        org.junit.Assert.assertNotNull("enwiki.random.lines.txt", (java.lang.Object) ruleChainListList90);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.failfast", (java.lang.Object) "enwiki.random.lines.txt");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5027");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain9);
        org.junit.rules.RuleChain ruleChain11 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain11);
        org.junit.rules.RuleChain ruleChain13 = ruleChain10.around((org.junit.rules.TestRule) ruleChain12);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain10;
        org.apache.lucene.index.IndexReader indexReader16 = null;
        org.apache.lucene.index.Terms terms17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader16, terms17, terms18, true);
        org.apache.lucene.index.IndexReader indexReader22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum24 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.badapples", indexReader22, (int) '#', postingsEnum24, postingsEnum25);
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum29 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.slow", postingsEnum28, postingsEnum29, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests32 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests32.tearDown();
        org.apache.lucene.index.IndexReader indexReader35 = null;
        org.apache.lucene.index.Terms terms36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        kuromojiAnalysisTests32.assertTermsEquals("tests.failfast", indexReader35, terms36, terms37, false);
        kuromojiAnalysisTests32.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader42 = null;
        org.apache.lucene.index.Terms terms43 = null;
        org.apache.lucene.index.Terms terms44 = null;
        kuromojiAnalysisTests32.assertTermsEquals("hi!", indexReader42, terms43, terms44, true);
        java.lang.String str47 = kuromojiAnalysisTests32.getTestName();
        org.apache.lucene.index.IndexReader indexReader49 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum51 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum52 = null;
        kuromojiAnalysisTests32.assertDocsSkippingEquals("", indexReader49, (int) (byte) 0, postingsEnum51, postingsEnum52, false);
        kuromojiAnalysisTests32.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain56 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain57 = kuromojiAnalysisTests32.failureAndSuccessEvents;
        org.apache.lucene.index.IndexReader indexReader59 = null;
        org.apache.lucene.index.Fields fields60 = null;
        org.apache.lucene.index.Fields fields61 = null;
        kuromojiAnalysisTests32.assertFieldsEquals("hi!", indexReader59, fields60, fields61, false);
        kuromojiAnalysisTests32.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) "tests.slow", (java.lang.Object) kuromojiAnalysisTests32);
        org.apache.lucene.index.PostingsEnum postingsEnum67 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum68 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests32.assertDocsAndPositionsEnumEquals("", postingsEnum67, postingsEnum68);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5028");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", 1.0f, 10.0f, (-1.0f));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5029");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("", (double) (short) 1, (double) (byte) 1, (double) (short) 1);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5030");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray3, (double) '#');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray6, doubleArray7, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray2, doubleArray7, (double) 0.0f);
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray13, (double) '#');
        double[] doubleArray16 = new double[] {};
        double[] doubleArray17 = new double[] {};
        org.junit.Assert.assertArrayEquals(doubleArray16, doubleArray17, (double) '#');
        org.junit.Assert.assertArrayEquals(doubleArray12, doubleArray17, (double) 0.0f);
        org.junit.Assert.assertArrayEquals("", doubleArray2, doubleArray17, (double) 1);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests24 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests24.tearDown();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests24.assertTermsEquals("tests.failfast", indexReader27, terms28, terms29, false);
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum34 = null;
        kuromojiAnalysisTests24.assertDocsEnumEquals("tests.weekly", postingsEnum33, postingsEnum34, true);
        kuromojiAnalysisTests24.setIndexWriterMaxDocs((int) ' ');
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests24.ruleChain;
        kuromojiAnalysisTests24.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.weekly", (java.lang.Object) doubleArray17, (java.lang.Object) kuromojiAnalysisTests24);
        org.apache.lucene.index.PostingsEnum postingsEnum43 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum44 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests24.assertDocsAndPositionsEnumEquals("tests.awaitsfix", postingsEnum43, postingsEnum44);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5031");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.weekly", 100.0d, (double) 0.0f);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5032");
        java.lang.Object obj0 = null;
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray4, intArray5);
        int[] intArray7 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray4, intArray7);
        int[] intArray9 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray7, intArray9);
        int[] intArray13 = new int[] {};
        int[] intArray14 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray13, intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray19 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray18, intArray19);
        int[] intArray21 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray18, intArray21);
        int[] intArray23 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray21, intArray23);
        org.junit.Assert.assertArrayEquals("", intArray14, intArray23);
        org.junit.Assert.assertArrayEquals(intArray9, intArray14);
        int[] intArray31 = new int[] {};
        int[] intArray32 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray31, intArray32);
        int[] intArray35 = new int[] {};
        int[] intArray36 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray35, intArray36);
        int[] intArray38 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray35, intArray38);
        org.junit.Assert.assertArrayEquals("enwiki.random.lines.txt", intArray32, intArray35);
        int[] intArray43 = new int[] {};
        int[] intArray44 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray43, intArray44);
        int[] intArray46 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray43, intArray46);
        int[] intArray48 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray46, intArray48);
        int[] intArray51 = new int[] {};
        int[] intArray52 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray51, intArray52);
        int[] intArray54 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray51, intArray54);
        org.junit.Assert.assertArrayEquals(intArray48, intArray54);
        org.junit.Assert.assertArrayEquals("tests.maxfailures", intArray35, intArray48);
        int[] intArray61 = new int[] {};
        int[] intArray62 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray61, intArray62);
        int[] intArray66 = new int[] {};
        int[] intArray67 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray66, intArray67);
        int[] intArray69 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray66, intArray69);
        int[] intArray71 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray69, intArray71);
        int[] intArray75 = new int[] {};
        int[] intArray76 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray75, intArray76);
        int[] intArray78 = new int[] {};
        org.junit.Assert.assertArrayEquals(intArray75, intArray78);
        int[] intArray80 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray78, intArray80);
        org.junit.Assert.assertArrayEquals(intArray69, intArray80);
        org.junit.Assert.assertArrayEquals("random", intArray62, intArray69);
        int[] intArray85 = new int[] {};
        int[] intArray86 = new int[] {};
        org.junit.Assert.assertArrayEquals("", intArray85, intArray86);
        org.junit.Assert.assertNotNull((java.lang.Object) intArray85);
        org.junit.Assert.assertArrayEquals("tests.nightly", intArray62, intArray85);
        org.junit.Assert.assertArrayEquals("", intArray35, intArray85);
        org.junit.Assert.assertArrayEquals("tests.failfast", intArray14, intArray35);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(obj0, (java.lang.Object) "tests.failfast");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5033");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 10);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5034");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.awaitsfix", 1.0d, (double) 100L);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5035");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray5, executorServiceArray7, executorServiceArray9 };
        java.util.concurrent.ExecutorService executorService11 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray12 = new java.util.concurrent.ExecutorService[] { executorService11 };
        java.util.concurrent.ExecutorService executorService13 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray14 = new java.util.concurrent.ExecutorService[] { executorService13 };
        java.util.concurrent.ExecutorService executorService15 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray16 = new java.util.concurrent.ExecutorService[] { executorService15 };
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray18 = new java.util.concurrent.ExecutorService[] { executorService17 };
        java.util.concurrent.ExecutorService[][] executorServiceArray19 = new java.util.concurrent.ExecutorService[][] { executorServiceArray12, executorServiceArray14, executorServiceArray16, executorServiceArray18 };
        java.util.concurrent.ExecutorService executorService20 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray21 = new java.util.concurrent.ExecutorService[] { executorService20 };
        java.util.concurrent.ExecutorService executorService22 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray23 = new java.util.concurrent.ExecutorService[] { executorService22 };
        java.util.concurrent.ExecutorService executorService24 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray25 = new java.util.concurrent.ExecutorService[] { executorService24 };
        java.util.concurrent.ExecutorService executorService26 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray27 = new java.util.concurrent.ExecutorService[] { executorService26 };
        java.util.concurrent.ExecutorService[][] executorServiceArray28 = new java.util.concurrent.ExecutorService[][] { executorServiceArray21, executorServiceArray23, executorServiceArray25, executorServiceArray27 };
        java.util.concurrent.ExecutorService executorService29 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray30 = new java.util.concurrent.ExecutorService[] { executorService29 };
        java.util.concurrent.ExecutorService executorService31 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray32 = new java.util.concurrent.ExecutorService[] { executorService31 };
        java.util.concurrent.ExecutorService executorService33 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray34 = new java.util.concurrent.ExecutorService[] { executorService33 };
        java.util.concurrent.ExecutorService executorService35 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray36 = new java.util.concurrent.ExecutorService[] { executorService35 };
        java.util.concurrent.ExecutorService[][] executorServiceArray37 = new java.util.concurrent.ExecutorService[][] { executorServiceArray30, executorServiceArray32, executorServiceArray34, executorServiceArray36 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray38 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray10, executorServiceArray19, executorServiceArray28, executorServiceArray37 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet39 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray38);
        java.util.List<java.io.Serializable[]> serializableArrayList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.io.Serializable[][]) executorServiceArray38);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("", (java.lang.Object) executorServiceArray38);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5036");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        java.lang.Object obj13 = null;
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, obj13);
        kuromojiAnalysisTests0.ensureCleanedUp();
        org.apache.lucene.index.PostingsEnum postingsEnum17 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum18 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("", postingsEnum17, postingsEnum18);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5037");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (-1.0d), (double) (byte) 1);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5038");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals((double) (short) -1, (double) 10, (double) 'a');
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5039");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        java.lang.String str5 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        java.lang.Object obj9 = null;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests10 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests10.tearDown();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests10.assertTermsEquals("tests.failfast", indexReader13, terms14, terms15, false);
        kuromojiAnalysisTests10.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests10.assertTermsEquals("hi!", indexReader20, terms21, terms22, true);
        kuromojiAnalysisTests10.setUp();
        kuromojiAnalysisTests10.tearDown();
        kuromojiAnalysisTests10.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule28 = kuromojiAnalysisTests10.ruleChain;
        org.junit.Assert.assertNotSame(obj9, (java.lang.Object) kuromojiAnalysisTests10);
        org.junit.rules.RuleChain ruleChain30 = kuromojiAnalysisTests10.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain31 = ruleChain8.around((org.junit.rules.TestRule) ruleChain30);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain30;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests33 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests33.tearDown();
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests33.assertTermsEquals("tests.failfast", indexReader36, terms37, terms38, false);
        kuromojiAnalysisTests33.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests33.setIndexWriterMaxDocs((int) (short) 100);
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests33);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) ruleChain30, (java.lang.Object) kuromojiAnalysisTests33);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5040");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray7);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray3, byteArray7);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray11, byteArray12);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray15, byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray15);
        byte[] byteArray22 = new byte[] {};
        byte[] byteArray23 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray22, byteArray23);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray26, byteArray27);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray23, byteArray27);
        byte[] byteArray30 = new byte[] {};
        org.junit.Assert.assertArrayEquals(byteArray23, byteArray30);
        byte[] byteArray33 = new byte[] {};
        byte[] byteArray34 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray33, byteArray34);
        byte[] byteArray37 = new byte[] {};
        byte[] byteArray38 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray37, byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray37);
        byte[] byteArray42 = new byte[] {};
        byte[] byteArray43 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray42, byteArray43);
        byte[] byteArray46 = new byte[] {};
        byte[] byteArray47 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray46, byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray43, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray37, byteArray46);
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray30, byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray12, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray30);
        byte[] byteArray54 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray54);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5041");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.slow", indexReader11, terms12, terms13, false);
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader17, terms18, terms19, false);
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum26 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("europarl.lines.txt.gz", indexReader23, (int) (byte) -1, postingsEnum25, postingsEnum26, true);
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.NumericDocValues numericDocValues33 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues34 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocValuesEquals("tests.slow", 0, numericDocValues33, numericDocValues34);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5042");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals(100.0d, (double) 100L, (double) 2);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5043");
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet3 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray2);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        java.io.Serializable[] serializableArray6 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet7 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray6);
        java.util.Set[] setArray9 = new java.util.Set[3];
        @SuppressWarnings("unchecked")
        java.util.Set<java.io.Serializable>[] serializableSetArray10 = (java.util.Set<java.io.Serializable>[]) setArray9;
        serializableSetArray10[0] = serializableSet3;
        serializableSetArray10[1] = serializableSet5;
        serializableSetArray10[2] = serializableSet7;
        java.util.Set<java.util.Set<java.io.Serializable>> serializableSetSet17 = org.apache.lucene.util.LuceneTestCase.asSet(serializableSetArray10);
        org.junit.Assert.assertNotNull((java.lang.Object) serializableSetArray10);
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList19 = org.elasticsearch.test.ESTestCase.randomSubsetOf(1, (java.lang.Iterable<java.io.Serializable>[]) serializableSetArray10);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray24 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet25 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray24);
        java.io.Serializable[] serializableArray27 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet28 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray27);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray29 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet30 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray29);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray27, (java.lang.Object[]) throttlingArray29);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) serializableArray27);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet35 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray34);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray36 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet37 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray36);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray34, (java.lang.Object[]) throttlingArray36);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) serializableArray34);
        java.util.List<java.lang.Object> objList40 = org.elasticsearch.test.ESTestCase.randomSubsetOf(0, (java.lang.Object[]) throttlingArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray42 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet43 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray42);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet46 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray47 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet48 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray47);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray47);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray42, (java.lang.Object[]) serializableArray45);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray52 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet53 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray52);
        java.io.Serializable[] serializableArray55 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet56 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray55);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray57 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet58 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray57);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray55, (java.lang.Object[]) throttlingArray57);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray52, (java.lang.Object[]) serializableArray55);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray45, (java.lang.Object[]) throttlingArray52);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray63 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet64 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray63);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet67 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray66);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray68 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet69 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray68);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray66, (java.lang.Object[]) throttlingArray68);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray63, (java.lang.Object[]) serializableArray66);
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray52, (java.lang.Object[]) serializableArray66);
        java.util.Set<org.apache.lucene.store.MockDirectoryWrapper.Throttling> throttlingSet73 = org.apache.lucene.util.LuceneTestCase.asSet(throttlingArray52);
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) throttlingArray24, (java.lang.Object[]) throttlingArray52);
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet77 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray76);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray78 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet79 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray78);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray76, (java.lang.Object[]) throttlingArray78);
        java.io.Serializable[] serializableArray82 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet83 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray82);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray84 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet85 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray84);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray82, (java.lang.Object[]) throttlingArray84);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray76, (java.lang.Object[]) serializableArray82);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) throttlingArray52, (java.lang.Object[]) serializableArray76);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("tests.monster", (java.lang.Object[]) serializableSetArray10, (java.lang.Object[]) throttlingArray52);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5044");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (-1L), (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5045");
        java.util.concurrent.ExecutorService executorService2 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray3 = new java.util.concurrent.ExecutorService[] { executorService2 };
        java.util.concurrent.ExecutorService executorService4 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] { executorService4 };
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray7 = new java.util.concurrent.ExecutorService[] { executorService6 };
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] { executorService8 };
        java.util.concurrent.ExecutorService[][] executorServiceArray10 = new java.util.concurrent.ExecutorService[][] { executorServiceArray3, executorServiceArray5, executorServiceArray7, executorServiceArray9 };
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet11 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray10);
        java.util.List<java.util.concurrent.ExecutorService[]> executorServiceArrayList12 = org.elasticsearch.test.ESTestCase.randomSubsetOf(3, executorServiceArray10);
        java.util.Set<java.util.concurrent.ExecutorService[]> executorServiceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray10);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests15 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests15.tearDown();
        org.apache.lucene.index.IndexReader indexReader18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        kuromojiAnalysisTests15.assertTermsEquals("tests.failfast", indexReader18, terms19, terms20, false);
        kuromojiAnalysisTests15.tearDown();
        java.util.Locale locale25 = org.apache.lucene.util.LuceneTestCase.localeForName("tests.nightly");
        org.junit.Assert.assertNotSame("tests.weekly", (java.lang.Object) kuromojiAnalysisTests15, (java.lang.Object) "tests.nightly");
        kuromojiAnalysisTests15.ensureAllSearchContextsReleased();
        java.lang.String str28 = kuromojiAnalysisTests15.getTestName();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum33 = null;
        kuromojiAnalysisTests15.assertPositionsSkippingEquals("enwiki.random.lines.txt", indexReader30, (int) (byte) 1, postingsEnum32, postingsEnum33);
        kuromojiAnalysisTests15.resetCheckIndexStatus();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame("tests.failfast", (java.lang.Object) executorServiceArray10, (java.lang.Object) kuromojiAnalysisTests15);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5046");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.awaitsfix", (double) (byte) -1, (double) (-1L), (double) 4);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5047");
        short[] shortArray1 = null;
        short[] shortArray3 = new short[] {};
        short[] shortArray4 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray3, shortArray4);
        short[] shortArray6 = new short[] {};
        short[] shortArray7 = new short[] {};
        org.junit.Assert.assertArrayEquals(shortArray6, shortArray7);
        org.junit.Assert.assertArrayEquals("", shortArray4, shortArray6);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals("hi!", shortArray1, shortArray6);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5048");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.PostingsEnum postingsEnum11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        kuromojiAnalysisTests1.assertDocsEnumEquals("europarl.lines.txt.gz", postingsEnum11, postingsEnum12, false);
        java.lang.String str15 = kuromojiAnalysisTests1.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader26 = null;
        org.apache.lucene.index.Terms terms27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        kuromojiAnalysisTests16.assertTermsEquals("hi!", indexReader26, terms27, terms28, true);
        kuromojiAnalysisTests16.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.maxfailures");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests16);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5049");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests0.failureAndSuccessEvents;
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.tearDown();
        java.lang.String str11 = kuromojiAnalysisTests0.getTestName();
        org.junit.rules.TestRule testRule14 = null;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain15;
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule(testRule17);
        org.junit.rules.RuleChain ruleChain19 = ruleChain15.around((org.junit.rules.TestRule) ruleChain18);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain18);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain18;
        org.junit.rules.TestRule testRule22 = kuromojiAnalysisTests0.ruleChain;
        kuromojiAnalysisTests0.setIndexWriterMaxDocs((int) '#');
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests25 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests25.tearDown();
        org.apache.lucene.index.IndexReader indexReader28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        kuromojiAnalysisTests25.assertTermsEquals("tests.failfast", indexReader28, terms29, terms30, false);
        kuromojiAnalysisTests25.overrideTestDefaultQueryCache();
        org.junit.rules.RuleChain ruleChain34 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain35 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain34);
        org.junit.rules.RuleChain ruleChain36 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain37 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain36);
        org.junit.rules.RuleChain ruleChain38 = ruleChain35.around((org.junit.rules.TestRule) ruleChain37);
        kuromojiAnalysisTests25.failureAndSuccessEvents = ruleChain35;
        org.junit.Assert.assertNotEquals((java.lang.Object) '#', (java.lang.Object) ruleChain35);
        java.lang.Object obj41 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain35, obj41);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5050");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 3, (double) '#');
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5051");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray7, charArray8);
        org.junit.Assert.assertArrayEquals(charArray4, charArray8);
        char[] charArray13 = new char[] {};
        char[] charArray14 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray13, charArray14);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray17, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray14, charArray18);
        org.junit.Assert.assertArrayEquals(charArray4, charArray14);
        char[] charArray28 = new char[] {};
        char[] charArray29 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray28, charArray29);
        org.junit.Assert.assertArrayEquals("tests.weekly", charArray14, charArray28);
        char[] charArray33 = new char[] {};
        char[] charArray34 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray33, charArray34);
        char[] charArray37 = new char[] {};
        char[] charArray38 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray37, charArray38);
        org.junit.Assert.assertArrayEquals(charArray34, charArray38);
        org.junit.Assert.assertArrayEquals("tests.slow", charArray28, charArray38);
        char[] charArray43 = new char[] {};
        char[] charArray44 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray43, charArray44);
        char[] charArray47 = new char[] {};
        char[] charArray48 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray47, charArray48);
        org.junit.Assert.assertArrayEquals(charArray44, charArray48);
        char[] charArray53 = new char[] {};
        char[] charArray54 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray53, charArray54);
        char[] charArray57 = new char[] {};
        char[] charArray58 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray57, charArray58);
        char[] charArray61 = new char[] {};
        char[] charArray62 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray61, charArray62);
        org.junit.Assert.assertArrayEquals(charArray58, charArray62);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray54, charArray58);
        org.junit.Assert.assertArrayEquals(charArray44, charArray58);
        char[] charArray68 = new char[] {};
        char[] charArray69 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray68, charArray69);
        char[] charArray72 = new char[] {};
        char[] charArray73 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray72, charArray73);
        org.junit.Assert.assertArrayEquals(charArray69, charArray73);
        char[] charArray78 = new char[] {};
        char[] charArray79 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray78, charArray79);
        char[] charArray82 = new char[] {};
        char[] charArray83 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray82, charArray83);
        char[] charArray86 = new char[] {};
        char[] charArray87 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray86, charArray87);
        org.junit.Assert.assertArrayEquals(charArray83, charArray87);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray79, charArray83);
        org.junit.Assert.assertArrayEquals(charArray69, charArray79);
        org.junit.Assert.assertArrayEquals(charArray58, charArray69);
        org.junit.Assert.assertArrayEquals(charArray28, charArray69);
        char[] charArray94 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(charArray28, charArray94);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5052");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((double) (short) -1, (double) 10, (double) 3);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5053");
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray1 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet2 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray1);
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet5 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray4);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray6 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet7 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray6);
        org.junit.Assert.assertArrayEquals("tests.failfast", (java.lang.Object[]) serializableArray4, (java.lang.Object[]) throttlingArray6);
        org.junit.Assert.assertArrayEquals("", (java.lang.Object[]) throttlingArray1, (java.lang.Object[]) throttlingArray6);
        java.util.List[] listArray11 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray12 = (java.util.List<org.junit.rules.RuleChain>[]) listArray11;
        java.util.List[] listArray14 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray15 = (java.util.List<org.junit.rules.RuleChain>[]) listArray14;
        java.util.List[] listArray17 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray18 = (java.util.List<org.junit.rules.RuleChain>[]) listArray17;
        java.util.List[] listArray20 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray21 = (java.util.List<org.junit.rules.RuleChain>[]) listArray20;
        java.util.List[] listArray23 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[] ruleChainListArray24 = (java.util.List<org.junit.rules.RuleChain>[]) listArray23;
        java.util.List[][] listArray26 = new java.util.List[5][];
        @SuppressWarnings("unchecked")
        java.util.List<org.junit.rules.RuleChain>[][] ruleChainListArray27 = (java.util.List<org.junit.rules.RuleChain>[][]) listArray26;
        ruleChainListArray27[0] = ruleChainListArray12;
        ruleChainListArray27[1] = listArray14;
        ruleChainListArray27[2] = listArray17;
        ruleChainListArray27[3] = listArray20;
        ruleChainListArray27[4] = listArray23;
        java.util.Set<java.util.List<org.junit.rules.RuleChain>[]> ruleChainListArraySet38 = org.apache.lucene.util.LuceneTestCase.asSet(ruleChainListArray27);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object[]) throttlingArray1, (java.lang.Object[]) ruleChainListArray27);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5054");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.maxfailures", (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5055");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.monster", (double) (short) 0, (double) 10L, (double) '#');
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5056");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.badapples");
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests1);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        long[] longArray17 = new long[] {};
        long[] longArray18 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray17, longArray18);
        long[] longArray21 = new long[] {};
        long[] longArray22 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray21, longArray22);
        org.junit.Assert.assertArrayEquals(longArray18, longArray22);
        long[] longArray26 = new long[] {};
        long[] longArray27 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray26, longArray27);
        long[] longArray30 = new long[] {};
        long[] longArray31 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray30, longArray31);
        org.junit.Assert.assertArrayEquals(longArray27, longArray31);
        org.junit.Assert.assertArrayEquals(longArray18, longArray27);
        long[] longArray36 = new long[] {};
        long[] longArray37 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray36, longArray37);
        org.junit.Assert.assertArrayEquals("random", longArray27, longArray36);
        long[] longArray41 = new long[] {};
        long[] longArray42 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray41, longArray42);
        long[] longArray45 = new long[] {};
        long[] longArray46 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray45, longArray46);
        org.junit.Assert.assertArrayEquals(longArray42, longArray46);
        org.junit.Assert.assertArrayEquals("hi!", longArray36, longArray46);
        long[] longArray51 = new long[] {};
        long[] longArray52 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray51, longArray52);
        long[] longArray55 = new long[] {};
        long[] longArray56 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray55, longArray56);
        org.junit.Assert.assertArrayEquals(longArray52, longArray56);
        long[] longArray60 = new long[] {};
        long[] longArray61 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray60, longArray61);
        long[] longArray64 = new long[] {};
        long[] longArray65 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray64, longArray65);
        org.junit.Assert.assertArrayEquals(longArray61, longArray65);
        org.junit.Assert.assertArrayEquals(longArray52, longArray61);
        long[] longArray70 = new long[] {};
        long[] longArray71 = new long[] {};
        org.junit.Assert.assertArrayEquals("", longArray70, longArray71);
        org.junit.Assert.assertArrayEquals(longArray61, longArray70);
        org.junit.Assert.assertArrayEquals(longArray46, longArray70);
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) longArray46);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests78 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule79 = kuromojiAnalysisTests78.ruleChain;
        kuromojiAnalysisTests78.ensureCleanedUp();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests82 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests82.tearDown();
        org.apache.lucene.index.IndexReader indexReader85 = null;
        org.apache.lucene.index.Terms terms86 = null;
        org.apache.lucene.index.Terms terms87 = null;
        kuromojiAnalysisTests82.assertTermsEquals("tests.failfast", indexReader85, terms86, terms87, false);
        org.junit.rules.RuleChain ruleChain90 = kuromojiAnalysisTests82.failureAndSuccessEvents;
        org.junit.Assert.assertNotSame("hi!", (java.lang.Object) ruleChain90, (java.lang.Object) "tests.weekly");
        org.junit.Assert.assertNotSame((java.lang.Object) kuromojiAnalysisTests78, (java.lang.Object) ruleChain90);
        org.junit.Assert.assertNotSame("", (java.lang.Object) "tests.awaitsfix", (java.lang.Object) kuromojiAnalysisTests78);
        java.lang.String str95 = kuromojiAnalysisTests78.getTestName();
        org.junit.rules.TestRule testRule96 = kuromojiAnalysisTests78.ruleChain;
        org.junit.Assert.assertNotEquals((java.lang.Object) longArray46, (java.lang.Object) testRule96);
        org.junit.rules.RuleChain ruleChain98 = org.junit.rules.RuleChain.outerRule(testRule96);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("enwiki.random.lines.txt", (java.lang.Object) testRule96);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5057");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum7 = null;
        kuromojiAnalysisTests0.assertPositionsSkippingEquals("tests.maxfailures", indexReader4, 0, postingsEnum6, postingsEnum7);
        java.lang.String str9 = kuromojiAnalysisTests0.getTestName();
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        org.apache.lucene.index.Terms terms13 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.badapples", indexReader11, terms12, terms13, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests17 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests17.tearDown();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        org.apache.lucene.index.Terms terms22 = null;
        kuromojiAnalysisTests17.assertTermsEquals("tests.failfast", indexReader20, terms21, terms22, false);
        kuromojiAnalysisTests17.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader27 = null;
        org.apache.lucene.index.Terms terms28 = null;
        org.apache.lucene.index.Terms terms29 = null;
        kuromojiAnalysisTests17.assertTermsEquals("hi!", indexReader27, terms28, terms29, true);
        java.lang.String str32 = kuromojiAnalysisTests17.getTestName();
        org.apache.lucene.index.IndexReader indexReader34 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        kuromojiAnalysisTests17.assertDocsSkippingEquals("", indexReader34, (int) (byte) 0, postingsEnum36, postingsEnum37, false);
        kuromojiAnalysisTests17.ensureCheckIndexPassed();
        org.junit.rules.RuleChain ruleChain41 = kuromojiAnalysisTests17.failureAndSuccessEvents;
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        org.junit.rules.RuleChain ruleChain46 = ruleChain43.around(testRule45);
        org.junit.rules.RuleChain ruleChain47 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain46);
        org.junit.rules.TestRule testRule50 = null;
        org.junit.rules.RuleChain ruleChain51 = org.junit.rules.RuleChain.outerRule(testRule50);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain51;
        org.junit.rules.TestRule testRule53 = null;
        org.junit.rules.RuleChain ruleChain54 = org.junit.rules.RuleChain.outerRule(testRule53);
        org.junit.rules.RuleChain ruleChain55 = ruleChain51.around((org.junit.rules.TestRule) ruleChain54);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain54);
        org.junit.rules.TestRule testRule57 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain58 = ruleChain54.around(testRule57);
        org.junit.rules.RuleChain ruleChain59 = ruleChain46.around((org.junit.rules.TestRule) ruleChain58);
        org.junit.rules.TestRule testRule62 = null;
        org.junit.rules.RuleChain ruleChain63 = org.junit.rules.RuleChain.outerRule(testRule62);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain63;
        org.junit.rules.TestRule testRule65 = null;
        org.junit.rules.RuleChain ruleChain66 = org.junit.rules.RuleChain.outerRule(testRule65);
        org.junit.rules.RuleChain ruleChain67 = ruleChain63.around((org.junit.rules.TestRule) ruleChain66);
        org.junit.Assert.assertNotSame("tests.maxfailures", (java.lang.Object) "tests.weekly", (java.lang.Object) ruleChain66);
        org.junit.rules.TestRule testRule69 = org.apache.lucene.util.LuceneTestCase.classRules;
        org.junit.rules.RuleChain ruleChain70 = ruleChain66.around(testRule69);
        org.junit.rules.RuleChain ruleChain71 = ruleChain46.around((org.junit.rules.TestRule) ruleChain70);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests72 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests72.tearDown();
        kuromojiAnalysisTests72.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests72.setUp();
        org.junit.rules.TestRule testRule77 = null;
        org.junit.rules.RuleChain ruleChain78 = org.junit.rules.RuleChain.outerRule(testRule77);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain78;
        org.junit.rules.TestRule testRule80 = null;
        org.junit.rules.RuleChain ruleChain81 = org.junit.rules.RuleChain.outerRule(testRule80);
        org.junit.rules.RuleChain ruleChain82 = ruleChain78.around((org.junit.rules.TestRule) ruleChain81);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain82;
        kuromojiAnalysisTests72.failureAndSuccessEvents = ruleChain82;
        org.junit.rules.RuleChain ruleChain85 = ruleChain46.around((org.junit.rules.TestRule) ruleChain82);
        org.junit.rules.TestRule testRule86 = null;
        org.junit.rules.RuleChain ruleChain87 = ruleChain85.around(testRule86);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain87;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) ruleChain41, (java.lang.Object) ruleChain87);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain41;
        org.junit.rules.RuleChain ruleChain91 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain41);
        java.io.Serializable[] serializableArray93 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet94 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray93);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray95 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet96 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray95);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray93, (java.lang.Object[]) throttlingArray95);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((java.lang.Object) ruleChain91, (java.lang.Object) serializableArray93);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5058");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.nightly", (long) '4', (long) 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5059");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray2, byteArray3);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray6, byteArray7);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray10, byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray7, byteArray10);
        byte[] byteArray15 = new byte[] {};
        byte[] byteArray16 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray15, byteArray16);
        byte[] byteArray19 = new byte[] {};
        byte[] byteArray20 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray19, byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray16, byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray10, byteArray19);
        org.junit.Assert.assertArrayEquals("tests.failfast", byteArray3, byteArray10);
        byte[] byteArray26 = new byte[] {};
        byte[] byteArray27 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray26, byteArray27);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray30, byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray27, byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray3, byteArray30);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) byteArray3);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5060");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        org.junit.rules.RuleChain ruleChain11 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.junit.rules.RuleChain ruleChain13 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests14 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests14.tearDown();
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Terms terms18 = null;
        org.apache.lucene.index.Terms terms19 = null;
        kuromojiAnalysisTests14.assertTermsEquals("tests.failfast", indexReader17, terms18, terms19, false);
        org.junit.rules.RuleChain ruleChain22 = kuromojiAnalysisTests14.failureAndSuccessEvents;
        kuromojiAnalysisTests14.ensureCleanedUp();
        org.apache.lucene.index.IndexReader indexReader25 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum27 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum28 = null;
        kuromojiAnalysisTests14.assertDocsSkippingEquals("hi!", indexReader25, (int) '4', postingsEnum27, postingsEnum28, true);
        java.lang.String str31 = kuromojiAnalysisTests14.getTestName();
        org.junit.rules.TestRule testRule32 = kuromojiAnalysisTests14.ruleChain;
        org.junit.Assert.assertNotSame("tests.slow", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) kuromojiAnalysisTests14);
        kuromojiAnalysisTests14.ensureCheckIndexPassed();
        org.apache.lucene.index.PostingsEnum postingsEnum36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum37 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests14.assertDocsAndPositionsEnumEquals("tests.badapples", postingsEnum36, postingsEnum37);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5061");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) (byte) 0, (long) 1);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5062");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.monster", (float) (short) -1, (float) (byte) 1, (-1.0f));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5063");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests1, (java.lang.Object) "");
        java.lang.String str5 = kuromojiAnalysisTests1.getTestName();
        kuromojiAnalysisTests1.setIndexWriterMaxDocs((int) (short) 0);
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum12 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("<unknown>", indexReader10, 5, postingsEnum12, postingsEnum13);
        org.junit.rules.RuleChain ruleChain15 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        org.apache.lucene.index.NumericDocValues numericDocValues18 = null;
        org.apache.lucene.index.NumericDocValues numericDocValues19 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests1.assertDocValuesEquals("hi!", (int) (byte) 1, numericDocValues18, numericDocValues19);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5064");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNotEquals("tests.maxfailures", (long) (short) -1, (long) (short) -1);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5065");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.weekly", indexReader12, fields13, fields14, true);
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum21 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        kuromojiAnalysisTests0.assertDocsSkippingEquals("tests.monster", indexReader19, 0, postingsEnum21, postingsEnum22, true);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("tests.badapples");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5066");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("random", 10.0d, 0.0d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5067");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("hi!", (long) 5, 0L);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5068");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.failfast", (long) 'a', (long) 4);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5069");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals(0.0f, 10.0f, (float) (-1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5070");
        java.lang.Object[] objArray1 = null;
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray4 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet5 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray4);
        java.io.Serializable[] serializableArray7 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet8 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray7);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray9 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet10 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray9);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray7, (java.lang.Object[]) throttlingArray9);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) serializableArray7);
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet15 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray14);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray16 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet17 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray16);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray14, (java.lang.Object[]) throttlingArray16);
        org.junit.Assert.assertEquals("tests.monster", (java.lang.Object[]) throttlingArray4, (java.lang.Object[]) serializableArray14);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests20 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests20.tearDown();
        org.apache.lucene.index.IndexReader indexReader23 = null;
        org.apache.lucene.index.Terms terms24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        kuromojiAnalysisTests20.assertTermsEquals("tests.failfast", indexReader23, terms24, terms25, false);
        kuromojiAnalysisTests20.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        kuromojiAnalysisTests20.assertTermsEquals("hi!", indexReader30, terms31, terms32, true);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum38 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum39 = null;
        kuromojiAnalysisTests20.assertDocsSkippingEquals("hi!", indexReader36, (int) (byte) 1, postingsEnum38, postingsEnum39, false);
        org.junit.rules.RuleChain ruleChain42 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain43 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain42);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests44 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule45 = kuromojiAnalysisTests44.ruleChain;
        org.junit.rules.RuleChain ruleChain46 = ruleChain43.around(testRule45);
        kuromojiAnalysisTests20.failureAndSuccessEvents = ruleChain46;
        java.util.concurrent.ExecutorService executorService48 = null;
        java.util.concurrent.ExecutorService[] executorServiceArray49 = new java.util.concurrent.ExecutorService[] { executorService48 };
        boolean boolean50 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean51 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean52 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        boolean boolean53 = org.elasticsearch.test.ESTestCase.terminate(executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) ruleChain46, (java.lang.Object) executorServiceArray49);
        org.junit.Assert.assertNotSame((java.lang.Object) serializableArray14, (java.lang.Object) executorServiceArray49);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("<unknown>", objArray1, (java.lang.Object[]) serializableArray14);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5071");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests2 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests2.tearDown();
        org.junit.Assert.assertNotSame("enwiki.random.lines.txt", (java.lang.Object) kuromojiAnalysisTests2, (java.lang.Object) "");
        kuromojiAnalysisTests2.setUp();
        kuromojiAnalysisTests2.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain8 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.Assert.assertNotNull("tests.badapples", (java.lang.Object) kuromojiAnalysisTests2);
        org.apache.lucene.index.IndexReader indexReader11 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum13 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum14 = null;
        kuromojiAnalysisTests2.assertPositionsSkippingEquals("tests.awaitsfix", indexReader11, (int) ' ', postingsEnum13, postingsEnum14);
        org.junit.rules.RuleChain ruleChain16 = kuromojiAnalysisTests2.failureAndSuccessEvents;
        org.junit.rules.TestRule testRule17 = kuromojiAnalysisTests2.ruleChain;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests2);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5072");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.PostingsEnum postingsEnum5 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum6 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("tests.maxfailures", postingsEnum5, postingsEnum6, false);
        org.junit.rules.RuleChain ruleChain9 = org.junit.rules.RuleChain.emptyRuleChain();
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain9);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests11 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        org.junit.rules.TestRule testRule12 = kuromojiAnalysisTests11.ruleChain;
        org.junit.rules.RuleChain ruleChain13 = ruleChain10.around(testRule12);
        org.junit.rules.RuleChain ruleChain14 = org.junit.rules.RuleChain.outerRule((org.junit.rules.TestRule) ruleChain13);
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain13;
        org.apache.lucene.index.IndexReader indexReader17 = null;
        org.apache.lucene.index.Fields fields18 = null;
        org.apache.lucene.index.Fields fields19 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("", indexReader17, fields18, fields19, true);
        kuromojiAnalysisTests0.ensureCheckIndexPassed();
        kuromojiAnalysisTests0.overrideTestDefaultQueryCache();
        org.junit.rules.TestRule testRule24 = kuromojiAnalysisTests0.ruleChain;
        org.junit.Assert.assertNotNull((java.lang.Object) kuromojiAnalysisTests0);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests26 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests26.tearDown();
        org.apache.lucene.index.IndexReader indexReader29 = null;
        org.apache.lucene.index.Terms terms30 = null;
        org.apache.lucene.index.Terms terms31 = null;
        kuromojiAnalysisTests26.assertTermsEquals("tests.failfast", indexReader29, terms30, terms31, false);
        kuromojiAnalysisTests26.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests26.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        org.apache.lucene.index.Fields fields40 = null;
        kuromojiAnalysisTests26.assertFieldsEquals("tests.weekly", indexReader38, fields39, fields40, true);
        kuromojiAnalysisTests26.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests26.assertDocsSkippingEquals("tests.monster", indexReader45, 0, postingsEnum47, postingsEnum48, true);
        kuromojiAnalysisTests26.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests53 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests53.tearDown();
        org.apache.lucene.index.IndexReader indexReader56 = null;
        org.apache.lucene.index.Terms terms57 = null;
        org.apache.lucene.index.Terms terms58 = null;
        kuromojiAnalysisTests53.assertTermsEquals("tests.failfast", indexReader56, terms57, terms58, false);
        kuromojiAnalysisTests53.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests53.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule64 = kuromojiAnalysisTests53.ruleChain;
        org.junit.rules.RuleChain ruleChain65 = kuromojiAnalysisTests53.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain65);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain65;
        kuromojiAnalysisTests26.failureAndSuccessEvents = ruleChain65;
        kuromojiAnalysisTests26.resetCheckIndexStatus();
        org.junit.Assert.assertNotEquals((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests26);
        org.apache.lucene.index.PostingsEnum postingsEnum72 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum73 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        kuromojiAnalysisTests0.assertDocsAndPositionsEnumEquals("tests.slow", postingsEnum72, postingsEnum73);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5073");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests0.ensureCleanedUp();
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.junit.rules.TestRule testRule11 = kuromojiAnalysisTests0.ruleChain;
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Terms terms14 = null;
        org.apache.lucene.index.Terms terms15 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.nightly", indexReader13, terms14, terms15, true);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) "tests.nightly");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5074");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.tearDown();
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.junit.rules.RuleChain ruleChain14 = kuromojiAnalysisTests1.failureAndSuccessEvents;
        kuromojiAnalysisTests1.resetCheckIndexStatus();
        kuromojiAnalysisTests1.ensureCleanedUp();
        kuromojiAnalysisTests1.setUp();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.maxfailures", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5075");
        char[] charArray3 = new char[] {};
        char[] charArray4 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray3, charArray4);
        char[] charArray7 = new char[] {};
        char[] charArray8 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray7, charArray8);
        char[] charArray11 = new char[] {};
        char[] charArray12 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray11, charArray12);
        org.junit.Assert.assertArrayEquals(charArray8, charArray12);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray4, charArray8);
        char[] charArray17 = new char[] {};
        char[] charArray18 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray17, charArray18);
        char[] charArray21 = new char[] {};
        char[] charArray22 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray21, charArray22);
        org.junit.Assert.assertArrayEquals(charArray18, charArray22);
        char[] charArray27 = new char[] {};
        char[] charArray28 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray27, charArray28);
        char[] charArray31 = new char[] {};
        char[] charArray32 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray31, charArray32);
        char[] charArray35 = new char[] {};
        char[] charArray36 = new char[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", charArray35, charArray36);
        org.junit.Assert.assertArrayEquals(charArray32, charArray36);
        org.junit.Assert.assertArrayEquals("<unknown>", charArray28, charArray32);
        org.junit.Assert.assertArrayEquals(charArray18, charArray32);
        char[] charArray41 = new char[] {};
        org.junit.Assert.assertArrayEquals(charArray18, charArray41);
        org.junit.Assert.assertArrayEquals(charArray8, charArray18);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) charArray18);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5076");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader10 = null;
        org.apache.lucene.index.Terms terms11 = null;
        org.apache.lucene.index.Terms terms12 = null;
        kuromojiAnalysisTests0.assertTermsEquals("hi!", indexReader10, terms11, terms12, true);
        java.lang.String str15 = kuromojiAnalysisTests0.getTestName();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests16 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests16.tearDown();
        org.apache.lucene.index.IndexReader indexReader19 = null;
        org.apache.lucene.index.Terms terms20 = null;
        org.apache.lucene.index.Terms terms21 = null;
        kuromojiAnalysisTests16.assertTermsEquals("tests.failfast", indexReader19, terms20, terms21, false);
        kuromojiAnalysisTests16.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests16.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule27 = kuromojiAnalysisTests16.ruleChain;
        org.junit.rules.RuleChain ruleChain28 = kuromojiAnalysisTests16.failureAndSuccessEvents;
        kuromojiAnalysisTests0.failureAndSuccessEvents = ruleChain28;
        org.apache.lucene.index.PostingsEnum postingsEnum31 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum32 = null;
        kuromojiAnalysisTests0.assertDocsEnumEquals("", postingsEnum31, postingsEnum32, false);
        org.apache.lucene.index.IndexReader indexReader36 = null;
        org.apache.lucene.index.Terms terms37 = null;
        org.apache.lucene.index.Terms terms38 = null;
        kuromojiAnalysisTests0.assertTermsEquals("", indexReader36, terms37, terms38, false);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests42 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests42.tearDown();
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.Terms terms46 = null;
        org.apache.lucene.index.Terms terms47 = null;
        kuromojiAnalysisTests42.assertTermsEquals("tests.failfast", indexReader45, terms46, terms47, false);
        org.junit.rules.RuleChain ruleChain50 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        kuromojiAnalysisTests42.ensureCleanedUp();
        kuromojiAnalysisTests42.tearDown();
        kuromojiAnalysisTests42.tearDown();
        org.junit.Assert.assertNotEquals("tests.slow", (java.lang.Object) kuromojiAnalysisTests42, (java.lang.Object) "hi!");
        org.junit.rules.RuleChain ruleChain56 = kuromojiAnalysisTests42.failureAndSuccessEvents;
        kuromojiAnalysisTests42.restoreIndexWriterMaxDocs();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, (java.lang.Object) kuromojiAnalysisTests42);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5077");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        org.apache.lucene.index.IndexReader indexReader3 = null;
        org.apache.lucene.index.Terms terms4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        kuromojiAnalysisTests0.assertTermsEquals("tests.failfast", indexReader3, terms4, terms5, false);
        kuromojiAnalysisTests0.assertPathHasBeenCleared("enwiki.random.lines.txt");
        kuromojiAnalysisTests0.resetCheckIndexStatus();
        org.apache.lucene.index.IndexReader indexReader12 = null;
        org.apache.lucene.index.Fields fields13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        kuromojiAnalysisTests0.assertFieldsEquals("tests.nightly", indexReader12, fields13, fields14, false);
        kuromojiAnalysisTests0.tearDown();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull((java.lang.Object) kuromojiAnalysisTests0);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5078");
        java.util.concurrent.ExecutorService[] executorServiceArray0 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray1 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray2 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray3 = new java.util.concurrent.ExecutorService[][] { executorServiceArray0, executorServiceArray1, executorServiceArray2 };
        java.util.concurrent.ExecutorService[] executorServiceArray4 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray5 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray6 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray7 = new java.util.concurrent.ExecutorService[][] { executorServiceArray4, executorServiceArray5, executorServiceArray6 };
        java.util.concurrent.ExecutorService[] executorServiceArray8 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray9 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[] executorServiceArray10 = new java.util.concurrent.ExecutorService[] {};
        java.util.concurrent.ExecutorService[][] executorServiceArray11 = new java.util.concurrent.ExecutorService[][] { executorServiceArray8, executorServiceArray9, executorServiceArray10 };
        java.util.concurrent.ExecutorService[][][] executorServiceArray12 = new java.util.concurrent.ExecutorService[][][] { executorServiceArray3, executorServiceArray7, executorServiceArray11 };
        java.util.Set<java.util.concurrent.ExecutorService[][]> executorServiceArraySet13 = org.apache.lucene.util.LuceneTestCase.asSet(executorServiceArray12);
        org.elasticsearch.test.ESTestCase[][][] eSTestCaseArray14 = new org.elasticsearch.test.ESTestCase[][][] {};
        java.util.Set<org.elasticsearch.test.ESTestCase[][]> eSTestCaseArraySet15 = org.apache.lucene.util.LuceneTestCase.asSet(eSTestCaseArray14);
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet19 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray18);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray20 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet21 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray20);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray18, (java.lang.Object[]) throttlingArray20);
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet25 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray24);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray26 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet27 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray26);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) throttlingArray26);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray18, (java.lang.Object[]) serializableArray24);
        java.io.Serializable[] serializableArray31 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet32 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray31);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray33 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet34 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray33);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray31, (java.lang.Object[]) throttlingArray33);
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet38 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray39 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet40 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray39);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray37, (java.lang.Object[]) throttlingArray39);
        org.junit.Assert.assertEquals((java.lang.Object[]) serializableArray31, (java.lang.Object[]) serializableArray37);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray44 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet45 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray44);
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet48 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray49 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet50 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray49);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray47, (java.lang.Object[]) throttlingArray49);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray44, (java.lang.Object[]) serializableArray47);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray54 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet55 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray54);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] {};
        java.util.Set<java.io.Serializable> serializableSet58 = org.apache.lucene.util.LuceneTestCase.asSet(serializableArray57);
        org.apache.lucene.store.MockDirectoryWrapper.Throttling[] throttlingArray59 = new org.apache.lucene.store.MockDirectoryWrapper.Throttling[] {};
        java.util.Set<java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>> throttlingEnumSet60 = org.apache.lucene.util.LuceneTestCase.asSet((java.lang.Enum<org.apache.lucene.store.MockDirectoryWrapper.Throttling>[]) throttlingArray59);
        org.junit.Assert.assertEquals("hi!", (java.lang.Object[]) serializableArray57, (java.lang.Object[]) throttlingArray59);
        org.junit.Assert.assertEquals("tests.weekly", (java.lang.Object[]) throttlingArray54, (java.lang.Object[]) serializableArray57);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray47, (java.lang.Object[]) throttlingArray54);
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) serializableArray37, (java.lang.Object[]) throttlingArray54);
        org.junit.Assert.assertEquals("random", (java.lang.Object[]) serializableArray24, (java.lang.Object[]) serializableArray37);
        org.junit.Assert.assertEquals((java.lang.Object[]) eSTestCaseArray14, (java.lang.Object[]) serializableArray37);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals((java.lang.Object[]) executorServiceArray12, (java.lang.Object[]) eSTestCaseArray14);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5079");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("tests.badapples", (double) 3, (double) (short) -1, 0.0d);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5080");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals((long) 'a', (long) (byte) 100);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5081");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests1 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests1.tearDown();
        org.apache.lucene.index.IndexReader indexReader4 = null;
        org.apache.lucene.index.Terms terms5 = null;
        org.apache.lucene.index.Terms terms6 = null;
        kuromojiAnalysisTests1.assertTermsEquals("tests.failfast", indexReader4, terms5, terms6, false);
        kuromojiAnalysisTests1.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests1.ensureCheckIndexPassed();
        org.apache.lucene.index.IndexReader indexReader13 = null;
        org.apache.lucene.index.Fields fields14 = null;
        org.apache.lucene.index.Fields fields15 = null;
        kuromojiAnalysisTests1.assertFieldsEquals("tests.weekly", indexReader13, fields14, fields15, true);
        kuromojiAnalysisTests1.overrideTestDefaultQueryCache();
        org.apache.lucene.index.IndexReader indexReader20 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum22 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum23 = null;
        kuromojiAnalysisTests1.assertDocsSkippingEquals("tests.monster", indexReader20, 0, postingsEnum22, postingsEnum23, true);
        kuromojiAnalysisTests1.restoreIndexWriterMaxDocs();
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests28 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests28.tearDown();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests28.assertTermsEquals("tests.failfast", indexReader31, terms32, terms33, false);
        kuromojiAnalysisTests28.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests28.ensureAllSearchContextsReleased();
        org.junit.rules.TestRule testRule39 = kuromojiAnalysisTests28.ruleChain;
        org.junit.rules.RuleChain ruleChain40 = kuromojiAnalysisTests28.failureAndSuccessEvents;
        org.junit.Assert.assertNotEquals((java.lang.Object) "random", (java.lang.Object) ruleChain40);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain40;
        kuromojiAnalysisTests1.failureAndSuccessEvents = ruleChain40;
        org.apache.lucene.index.IndexReader indexReader45 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum47 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum48 = null;
        kuromojiAnalysisTests1.assertPositionsSkippingEquals("tests.maxfailures", indexReader45, 2, postingsEnum47, postingsEnum48);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("<unknown>", (java.lang.Object) kuromojiAnalysisTests1);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5082");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertEquals("enwiki.random.lines.txt", 100.0d, (double) 1.0f);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5083");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray1, byteArray2);
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray5, byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray2, byteArray5);
        byte[] byteArray10 = new byte[] {};
        byte[] byteArray11 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray10, byteArray11);
        byte[] byteArray14 = new byte[] {};
        byte[] byteArray15 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray14, byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray11, byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray5, byteArray14);
        byte[] byteArray21 = new byte[] {};
        byte[] byteArray22 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray21, byteArray22);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray25, byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray22, byteArray25);
        byte[] byteArray30 = new byte[] {};
        byte[] byteArray31 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray30, byteArray31);
        byte[] byteArray34 = new byte[] {};
        byte[] byteArray35 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray34, byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray31, byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray25, byteArray34);
        byte[] byteArray40 = new byte[] {};
        byte[] byteArray41 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray40, byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray34, byteArray41);
        byte[] byteArray45 = new byte[] {};
        byte[] byteArray46 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray45, byteArray46);
        byte[] byteArray49 = new byte[] {};
        byte[] byteArray50 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray49, byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray46, byteArray49);
        byte[] byteArray54 = new byte[] {};
        byte[] byteArray55 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray54, byteArray55);
        byte[] byteArray58 = new byte[] {};
        byte[] byteArray59 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray58, byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray55, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray49, byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray41, byteArray49);
        byte[] byteArray66 = new byte[] {};
        byte[] byteArray67 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray66, byteArray67);
        byte[] byteArray70 = new byte[] {};
        byte[] byteArray71 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray70, byteArray71);
        org.junit.Assert.assertArrayEquals("tests.monster", byteArray67, byteArray71);
        byte[] byteArray75 = new byte[] {};
        byte[] byteArray76 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray75, byteArray76);
        byte[] byteArray79 = new byte[] {};
        byte[] byteArray80 = new byte[] {};
        org.junit.Assert.assertArrayEquals("<unknown>", byteArray79, byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray76, byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray79);
        org.junit.Assert.assertArrayEquals("tests.badapples", byteArray41, byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray14, byteArray67);
        byte[] byteArray86 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertArrayEquals(byteArray67, byteArray86);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5084");
        org.junit.rules.TestRule testRule3 = null;
        org.junit.rules.RuleChain ruleChain4 = org.junit.rules.RuleChain.outerRule(testRule3);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain4;
        org.junit.rules.TestRule testRule6 = null;
        org.junit.rules.RuleChain ruleChain7 = org.junit.rules.RuleChain.outerRule(testRule6);
        org.junit.rules.RuleChain ruleChain8 = ruleChain4.around((org.junit.rules.TestRule) ruleChain7);
        org.junit.rules.TestRule testRule9 = null;
        org.junit.rules.RuleChain ruleChain10 = org.junit.rules.RuleChain.outerRule(testRule9);
        org.junit.rules.TestRule testRule11 = null;
        org.junit.rules.RuleChain ruleChain12 = org.junit.rules.RuleChain.outerRule(testRule11);
        org.apache.lucene.util.LuceneTestCase.classRules = ruleChain12;
        org.junit.rules.TestRule testRule14 = null;
        org.junit.rules.RuleChain ruleChain15 = org.junit.rules.RuleChain.outerRule(testRule14);
        org.junit.rules.RuleChain ruleChain16 = ruleChain12.around((org.junit.rules.TestRule) ruleChain15);
        org.junit.rules.TestRule testRule17 = null;
        org.junit.rules.RuleChain ruleChain18 = org.junit.rules.RuleChain.outerRule(testRule17);
        org.junit.rules.RuleChain[] ruleChainArray19 = new org.junit.rules.RuleChain[] { ruleChain4, ruleChain10, ruleChain12, ruleChain18 };
        java.util.List<org.junit.rules.RuleChain> ruleChainList20 = org.elasticsearch.test.ESTestCase.randomSubsetOf((int) (short) 0, ruleChainArray19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests21 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests21.tearDown();
        org.apache.lucene.index.IndexReader indexReader24 = null;
        org.apache.lucene.index.Terms terms25 = null;
        org.apache.lucene.index.Terms terms26 = null;
        kuromojiAnalysisTests21.assertTermsEquals("tests.failfast", indexReader24, terms25, terms26, false);
        kuromojiAnalysisTests21.restoreIndexWriterMaxDocs();
        org.apache.lucene.index.IndexReader indexReader31 = null;
        org.apache.lucene.index.Terms terms32 = null;
        org.apache.lucene.index.Terms terms33 = null;
        kuromojiAnalysisTests21.assertTermsEquals("hi!", indexReader31, terms32, terms33, true);
        org.apache.lucene.index.IndexReader indexReader37 = null;
        org.apache.lucene.index.Fields fields38 = null;
        org.apache.lucene.index.Fields fields39 = null;
        kuromojiAnalysisTests21.assertFieldsEquals("", indexReader37, fields38, fields39, false);
        kuromojiAnalysisTests21.setIndexWriterMaxDocs((int) (short) 1);
        org.junit.Assert.assertNotEquals("tests.nightly", (java.lang.Object) ruleChainArray19, (java.lang.Object) kuromojiAnalysisTests21);
        java.util.Set<org.junit.rules.TestRule> testRuleSet45 = org.apache.lucene.util.LuceneTestCase.asSet((org.junit.rules.TestRule[]) ruleChainArray19);
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests47 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests47.tearDown();
        org.apache.lucene.index.IndexReader indexReader50 = null;
        org.apache.lucene.index.Terms terms51 = null;
        org.apache.lucene.index.Terms terms52 = null;
        kuromojiAnalysisTests47.assertTermsEquals("tests.failfast", indexReader50, terms51, terms52, false);
        kuromojiAnalysisTests47.assertPathHasBeenCleared("tests.nightly");
        kuromojiAnalysisTests47.ensureCheckIndexPassed();
        org.junit.Assert.assertNotEquals("tests.badapples", (java.lang.Object) kuromojiAnalysisTests47, (java.lang.Object) '4');
        org.apache.lucene.index.IndexReader indexReader61 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum63 = null;
        org.apache.lucene.index.PostingsEnum postingsEnum64 = null;
        kuromojiAnalysisTests47.assertPositionsSkippingEquals("random", indexReader61, (int) '#', postingsEnum63, postingsEnum64);
        kuromojiAnalysisTests47.restoreIndexWriterMaxDocs();
        org.junit.Assert.assertNotEquals((java.lang.Object) testRuleSet45, (java.lang.Object) kuromojiAnalysisTests47);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertNull("tests.monster", (java.lang.Object) testRuleSet45);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest10.test5085");
        org.elasticsearch.index.analysis.KuromojiAnalysisTests kuromojiAnalysisTests0 = new org.elasticsearch.index.analysis.KuromojiAnalysisTests();
        kuromojiAnalysisTests0.tearDown();
        kuromojiAnalysisTests0.assertPathHasBeenCleared("hi!");
        kuromojiAnalysisTests0.setUp();
        kuromojiAnalysisTests0.ensureAllSearchContextsReleased();
        kuromojiAnalysisTests0.setUp();
        java.lang.String str7 = kuromojiAnalysisTests0.getTestName();
        kuromojiAnalysisTests0.setIndexWriterMaxDocs(3);
        java.lang.Object obj10 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.junit.Assert.assertSame((java.lang.Object) kuromojiAnalysisTests0, obj10);
    }
}

