import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass2 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.Archive archive3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap4 = explodedArchiveTests0.getEntriesMap(archive3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.Archive archive3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap4 = explodedArchiveTests0.getEntriesMap(archive3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.Archive archive5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap6 = explodedArchiveTests0.getEntriesMap(archive5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        java.lang.Class<?> wildcardClass13 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.lang.Class<?> wildcardClass7 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.InputStream inputStream14 = null;
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream14, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive3);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.Archive archive13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap14 = explodedArchiveTests0.getEntriesMap(archive13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass4 = temporaryFolder3.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.InputStream inputStream5 = null;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream3 = null;
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.setrootFolder(file2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.lang.Class<?> wildcardClass6 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.Archive archive20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap21 = explodedArchiveTests0.getEntriesMap(archive20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap3 = explodedArchiveTests0.getEntriesMap(archive2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.InputStream inputStream6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests6.archive = explodedArchive9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests6.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file14 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests13.archive;
        java.io.File file16 = null;
        explodedArchiveTests13.rootFolder = file16;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder18;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file14 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests13.archive;
        java.io.File file16 = null;
        explodedArchiveTests13.rootFolder = file16;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder18;
        java.lang.Class<?> wildcardClass20 = temporaryFolder18.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        org.springframework.boot.loader.archive.Archive archive14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap15 = explodedArchiveTests0.getEntriesMap(archive14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = explodedArchiveTests0.archive;
        java.io.InputStream inputStream4 = null;
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive3);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        java.io.File file11 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder12;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive8);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream4 = null;
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file16 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests15.archive;
        java.io.File file18 = null;
        explodedArchiveTests15.rootFolder = file18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests21.archive = explodedArchive22;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests21.temporaryFolder;
        java.io.File file25 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder26;
        explodedArchiveTests9.temporaryFolder = temporaryFolder26;
        explodedArchiveTests0.temporaryFolder = temporaryFolder26;
        org.springframework.boot.loader.archive.Archive archive30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap31 = explodedArchiveTests0.getEntriesMap(archive30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file16 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests15.archive;
        java.io.File file18 = null;
        explodedArchiveTests15.rootFolder = file18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests21.archive = explodedArchive22;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests21.temporaryFolder;
        java.io.File file25 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder26;
        explodedArchiveTests9.temporaryFolder = temporaryFolder26;
        explodedArchiveTests0.temporaryFolder = temporaryFolder26;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.Archive archive7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap8 = explodedArchiveTests0.getEntriesMap(archive7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        java.io.InputStream inputStream3 = null;
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = file7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        java.lang.Class<?> wildcardClass14 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests6.archive = explodedArchive9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests6.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.InputStream inputStream6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        java.io.InputStream inputStream17 = null;
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream17, outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.lang.Class<?> wildcardClass7 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.Archive archive9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap10 = explodedArchiveTests0.getEntriesMap(archive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        java.io.File file10 = explodedArchiveTests8.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        java.io.File file17 = explodedArchiveTests12.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests18.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests18.archive = explodedArchive21;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests18.setarchive(explodedArchive23);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        explodedArchiveTests18.settemporaryFolder(temporaryFolder26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests18.setarchive(explodedArchive28);
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests18.gettemporaryFolder();
        explodedArchiveTests12.settemporaryFolder(temporaryFolder30);
        explodedArchiveTests8.temporaryFolder = temporaryFolder30;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder30);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        java.lang.Class<?> wildcardClass24 = temporaryFolder22.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests17.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.temporaryFolder;
        java.io.File file21 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder22;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        java.lang.Class<?> wildcardClass11 = temporaryFolder9.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = file10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        java.io.InputStream inputStream13 = null;
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream13, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive3);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass14 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream19 = null;
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream19, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests13.gettemporaryFolder();
        java.io.File file16 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        java.lang.Class<?> wildcardClass19 = temporaryFolder17.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        java.io.InputStream inputStream9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.setrootFolder(file2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.Archive archive10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap11 = explodedArchiveTests0.getEntriesMap(archive10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.lang.Class<?> wildcardClass24 = temporaryFolder22.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        java.io.File file11 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder12;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        java.io.File file19 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream20 = null;
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream20, outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.getarchive();
        java.lang.Class<?> wildcardClass15 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.setrootFolder(file3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests6.archive = explodedArchive9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests6.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests25.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests25.archive = explodedArchive28;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests25.setarchive(explodedArchive30);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests25.setarchive(explodedArchive32);
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests25.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder34);
        org.springframework.boot.loader.archive.Archive archive36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap37 = explodedArchiveTests0.getEntriesMap(archive36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder34);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.Archive archive9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap10 = explodedArchiveTests0.getEntriesMap(archive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.Archive archive13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap14 = explodedArchiveTests0.getEntriesMap(archive13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.Archive archive8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap9 = explodedArchiveTests0.getEntriesMap(archive8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.Archive archive12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap13 = explodedArchiveTests0.getEntriesMap(archive12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file16 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests15.archive;
        java.io.File file18 = null;
        explodedArchiveTests15.rootFolder = file18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests21.archive = explodedArchive22;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests21.temporaryFolder;
        java.io.File file25 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder26;
        explodedArchiveTests9.temporaryFolder = temporaryFolder26;
        explodedArchiveTests0.temporaryFolder = temporaryFolder26;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests17.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.temporaryFolder;
        java.io.File file21 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder22;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.setarchive(explodedArchive15);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests8.archive;
        java.io.File file11 = null;
        explodedArchiveTests8.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        java.io.InputStream inputStream15 = null;
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream15, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        java.io.File file26 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        java.lang.Class<?> wildcardClass25 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive3);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap7 = explodedArchiveTests0.getEntriesMap(archive6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream19 = null;
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream19, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests6.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests6.getarchive();
        java.io.File file11 = null;
        explodedArchiveTests6.rootFolder = file11;
        java.io.File file13 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file15 = explodedArchiveTests14.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests14.archive;
        java.io.File file17 = null;
        explodedArchiveTests14.rootFolder = file17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests14.gettemporaryFolder();
        explodedArchiveTests6.temporaryFolder = temporaryFolder19;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder19);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests22.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests22.archive = explodedArchive25;
        java.io.File file27 = null;
        explodedArchiveTests22.setrootFolder(file27);
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests22.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file31 = explodedArchiveTests30.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = explodedArchiveTests30.archive;
        java.io.File file33 = null;
        explodedArchiveTests30.rootFolder = file33;
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests22.settemporaryFolder(temporaryFolder35);
        explodedArchiveTests0.temporaryFolder = temporaryFolder35;
        org.springframework.boot.loader.archive.Archive archive38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap39 = explodedArchiveTests0.getEntriesMap(archive38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(explodedArchive32);
        org.junit.Assert.assertNotNull(temporaryFolder35);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.Archive archive24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap25 = explodedArchiveTests0.getEntriesMap(archive24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file6 = explodedArchiveTests5.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests5.archive;
        java.io.File file8 = null;
        explodedArchiveTests5.rootFolder = file8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests5.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream5 = null;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests17.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.temporaryFolder;
        java.io.File file21 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder22;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        java.io.InputStream inputStream25 = null;
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream25, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.setrootFolder(file3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive24);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        java.io.File file19 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        java.io.InputStream inputStream22 = null;
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.setarchive(explodedArchive15);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests8.archive;
        java.io.File file11 = null;
        explodedArchiveTests8.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests17.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.temporaryFolder;
        java.io.File file21 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder22;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests8.archive;
        java.io.File file11 = null;
        explodedArchiveTests8.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        org.springframework.boot.loader.archive.Archive archive15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap16 = explodedArchiveTests0.getEntriesMap(archive15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        java.io.File file26 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = null;
        explodedArchiveTests25.archive = explodedArchive26;
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests25.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = explodedArchiveTests25.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests25.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder30;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(explodedArchive29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.archive = explodedArchive4;
        java.lang.Class<?> wildcardClass6 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests7.setarchive(explodedArchive12);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        explodedArchiveTests7.settemporaryFolder(temporaryFolder15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests17.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests17.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        explodedArchiveTests17.settemporaryFolder(temporaryFolder25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests17.setarchive(explodedArchive27);
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests7.settemporaryFolder(temporaryFolder29);
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.Archive archive11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap12 = explodedArchiveTests0.getEntriesMap(archive11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = file18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests6.archive = explodedArchive9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests6.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        java.io.File file20 = null;
        explodedArchiveTests0.setrootFolder(file20);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.Archive archive26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap27 = explodedArchiveTests0.getEntriesMap(archive26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests8.archive;
        java.io.File file11 = null;
        explodedArchiveTests8.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream16 = null;
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream16, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        java.lang.Class<?> wildcardClass26 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = null;
        explodedArchiveTests0.setrootFolder(file14);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        java.io.File file9 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        java.io.File file15 = explodedArchiveTests11.getrootFolder();
        java.io.File file16 = explodedArchiveTests11.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests11.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file20 = explodedArchiveTests19.getrootFolder();
        java.io.File file21 = explodedArchiveTests19.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests23.archive = explodedArchive24;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.temporaryFolder;
        java.io.File file27 = explodedArchiveTests23.getrootFolder();
        java.io.File file28 = explodedArchiveTests23.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests29.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests29.archive = explodedArchive32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests29.setarchive(explodedArchive34);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        explodedArchiveTests29.settemporaryFolder(temporaryFolder37);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests29.setarchive(explodedArchive39);
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests29.gettemporaryFolder();
        explodedArchiveTests23.settemporaryFolder(temporaryFolder41);
        explodedArchiveTests19.temporaryFolder = temporaryFolder41;
        explodedArchiveTests11.settemporaryFolder(temporaryFolder41);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = explodedArchiveTests45.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests47.gettemporaryFolder();
        explodedArchiveTests45.settemporaryFolder(temporaryFolder49);
        explodedArchiveTests11.settemporaryFolder(temporaryFolder49);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder49);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(explodedArchive46);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass19 = temporaryFolder18.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass26 = temporaryFolder25.getClass();
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.setarchive(explodedArchive11);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        org.springframework.boot.loader.archive.Archive archive9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap10 = explodedArchiveTests0.getEntriesMap(archive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file6 = explodedArchiveTests5.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests5.archive;
        java.io.File file8 = null;
        explodedArchiveTests5.rootFolder = file8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests5.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.InputStream inputStream13 = null;
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream13, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.lang.Class<?> wildcardClass5 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        java.io.File file19 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        java.io.InputStream inputStream8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        java.io.File file17 = explodedArchiveTests10.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests18.archive = explodedArchive19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests18.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests18.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file25 = explodedArchiveTests24.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests24.archive;
        java.io.File file27 = null;
        explodedArchiveTests24.rootFolder = file27;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests24.temporaryFolder = temporaryFolder35;
        explodedArchiveTests18.temporaryFolder = temporaryFolder35;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests38.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests38.gettemporaryFolder();
        explodedArchiveTests18.settemporaryFolder(temporaryFolder40);
        explodedArchiveTests10.settemporaryFolder(temporaryFolder40);
        explodedArchiveTests0.temporaryFolder = temporaryFolder40;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests7.setarchive(explodedArchive12);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        explodedArchiveTests7.settemporaryFolder(temporaryFolder15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests17.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests17.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        explodedArchiveTests17.settemporaryFolder(temporaryFolder25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests17.setarchive(explodedArchive27);
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests7.settemporaryFolder(temporaryFolder29);
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests6.archive = explodedArchive9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests6.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream22 = null;
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        java.io.File file14 = null;
        explodedArchiveTests9.setrootFolder(file14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file18 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests17.archive;
        java.io.File file20 = null;
        explodedArchiveTests17.rootFolder = file20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder22);
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests0.setarchive(explodedArchive9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        java.io.File file26 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream28 = null;
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream28, outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = null;
        explodedArchiveTests0.setrootFolder(file14);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream14 = null;
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream14, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests13.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder16);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests10.setarchive(explodedArchive18);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests20.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests20.archive = explodedArchive23;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests20.setarchive(explodedArchive25);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests20.settemporaryFolder(temporaryFolder28);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests20.temporaryFolder = temporaryFolder35;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder35);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder35);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests0.setarchive(explodedArchive9);
        java.io.InputStream inputStream11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap16 = explodedArchiveTests0.getEntriesMap(archive15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests6.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests6.getarchive();
        java.io.File file11 = null;
        explodedArchiveTests6.rootFolder = file11;
        java.io.File file13 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file15 = explodedArchiveTests14.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests14.archive;
        java.io.File file17 = null;
        explodedArchiveTests14.rootFolder = file17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests14.gettemporaryFolder();
        explodedArchiveTests6.temporaryFolder = temporaryFolder19;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder19);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = null;
        explodedArchiveTests0.setrootFolder(file14);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        java.io.File file7 = explodedArchiveTests3.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests3.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests3.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.InputStream inputStream7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.Archive archive8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap9 = explodedArchiveTests0.getEntriesMap(archive8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap17 = explodedArchiveTests0.getEntriesMap(archive16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        java.io.File file7 = explodedArchiveTests3.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests3.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests3.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass8 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.InputStream inputStream25 = null;
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream25, outputStream26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        java.io.File file26 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file26);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        java.lang.Class<?> wildcardClass9 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        java.io.File file12 = explodedArchiveTests9.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests13.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests20.archive = explodedArchive21;
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests17.settemporaryFolder(temporaryFolder23);
        explodedArchiveTests13.settemporaryFolder(temporaryFolder23);
        explodedArchiveTests9.settemporaryFolder(temporaryFolder23);
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests9.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder27;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        java.io.File file26 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file10 = explodedArchiveTests9.getrootFolder();
        java.io.File file11 = explodedArchiveTests9.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests13.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.temporaryFolder;
        java.io.File file17 = explodedArchiveTests13.getrootFolder();
        java.io.File file18 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests19.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests19.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests19.settemporaryFolder(temporaryFolder27);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests19.setarchive(explodedArchive29);
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests19.gettemporaryFolder();
        explodedArchiveTests13.settemporaryFolder(temporaryFolder31);
        explodedArchiveTests9.temporaryFolder = temporaryFolder31;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder31);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder31);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.archive = explodedArchive4;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.rootFolder = file6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.InputStream inputStream10 = null;
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        java.io.File file19 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests0.archive = explodedArchive31;
        java.io.InputStream inputStream33 = null;
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream33, outputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests0.archive = explodedArchive16;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.Archive archive7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap8 = explodedArchiveTests0.getEntriesMap(archive7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive15);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        java.io.File file15 = explodedArchiveTests11.getrootFolder();
        java.io.File file16 = null;
        explodedArchiveTests11.rootFolder = file16;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests11.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests11.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder20;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder20);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        java.io.File file9 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests7.setarchive(explodedArchive12);
        java.io.File file14 = null;
        explodedArchiveTests7.rootFolder = file14;
        java.io.File file16 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests18.archive = explodedArchive19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.temporaryFolder;
        java.io.File file22 = explodedArchiveTests18.getrootFolder();
        java.io.File file23 = explodedArchiveTests18.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests18.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        java.io.File file35 = explodedArchiveTests30.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests36.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests36.archive = explodedArchive39;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = null;
        explodedArchiveTests36.setarchive(explodedArchive41);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests43 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests43.temporaryFolder;
        explodedArchiveTests36.settemporaryFolder(temporaryFolder44);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests36.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests36.gettemporaryFolder();
        explodedArchiveTests30.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests26.temporaryFolder = temporaryFolder48;
        explodedArchiveTests18.settemporaryFolder(temporaryFolder48);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests52 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = explodedArchiveTests52.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests54 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests54.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests54.gettemporaryFolder();
        explodedArchiveTests52.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests18.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests7.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder56);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(explodedArchive53);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder56);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap5 = explodedArchiveTests0.getEntriesMap(archive4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests4.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests4.settemporaryFolder(temporaryFolder10);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        java.io.InputStream inputStream9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        java.io.InputStream inputStream10 = null;
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        java.io.File file15 = null;
        explodedArchiveTests0.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.archive = explodedArchive17;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNull(file3);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file3 = explodedArchiveTests2.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests2.archive;
        java.io.File file5 = null;
        explodedArchiveTests2.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        java.io.File file12 = explodedArchiveTests9.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests13.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests20.archive = explodedArchive21;
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests17.settemporaryFolder(temporaryFolder23);
        explodedArchiveTests13.settemporaryFolder(temporaryFolder23);
        explodedArchiveTests9.settemporaryFolder(temporaryFolder23);
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests9.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder27;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive5);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.setarchive(explodedArchive10);
        java.io.File file12 = null;
        explodedArchiveTests7.rootFolder = file12;
        java.io.File file14 = explodedArchiveTests7.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests15.archive = explodedArchive16;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests15.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests15.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = explodedArchiveTests15.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file22 = explodedArchiveTests21.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests21.archive;
        java.io.File file24 = null;
        explodedArchiveTests21.rootFolder = file24;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests27.archive = explodedArchive28;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.temporaryFolder;
        java.io.File file31 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests21.temporaryFolder = temporaryFolder32;
        explodedArchiveTests15.temporaryFolder = temporaryFolder32;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests35.gettemporaryFolder();
        explodedArchiveTests15.settemporaryFolder(temporaryFolder37);
        explodedArchiveTests7.settemporaryFolder(temporaryFolder37);
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder40;
        org.springframework.boot.loader.archive.Archive archive42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap43 = explodedArchiveTests0.getEntriesMap(archive42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNull(explodedArchive20);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder40);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests7.setarchive(explodedArchive12);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests7.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests16.archive = explodedArchive19;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests16.setarchive(explodedArchive21);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        explodedArchiveTests16.settemporaryFolder(temporaryFolder24);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = null;
        explodedArchiveTests16.setarchive(explodedArchive26);
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests7.temporaryFolder = temporaryFolder29;
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        org.springframework.boot.loader.archive.Archive archive32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap33 = explodedArchiveTests0.getEntriesMap(archive32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        java.io.File file26 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        java.io.File file10 = explodedArchiveTests8.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        java.io.File file17 = explodedArchiveTests12.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests18.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests18.archive = explodedArchive21;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests18.setarchive(explodedArchive23);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        explodedArchiveTests18.settemporaryFolder(temporaryFolder26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests18.setarchive(explodedArchive28);
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests18.gettemporaryFolder();
        explodedArchiveTests12.settemporaryFolder(temporaryFolder30);
        explodedArchiveTests8.temporaryFolder = temporaryFolder30;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder30);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests0.archive = explodedArchive31;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.temporaryFolder;
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.Archive archive7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap8 = explodedArchiveTests0.getEntriesMap(archive7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        java.io.InputStream inputStream9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.setrootFolder(file3);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        java.io.File file24 = null;
        explodedArchiveTests0.rootFolder = file24;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests15.setarchive(explodedArchive17);
        java.io.File file19 = explodedArchiveTests15.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file6 = explodedArchiveTests5.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests5.archive;
        java.io.File file8 = null;
        explodedArchiveTests5.rootFolder = file8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests5.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests6.archive = explodedArchive7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.temporaryFolder;
        java.io.File file10 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file5 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests4.archive;
        java.io.File file7 = null;
        explodedArchiveTests4.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests4.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        java.io.File file15 = null;
        explodedArchiveTests0.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.setarchive(explodedArchive17);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        java.io.File file19 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        java.io.File file9 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        java.io.File file15 = explodedArchiveTests11.getrootFolder();
        java.io.File file16 = explodedArchiveTests11.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests11.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file20 = explodedArchiveTests19.getrootFolder();
        java.io.File file21 = explodedArchiveTests19.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests23.archive = explodedArchive24;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.temporaryFolder;
        java.io.File file27 = explodedArchiveTests23.getrootFolder();
        java.io.File file28 = explodedArchiveTests23.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests29.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests29.archive = explodedArchive32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests29.setarchive(explodedArchive34);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        explodedArchiveTests29.settemporaryFolder(temporaryFolder37);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests29.setarchive(explodedArchive39);
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests29.gettemporaryFolder();
        explodedArchiveTests23.settemporaryFolder(temporaryFolder41);
        explodedArchiveTests19.temporaryFolder = temporaryFolder41;
        explodedArchiveTests11.settemporaryFolder(temporaryFolder41);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = explodedArchiveTests45.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests47.gettemporaryFolder();
        explodedArchiveTests45.settemporaryFolder(temporaryFolder49);
        explodedArchiveTests11.settemporaryFolder(temporaryFolder49);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder49);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(explodedArchive46);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(explodedArchive14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive5);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests0.archive;
        java.io.InputStream inputStream28 = null;
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream28, outputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(explodedArchive27);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file8);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.Archive archive9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap10 = explodedArchiveTests0.getEntriesMap(archive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests22.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests22.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests22.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder27);
        java.io.InputStream inputStream30 = null;
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream30, outputStream31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests11.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests4.settemporaryFolder(temporaryFolder14);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.setarchive(explodedArchive20);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive19);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests10.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests10.rootFolder = file15;
        java.io.File file17 = explodedArchiveTests10.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests18.archive = explodedArchive19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests18.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests18.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file25 = explodedArchiveTests24.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests24.archive;
        java.io.File file27 = null;
        explodedArchiveTests24.rootFolder = file27;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests24.temporaryFolder = temporaryFolder35;
        explodedArchiveTests18.temporaryFolder = temporaryFolder35;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests38.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests38.gettemporaryFolder();
        explodedArchiveTests18.settemporaryFolder(temporaryFolder40);
        explodedArchiveTests10.settemporaryFolder(temporaryFolder40);
        explodedArchiveTests0.temporaryFolder = temporaryFolder40;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        java.lang.Class<?> wildcardClass7 = temporaryFolder6.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests13.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder16);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests10.setarchive(explodedArchive18);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests20.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests20.archive = explodedArchive23;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests20.setarchive(explodedArchive25);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests20.settemporaryFolder(temporaryFolder28);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests20.temporaryFolder = temporaryFolder35;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder35);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder35);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        java.io.File file9 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream10 = null;
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests4.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests4.temporaryFolder;
        java.io.File file8 = explodedArchiveTests4.getrootFolder();
        java.io.File file9 = explodedArchiveTests4.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests10.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests4.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file11 = explodedArchiveTests10.getrootFolder();
        java.io.File file12 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests14.archive = explodedArchive15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests14.temporaryFolder;
        java.io.File file18 = explodedArchiveTests14.getrootFolder();
        java.io.File file19 = explodedArchiveTests14.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests20.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests20.archive = explodedArchive23;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests20.setarchive(explodedArchive25);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests20.settemporaryFolder(temporaryFolder28);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests20.setarchive(explodedArchive30);
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests20.gettemporaryFolder();
        explodedArchiveTests14.settemporaryFolder(temporaryFolder32);
        explodedArchiveTests10.temporaryFolder = temporaryFolder32;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder32);
        org.springframework.boot.loader.archive.Archive archive36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap37 = explodedArchiveTests0.getEntriesMap(archive36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder32);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests0.archive = explodedArchive31;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.Archive archive6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap7 = explodedArchiveTests0.getEntriesMap(archive6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests9.archive = explodedArchive10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file16 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests15.archive;
        java.io.File file18 = null;
        explodedArchiveTests15.rootFolder = file18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests21.archive = explodedArchive22;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests21.temporaryFolder;
        java.io.File file25 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder26;
        explodedArchiveTests9.temporaryFolder = temporaryFolder26;
        explodedArchiveTests0.temporaryFolder = temporaryFolder26;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests0.temporaryFolder;
        java.io.File file31 = null;
        explodedArchiveTests0.setrootFolder(file31);
        java.io.InputStream inputStream33 = null;
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream33, outputStream34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests9.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests9.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests22.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests22.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests22.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder27);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder29;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        org.springframework.boot.loader.archive.Archive archive9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap10 = explodedArchiveTests0.getEntriesMap(archive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file9 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests8.archive;
        java.io.File file11 = null;
        explodedArchiveTests8.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests26.archive = explodedArchive27;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests26.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests26.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file33 = explodedArchiveTests32.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = explodedArchiveTests32.archive;
        java.io.File file35 = null;
        explodedArchiveTests32.rootFolder = file35;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests32.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests38.archive = explodedArchive39;
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests38.temporaryFolder;
        java.io.File file42 = explodedArchiveTests38.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests38.temporaryFolder;
        explodedArchiveTests32.temporaryFolder = temporaryFolder43;
        explodedArchiveTests26.temporaryFolder = temporaryFolder43;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests26.archive = explodedArchive46;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = null;
        explodedArchiveTests26.archive = explodedArchive48;
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder50);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(explodedArchive34);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder50);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.getarchive();
        java.io.InputStream inputStream3 = null;
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream3, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive2);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests7.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests7.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests7.setarchive(explodedArchive12);
        java.io.File file14 = null;
        explodedArchiveTests7.rootFolder = file14;
        java.io.File file16 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests18.archive = explodedArchive19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.temporaryFolder;
        java.io.File file22 = explodedArchiveTests18.getrootFolder();
        java.io.File file23 = explodedArchiveTests18.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests18.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file27 = explodedArchiveTests26.getrootFolder();
        java.io.File file28 = explodedArchiveTests26.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests30.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.temporaryFolder;
        java.io.File file34 = explodedArchiveTests30.getrootFolder();
        java.io.File file35 = explodedArchiveTests30.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests36.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests36.archive = explodedArchive39;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = null;
        explodedArchiveTests36.setarchive(explodedArchive41);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests43 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests43.temporaryFolder;
        explodedArchiveTests36.settemporaryFolder(temporaryFolder44);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests36.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests36.gettemporaryFolder();
        explodedArchiveTests30.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests26.temporaryFolder = temporaryFolder48;
        explodedArchiveTests18.settemporaryFolder(temporaryFolder48);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests52 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = explodedArchiveTests52.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests54 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests54.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests54.gettemporaryFolder();
        explodedArchiveTests52.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests18.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests7.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder56);
        java.lang.Class<?> wildcardClass61 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(explodedArchive53);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        java.io.InputStream inputStream12 = null;
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream12, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.getarchive();
        java.io.File file14 = explodedArchiveTests0.rootFolder;
        java.lang.Class<?> wildcardClass15 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        java.io.File file17 = explodedArchiveTests12.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests12.setarchive(explodedArchive18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = explodedArchiveTests12.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder21;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(explodedArchive20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive15);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.InputStream inputStream6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests2 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests2.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests2.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder4);
        java.lang.Class<?> wildcardClass6 = temporaryFolder4.getClass();
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = explodedArchive6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests3 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests3.archive = explodedArchive4;
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests3.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests10.archive = explodedArchive13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder18);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests20.archive = explodedArchive21;
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests20.temporaryFolder;
        java.io.File file24 = explodedArchiveTests20.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder25;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        java.io.File file28 = null;
        explodedArchiveTests0.rootFolder = file28;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file10 = null;
        explodedArchiveTests0.rootFolder = file10;
        java.lang.Class<?> wildcardClass12 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.lang.Class<?> wildcardClass3 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file1 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = explodedArchiveTests0.archive;
        java.io.File file3 = null;
        explodedArchiveTests0.rootFolder = file3;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = file7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file1);
        org.junit.Assert.assertNull(explodedArchive2);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder2 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.archive = explodedArchive3;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder2);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(explodedArchive11);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        java.io.File file7 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests6.archive;
        java.io.File file9 = null;
        explodedArchiveTests6.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests12.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.temporaryFolder;
        java.io.File file16 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests6.temporaryFolder = temporaryFolder17;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        java.io.File file24 = null;
        explodedArchiveTests0.setrootFolder(file24);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = null;
        explodedArchiveTests0.archive = explodedArchive1;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNull(file7);
    }
}

