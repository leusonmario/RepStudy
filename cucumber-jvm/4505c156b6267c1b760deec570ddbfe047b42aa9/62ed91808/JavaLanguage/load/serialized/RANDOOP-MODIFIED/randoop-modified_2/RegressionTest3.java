import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNotNull(picoFactory1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory3);
        org.junit.Assert.assertNotNull(javaLanguage4);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage4.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage4.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage4.objectFactory;
        javaLanguage4.begin_scenario();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        javaLanguage11.serializedObjectSupporter = serializedObjectSupporter12;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage11.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage11.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage20.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage11.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory26 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage4.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.language.LanguageMixin languageMixin28 = javaLanguage4.languageMixin;
        java.lang.reflect.Method method29 = null;
        // The following exception was thrown during execution in test generation
        try {
            javaLanguage4.registerAfterMaybe(method29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory2);
        org.junit.Assert.assertNotNull(picoFactory3);
        org.junit.Assert.assertNotNull(javaLanguage4);
        org.junit.Assert.assertNull(languageMixin5);
        org.junit.Assert.assertNull(languageMixin6);
        org.junit.Assert.assertNotNull(objectFactory7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage14);
        org.junit.Assert.assertNull(languageMixin16);
        org.junit.Assert.assertNotNull(objectFactory17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/String.java" + "'", str19, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "foo/java/lang/String.java" + "'", str22, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage23);
        org.junit.Assert.assertNotNull(picoFactory26);
        org.junit.Assert.assertNull(languageMixin28);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.StepDefinition stepDefinition2 = null;
        javaLanguage1.addStepDefinition(stepDefinition2);
        cuke4duke.internal.language.StepDefinition stepDefinition4 = null;
        javaLanguage1.addStepDefinition(stepDefinition4);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = javaLanguage8.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter13;
        javaLanguage1.begin_scenario();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList18 = javaLanguage1.step_definitions_for("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage11);
        org.junit.Assert.assertNotNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(javaLanguage14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage3.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        java.lang.String str13 = serializedObjectSupporter8.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        javaLanguage17.serializedObjectSupporter = serializedObjectSupporter18;
        cuke4duke.internal.language.LanguageMixin languageMixin22 = javaLanguage17.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage17.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter24 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter24.deserializeObjectJavaLanguage2();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage27 = serializedObjectSupporter24.deserializeObjectJavaLanguage2();
        javaLanguage17.serializedObjectSupporter = serializedObjectSupporter24;
        cuke4duke.internal.language.StepDefinition stepDefinition29 = null;
        javaLanguage17.addStepDefinition(stepDefinition29);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter31 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = serializedObjectSupporter31.deserializeObjectJavaLanguage2();
        java.lang.String str33 = serializedObjectSupporter31.deserializeObjectString1();
        java.lang.String str34 = serializedObjectSupporter31.deserializeObjectString2();
        javaLanguage17.serializedObjectSupporter = serializedObjectSupporter31;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter36 = javaLanguage17.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter37 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter40 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage42 = serializedObjectSupporter40.deserializeObjectJavaLanguage1();
        javaLanguage39.serializedObjectSupporter = serializedObjectSupporter40;
        cuke4duke.internal.language.LanguageMixin languageMixin44 = javaLanguage39.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory45 = javaLanguage39.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter46 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage47 = serializedObjectSupporter46.deserializeObjectJavaLanguage2();
        java.lang.String str48 = serializedObjectSupporter46.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage49 = serializedObjectSupporter46.deserializeObjectJavaLanguage2();
        javaLanguage39.serializedObjectSupporter = serializedObjectSupporter46;
        cuke4duke.internal.java.JavaLanguage javaLanguage51 = serializedObjectSupporter46.deserializeObjectJavaLanguage2();
        javaLanguage17.serializedObjectSupporter = serializedObjectSupporter46;
        cuke4duke.internal.java.JavaLanguage javaLanguage53 = serializedObjectSupporter46.deserializeObjectJavaLanguage2();
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter46;
        java.lang.String str55 = serializedObjectSupporter46.deserializeObjectString2();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter46;
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
        org.junit.Assert.assertNull(languageMixin4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage10);
        org.junit.Assert.assertNotNull(picoFactory12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/String.java" + "'", str19, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage20);
        org.junit.Assert.assertNull(languageMixin22);
        org.junit.Assert.assertNotNull(objectFactory23);
        org.junit.Assert.assertNotNull(javaLanguage25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "foo/java/lang/String.java" + "'", str26, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage27);
        org.junit.Assert.assertNotNull(javaLanguage32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "foo/java/lang/String.java" + "'", str33, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "foo/java/lang/Strix.java" + "'", str34, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(serializedObjectSupporter36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "foo/java/lang/String.java" + "'", str38, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "foo/java/lang/String.java" + "'", str41, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage42);
        org.junit.Assert.assertNull(languageMixin44);
        org.junit.Assert.assertNotNull(objectFactory45);
        org.junit.Assert.assertNotNull(javaLanguage47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "foo/java/lang/String.java" + "'", str48, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage49);
        org.junit.Assert.assertNotNull(javaLanguage51);
        org.junit.Assert.assertNotNull(javaLanguage53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "foo/java/lang/Strix.java" + "'", str55, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage6.getlanguageMixin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertNotNull(picoFactory5);
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertNull(languageMixin7);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage2.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage2.getobjectFactory();
        java.lang.Class<?> wildcardClass11 = javaLanguage2.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory16 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory18 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory20 = serializedObjectSupporter14.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.StepDefinition stepDefinition22 = null;
        javaLanguage21.addStepDefinition(stepDefinition22);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter24 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter24.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter26 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory28 = serializedObjectSupporter26.deserializeObjectObjectFactory2();
        javaLanguage25.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.String str30 = serializedObjectSupporter26.deserializeObjectString2();
        java.lang.String str31 = serializedObjectSupporter26.deserializeObjectString2();
        javaLanguage21.serializedObjectSupporter = serializedObjectSupporter26;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter26;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin8);
        org.junit.Assert.assertNotNull(objectFactory9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(languageMixin12);
        org.junit.Assert.assertNull(languageMixin13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory16);
        org.junit.Assert.assertNotNull(picoFactory17);
        org.junit.Assert.assertNotNull(picoFactory18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/String.java" + "'", str19, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory20);
        org.junit.Assert.assertNotNull(javaLanguage21);
        org.junit.Assert.assertNotNull(javaLanguage25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "foo/java/lang/String.java" + "'", str27, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "foo/java/lang/Strix.java" + "'", str30, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "foo/java/lang/Strix.java" + "'", str31, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass3 = javaLanguage1.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter5;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter9.deserializeObjectObjectFactory2();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(picoFactory10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage2.objectFactory;
        javaLanguage2.load("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = javaLanguage2.serializedObjectSupporter;
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(objectFactory7);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNotNull(serializedObjectSupporter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        javaLanguage9.serializedObjectSupporter = serializedObjectSupporter10;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage9.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter14;
        javaLanguage6.begin_scenario();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(serializedObjectSupporter14);
        org.junit.Assert.assertNotNull(javaLanguage15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass3 = javaLanguage1.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter5;
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter5.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage9.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage9.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage9.objectFactory;
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(javaLanguage9);
        org.junit.Assert.assertNull(languageMixin10);
        org.junit.Assert.assertNull(languageMixin11);
        org.junit.Assert.assertNotNull(objectFactory12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        javaLanguage1.begin_scenario();
        javaLanguage1.end_scenario();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory17 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory18 = serializedObjectSupporter8.deserializeObjectObjectFactory1();
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(picoFactory10);
        org.junit.Assert.assertNotNull(picoFactory11);
        org.junit.Assert.assertNotNull(javaLanguage12);
        org.junit.Assert.assertNotNull(javaLanguage13);
        org.junit.Assert.assertNotNull(javaLanguage14);
        org.junit.Assert.assertNotNull(javaLanguage16);
        org.junit.Assert.assertNotNull(picoFactory17);
        org.junit.Assert.assertNotNull(picoFactory18);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage1.languageMixin;
        javaLanguage1.begin_scenario();
        cuke4duke.internal.language.StepDefinition stepDefinition7 = null;
        javaLanguage1.addStepDefinition(stepDefinition7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage1.loadClass("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(javaLanguage1);
        org.junit.Assert.assertNotNull(javaLanguage3);
        org.junit.Assert.assertNull(languageMixin5);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter3.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = javaLanguage8.serializedObjectSupporter;
        java.lang.Class<?> wildcardClass11 = javaLanguage8.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage8.getlanguageMixin();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(javaLanguage5);
        org.junit.Assert.assertNotNull(picoFactory7);
        org.junit.Assert.assertNotNull(javaLanguage8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(languageMixin12);
    }
}

