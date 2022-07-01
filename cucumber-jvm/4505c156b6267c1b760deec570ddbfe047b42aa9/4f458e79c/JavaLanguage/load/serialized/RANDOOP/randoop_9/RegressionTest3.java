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
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = javaLanguage15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass17 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/String.java" + "'", str17, "foo/java/lang/String.java");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass20 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/String.java" + "'", str17, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/String.java" + "'", str18, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = javaLanguage4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/String.java" + "'", str18, "foo/java/lang/String.java");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass15 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/Strix.java" + "'", str18, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/String.java" + "'", str17, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage18);
        org.junit.Assert.assertNull(javaLanguage19);
        org.junit.Assert.assertNull(javaLanguage20);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/Strix.java" + "'", str18, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/String.java" + "'", str17, "foo/java/lang/String.java");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass15 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass16 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = javaLanguage7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/Strix.java" + "'", str18, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = javaLanguage17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass15 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass17 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = javaLanguage12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = javaLanguage3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/String.java" + "'", str1, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = javaLanguage13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass18 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass16 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass3 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

