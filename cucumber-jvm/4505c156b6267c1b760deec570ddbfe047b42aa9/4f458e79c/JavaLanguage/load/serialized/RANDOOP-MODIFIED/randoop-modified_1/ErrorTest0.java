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
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage9.objectFactory;
        java.lang.Class class13 = javaLanguage9.loadClass("foo/java/lang/String.java");
        javaLanguage2.registerStepDefinitionsFor(class13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage4.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage4.end_scenario();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage1.objectFactory;
        java.lang.Class class5 = javaLanguage1.loadClass("foo/java/lang/String.java");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList3 = javaLanguage1.step_definitions_for("foo/java/lang/String.java");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter3.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass5);
        javaLanguage1.load("foo/java/lang/String.java");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.util.List<cuke4duke.internal.language.StepDefinition> stepDefinitionList3 = javaLanguage1.step_definitions_for("foo/java/lang/String.java");
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage1.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.String str12 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage14.end_scenario();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage9.languageMixin;
        java.lang.Class<?> wildcardClass11 = javaLanguage9.getClass();
        javaLanguage6.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.ObjectFactory objectFactory13 = javaLanguage6.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter3.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass5);
        javaLanguage1.load("foo/java/lang/String.java");
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage1.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = javaLanguage1.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage9.end_scenario();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage6.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
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
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage1.languageMixin;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage1.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage5.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage9.objectFactory;
        java.lang.Class class13 = javaLanguage9.loadClass("foo/java/lang/String.java");
        javaLanguage2.registerStepDefinitionsFor(class13);
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory16 = javaLanguage2.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter8.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass10);
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage7.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = javaLanguage7.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage1.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter8;
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        java.lang.String str14 = serializedObjectSupporter8.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage16.end_scenario();
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin6 = javaLanguage5.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory7 = javaLanguage5.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage3.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage6.serializedObjectSupporter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter2.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory3 = javaLanguage1.objectFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin2 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin2 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Class<?> wildcardClass11 = javaLanguage6.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter17.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter17.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass20 = serializedObjectSupporter17.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass20);
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage2.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory13 = serializedObjectSupporter9.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter9.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage18.end_scenario();
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter2.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter2.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter3.deserializeObjectString1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage9.objectFactory;
        java.lang.Class class13 = javaLanguage9.loadClass("foo/java/lang/String.java");
        javaLanguage2.registerStepDefinitionsFor(class13);
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter16.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory22 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage25.end_scenario();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter2 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter2.deserializeObjectObjectFactory2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter2;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = javaLanguage1.serializedObjectSupporter;
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.ObjectFactory objectFactory9 = javaLanguage8.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage9.objectFactory;
        java.lang.Class class13 = javaLanguage9.loadClass("foo/java/lang/String.java");
        javaLanguage2.registerStepDefinitionsFor(class13);
        javaLanguage2.load("foo/java/lang/String.java");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage2.end_scenario();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str7 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage12.end_scenario();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage3.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter6.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage5.end_scenario();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage2();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter7.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter9 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter9.deserializeObjectJavaLanguage2();
        javaLanguage8.serializedObjectSupporter = serializedObjectSupporter9;
        cuke4duke.internal.language.LanguageMixin languageMixin12 = javaLanguage8.languageMixin;
        javaLanguage8.load("foo/java/lang/String.java");
        java.lang.Class<?> wildcardClass15 = javaLanguage8.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter3.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass5);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.ObjectFactory objectFactory8 = javaLanguage1.objectFactory;
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage1.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin2 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin4 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin5 = javaLanguage1.languageMixin;
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str7 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString1();
        javaLanguage1.serializedObjectSupporter = serializedObjectSupporter6;
        cuke4duke.internal.java.PicoFactory picoFactory11 = serializedObjectSupporter6.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter6.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory3 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage4.end_scenario();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter7.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin10 = javaLanguage9.languageMixin;
        java.lang.Class<?> wildcardClass11 = javaLanguage9.getClass();
        javaLanguage6.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.language.LanguageMixin languageMixin13 = javaLanguage6.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter14 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str15 = serializedObjectSupporter14.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory16 = serializedObjectSupporter14.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter14.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass18 = serializedObjectSupporter14.getClass();
        javaLanguage6.registerStepDefinitionsFor((java.lang.Class) wildcardClass18);
        cuke4duke.internal.java.ObjectFactory objectFactory20 = javaLanguage6.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory21 = javaLanguage6.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage6.end_scenario();
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter4 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter4.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter4.deserializeObjectObjectFactory2();
        java.lang.Class<?> wildcardClass7 = picoFactory6.getClass();
        javaLanguage3.registerStepDefinitionsFor((java.lang.Class) wildcardClass7);
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
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter6 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter6.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory10 = serializedObjectSupporter6.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter6.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter6.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        javaLanguage5.serializedObjectSupporter = serializedObjectSupporter6;
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter6.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage15.end_scenario();
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory7 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.PicoFactory picoFactory8 = serializedObjectSupporter0.deserializeObjectObjectFactory1();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage11.end_scenario();
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.PicoFactory picoFactory1 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage3.end_scenario();
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin2 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.language.LanguageMixin languageMixin3 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.ObjectFactory objectFactory4 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter5 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter5.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str8 = serializedObjectSupporter7.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory9 = serializedObjectSupporter7.deserializeObjectObjectFactory2();
        javaLanguage6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Class<?> wildcardClass11 = javaLanguage6.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass11);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter13 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter13.deserializeObjectJavaLanguage2();
        cuke4duke.internal.language.LanguageMixin languageMixin16 = javaLanguage15.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter17 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter17.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter17.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass20 = serializedObjectSupporter17.getClass();
        javaLanguage15.registerStepDefinitionsFor((java.lang.Class) wildcardClass20);
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass20);
        cuke4duke.internal.language.LanguageMixin languageMixin23 = javaLanguage1.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter24 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.java.ObjectFactory objectFactory25 = javaLanguage1.getobjectFactory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter3.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter3;
        cuke4duke.internal.language.LanguageMixin languageMixin7 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter8.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory10 = javaLanguage9.getobjectFactory();
        cuke4duke.internal.java.ObjectFactory objectFactory11 = javaLanguage9.objectFactory;
        java.lang.Class class13 = javaLanguage9.loadClass("foo/java/lang/String.java");
        javaLanguage2.registerStepDefinitionsFor(class13);
        cuke4duke.internal.language.LanguageMixin languageMixin15 = javaLanguage2.getlanguageMixin();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter16 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str17 = serializedObjectSupporter16.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        java.lang.String str19 = serializedObjectSupporter16.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter16.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage21 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory22 = serializedObjectSupporter16.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage23 = serializedObjectSupporter16.deserializeObjectJavaLanguage1();
        javaLanguage2.serializedObjectSupporter = serializedObjectSupporter16;
        cuke4duke.internal.java.JavaLanguage javaLanguage25 = serializedObjectSupporter16.deserializeObjectJavaLanguage2();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage25.end_scenario();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory2 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.language.LanguageMixin languageMixin9 = javaLanguage8.getlanguageMixin();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage8.end_scenario();
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.PicoFactory picoFactory4 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.PicoFactory picoFactory6 = serializedObjectSupporter0.deserializeObjectObjectFactory2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter8 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter8.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter8.deserializeObjectString1();
        cuke4duke.internal.java.PicoFactory picoFactory12 = serializedObjectSupporter8.deserializeObjectObjectFactory2();
        javaLanguage7.serializedObjectSupporter = serializedObjectSupporter8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage7.end_scenario();
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.ObjectFactory objectFactory2 = javaLanguage1.getobjectFactory();
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter3 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter3.getClass();
        javaLanguage1.registerStepDefinitionsFor((java.lang.Class) wildcardClass5);
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter7 = javaLanguage1.serializedObjectSupporter;
        cuke4duke.internal.language.LanguageMixin languageMixin8 = javaLanguage1.languageMixin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javaLanguage1.end_scenario();
    }
}

