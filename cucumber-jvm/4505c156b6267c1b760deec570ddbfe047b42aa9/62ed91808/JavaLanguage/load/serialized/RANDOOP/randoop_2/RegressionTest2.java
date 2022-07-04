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
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.StepDefinition stepDefinition4 = null;
        javaLanguage2.addStepDefinition(stepDefinition4);
        cuke4duke.internal.language.StepDefinition stepDefinition6 = null;
        javaLanguage2.addStepDefinition(stepDefinition6);
        javaLanguage2.begin_scenario();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage2.objectFactory;
        java.lang.Class<?> wildcardClass13 = javaLanguage2.loadClass("foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin9);
        org.junit.Assert.assertNotNull(objectFactory10);
        org.junit.Assert.assertNotNull(objectFactory11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage14.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage14.objectFactory;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNotNull(objectFactory16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = javaLanguage2.serializedObjectSupporter;
        javaLanguage2.begin_scenario();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage8.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage13.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str21 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory22 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory23 = serializedObjectSupporter14.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter25 = javaLanguage24.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(objectFactory9);
        org.junit.Assert.assertNotNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(javaLanguage13);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(picoFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/Strix.java" + "'", str19, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "foo/java/lang/String.java" + "'", str21, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory22);
        org.junit.Assert.assertNotNull(picoFactory23);
        org.junit.Assert.assertNotNull(javaLanguage24);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage15.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage15.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage15.getlanguageMixin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(picoFactory13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(objectFactory16);
        org.junit.Assert.assertNotNull(objectFactory17);
        org.junit.Assert.assertNull(languageMixin18);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage8.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage13.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage21.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter23 = javaLanguage21.serializedObjectSupporter;
        cuke4duke.internal.java.ObjectFactory objectFactory24 = javaLanguage21.getobjectFactory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(objectFactory9);
        org.junit.Assert.assertNotNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(javaLanguage13);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(picoFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/Strix.java" + "'", str19, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage21);
        org.junit.Assert.assertNotNull(objectFactory22);
        org.junit.Assert.assertNull(serializedObjectSupporter23);
        org.junit.Assert.assertNotNull(objectFactory24);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.objectFactory;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage6.objectFactory;
        java.lang.Class<?> wildcardClass9 = javaLanguage6.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(picoFactory3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertNotNull(objectFactory7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        javaLanguage2.begin_scenario();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage2.serializedObjectSupporter;
        javaLanguage2.end_scenario();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = null;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter8;
        javaLanguage2.begin_scenario();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter9.deserializeObjectObjectFactory2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter9.deserializeObjectObjectFactory2();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString2();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(picoFactory5);
        org.junit.Assert.assertNotNull(picoFactory6);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNotNull(picoFactory13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.StepDefinition stepDefinition14 = null;
        javaLanguage13.addStepDefinition(stepDefinition14);
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(picoFactory12);
        org.junit.Assert.assertNotNull(javaLanguage13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str7 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter3.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.StepDefinition stepDefinition12 = null;
        javaLanguage11.addStepDefinition(stepDefinition12);
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory8);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(javaLanguage11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.StepDefinition stepDefinition4 = null;
        javaLanguage3.addStepDefinition(stepDefinition4);
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage3.end_scenario();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory2);
        org.junit.Assert.assertNotNull(javaLanguage3);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        javaLanguage2.begin_scenario();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage2.serializedObjectSupporter;
        javaLanguage2.end_scenario();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage2.languageMixin;
        java.lang.reflect.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage2.registerBeforeMaybe(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertNotNull(objectFactory9);
        org.junit.Assert.assertNull(languageMixin10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializedObjectSupporter7.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertNull(languageMixin3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(javaLanguage12);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.StepDefinition stepDefinition5 = null;
        javaLanguage2.addStepDefinition(stepDefinition5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage10.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage10.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage10.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        javaLanguage15.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.PicoFactory picoFactory19 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        javaLanguage10.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.PicoFactory picoFactory21 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.PicoFactory picoFactory23 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage24 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter16.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory26 = serializedObjectSupporter16.deserializeObjectObjectFactory1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(objectFactory11);
        org.junit.Assert.assertNotNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(javaLanguage17);
        org.junit.Assert.assertNotNull(picoFactory19);
        org.junit.Assert.assertNotNull(picoFactory21);
        org.junit.Assert.assertNotNull(picoFactory23);
        org.junit.Assert.assertNotNull(javaLanguage24);
        org.junit.Assert.assertNotNull(javaLanguage25);
        org.junit.Assert.assertNotNull(picoFactory26);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(picoFactory8);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory12);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory6);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage2.getlanguageMixin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNotNull(objectFactory13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        javaLanguage9.begin_scenario();
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage9.objectFactory;
        javaLanguage9.begin_scenario();
        javaLanguage9.begin_scenario();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(picoFactory8);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(objectFactory10);
        org.junit.Assert.assertNotNull(objectFactory12);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.StepDefinition stepDefinition15 = null;
        javaLanguage2.addStepDefinition(stepDefinition15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNull(languageMixin14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage1.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage5.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = javaLanguage5.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter11.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter11.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        javaLanguage16.begin_scenario();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter18.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter18;
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter18;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(objectFactory6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(picoFactory12);
        org.junit.Assert.assertNotNull(javaLanguage13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/String.java" + "'", str19, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage20);
        org.junit.Assert.assertNotNull(javaLanguage21);
        org.junit.Assert.assertNotNull(javaLanguage22);
        org.junit.Assert.assertNotNull(javaLanguage23);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Class<?> wildcardClass14 = javaLanguage2.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = javaLanguage2.serializedObjectSupporter;
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter15.deserializeObjectObjectFactory1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(serializedObjectSupporter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory17);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(picoFactory3);
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = javaLanguage8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        javaLanguage6.addStepDefinition(stepDefinition7);
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        javaLanguage6.addStepDefinition(stepDefinition9);
        cuke4duke.internal.language.StepDefinition stepDefinition11 = null;
        javaLanguage6.addStepDefinition(stepDefinition11);
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(javaLanguage6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter7.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        java.lang.String str15 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(picoFactory13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage2.objectFactory;
        java.lang.Class<?> wildcardClass9 = objectFactory8.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNotNull(objectFactory5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(objectFactory7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        javaLanguage2.begin_scenario();
        cuke4duke.internal.language.StepDefinition stepDefinition6 = null;
        javaLanguage2.addStepDefinition(stepDefinition6);
        javaLanguage2.begin_scenario();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage2.getobjectFactory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(objectFactory10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage10.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage10.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage10.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        javaLanguage15.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.PicoFactory picoFactory19 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        javaLanguage10.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.PicoFactory picoFactory21 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter16;
        java.lang.String str23 = serializedObjectSupporter16.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter16.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory25 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(objectFactory11);
        org.junit.Assert.assertNotNull(objectFactory12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(javaLanguage17);
        org.junit.Assert.assertNotNull(picoFactory19);
        org.junit.Assert.assertNotNull(picoFactory21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "foo/java/lang/Strix.java" + "'", str23, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory24);
        org.junit.Assert.assertNotNull(picoFactory25);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage4.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage4.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage4.serializedObjectSupporter;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        javaLanguage4.addStepDefinition(stepDefinition8);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter10.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter10.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory15 = serializedObjectSupporter10.deserializeObjectObjectFactory2();
        java.lang.String str16 = serializedObjectSupporter10.deserializeObjectString1();
        javaLanguage4.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str18 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter10.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory20 = serializedObjectSupporter10.deserializeObjectObjectFactory2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(javaLanguage4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(picoFactory13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertNotNull(picoFactory15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/String.java" + "'", str18, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage19);
        org.junit.Assert.assertNotNull(picoFactory20);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str7 = serializedObjectSupporter3.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter3.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter3.deserializeObjectObjectFactory1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter3.getClass();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = javaLanguage7.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter13.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter13.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter13.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory19 = serializedObjectSupporter13.deserializeObjectObjectFactory1();
        java.lang.String str20 = serializedObjectSupporter13.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter13.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter13;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage11);
        org.junit.Assert.assertNotNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage18);
        org.junit.Assert.assertNotNull(picoFactory19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "foo/java/lang/Strix.java" + "'", str20, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage21);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        javaLanguage7.begin_scenario();
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        javaLanguage7.addStepDefinition(stepDefinition9);
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage7.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage7.objectFactory;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(picoFactory5);
        org.junit.Assert.assertNotNull(picoFactory6);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(objectFactory12);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter9.deserializeObjectObjectFactory2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        javaLanguage14.begin_scenario();
        java.lang.Class<?> wildcardClass17 = javaLanguage14.loadClass("foo/java/lang/String.java");
        javaLanguage14.end_scenario();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(picoFactory5);
        org.junit.Assert.assertNotNull(picoFactory6);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(objectFactory8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage2.getlanguageMixin();
        java.lang.reflect.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage2.registerStepDefinitionMaybe(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(languageMixin7);
        org.junit.Assert.assertNull(languageMixin8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage1.objectFactory;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(objectFactory8);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter2.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.StepDefinition stepDefinition9 = null;
        javaLanguage8.addStepDefinition(stepDefinition9);
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage8.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = javaLanguage8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(picoFactory5);
        org.junit.Assert.assertNotNull(picoFactory6);
        org.junit.Assert.assertNotNull(picoFactory7);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(objectFactory11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter7.deserializeObjectObjectFactory1();
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage12.getobjectFactory();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(picoFactory8);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(picoFactory10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(objectFactory13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        javaLanguage2.begin_scenario();
        javaLanguage2.begin_scenario();
        javaLanguage2.end_scenario();
        javaLanguage2.begin_scenario();
        javaLanguage2.end_scenario();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Class<?> wildcardClass14 = javaLanguage2.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = javaLanguage2.serializedObjectSupporter;
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNotNull(serializedObjectSupporter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage8.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage13.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.PicoFactory picoFactory21 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        java.lang.String str22 = serializedObjectSupporter14.deserializeObjectString2();
        java.lang.String str23 = serializedObjectSupporter14.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory26 = serializedObjectSupporter14.deserializeObjectObjectFactory1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = serializedObjectSupporter14.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNotNull(objectFactory9);
        org.junit.Assert.assertNotNull(objectFactory10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(javaLanguage13);
        org.junit.Assert.assertNotNull(javaLanguage15);
        org.junit.Assert.assertNotNull(picoFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/Strix.java" + "'", str19, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "foo/java/lang/Strix.java" + "'", str22, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "foo/java/lang/Strix.java" + "'", str23, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory24);
        org.junit.Assert.assertNotNull(javaLanguage25);
        org.junit.Assert.assertNotNull(picoFactory26);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        javaLanguage2.begin_scenario();
        javaLanguage2.begin_scenario();
        javaLanguage2.end_scenario();
        java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList9 = javaLanguage2.step_definitions_for("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage12.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage12.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage12.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage12.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter17.deserializeObjectJavaLanguage1();
        java.lang.String str20 = serializedObjectSupporter17.deserializeObjectString1();
        javaLanguage12.serializedObjectSupporter = serializedObjectSupporter17;
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter17.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory23 = serializedObjectSupporter17.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter17.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter17.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory26 = javaLanguage25.objectFactory;
        javaLanguage25.begin_scenario();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter28 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = serializedObjectSupporter28.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory30 = javaLanguage29.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter31 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str32 = serializedObjectSupporter31.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage33 = serializedObjectSupporter31.deserializeObjectJavaLanguage1();
        javaLanguage29.serializedObjectSupporter = serializedObjectSupporter31;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter35 = javaLanguage29.serializedObjectSupporter;
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString2();
        javaLanguage25.serializedObjectSupporter = serializedObjectSupporter35;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter35;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNotNull(stepDefinitionList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(objectFactory13);
        org.junit.Assert.assertNotNull(objectFactory14);
        org.junit.Assert.assertNull(languageMixin15);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/String.java" + "'", str18, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "foo/java/lang/String.java" + "'", str20, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage22);
        org.junit.Assert.assertNotNull(picoFactory23);
        org.junit.Assert.assertNotNull(picoFactory24);
        org.junit.Assert.assertNotNull(javaLanguage25);
        org.junit.Assert.assertNotNull(objectFactory26);
        org.junit.Assert.assertNotNull(javaLanguage29);
        org.junit.Assert.assertNotNull(objectFactory30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "foo/java/lang/String.java" + "'", str32, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage33);
        org.junit.Assert.assertNotNull(serializedObjectSupporter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "foo/java/lang/Strix.java" + "'", str36, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage2.objectFactory;
        javaLanguage2.load("foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory3);
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNotNull(objectFactory6);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage4.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage4.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage4.serializedObjectSupporter;
        cuke4duke.internal.language.StepDefinition stepDefinition8 = null;
        javaLanguage4.addStepDefinition(stepDefinition8);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter10.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter10.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory15 = serializedObjectSupporter10.deserializeObjectObjectFactory2();
        java.lang.String str16 = serializedObjectSupporter10.deserializeObjectString1();
        javaLanguage4.serializedObjectSupporter = serializedObjectSupporter10;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter19.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter19.deserializeObjectObjectFactory2();
        javaLanguage18.serializedObjectSupporter = serializedObjectSupporter19;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNotNull(javaLanguage4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(picoFactory13);
        org.junit.Assert.assertNotNull(picoFactory14);
        org.junit.Assert.assertNotNull(picoFactory15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "foo/java/lang/String.java" + "'", str20, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage21);
        org.junit.Assert.assertNotNull(javaLanguage22);
        org.junit.Assert.assertNotNull(javaLanguage23);
        org.junit.Assert.assertNotNull(picoFactory24);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(serializedObjectSupporter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter3.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter3.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter3.deserializeObjectObjectFactory2();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(objectFactory2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory9);
        org.junit.Assert.assertNotNull(picoFactory10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        javaLanguage2.begin_scenario();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage2.serializedObjectSupporter;
        javaLanguage2.end_scenario();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        java.lang.reflect.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage2.registerBeforeMaybe(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertNotNull(objectFactory4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory3);
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(picoFactory6);
        org.junit.Assert.assertNotNull(javaLanguage7);
    }
}

