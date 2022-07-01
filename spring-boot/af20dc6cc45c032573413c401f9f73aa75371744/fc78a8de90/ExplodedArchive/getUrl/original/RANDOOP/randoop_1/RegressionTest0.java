import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) 'a', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = new org.springframework.boot.loader.archive.ExplodedArchive(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL1 = new java.net.URL("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.net.URLStreamHandlerFactory uRLStreamHandlerFactory0 = null;
        java.net.URL.setURLStreamHandlerFactory(uRLStreamHandlerFactory0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = new org.springframework.boot.loader.archive.ExplodedArchive(file0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.net.URL uRL0 = null;
        java.net.URLStreamHandler uRLStreamHandler2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL(uRL0, "hi!", uRLStreamHandler2);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) '#', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = new org.springframework.boot.loader.archive.ExplodedArchive(file0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = new java.net.URL(uRL0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) '#', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) '4', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (-1), "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) 'a', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) '4', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (-1), "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (-1), "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) ' ', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) ' ', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (-1), "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) 'a', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) '4', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (-1), "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) '4', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) ' ', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) '4', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) '#', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) '4', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) 'a', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (-1), "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) '#', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) '4', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) '#', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) 'a', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) 'a', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) 'a', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) ' ', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) '#', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) ' ', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 0, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) ' ', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (-1), "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (-1), "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) '#', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (-1), "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (byte) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (-1), "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) 100, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) ' ', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (int) (short) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (byte) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", (-1), "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (-1), "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) 10, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) 1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) ' ', "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "hi!", (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", 10, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (short) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "", (int) (short) 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "", (int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) '#', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "", (int) (byte) -1, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) 'a', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("", "hi!", 100, "hi!", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (short) 0, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) '4', "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("hi!", "hi!", (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.net.URLStreamHandler uRLStreamHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL5 = new java.net.URL("hi!", "hi!", (int) (byte) -1, "", uRLStreamHandler4);
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: hi!");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }
}

