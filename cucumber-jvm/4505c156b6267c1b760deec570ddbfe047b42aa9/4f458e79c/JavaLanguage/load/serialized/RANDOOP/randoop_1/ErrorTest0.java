import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter8.getClass();
        javaLanguage2.registerStepDefinitionsFor((java.lang.Class) wildcardClass12);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        javaLanguage2.registerStepDefinitionsFor((java.lang.Class) wildcardClass15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class class3 = javaLanguage1.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage15.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage15.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage6.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        javaLanguage11.serializedObjectSupporter = serializedObjectSupporter12;
        cuke4duke.internal.java.PicoFactory picoFactory15 = serializedObjectSupporter12.deserializeObjectObjectFactory2();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.Class class18 = javaLanguage6.loadClass("foo/java/lang/String.java");
        javaLanguage3.registerStepDefinitionsFor(class18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class class3 = javaLanguage1.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = javaLanguage1.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage17.end_scenario();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage1.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage16.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage16.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage20.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory25 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter29 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = serializedObjectSupporter29.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory32 = serializedObjectSupporter29.deserializeObjectObjectFactory1();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage34 = serializedObjectSupporter29.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = serializedObjectSupporter29.deserializeObjectJavaLanguage2();
        javaLanguage28.serializedObjectSupporter = serializedObjectSupporter29;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage28.end_scenario();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage15.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage15.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        java.lang.Class class21 = javaLanguage19.loadClass("foo/java/lang/String.java");
        javaLanguage15.registerStepDefinitionsFor(class21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage4.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage4.end_scenario();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage8.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage8.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage13.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        javaLanguage13.serializedObjectSupporter = serializedObjectSupporter15;
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString2();
        java.lang.String str21 = serializedObjectSupporter15.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter15;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList3 = javaLanguage1.step_definitions_for("foo/java/lang/String.java");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory6 = javaLanguage5.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter7;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = javaLanguage5.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage14.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage14.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter17.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory19 = javaLanguage18.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter20 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str21 = serializedObjectSupporter20.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter20.deserializeObjectJavaLanguage1();
        javaLanguage18.serializedObjectSupporter = serializedObjectSupporter20;
        java.lang.Class<?> wildcardClass24 = serializedObjectSupporter20.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass24);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        javaLanguage14.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        javaLanguage5.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter31 = javaLanguage1.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString2();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage4.end_scenario();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage16.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage16.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage20.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory25 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage28.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage28.end_scenario();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage2.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage8.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage8.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory14 = javaLanguage13.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        javaLanguage13.serializedObjectSupporter = serializedObjectSupporter15;
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString2();
        java.lang.String str21 = serializedObjectSupporter15.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter15;
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage2.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter3.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter3.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter3.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage11.end_scenario();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter6;
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter6.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter6.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter6;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage12.end_scenario();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str18 = serializedObjectSupporter17.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory19 = serializedObjectSupporter17.deserializeObjectObjectFactory2();
        java.lang.Class<?> wildcardClass20 = serializedObjectSupporter17.getClass();
        javaLanguage16.registerStepDefinitionsFor((java.lang.Class) wildcardClass20);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter22 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter22.deserializeObjectJavaLanguage1();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter22.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass26 = javaLanguage25.getClass();
        javaLanguage16.registerStepDefinitionsFor((java.lang.Class) wildcardClass26);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter28 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str29 = serializedObjectSupporter28.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage30 = serializedObjectSupporter28.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory31 = javaLanguage30.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin32 = javaLanguage30.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory33 = javaLanguage30.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter34 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = serializedObjectSupporter34.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory36 = javaLanguage35.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter37 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        javaLanguage35.serializedObjectSupporter = serializedObjectSupporter37;
        javaLanguage30.serializedObjectSupporter = serializedObjectSupporter37;
        java.lang.String str42 = serializedObjectSupporter37.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage43 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage44 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage45 = serializedObjectSupporter37.deserializeObjectJavaLanguage2();
        java.lang.String str46 = serializedObjectSupporter37.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory47 = serializedObjectSupporter37.deserializeObjectObjectFactory1();
        java.lang.String str48 = serializedObjectSupporter37.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage49 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage50 = serializedObjectSupporter37.deserializeObjectJavaLanguage1();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter37;
        cuke4duke.internal.language.LanguageMixin languageMixin52 = javaLanguage16.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage16.end_scenario();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList17 = javaLanguage15.step_definitions_for("foo/java/lang/String.java");
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage15.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        java.lang.String str21 = serializedObjectSupporter19.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter19.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory23 = javaLanguage22.getobjectFactory();
        java.lang.Class<?> wildcardClass24 = javaLanguage22.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage16.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage16.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage20.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory25 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = serializedObjectSupporter21.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage29 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage29.end_scenario();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class class3 = javaLanguage1.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage7.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage7.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage12.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage12.serializedObjectSupporter = serializedObjectSupporter14;
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        java.lang.String str23 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter14.deserializeObjectObjectFactory1();
        java.lang.String str25 = serializedObjectSupporter14.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage26 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter14;
        cuke4duke.internal.java.ObjectFactory objectFactory28 = javaLanguage1.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage8.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = javaLanguage8.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str13 = serializedObjectSupporter12.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory15 = javaLanguage14.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage14.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage14.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter18.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage19.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str22 = serializedObjectSupporter21.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage19.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.String str26 = serializedObjectSupporter21.deserializeObjectString2();
        java.lang.String str27 = serializedObjectSupporter21.deserializeObjectString1();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory29 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter31 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage32 = serializedObjectSupporter31.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter33 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage34 = serializedObjectSupporter33.deserializeObjectJavaLanguage1();
        javaLanguage32.serializedObjectSupporter = serializedObjectSupporter33;
        java.lang.String str36 = serializedObjectSupporter33.deserializeObjectString1();
        java.lang.String str37 = serializedObjectSupporter33.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage38 = serializedObjectSupporter33.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage39 = serializedObjectSupporter33.deserializeObjectJavaLanguage2();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter33;
        cuke4duke.internal.java.JavaLanguage javaLanguage41 = serializedObjectSupporter33.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory42 = javaLanguage41.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage41.end_scenario();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage5.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage3.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage7.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage7.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter11 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter11.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage12.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage12.serializedObjectSupporter = serializedObjectSupporter14;
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.String str19 = serializedObjectSupporter14.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter14;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter8.getClass();
        javaLanguage2.registerStepDefinitionsFor((java.lang.Class) wildcardClass12);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory17 = javaLanguage16.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin18 = javaLanguage16.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter21 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage22 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        javaLanguage20.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.PicoFactory picoFactory24 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory25 = serializedObjectSupporter21.deserializeObjectObjectFactory2();
        javaLanguage16.serializedObjectSupporter = serializedObjectSupporter21;
        javaLanguage14.serializedObjectSupporter = serializedObjectSupporter21;
        cuke4duke.internal.java.JavaLanguage javaLanguage28 = serializedObjectSupporter21.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter29 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str30 = serializedObjectSupporter29.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = serializedObjectSupporter29.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory32 = serializedObjectSupporter29.deserializeObjectObjectFactory1();
        java.lang.String str33 = serializedObjectSupporter29.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage34 = serializedObjectSupporter29.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = serializedObjectSupporter29.deserializeObjectJavaLanguage2();
        javaLanguage28.serializedObjectSupporter = serializedObjectSupporter29;
        cuke4duke.internal.java.ObjectFactory objectFactory37 = javaLanguage28.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage28.end_scenario();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
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
        java.lang.String str13 = serializedObjectSupporter8.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory14 = serializedObjectSupporter8.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage17.end_scenario();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter14.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage15.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage15.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter2.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage9.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString2();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter4;
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage3.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage3.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin11 = javaLanguage3.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage2.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str11 = serializedObjectSupporter10.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter10;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = javaLanguage8.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter15 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str16 = serializedObjectSupporter15.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter15.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage17.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage17.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter20 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter20.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory22 = javaLanguage21.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter23 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str24 = serializedObjectSupporter23.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter23.deserializeObjectJavaLanguage1();
        javaLanguage21.serializedObjectSupporter = serializedObjectSupporter23;
        java.lang.Class<?> wildcardClass27 = serializedObjectSupporter23.getClass();
        javaLanguage17.registerStepDefinitionsFor((java.lang.Class) wildcardClass27);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        javaLanguage17.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        javaLanguage8.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        javaLanguage2.registerStepDefinitionsFor((java.lang.Class) wildcardClass30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage3.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage3.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        java.lang.Class class9 = javaLanguage7.loadClass("foo/java/lang/String.java");
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage7.languageMixin;
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage7.objectFactory;
        java.lang.Class<?> wildcardClass12 = javaLanguage7.getClass();
        javaLanguage3.registerStepDefinitionsFor((java.lang.Class) wildcardClass12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = javaLanguage6.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage6.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage6.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory12 = javaLanguage11.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter13.deserializeObjectJavaLanguage1();
        javaLanguage11.serializedObjectSupporter = serializedObjectSupporter13;
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter13;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = javaLanguage6.serializedObjectSupporter;
        java.lang.String str19 = serializedObjectSupporter18.deserializeObjectString1();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter18;
        cuke4duke.internal.language.LanguageMixin languageMixin21 = javaLanguage3.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage16.end_scenario();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory5 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage8.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = javaLanguage2.serializedObjectSupporter;
        cuke4duke.internal.language.LanguageMixin languageMixin14 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory18 = javaLanguage15.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin19 = javaLanguage15.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str5 = serializedObjectSupporter4.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter4.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage6.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter10 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter10.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter12 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter12.deserializeObjectJavaLanguage1();
        javaLanguage11.serializedObjectSupporter = serializedObjectSupporter12;
        cuke4duke.internal.java.PicoFactory picoFactory15 = serializedObjectSupporter12.deserializeObjectObjectFactory2();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter12;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = javaLanguage6.serializedObjectSupporter;
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter17;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter19 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter19.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass22 = serializedObjectSupporter19.getClass();
        javaLanguage3.registerStepDefinitionsFor((java.lang.Class) wildcardClass22);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter24 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage26 = serializedObjectSupporter24.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory27 = javaLanguage26.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin28 = javaLanguage26.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory29 = javaLanguage26.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter30 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage31 = serializedObjectSupporter30.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory32 = javaLanguage31.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter33 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str34 = serializedObjectSupporter33.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage35 = serializedObjectSupporter33.deserializeObjectJavaLanguage1();
        javaLanguage31.serializedObjectSupporter = serializedObjectSupporter33;
        javaLanguage26.serializedObjectSupporter = serializedObjectSupporter33;
        cuke4duke.internal.java.JavaLanguage javaLanguage38 = serializedObjectSupporter33.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter39 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage40 = serializedObjectSupporter39.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory41 = javaLanguage40.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin42 = javaLanguage40.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter43 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage44 = serializedObjectSupporter43.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter45 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage46 = serializedObjectSupporter45.deserializeObjectJavaLanguage1();
        javaLanguage44.serializedObjectSupporter = serializedObjectSupporter45;
        cuke4duke.internal.java.PicoFactory picoFactory48 = serializedObjectSupporter45.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory49 = serializedObjectSupporter45.deserializeObjectObjectFactory2();
        javaLanguage40.serializedObjectSupporter = serializedObjectSupporter45;
        javaLanguage38.serializedObjectSupporter = serializedObjectSupporter45;
        cuke4duke.internal.java.PicoFactory picoFactory52 = serializedObjectSupporter45.deserializeObjectObjectFactory2();
        javaLanguage3.serializedObjectSupporter = serializedObjectSupporter45;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter54 = javaLanguage3.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter55 = javaLanguage3.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage2.getobjectFactory();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory5 = javaLanguage2.objectFactory;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage7.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter9;
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin17 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter18 = javaLanguage15.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }
}

