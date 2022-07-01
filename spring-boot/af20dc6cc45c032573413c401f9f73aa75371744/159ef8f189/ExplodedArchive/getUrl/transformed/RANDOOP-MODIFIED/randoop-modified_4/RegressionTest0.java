import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL4 = new java.net.URL("", "", (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.jar.Manifest manifest1 = new java.util.jar.Manifest(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry1 = explodedArchive0.new FileEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.springframework.boot.loader.archive.ExplodedArchive$FileEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler1 = explodedArchive0.new FilteredURLStreamHandler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.springframework.boot.loader.archive.ExplodedArchive$FilteredURLStreamHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = new org.springframework.boot.loader.archive.ExplodedArchive(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.loader.util.AsciiBytes asciiBytes4 = new org.springframework.boot.loader.util.AsciiBytes(byteArray1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        java.io.File file2 = new java.io.File("", "");
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "/");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL3 = new java.net.URL("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: ");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        java.util.jar.Manifest manifest0 = new java.util.jar.Manifest();
    }
}

