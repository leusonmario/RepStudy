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
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/String.java" + "'", str18, "foo/java/lang/String.java");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass19 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
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
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = javaLanguage9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
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
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass18 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str19 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage20 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/Strix.java" + "'", str19, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage20);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "foo/java/lang/Strix.java" + "'", str1, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str19 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/Strix.java" + "'", str18, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "foo/java/lang/Strix.java" + "'", str19, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = javaLanguage10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass16 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = javaLanguage8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass14 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
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
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage19 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass20 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/Strix.java" + "'", str17, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage18);
        org.junit.Assert.assertNull(javaLanguage19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage16);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/String.java" + "'", str2, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/Strix.java" + "'", str3, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str17 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/String.java" + "'", str16, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "foo/java/lang/String.java" + "'", str17, "foo/java/lang/String.java");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage18 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertNull(javaLanguage18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = javaLanguage11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/String.java" + "'", str14, "foo/java/lang/String.java");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str18 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass19 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/Strix.java" + "'", str15, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "foo/java/lang/Strix.java" + "'", str18, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str15 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str16 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "foo/java/lang/String.java" + "'", str15, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "foo/java/lang/Strix.java" + "'", str16, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass12 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage16 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage17 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage15);
        org.junit.Assert.assertNull(javaLanguage16);
        org.junit.Assert.assertNull(javaLanguage17);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/String.java" + "'", str6, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str14 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/Strix.java" + "'", str10, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "foo/java/lang/Strix.java" + "'", str14, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/String.java" + "'", str13, "foo/java/lang/String.java");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/String.java" + "'", str5, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.Class<?> wildcardClass10 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str13 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/String.java" + "'", str12, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "foo/java/lang/Strix.java" + "'", str13, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage14);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/String.java" + "'", str8, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/String.java" + "'", str9, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/String.java" + "'", str11, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/Strix.java" + "'", str7, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "foo/java/lang/Strix.java" + "'", str12, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage7 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage7);
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage2 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertNull(javaLanguage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/String.java" + "'", str4, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage4 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage6 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage10 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "foo/java/lang/String.java" + "'", str3, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "foo/java/lang/Strix.java" + "'", str5, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "foo/java/lang/Strix.java" + "'", str8, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "foo/java/lang/Strix.java" + "'", str9, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "foo/java/lang/Strix.java" + "'", str11, "foo/java/lang/Strix.java");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        cuke4duke.internal.java.SerializedObjectSupporter serializedObjectSupporter0 = new cuke4duke.internal.java.SerializedObjectSupporter();
        cuke4duke.internal.java.JavaLanguage javaLanguage1 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage3 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        cuke4duke.internal.java.JavaLanguage javaLanguage5 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage8 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage9 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        cuke4duke.internal.java.JavaLanguage javaLanguage11 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage12 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        cuke4duke.internal.java.JavaLanguage javaLanguage13 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage14 = serializedObjectSupporter0.deserializeObjectJavaLanguage1();
        cuke4duke.internal.java.JavaLanguage javaLanguage15 = serializedObjectSupporter0.deserializeObjectJavaLanguage2();
        org.junit.Assert.assertNull(javaLanguage1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "foo/java/lang/Strix.java" + "'", str2, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "foo/java/lang/Strix.java" + "'", str4, "foo/java/lang/Strix.java");
        org.junit.Assert.assertNull(javaLanguage5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "foo/java/lang/Strix.java" + "'", str6, "foo/java/lang/Strix.java");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "foo/java/lang/String.java" + "'", str7, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage8);
        org.junit.Assert.assertNull(javaLanguage9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "foo/java/lang/String.java" + "'", str10, "foo/java/lang/String.java");
        org.junit.Assert.assertNull(javaLanguage11);
        org.junit.Assert.assertNull(javaLanguage12);
        org.junit.Assert.assertNull(javaLanguage13);
        org.junit.Assert.assertNull(javaLanguage14);
        org.junit.Assert.assertNull(javaLanguage15);
    }
}

