import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder9);
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        java.io.File file19 = explodedArchiveTests16.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests16.setarchive(explodedArchive20);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests16.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests16.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests16.archive = explodedArchive24;
        java.io.File file26 = explodedArchiveTests16.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = null;
        explodedArchiveTests27.rootFolder = file29;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = explodedArchiveTests27.getarchive();
        java.io.File file33 = null;
        explodedArchiveTests27.setrootFolder(file33);
        java.io.File file35 = explodedArchiveTests27.rootFolder;
        java.io.File file36 = null;
        explodedArchiveTests27.rootFolder = file36;
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests27.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests16.settemporaryFolder(temporaryFolder40);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder40);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(explodedArchive32);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(explodedArchive43);
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        java.io.File file15 = explodedArchiveTests12.rootFolder;
        java.io.File file16 = explodedArchiveTests12.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests12.setarchive(explodedArchive17);
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests6.temporaryFolder = temporaryFolder19;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder19);
        java.io.File file22 = null;
        explodedArchiveTests0.setrootFolder(file22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests0.getarchive();
        java.io.File file25 = null;
        explodedArchiveTests0.rootFolder = file25;
        java.io.File file27 = null;
        explodedArchiveTests0.setrootFolder(file27);
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests0.temporaryFolder;
        java.io.File file31 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getFilteredArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder6;
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.setrootFolder(file9);
        java.io.File file11 = explodedArchiveTests0.getrootFolder();
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(temporaryFolder13);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.getrootFolder();
        java.io.File file10 = explodedArchiveTests6.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder11);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.getarchive();
        java.io.File file16 = null;
        explodedArchiveTests0.rootFolder = file16;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive15);
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder13 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(explodedArchive11);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder10);
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        java.io.File file15 = explodedArchiveTests12.rootFolder;
        java.io.File file16 = explodedArchiveTests12.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests12.setarchive(explodedArchive17);
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests6.temporaryFolder = temporaryFolder19;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder19);
        java.io.File file22 = null;
        explodedArchiveTests0.setrootFolder(file22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests0.archive = explodedArchive25;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests27.gettemporaryFolder();
        java.io.File file34 = explodedArchiveTests27.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        java.io.File file38 = explodedArchiveTests35.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.temporaryFolder;
        explodedArchiveTests27.temporaryFolder = temporaryFolder39;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder39);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = null;
        explodedArchiveTests0.archive = explodedArchive42;
        java.io.File file44 = null;
        explodedArchiveTests0.setrootFolder(file44);
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file47 = null;
        explodedArchiveTests0.setrootFolder(file47);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder46);
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(explodedArchive11);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        java.io.File file16 = explodedArchiveTests9.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests9.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder20);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        java.io.File file23 = null;
        explodedArchiveTests0.rootFolder = file23;
        java.io.File file25 = null;
        explodedArchiveTests0.setrootFolder(file25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests0.archive = explodedArchive27;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests0.archive = explodedArchive29;
        java.io.File file31 = null;
        explodedArchiveTests0.rootFolder = file31;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder20);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
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
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.temporaryFolder;
        java.io.File file16 = null;
        explodedArchiveTests0.rootFolder = file16;
        java.io.File file18 = null;
        explodedArchiveTests0.rootFolder = file18;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.getrootFolder();
        java.io.File file23 = explodedArchiveTests20.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests20.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests20.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests20.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests20.archive = explodedArchive28;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests20.setarchive(explodedArchive30);
        java.io.File file32 = null;
        explodedArchiveTests20.rootFolder = file32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = explodedArchiveTests20.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder35;
        java.lang.Class<?> wildcardClass37 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNull(explodedArchive34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.getrootFolder();
        java.io.File file22 = explodedArchiveTests19.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        explodedArchiveTests19.settemporaryFolder(temporaryFolder24);
        explodedArchiveTests13.temporaryFolder = temporaryFolder24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests13.getarchive();
        java.io.File file28 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests29.gettemporaryFolder();
        java.io.File file36 = explodedArchiveTests29.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = null;
        explodedArchiveTests29.setarchive(explodedArchive37);
        java.io.File file39 = explodedArchiveTests29.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests29.gettemporaryFolder();
        java.io.File file41 = null;
        explodedArchiveTests29.rootFolder = file41;
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests29.temporaryFolder;
        explodedArchiveTests13.temporaryFolder = temporaryFolder43;
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests13.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder46;
        java.io.File file48 = null;
        explodedArchiveTests0.rootFolder = file48;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder10 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file13 = null;
        explodedArchiveTests0.rootFolder = file13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = null;
        explodedArchiveTests17.rootFolder = file19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests17.getarchive();
        java.io.File file23 = null;
        explodedArchiveTests17.setrootFolder(file23);
        java.io.File file25 = explodedArchiveTests17.rootFolder;
        java.io.File file26 = explodedArchiveTests17.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests17.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests17.archive = explodedArchive28;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests17.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests17.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests17.archive = explodedArchive32;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests34 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests34.temporaryFolder;
        java.io.File file36 = explodedArchiveTests34.getrootFolder();
        java.io.File file37 = explodedArchiveTests34.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests34.temporaryFolder;
        java.io.File file39 = explodedArchiveTests34.getrootFolder();
        java.io.File file40 = explodedArchiveTests34.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests34.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests34.temporaryFolder;
        explodedArchiveTests17.temporaryFolder = temporaryFolder42;
        explodedArchiveTests0.temporaryFolder = temporaryFolder42;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNull(explodedArchive41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests12.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests12.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests12.archive;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file26 = explodedArchiveTests12.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests12.settemporaryFolder(temporaryFolder33);
        java.io.File file35 = null;
        explodedArchiveTests12.rootFolder = file35;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests38.temporaryFolder;
        java.io.File file40 = explodedArchiveTests38.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests38.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests38.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests38.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = null;
        explodedArchiveTests38.setarchive(explodedArchive44);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests46 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests46.temporaryFolder;
        java.io.File file48 = explodedArchiveTests46.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests46.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = null;
        explodedArchiveTests46.setarchive(explodedArchive53);
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests46.gettemporaryFolder();
        explodedArchiveTests38.settemporaryFolder(temporaryFolder55);
        java.io.File file57 = null;
        explodedArchiveTests38.setrootFolder(file57);
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests38.temporaryFolder;
        explodedArchiveTests12.temporaryFolder = temporaryFolder59;
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder61;
        java.io.File file63 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNull(file63);
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file13 = null;
        explodedArchiveTests0.rootFolder = file13;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.archive = explodedArchive15;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests0.rootFolder = file15;
        java.io.File file17 = null;
        explodedArchiveTests0.rootFolder = file17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests0.setarchive(explodedArchive19);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        java.io.File file18 = explodedArchiveTests15.rootFolder;
        java.io.File file19 = explodedArchiveTests15.rootFolder;
        java.io.File file20 = null;
        explodedArchiveTests15.setrootFolder(file20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests15.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.rootFolder = file24;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        java.io.File file28 = explodedArchiveTests26.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        java.io.File file35 = explodedArchiveTests32.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        explodedArchiveTests32.settemporaryFolder(temporaryFolder37);
        explodedArchiveTests26.temporaryFolder = temporaryFolder37;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = explodedArchiveTests26.getarchive();
        java.io.File file41 = explodedArchiveTests26.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests42 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests42.temporaryFolder;
        java.io.File file44 = explodedArchiveTests42.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = null;
        explodedArchiveTests42.setarchive(explodedArchive45);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = explodedArchiveTests42.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests48 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests48.temporaryFolder;
        java.io.File file50 = explodedArchiveTests48.getrootFolder();
        java.io.File file51 = explodedArchiveTests48.getrootFolder();
        java.io.File file52 = explodedArchiveTests48.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests48.gettemporaryFolder();
        explodedArchiveTests42.settemporaryFolder(temporaryFolder53);
        explodedArchiveTests26.temporaryFolder = temporaryFolder53;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = explodedArchiveTests26.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = explodedArchiveTests26.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        java.io.File file61 = explodedArchiveTests59.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests59.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests59.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests59.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests59.gettemporaryFolder();
        java.io.File file66 = explodedArchiveTests59.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests59.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests59.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive69 = null;
        explodedArchiveTests59.setarchive(explodedArchive69);
        org.junit.rules.TemporaryFolder temporaryFolder71 = explodedArchiveTests59.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests72 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests72.temporaryFolder;
        java.io.File file74 = explodedArchiveTests72.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests72.gettemporaryFolder();
        java.io.File file76 = null;
        explodedArchiveTests72.rootFolder = file76;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive78 = explodedArchiveTests72.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder79 = explodedArchiveTests72.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder80 = explodedArchiveTests72.gettemporaryFolder();
        explodedArchiveTests59.settemporaryFolder(temporaryFolder80);
        java.io.File file82 = explodedArchiveTests59.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder83 = explodedArchiveTests59.temporaryFolder;
        explodedArchiveTests26.temporaryFolder = temporaryFolder83;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder83);
        org.junit.rules.TemporaryFolder temporaryFolder86 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getFilteredArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNull(explodedArchive40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(explodedArchive47);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNull(explodedArchive56);
        org.junit.Assert.assertNull(explodedArchive57);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNull(file61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder71);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNull(file74);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNull(explodedArchive78);
        org.junit.Assert.assertNotNull(temporaryFolder79);
        org.junit.Assert.assertNotNull(temporaryFolder80);
        org.junit.Assert.assertNull(file82);
        org.junit.Assert.assertNotNull(temporaryFolder83);
        org.junit.Assert.assertNotNull(temporaryFolder86);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.setarchive(explodedArchive14);
        java.io.File file16 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        java.io.File file20 = explodedArchiveTests17.rootFolder;
        java.io.File file21 = explodedArchiveTests17.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests17.setarchive(explodedArchive22);
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests17.gettemporaryFolder();
        java.io.File file25 = explodedArchiveTests17.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests17.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests17.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests28 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests28.temporaryFolder;
        java.io.File file30 = explodedArchiveTests28.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests28.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests28.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests28.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests34 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests34.temporaryFolder;
        java.io.File file36 = explodedArchiveTests34.getrootFolder();
        java.io.File file37 = explodedArchiveTests34.rootFolder;
        java.io.File file38 = explodedArchiveTests34.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests34.setarchive(explodedArchive39);
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests34.gettemporaryFolder();
        explodedArchiveTests28.temporaryFolder = temporaryFolder41;
        explodedArchiveTests17.temporaryFolder = temporaryFolder41;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder41);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = null;
        explodedArchiveTests0.archive = explodedArchive45;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder41);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests16.setarchive(explodedArchive23);
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests16.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests12.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests12.getarchive();
        java.io.File file18 = null;
        explodedArchiveTests12.setrootFolder(file18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests12.setarchive(explodedArchive20);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests22.gettemporaryFolder();
        java.io.File file26 = null;
        explodedArchiveTests22.rootFolder = file26;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = explodedArchiveTests22.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests22.gettemporaryFolder();
        java.io.File file30 = null;
        explodedArchiveTests22.setrootFolder(file30);
        java.io.File file32 = null;
        explodedArchiveTests22.rootFolder = file32;
        java.io.File file34 = explodedArchiveTests22.rootFolder;
        java.io.File file35 = explodedArchiveTests22.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests22.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        java.io.File file40 = explodedArchiveTests37.rootFolder;
        java.io.File file41 = explodedArchiveTests37.rootFolder;
        java.io.File file42 = null;
        explodedArchiveTests37.setrootFolder(file42);
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests37.temporaryFolder;
        explodedArchiveTests22.settemporaryFolder(temporaryFolder44);
        explodedArchiveTests12.settemporaryFolder(temporaryFolder44);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = null;
        explodedArchiveTests12.archive = explodedArchive47;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests49 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests49.temporaryFolder;
        java.io.File file51 = explodedArchiveTests49.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests49.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = null;
        explodedArchiveTests49.setarchive(explodedArchive56);
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests49.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = null;
        explodedArchiveTests49.setarchive(explodedArchive59);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = explodedArchiveTests49.archive;
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests49.gettemporaryFolder();
        java.io.File file63 = explodedArchiveTests49.rootFolder;
        java.io.File file64 = null;
        explodedArchiveTests49.rootFolder = file64;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests66 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests66.temporaryFolder;
        java.io.File file68 = null;
        explodedArchiveTests66.rootFolder = file68;
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests66.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests71 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests71.temporaryFolder;
        java.io.File file73 = explodedArchiveTests71.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder74 = explodedArchiveTests71.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests71.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder76 = explodedArchiveTests71.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder77 = explodedArchiveTests71.temporaryFolder;
        java.io.File file78 = null;
        explodedArchiveTests71.setrootFolder(file78);
        org.junit.rules.TemporaryFolder temporaryFolder80 = explodedArchiveTests71.gettemporaryFolder();
        explodedArchiveTests66.settemporaryFolder(temporaryFolder80);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive82 = explodedArchiveTests66.archive;
        org.junit.rules.TemporaryFolder temporaryFolder83 = explodedArchiveTests66.temporaryFolder;
        explodedArchiveTests49.settemporaryFolder(temporaryFolder83);
        explodedArchiveTests12.temporaryFolder = temporaryFolder83;
        org.junit.rules.TemporaryFolder temporaryFolder86 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder86;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(explodedArchive28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNull(explodedArchive61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNull(file63);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNull(file73);
        org.junit.Assert.assertNotNull(temporaryFolder74);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNotNull(temporaryFolder76);
        org.junit.Assert.assertNotNull(temporaryFolder77);
        org.junit.Assert.assertNotNull(temporaryFolder80);
        org.junit.Assert.assertNull(explodedArchive82);
        org.junit.Assert.assertNotNull(temporaryFolder83);
        org.junit.Assert.assertNotNull(temporaryFolder86);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder11);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(explodedArchive15);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        java.io.File file16 = null;
        explodedArchiveTests0.setrootFolder(file16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive19);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests17.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests17.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests17.settemporaryFolder(temporaryFolder30);
        explodedArchiveTests9.temporaryFolder = temporaryFolder30;
        explodedArchiveTests0.temporaryFolder = temporaryFolder30;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests0.setarchive(explodedArchive35);
        java.io.File file37 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(explodedArchive38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        java.io.File file14 = null;
        explodedArchiveTests0.setrootFolder(file14);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests5.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests5.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests0.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder27);
        java.io.File file29 = explodedArchiveTests0.rootFolder;
        java.io.File file30 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(explodedArchive31);
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file14 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests15.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder21);
        java.io.File file23 = null;
        explodedArchiveTests0.rootFolder = file23;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        java.io.File file28 = explodedArchiveTests26.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests26.setarchive(explodedArchive32);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests34 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests34.temporaryFolder;
        java.io.File file36 = explodedArchiveTests34.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests34.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests34.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests34.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests34.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = null;
        explodedArchiveTests34.setarchive(explodedArchive41);
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests34.gettemporaryFolder();
        explodedArchiveTests26.settemporaryFolder(temporaryFolder43);
        java.io.File file45 = null;
        explodedArchiveTests26.setrootFolder(file45);
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder47;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive49 = null;
        explodedArchiveTests0.archive = explodedArchive49;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests54 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests54.temporaryFolder;
        java.io.File file56 = null;
        explodedArchiveTests54.rootFolder = file56;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive58 = explodedArchiveTests54.archive;
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests54.gettemporaryFolder();
        java.io.File file60 = explodedArchiveTests54.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = null;
        explodedArchiveTests54.setarchive(explodedArchive61);
        java.io.File file63 = explodedArchiveTests54.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests64 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests64.temporaryFolder;
        java.io.File file66 = explodedArchiveTests64.getrootFolder();
        java.io.File file67 = explodedArchiveTests64.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests64.temporaryFolder;
        java.io.File file69 = explodedArchiveTests64.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive70 = explodedArchiveTests64.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive71 = null;
        explodedArchiveTests64.setarchive(explodedArchive71);
        java.io.File file73 = explodedArchiveTests64.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive74 = explodedArchiveTests64.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests75 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder76 = explodedArchiveTests75.temporaryFolder;
        java.io.File file77 = explodedArchiveTests75.getrootFolder();
        java.io.File file78 = explodedArchiveTests75.rootFolder;
        java.io.File file79 = explodedArchiveTests75.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder80 = explodedArchiveTests75.gettemporaryFolder();
        java.io.File file81 = explodedArchiveTests75.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder82 = explodedArchiveTests75.temporaryFolder;
        explodedArchiveTests64.temporaryFolder = temporaryFolder82;
        org.junit.rules.TemporaryFolder temporaryFolder84 = explodedArchiveTests64.temporaryFolder;
        explodedArchiveTests54.settemporaryFolder(temporaryFolder84);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder84);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNull(explodedArchive51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(explodedArchive58);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNull(file63);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNull(file67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNull(file69);
        org.junit.Assert.assertNull(explodedArchive70);
        org.junit.Assert.assertNull(file73);
        org.junit.Assert.assertNull(explodedArchive74);
        org.junit.Assert.assertNotNull(temporaryFolder76);
        org.junit.Assert.assertNull(file77);
        org.junit.Assert.assertNull(file78);
        org.junit.Assert.assertNull(file79);
        org.junit.Assert.assertNotNull(temporaryFolder80);
        org.junit.Assert.assertNull(file81);
        org.junit.Assert.assertNotNull(temporaryFolder82);
        org.junit.Assert.assertNotNull(temporaryFolder84);
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.setarchive(explodedArchive14);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder9);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests0.archive = explodedArchive18;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = null;
        explodedArchiveTests20.rootFolder = file22;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests20.temporaryFolder;
        java.io.File file25 = null;
        explodedArchiveTests20.rootFolder = file25;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests20.archive = explodedArchive27;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests20.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests20.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests20.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder31;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests0.archive = explodedArchive33;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive11);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        java.io.File file18 = explodedArchiveTests15.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests15.setarchive(explodedArchive19);
        java.io.File file21 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests15.archive = explodedArchive22;
        java.io.File file24 = null;
        explodedArchiveTests15.rootFolder = file24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests15.getarchive();
        java.io.File file27 = null;
        explodedArchiveTests15.rootFolder = file27;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests29.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests29.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = null;
        explodedArchiveTests29.setarchive(explodedArchive36);
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests29.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests29.setarchive(explodedArchive39);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests29.archive;
        java.io.File file42 = explodedArchiveTests29.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests29.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder43;
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests15.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder45;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(explodedArchive41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder45);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.getrootFolder();
        java.io.File file17 = explodedArchiveTests14.getrootFolder();
        java.io.File file18 = explodedArchiveTests14.rootFolder;
        java.io.File file19 = explodedArchiveTests14.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests14.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests14.archive;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests14.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests23.gettemporaryFolder();
        java.io.File file30 = explodedArchiveTests23.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests23.setarchive(explodedArchive31);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests33 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests33.temporaryFolder;
        java.io.File file35 = explodedArchiveTests33.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests33.gettemporaryFolder();
        explodedArchiveTests23.settemporaryFolder(temporaryFolder36);
        explodedArchiveTests14.temporaryFolder = temporaryFolder36;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder36);
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder40);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests0.setarchive(explodedArchive9);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(explodedArchive11);
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.archive = explodedArchive14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder16);
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.getarchive();
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder11);
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests0.setarchive(explodedArchive18);
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests0.temporaryFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests11.temporaryFolder;
        java.io.File file13 = explodedArchiveTests11.getrootFolder();
        java.io.File file14 = explodedArchiveTests11.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        explodedArchiveTests11.settemporaryFolder(temporaryFolder16);
        explodedArchiveTests5.temporaryFolder = temporaryFolder16;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        explodedArchiveTests5.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests5.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests5.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        java.io.File file27 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests0.setarchive(explodedArchive28);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file27);
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file16 = null;
        explodedArchiveTests12.rootFolder = file16;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests12.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder19;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive21);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.archive = explodedArchive7;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = null;
        explodedArchiveTests12.rootFolder = file14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests12.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests12.archive;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests12.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder19;
        java.io.File file21 = explodedArchiveTests0.rootFolder;
        java.io.File file22 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        java.io.File file26 = explodedArchiveTests23.rootFolder;
        java.io.File file27 = explodedArchiveTests23.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = explodedArchiveTests23.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests30.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests30.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests23.temporaryFolder = temporaryFolder36;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests38.temporaryFolder;
        java.io.File file40 = null;
        explodedArchiveTests38.rootFolder = file40;
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests38.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests38.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = explodedArchiveTests38.archive;
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests38.temporaryFolder;
        explodedArchiveTests23.settemporaryFolder(temporaryFolder45);
        explodedArchiveTests0.temporaryFolder = temporaryFolder45;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests49 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests49.temporaryFolder;
        java.io.File file51 = explodedArchiveTests49.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests49.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = explodedArchiveTests49.archive;
        java.io.File file57 = explodedArchiveTests49.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests49.temporaryFolder;
        java.io.File file59 = null;
        explodedArchiveTests49.rootFolder = file59;
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests49.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder61);
        java.io.File file63 = null;
        explodedArchiveTests0.setrootFolder(file63);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(explodedArchive29);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(explodedArchive43);
        org.junit.Assert.assertNull(explodedArchive44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNull(explodedArchive48);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(explodedArchive56);
        org.junit.Assert.assertNull(file57);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNotNull(temporaryFolder61);
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        java.io.File file11 = explodedArchiveTests8.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests8.setarchive(explodedArchive12);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests8.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests16.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests24.setarchive(explodedArchive31);
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests24.gettemporaryFolder();
        explodedArchiveTests16.settemporaryFolder(temporaryFolder33);
        explodedArchiveTests8.temporaryFolder = temporaryFolder33;
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = explodedArchiveTests0.getarchive();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNull(explodedArchive38);
        org.junit.Assert.assertNull(explodedArchive39);
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        java.io.File file6 = explodedArchiveTests4.getrootFolder();
        java.io.File file7 = explodedArchiveTests4.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests4.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = null;
        explodedArchiveTests12.rootFolder = file14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests12.getarchive();
        java.io.File file18 = null;
        explodedArchiveTests12.setrootFolder(file18);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.getrootFolder();
        java.io.File file23 = explodedArchiveTests20.getrootFolder();
        java.io.File file24 = explodedArchiveTests20.rootFolder;
        java.io.File file25 = explodedArchiveTests20.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        java.io.File file28 = explodedArchiveTests26.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests26.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests26.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        java.io.File file35 = explodedArchiveTests32.rootFolder;
        java.io.File file36 = explodedArchiveTests32.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = null;
        explodedArchiveTests32.setarchive(explodedArchive37);
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests32.gettemporaryFolder();
        explodedArchiveTests26.temporaryFolder = temporaryFolder39;
        explodedArchiveTests20.settemporaryFolder(temporaryFolder39);
        explodedArchiveTests12.temporaryFolder = temporaryFolder39;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder39);
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests45.temporaryFolder;
        java.io.File file47 = explodedArchiveTests45.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests45.gettemporaryFolder();
        java.io.File file52 = explodedArchiveTests45.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests45.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests45.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder54);
        java.io.File file56 = null;
        explodedArchiveTests0.rootFolder = file56;
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNull(explodedArchive59);
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        java.io.File file11 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests11.temporaryFolder;
        java.io.File file13 = explodedArchiveTests11.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests11.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests11.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests11.gettemporaryFolder();
        java.io.File file17 = null;
        explodedArchiveTests11.setrootFolder(file17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests11.archive;
        java.io.File file20 = explodedArchiveTests11.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests21 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests21.temporaryFolder;
        java.io.File file23 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests21.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests21.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests21.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests21.gettemporaryFolder();
        java.io.File file28 = explodedArchiveTests21.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests21.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests21.archive;
        java.io.File file31 = explodedArchiveTests21.rootFolder;
        java.io.File file32 = null;
        explodedArchiveTests21.rootFolder = file32;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests21.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests21.gettemporaryFolder();
        explodedArchiveTests11.temporaryFolder = temporaryFolder35;
        java.io.File file37 = null;
        explodedArchiveTests11.setrootFolder(file37);
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests11.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder39);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = null;
        explodedArchiveTests0.setarchive(explodedArchive41);
        java.io.File file43 = null;
        explodedArchiveTests0.rootFolder = file43;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = null;
        explodedArchiveTests0.archive = explodedArchive45;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder39);
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder14);
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = null;
        explodedArchiveTests8.rootFolder = file10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests8.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = null;
        explodedArchiveTests13.rootFolder = file15;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests13.archive;
        java.io.File file18 = null;
        explodedArchiveTests13.rootFolder = file18;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.getrootFolder();
        java.io.File file23 = explodedArchiveTests20.rootFolder;
        java.io.File file24 = explodedArchiveTests20.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests20.gettemporaryFolder();
        explodedArchiveTests13.settemporaryFolder(temporaryFolder25);
        explodedArchiveTests8.temporaryFolder = temporaryFolder25;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        java.io.File file29 = null;
        explodedArchiveTests0.setrootFolder(file29);
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.Archive archive32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap33 = explodedArchiveTests0.getEntriesMap(archive32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder31);
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder5);
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = null;
        explodedArchiveTests8.rootFolder = file10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests8.getarchive();
        java.io.File file14 = null;
        explodedArchiveTests8.setrootFolder(file14);
        java.io.File file16 = explodedArchiveTests8.rootFolder;
        java.io.File file17 = explodedArchiveTests8.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        java.io.File file20 = explodedArchiveTests18.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.gettemporaryFolder();
        java.io.File file22 = null;
        explodedArchiveTests18.rootFolder = file22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests18.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests18.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = null;
        explodedArchiveTests18.setarchive(explodedArchive26);
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests18.temporaryFolder;
        explodedArchiveTests8.temporaryFolder = temporaryFolder28;
        java.io.File file30 = null;
        explodedArchiveTests8.rootFolder = file30;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests8.archive = explodedArchive32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests8.setarchive(explodedArchive34);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = explodedArchiveTests8.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        java.io.File file40 = explodedArchiveTests37.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests37.temporaryFolder;
        java.io.File file42 = explodedArchiveTests37.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests37.archive;
        java.io.File file44 = null;
        explodedArchiveTests37.setrootFolder(file44);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests46 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests46.temporaryFolder;
        java.io.File file48 = null;
        explodedArchiveTests46.rootFolder = file48;
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests46.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = explodedArchiveTests46.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests46.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests46.gettemporaryFolder();
        explodedArchiveTests37.temporaryFolder = temporaryFolder54;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder54);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = null;
        explodedArchiveTests8.archive = explodedArchive57;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = null;
        explodedArchiveTests59.setarchive(explodedArchive61);
        java.io.File file63 = null;
        explodedArchiveTests59.rootFolder = file63;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests65 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests65.temporaryFolder;
        java.io.File file67 = explodedArchiveTests65.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests65.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests65.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests65.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder71 = explodedArchiveTests65.gettemporaryFolder();
        java.io.File file72 = explodedArchiveTests65.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive73 = null;
        explodedArchiveTests65.setarchive(explodedArchive73);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive75 = explodedArchiveTests65.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder76 = explodedArchiveTests65.gettemporaryFolder();
        explodedArchiveTests59.temporaryFolder = temporaryFolder76;
        org.junit.rules.TemporaryFolder temporaryFolder78 = explodedArchiveTests59.gettemporaryFolder();
        explodedArchiveTests8.settemporaryFolder(temporaryFolder78);
        explodedArchiveTests0.temporaryFolder = temporaryFolder78;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests81 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder82 = explodedArchiveTests81.temporaryFolder;
        java.io.File file83 = explodedArchiveTests81.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder84 = explodedArchiveTests81.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder85 = explodedArchiveTests81.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder86 = explodedArchiveTests81.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder87 = explodedArchiveTests81.temporaryFolder;
        java.io.File file88 = explodedArchiveTests81.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder89 = explodedArchiveTests81.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder89);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive91 = null;
        explodedArchiveTests0.archive = explodedArchive91;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive93 = null;
        explodedArchiveTests0.archive = explodedArchive93;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(explodedArchive36);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNull(explodedArchive43);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(explodedArchive51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder66);
        org.junit.Assert.assertNull(file67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNotNull(temporaryFolder71);
        org.junit.Assert.assertNull(file72);
        org.junit.Assert.assertNull(explodedArchive75);
        org.junit.Assert.assertNotNull(temporaryFolder76);
        org.junit.Assert.assertNotNull(temporaryFolder78);
        org.junit.Assert.assertNotNull(temporaryFolder82);
        org.junit.Assert.assertNull(file83);
        org.junit.Assert.assertNotNull(temporaryFolder84);
        org.junit.Assert.assertNotNull(temporaryFolder85);
        org.junit.Assert.assertNotNull(temporaryFolder86);
        org.junit.Assert.assertNotNull(temporaryFolder87);
        org.junit.Assert.assertNull(file88);
        org.junit.Assert.assertNotNull(temporaryFolder89);
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.getrootFolder();
        java.io.File file17 = explodedArchiveTests14.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        explodedArchiveTests14.settemporaryFolder(temporaryFolder19);
        explodedArchiveTests8.temporaryFolder = temporaryFolder19;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests22.gettemporaryFolder();
        explodedArchiveTests8.temporaryFolder = temporaryFolder25;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        java.io.File file28 = null;
        explodedArchiveTests0.setrootFolder(file28);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = null;
        explodedArchiveTests32.rootFolder = file34;
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests32.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = explodedArchiveTests32.getarchive();
        java.io.File file38 = null;
        explodedArchiveTests32.setrootFolder(file38);
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests32.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests41.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests41.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests41.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests41.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests49 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests49.temporaryFolder;
        java.io.File file51 = explodedArchiveTests49.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests49.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = null;
        explodedArchiveTests49.setarchive(explodedArchive56);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive58 = explodedArchiveTests49.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        java.io.File file61 = explodedArchiveTests59.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests59.gettemporaryFolder();
        explodedArchiveTests49.settemporaryFolder(temporaryFolder62);
        explodedArchiveTests41.temporaryFolder = temporaryFolder62;
        explodedArchiveTests32.temporaryFolder = temporaryFolder62;
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests32.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder66;
        java.io.File file68 = null;
        explodedArchiveTests0.rootFolder = file68;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(explodedArchive37);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(explodedArchive58);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNull(file61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNotNull(temporaryFolder66);
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        java.io.File file16 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        java.io.File file23 = null;
        explodedArchiveTests19.rootFolder = file23;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests19.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests33 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests33.temporaryFolder;
        java.io.File file35 = explodedArchiveTests33.getrootFolder();
        java.io.File file36 = explodedArchiveTests33.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        explodedArchiveTests33.settemporaryFolder(temporaryFolder38);
        explodedArchiveTests27.temporaryFolder = temporaryFolder38;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests27.temporaryFolder = temporaryFolder44;
        explodedArchiveTests19.settemporaryFolder(temporaryFolder44);
        java.io.File file47 = explodedArchiveTests19.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests48 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests48.temporaryFolder;
        java.io.File file50 = explodedArchiveTests48.getrootFolder();
        java.io.File file51 = explodedArchiveTests48.getrootFolder();
        java.io.File file52 = explodedArchiveTests48.rootFolder;
        java.io.File file53 = explodedArchiveTests48.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests48.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive55 = explodedArchiveTests48.archive;
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests48.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests48.temporaryFolder;
        java.io.File file58 = explodedArchiveTests48.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = explodedArchiveTests48.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests48.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests48.temporaryFolder;
        explodedArchiveTests19.settemporaryFolder(temporaryFolder61);
        explodedArchiveTests0.temporaryFolder = temporaryFolder61;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive64 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNull(explodedArchive55);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder57);
        org.junit.Assert.assertNull(file58);
        org.junit.Assert.assertNull(explodedArchive59);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNull(explodedArchive64);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        java.io.File file12 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = null;
        explodedArchiveTests9.rootFolder = file11;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests9.getarchive();
        java.io.File file15 = null;
        explodedArchiveTests9.setrootFolder(file15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        java.io.File file20 = explodedArchiveTests17.getrootFolder();
        java.io.File file21 = explodedArchiveTests17.rootFolder;
        java.io.File file22 = explodedArchiveTests17.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        java.io.File file32 = explodedArchiveTests29.rootFolder;
        java.io.File file33 = explodedArchiveTests29.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests29.setarchive(explodedArchive34);
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests29.gettemporaryFolder();
        explodedArchiveTests23.temporaryFolder = temporaryFolder36;
        explodedArchiveTests17.settemporaryFolder(temporaryFolder36);
        explodedArchiveTests9.temporaryFolder = temporaryFolder36;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder36);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(temporaryFolder36);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        java.io.File file11 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file16 = null;
        explodedArchiveTests12.rootFolder = file16;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests12.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file21 = null;
        explodedArchiveTests12.rootFolder = file21;
        java.io.File file23 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file25 = explodedArchiveTests12.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        java.io.File file28 = null;
        explodedArchiveTests26.rootFolder = file28;
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests26.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests26.getarchive();
        java.io.File file32 = null;
        explodedArchiveTests26.setrootFolder(file32);
        java.io.File file34 = explodedArchiveTests26.rootFolder;
        java.io.File file35 = explodedArchiveTests26.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        java.io.File file38 = explodedArchiveTests36.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests36.gettemporaryFolder();
        java.io.File file40 = null;
        explodedArchiveTests36.rootFolder = file40;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = explodedArchiveTests36.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests36.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = null;
        explodedArchiveTests36.setarchive(explodedArchive44);
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests36.temporaryFolder;
        explodedArchiveTests26.temporaryFolder = temporaryFolder46;
        java.io.File file48 = null;
        explodedArchiveTests26.rootFolder = file48;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = null;
        explodedArchiveTests26.archive = explodedArchive50;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = null;
        explodedArchiveTests26.setarchive(explodedArchive52);
        java.io.File file54 = null;
        explodedArchiveTests26.rootFolder = file54;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests56 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests56.temporaryFolder;
        java.io.File file58 = null;
        explodedArchiveTests56.rootFolder = file58;
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests56.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = explodedArchiveTests56.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests56.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests56.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests56.gettemporaryFolder();
        java.io.File file65 = explodedArchiveTests56.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive66 = null;
        explodedArchiveTests56.setarchive(explodedArchive66);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests68 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests68.temporaryFolder;
        java.io.File file70 = explodedArchiveTests68.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder71 = explodedArchiveTests68.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests68.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests68.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder74 = explodedArchiveTests68.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive75 = null;
        explodedArchiveTests68.setarchive(explodedArchive75);
        org.junit.rules.TemporaryFolder temporaryFolder77 = explodedArchiveTests68.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive78 = null;
        explodedArchiveTests68.setarchive(explodedArchive78);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive80 = explodedArchiveTests68.archive;
        org.junit.rules.TemporaryFolder temporaryFolder81 = explodedArchiveTests68.gettemporaryFolder();
        java.io.File file82 = explodedArchiveTests68.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests83 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder84 = explodedArchiveTests83.temporaryFolder;
        java.io.File file85 = explodedArchiveTests83.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder86 = explodedArchiveTests83.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder87 = explodedArchiveTests83.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder88 = explodedArchiveTests83.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder89 = explodedArchiveTests83.gettemporaryFolder();
        explodedArchiveTests68.settemporaryFolder(temporaryFolder89);
        java.io.File file91 = null;
        explodedArchiveTests68.rootFolder = file91;
        org.junit.rules.TemporaryFolder temporaryFolder93 = explodedArchiveTests68.gettemporaryFolder();
        explodedArchiveTests56.temporaryFolder = temporaryFolder93;
        org.junit.rules.TemporaryFolder temporaryFolder95 = explodedArchiveTests56.gettemporaryFolder();
        explodedArchiveTests26.temporaryFolder = temporaryFolder95;
        explodedArchiveTests12.temporaryFolder = temporaryFolder95;
        explodedArchiveTests0.temporaryFolder = temporaryFolder95;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNull(explodedArchive42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder57);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNull(explodedArchive61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNull(file70);
        org.junit.Assert.assertNotNull(temporaryFolder71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNotNull(temporaryFolder74);
        org.junit.Assert.assertNotNull(temporaryFolder77);
        org.junit.Assert.assertNull(explodedArchive80);
        org.junit.Assert.assertNotNull(temporaryFolder81);
        org.junit.Assert.assertNull(file82);
        org.junit.Assert.assertNotNull(temporaryFolder84);
        org.junit.Assert.assertNull(file85);
        org.junit.Assert.assertNotNull(temporaryFolder86);
        org.junit.Assert.assertNotNull(temporaryFolder87);
        org.junit.Assert.assertNotNull(temporaryFolder88);
        org.junit.Assert.assertNotNull(temporaryFolder89);
        org.junit.Assert.assertNotNull(temporaryFolder93);
        org.junit.Assert.assertNotNull(temporaryFolder95);
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        java.io.File file20 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests13.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.temporaryFolder;
        java.io.File file23 = null;
        explodedArchiveTests13.setrootFolder(file23);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests13.archive;
        java.io.File file26 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        java.io.File file30 = explodedArchiveTests27.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests27.setarchive(explodedArchive31);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests27.archive = explodedArchive33;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests35.gettemporaryFolder();
        java.io.File file39 = null;
        explodedArchiveTests35.rootFolder = file39;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests35.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests35.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests43 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests43.temporaryFolder;
        java.io.File file45 = explodedArchiveTests43.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests43.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests43.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests43.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests49 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests49.temporaryFolder;
        java.io.File file51 = explodedArchiveTests49.getrootFolder();
        java.io.File file52 = explodedArchiveTests49.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests53 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests53.temporaryFolder;
        explodedArchiveTests49.settemporaryFolder(temporaryFolder54);
        explodedArchiveTests43.temporaryFolder = temporaryFolder54;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests57 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests57.temporaryFolder;
        java.io.File file59 = explodedArchiveTests57.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests57.gettemporaryFolder();
        explodedArchiveTests43.temporaryFolder = temporaryFolder60;
        explodedArchiveTests35.settemporaryFolder(temporaryFolder60);
        explodedArchiveTests27.temporaryFolder = temporaryFolder60;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests64 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests64.temporaryFolder;
        java.io.File file66 = explodedArchiveTests64.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests64.gettemporaryFolder();
        java.io.File file71 = explodedArchiveTests64.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive72 = null;
        explodedArchiveTests64.setarchive(explodedArchive72);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests74 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests74.temporaryFolder;
        explodedArchiveTests64.settemporaryFolder(temporaryFolder75);
        explodedArchiveTests27.settemporaryFolder(temporaryFolder75);
        org.junit.rules.TemporaryFolder temporaryFolder78 = explodedArchiveTests27.temporaryFolder;
        java.io.File file79 = explodedArchiveTests27.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive80 = explodedArchiveTests27.archive;
        org.junit.rules.TemporaryFolder temporaryFolder81 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests13.temporaryFolder = temporaryFolder81;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder81);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive84 = explodedArchiveTests0.archive;
        java.io.File file85 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(explodedArchive41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNotNull(temporaryFolder78);
        org.junit.Assert.assertNull(file79);
        org.junit.Assert.assertNull(explodedArchive80);
        org.junit.Assert.assertNotNull(temporaryFolder81);
        org.junit.Assert.assertNull(explodedArchive84);
        org.junit.Assert.assertNull(file85);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder11);
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file17 = explodedArchiveTests0.getrootFolder();
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests0.archive = explodedArchive19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = null;
        explodedArchiveTests22.rootFolder = file24;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests22.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests22.getarchive();
        java.io.File file28 = null;
        explodedArchiveTests22.setrootFolder(file28);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests22.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests22.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests22.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests0.setarchive(explodedArchive34);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = null;
        explodedArchiveTests0.setarchive(explodedArchive36);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.getarchive();
        java.io.File file11 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder6;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests11.temporaryFolder;
        java.io.File file13 = explodedArchiveTests11.getrootFolder();
        java.io.File file14 = explodedArchiveTests11.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests11.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests11.archive = explodedArchive16;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests11.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests11.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests0.setarchive(explodedArchive23);
        java.io.File file25 = null;
        explodedArchiveTests0.rootFolder = file25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests0.archive = explodedArchive28;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(temporaryFolder8);
        org.junit.Assert.assertNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        java.io.File file11 = explodedArchiveTests8.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        java.io.File file19 = explodedArchiveTests16.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.temporaryFolder;
        java.io.File file21 = explodedArchiveTests16.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests16.getarchive();
        java.io.File file23 = explodedArchiveTests16.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        java.io.File file27 = explodedArchiveTests24.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests24.setarchive(explodedArchive28);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests24.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests24.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests32.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = null;
        explodedArchiveTests32.setarchive(explodedArchive38);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests40 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests40.temporaryFolder;
        java.io.File file42 = explodedArchiveTests40.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests40.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests40.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests40.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests40.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = null;
        explodedArchiveTests40.setarchive(explodedArchive47);
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests40.gettemporaryFolder();
        explodedArchiveTests32.settemporaryFolder(temporaryFolder49);
        explodedArchiveTests24.temporaryFolder = temporaryFolder49;
        explodedArchiveTests16.temporaryFolder = temporaryFolder49;
        explodedArchiveTests0.temporaryFolder = temporaryFolder49;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = null;
        explodedArchiveTests0.archive = explodedArchive54;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder49);
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        java.io.File file10 = null;
        explodedArchiveTests0.rootFolder = file10;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file5 = explodedArchiveTests0.rootFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        java.io.File file14 = explodedArchiveTests10.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = null;
        explodedArchiveTests15.rootFolder = file17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = explodedArchiveTests15.getarchive();
        java.io.File file21 = null;
        explodedArchiveTests15.setrootFolder(file21);
        java.io.File file23 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests24.gettemporaryFolder();
        java.io.File file31 = explodedArchiveTests24.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests24.setarchive(explodedArchive32);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = explodedArchiveTests24.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests24.temporaryFolder;
        explodedArchiveTests15.settemporaryFolder(temporaryFolder36);
        explodedArchiveTests10.temporaryFolder = temporaryFolder36;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder36);
        java.io.File file40 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests0.getarchive();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive20);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(explodedArchive34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNull(explodedArchive41);
        org.junit.Assert.assertNull(explodedArchive42);
        org.junit.Assert.assertNull(explodedArchive43);
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.setarchive(explodedArchive11);
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests14.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = null;
        explodedArchiveTests10.rootFolder = file12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests10.getarchive();
        java.io.File file16 = null;
        explodedArchiveTests10.setrootFolder(file16);
        java.io.File file18 = explodedArchiveTests10.rootFolder;
        java.io.File file19 = explodedArchiveTests10.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests20.gettemporaryFolder();
        java.io.File file24 = null;
        explodedArchiveTests20.rootFolder = file24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests20.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests20.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests20.setarchive(explodedArchive28);
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests10.temporaryFolder = temporaryFolder30;
        java.io.File file32 = null;
        explodedArchiveTests10.rootFolder = file32;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests10.archive = explodedArchive34;
        java.io.File file36 = null;
        explodedArchiveTests10.setrootFolder(file36);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = explodedArchiveTests10.getarchive();
        java.io.File file39 = null;
        explodedArchiveTests10.rootFolder = file39;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = null;
        explodedArchiveTests10.archive = explodedArchive41;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests43 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests43.temporaryFolder;
        java.io.File file45 = null;
        explodedArchiveTests43.rootFolder = file45;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = explodedArchiveTests43.archive;
        java.io.File file48 = null;
        explodedArchiveTests43.setrootFolder(file48);
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests43.temporaryFolder;
        java.io.File file51 = null;
        explodedArchiveTests43.rootFolder = file51;
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests43.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = explodedArchiveTests43.archive;
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests43.gettemporaryFolder();
        explodedArchiveTests10.temporaryFolder = temporaryFolder55;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder55);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests58 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests58.temporaryFolder;
        java.io.File file60 = explodedArchiveTests58.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests58.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests58.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests58.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive64 = explodedArchiveTests58.archive;
        java.io.File file65 = explodedArchiveTests58.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive66 = null;
        explodedArchiveTests58.archive = explodedArchive66;
        java.io.File file68 = explodedArchiveTests58.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests58.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder69;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(explodedArchive38);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(explodedArchive47);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNull(explodedArchive54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNull(explodedArchive64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNull(file68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests0.temporaryFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests17.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests17.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests17.settemporaryFolder(temporaryFolder30);
        explodedArchiveTests9.temporaryFolder = temporaryFolder30;
        explodedArchiveTests0.temporaryFolder = temporaryFolder30;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests35.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        java.io.File file44 = explodedArchiveTests41.rootFolder;
        java.io.File file45 = explodedArchiveTests41.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests41.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests35.temporaryFolder = temporaryFolder48;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = explodedArchiveTests35.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests51 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests51.temporaryFolder;
        java.io.File file53 = explodedArchiveTests51.getrootFolder();
        java.io.File file54 = explodedArchiveTests51.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive55 = null;
        explodedArchiveTests51.setarchive(explodedArchive55);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = null;
        explodedArchiveTests51.archive = explodedArchive57;
        java.io.File file59 = explodedArchiveTests51.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests51.temporaryFolder;
        explodedArchiveTests35.settemporaryFolder(temporaryFolder60);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder60);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(explodedArchive50);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNotNull(temporaryFolder60);
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = null;
        explodedArchiveTests10.rootFolder = file12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests10.getarchive();
        java.io.File file16 = null;
        explodedArchiveTests10.setrootFolder(file16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests10.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests10.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests10.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests10.archive;
        java.io.File file23 = explodedArchiveTests10.rootFolder;
        java.io.File file24 = null;
        explodedArchiveTests10.setrootFolder(file24);
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.Archive archive12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap13 = explodedArchiveTests0.getEntriesMap(archive12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder6 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder6;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests11 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests11.temporaryFolder;
        java.io.File file13 = explodedArchiveTests11.getrootFolder();
        java.io.File file14 = explodedArchiveTests11.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests11.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests11.archive = explodedArchive16;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests11.archive = explodedArchive18;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests11.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests0.archive = explodedArchive23;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(temporaryFolder8);
        org.junit.Assert.assertNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder22);
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = explodedArchiveTests0.getarchive();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(explodedArchive3);
        org.junit.Assert.assertNull(explodedArchive6);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = null;
        explodedArchiveTests15.rootFolder = file17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = explodedArchiveTests15.getarchive();
        java.io.File file21 = null;
        explodedArchiveTests15.setrootFolder(file21);
        java.io.File file23 = explodedArchiveTests15.rootFolder;
        java.io.File file24 = null;
        explodedArchiveTests15.rootFolder = file24;
        java.io.File file26 = explodedArchiveTests15.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests15.gettemporaryFolder();
        java.io.File file28 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        java.io.File file32 = explodedArchiveTests29.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests29.setarchive(explodedArchive33);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests29.archive = explodedArchive35;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        java.io.File file41 = null;
        explodedArchiveTests37.rootFolder = file41;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests37.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests37.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests45.temporaryFolder;
        java.io.File file47 = explodedArchiveTests45.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests45.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests51 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests51.temporaryFolder;
        java.io.File file53 = explodedArchiveTests51.getrootFolder();
        java.io.File file54 = explodedArchiveTests51.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests55 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests55.temporaryFolder;
        explodedArchiveTests51.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests45.temporaryFolder = temporaryFolder56;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        java.io.File file61 = explodedArchiveTests59.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests59.gettemporaryFolder();
        explodedArchiveTests45.temporaryFolder = temporaryFolder62;
        explodedArchiveTests37.settemporaryFolder(temporaryFolder62);
        explodedArchiveTests29.temporaryFolder = temporaryFolder62;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests66 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests66.temporaryFolder;
        java.io.File file68 = explodedArchiveTests66.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests66.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests66.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder71 = explodedArchiveTests66.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests66.gettemporaryFolder();
        java.io.File file73 = explodedArchiveTests66.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive74 = null;
        explodedArchiveTests66.setarchive(explodedArchive74);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests76 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder77 = explodedArchiveTests76.temporaryFolder;
        explodedArchiveTests66.settemporaryFolder(temporaryFolder77);
        explodedArchiveTests29.settemporaryFolder(temporaryFolder77);
        explodedArchiveTests15.temporaryFolder = temporaryFolder77;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder77);
        java.io.File file82 = explodedArchiveTests0.getrootFolder();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive20);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(explodedArchive43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNull(file61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNull(file68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNotNull(temporaryFolder71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNull(file73);
        org.junit.Assert.assertNotNull(temporaryFolder77);
        org.junit.Assert.assertNull(file82);
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests4 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests4.temporaryFolder;
        java.io.File file6 = explodedArchiveTests4.getrootFolder();
        java.io.File file7 = explodedArchiveTests4.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests4.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        java.io.File file13 = null;
        explodedArchiveTests0.rootFolder = file13;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        java.io.File file9 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests7.setarchive(explodedArchive14);
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests7.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests7.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests7.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests20.setarchive(explodedArchive23);
        java.io.File file25 = explodedArchiveTests20.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests20.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests20.gettemporaryFolder();
        explodedArchiveTests7.settemporaryFolder(temporaryFolder27);
        java.io.File file29 = explodedArchiveTests7.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.getrootFolder();
        java.io.File file33 = explodedArchiveTests30.rootFolder;
        java.io.File file34 = explodedArchiveTests30.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests30.setarchive(explodedArchive35);
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests30.gettemporaryFolder();
        java.io.File file38 = explodedArchiveTests30.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests30.archive = explodedArchive39;
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests7.temporaryFolder = temporaryFolder41;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder41);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(explodedArchive44);
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder11);
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests14.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = null;
        explodedArchiveTests19.rootFolder = file21;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests19.archive;
        java.io.File file24 = null;
        explodedArchiveTests19.setrootFolder(file24);
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests19.temporaryFolder;
        java.io.File file27 = null;
        explodedArchiveTests19.rootFolder = file27;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests19.archive;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests19.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder31;
        java.io.File file33 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = null;
        explodedArchiveTests0.setarchive(explodedArchive3);
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        java.io.File file10 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests6.gettemporaryFolder();
        java.io.File file14 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests6.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests6.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        java.io.File file20 = explodedArchiveTests17.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests17.setarchive(explodedArchive21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = null;
        explodedArchiveTests17.archive = explodedArchive23;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        java.io.File file27 = explodedArchiveTests25.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests25.gettemporaryFolder();
        java.io.File file29 = null;
        explodedArchiveTests25.rootFolder = file29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests25.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests25.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests33 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests33.temporaryFolder;
        java.io.File file35 = explodedArchiveTests33.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests33.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests33.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests33.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests39 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests39.temporaryFolder;
        java.io.File file41 = explodedArchiveTests39.getrootFolder();
        java.io.File file42 = explodedArchiveTests39.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests43 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests43.temporaryFolder;
        explodedArchiveTests39.settemporaryFolder(temporaryFolder44);
        explodedArchiveTests33.temporaryFolder = temporaryFolder44;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        java.io.File file49 = explodedArchiveTests47.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests47.gettemporaryFolder();
        explodedArchiveTests33.temporaryFolder = temporaryFolder50;
        explodedArchiveTests25.settemporaryFolder(temporaryFolder50);
        explodedArchiveTests17.temporaryFolder = temporaryFolder50;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder50);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder50);
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests0.temporaryFolder;
        java.io.File file57 = null;
        explodedArchiveTests0.rootFolder = file57;
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive60 = null;
        explodedArchiveTests0.archive = explodedArchive60;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder59);
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests8.rootFolder = file12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        java.io.File file25 = explodedArchiveTests22.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests22.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests16.temporaryFolder = temporaryFolder27;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests16.temporaryFolder = temporaryFolder33;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder33);
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests37.gettemporaryFolder();
        java.io.File file44 = explodedArchiveTests37.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = null;
        explodedArchiveTests37.setarchive(explodedArchive45);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        explodedArchiveTests37.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder48);
        java.io.File file51 = null;
        explodedArchiveTests0.setrootFolder(file51);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests54 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests54.temporaryFolder;
        java.io.File file56 = explodedArchiveTests54.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests54.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests54.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests54.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive60 = explodedArchiveTests54.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests54.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder61;
        java.io.File file63 = null;
        explodedArchiveTests0.setrootFolder(file63);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive65 = null;
        explodedArchiveTests0.archive = explodedArchive65;
        java.io.File file67 = explodedArchiveTests0.rootFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(explodedArchive53);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(file56);
        org.junit.Assert.assertNotNull(temporaryFolder57);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(explodedArchive60);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNull(file67);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        java.io.File file17 = null;
        explodedArchiveTests13.rootFolder = file17;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests13.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder21);
        java.io.File file23 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests0.temporaryFolder;
        java.io.File file25 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = null;
        explodedArchiveTests0.archive = explodedArchive26;
        java.io.File file28 = null;
        explodedArchiveTests0.setrootFolder(file28);
        java.io.File file30 = null;
        explodedArchiveTests0.rootFolder = file30;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests5.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests5.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file25 = null;
        explodedArchiveTests0.rootFolder = file25;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        java.io.File file30 = explodedArchiveTests27.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests27.setarchive(explodedArchive31);
        java.io.File file33 = explodedArchiveTests27.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests27.archive = explodedArchive34;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = explodedArchiveTests27.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests27.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests27.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests39 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests39.temporaryFolder;
        java.io.File file41 = explodedArchiveTests39.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests39.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests39.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests39.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests39.gettemporaryFolder();
        explodedArchiveTests27.settemporaryFolder(temporaryFolder45);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        java.io.File file49 = explodedArchiveTests47.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests47.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests47.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests47.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests47.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = null;
        explodedArchiveTests47.setarchive(explodedArchive54);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests56 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests56.temporaryFolder;
        java.io.File file58 = explodedArchiveTests56.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests56.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests56.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests56.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive62 = null;
        explodedArchiveTests56.setarchive(explodedArchive62);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests64 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests64.temporaryFolder;
        java.io.File file66 = explodedArchiveTests64.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests64.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive71 = null;
        explodedArchiveTests64.setarchive(explodedArchive71);
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests64.gettemporaryFolder();
        explodedArchiveTests56.settemporaryFolder(temporaryFolder73);
        explodedArchiveTests47.temporaryFolder = temporaryFolder73;
        explodedArchiveTests27.temporaryFolder = temporaryFolder73;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder73);
        java.io.File file78 = null;
        explodedArchiveTests0.setrootFolder(file78);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(explodedArchive36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder57);
        org.junit.Assert.assertNull(file58);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNotNull(temporaryFolder73);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        java.io.File file11 = explodedArchiveTests0.getrootFolder();
        java.io.File file12 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.archive;
        java.io.File file2 = null;
        explodedArchiveTests0.setrootFolder(file2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNestedArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        java.io.File file15 = null;
        explodedArchiveTests0.setrootFolder(file15);
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.setarchive(explodedArchive20);
        java.io.File file22 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file22);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = null;
        explodedArchiveTests0.rootFolder = file8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.archive = explodedArchive12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.archive = explodedArchive14;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getFilteredArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        java.io.File file14 = null;
        explodedArchiveTests10.rootFolder = file14;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests10.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests10.setarchive(explodedArchive18);
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder20;
        java.io.File file22 = null;
        explodedArchiveTests0.rootFolder = file22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests0.archive = explodedArchive24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = null;
        explodedArchiveTests0.setarchive(explodedArchive26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests0.setarchive(explodedArchive30);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive28);
        org.junit.Assert.assertNull(explodedArchive29);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        java.io.File file10 = null;
        explodedArchiveTests0.rootFolder = file10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        java.io.File file16 = explodedArchiveTests0.getrootFolder();
        java.io.File file17 = null;
        explodedArchiveTests0.setrootFolder(file17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests19.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests19.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests19.gettemporaryFolder();
        java.io.File file26 = explodedArchiveTests19.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        java.io.File file30 = explodedArchiveTests27.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests19.temporaryFolder = temporaryFolder31;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests19.setarchive(explodedArchive33);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        java.io.File file38 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.gettemporaryFolder();
        explodedArchiveTests19.temporaryFolder = temporaryFolder39;
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests19.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests19.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder42;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests10.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests10.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder16;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        java.io.File file20 = explodedArchiveTests18.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests18.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder21);
        java.io.File file23 = null;
        explodedArchiveTests0.rootFolder = file23;
        java.io.File file25 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests0.temporaryFolder;
        java.io.File file27 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(explodedArchive28);
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(explodedArchive8);
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests5.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests5.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests0.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder27);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        java.io.File file32 = explodedArchiveTests29.getrootFolder();
        java.io.File file33 = explodedArchiveTests29.rootFolder;
        java.io.File file34 = explodedArchiveTests29.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests35.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        java.io.File file44 = explodedArchiveTests41.rootFolder;
        java.io.File file45 = explodedArchiveTests41.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests41.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests35.temporaryFolder = temporaryFolder48;
        explodedArchiveTests29.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder48);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = null;
        explodedArchiveTests0.setarchive(explodedArchive52);
        java.io.File file54 = null;
        explodedArchiveTests0.rootFolder = file54;
        java.io.File file56 = null;
        explodedArchiveTests0.setrootFolder(file56);
        java.io.File file58 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = explodedArchiveTests0.getarchive();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(file58);
        org.junit.Assert.assertNull(explodedArchive59);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.archive;
        java.io.File file12 = null;
        explodedArchiveTests0.rootFolder = file12;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive11);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = null;
        explodedArchiveTests8.rootFolder = file10;
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder12);
        java.io.File file14 = null;
        explodedArchiveTests0.rootFolder = file14;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests0.setarchive(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder12);
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(explodedArchive7);
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.archive;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        java.io.File file12 = null;
        explodedArchiveTests0.rootFolder = file12;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests0.rootFolder = file12;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(temporaryFolder11);
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests0.rootFolder = file12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests15.archive;
        java.io.File file17 = null;
        explodedArchiveTests15.setrootFolder(file17);
        java.io.File file19 = null;
        explodedArchiveTests15.setrootFolder(file19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests15.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder21);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests23.setarchive(explodedArchive29);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests31 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests31.temporaryFolder;
        java.io.File file33 = explodedArchiveTests31.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests31.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests31.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests31.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests31.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = null;
        explodedArchiveTests31.setarchive(explodedArchive38);
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests31.gettemporaryFolder();
        explodedArchiveTests23.settemporaryFolder(temporaryFolder40);
        java.io.File file42 = explodedArchiveTests23.getrootFolder();
        java.io.File file43 = explodedArchiveTests23.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests23.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests45.temporaryFolder;
        java.io.File file47 = explodedArchiveTests45.getrootFolder();
        java.io.File file48 = explodedArchiveTests45.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests45.temporaryFolder;
        java.io.File file50 = explodedArchiveTests45.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = explodedArchiveTests45.getarchive();
        java.io.File file52 = explodedArchiveTests45.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests53 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests53.temporaryFolder;
        java.io.File file55 = explodedArchiveTests53.getrootFolder();
        java.io.File file56 = explodedArchiveTests53.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = null;
        explodedArchiveTests53.setarchive(explodedArchive57);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = explodedArchiveTests53.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive60 = explodedArchiveTests53.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests61 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests61.temporaryFolder;
        java.io.File file63 = explodedArchiveTests61.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests61.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests61.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests61.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive67 = null;
        explodedArchiveTests61.setarchive(explodedArchive67);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests69 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests69.temporaryFolder;
        java.io.File file71 = explodedArchiveTests69.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder74 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests69.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive76 = null;
        explodedArchiveTests69.setarchive(explodedArchive76);
        org.junit.rules.TemporaryFolder temporaryFolder78 = explodedArchiveTests69.gettemporaryFolder();
        explodedArchiveTests61.settemporaryFolder(temporaryFolder78);
        explodedArchiveTests53.temporaryFolder = temporaryFolder78;
        explodedArchiveTests45.temporaryFolder = temporaryFolder78;
        org.junit.rules.TemporaryFolder temporaryFolder82 = explodedArchiveTests45.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive83 = null;
        explodedArchiveTests45.archive = explodedArchive83;
        java.io.File file85 = null;
        explodedArchiveTests45.rootFolder = file85;
        org.junit.rules.TemporaryFolder temporaryFolder87 = explodedArchiveTests45.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder88 = explodedArchiveTests45.temporaryFolder;
        explodedArchiveTests23.temporaryFolder = temporaryFolder88;
        explodedArchiveTests0.temporaryFolder = temporaryFolder88;
        java.io.File file91 = null;
        explodedArchiveTests0.rootFolder = file91;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNull(explodedArchive51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNull(file55);
        org.junit.Assert.assertNull(file56);
        org.junit.Assert.assertNull(explodedArchive59);
        org.junit.Assert.assertNull(explodedArchive60);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNull(file63);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNotNull(temporaryFolder66);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNotNull(temporaryFolder74);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNotNull(temporaryFolder78);
        org.junit.Assert.assertNotNull(temporaryFolder82);
        org.junit.Assert.assertNotNull(temporaryFolder87);
        org.junit.Assert.assertNotNull(temporaryFolder88);
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder9);
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file19 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests12.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests12.temporaryFolder;
        java.io.File file22 = null;
        explodedArchiveTests12.setrootFolder(file22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests12.archive;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(explodedArchive27);
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests9.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests9.archive;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        java.io.File file26 = explodedArchiveTests23.getrootFolder();
        java.io.File file27 = explodedArchiveTests23.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.gettemporaryFolder();
        explodedArchiveTests9.temporaryFolder = temporaryFolder28;
        java.io.File file30 = null;
        explodedArchiveTests9.rootFolder = file30;
        java.io.File file32 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder33);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        java.io.File file38 = explodedArchiveTests35.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests39 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests39.temporaryFolder;
        explodedArchiveTests35.settemporaryFolder(temporaryFolder40);
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests35.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder42;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = explodedArchiveTests0.getarchive();
        java.io.InputStream inputStream45 = null;
        java.io.OutputStream outputStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream45, outputStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(explodedArchive44);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        java.io.File file15 = null;
        explodedArchiveTests0.setrootFolder(file15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.getrootFolder();
        java.io.File file22 = explodedArchiveTests19.rootFolder;
        java.io.File file23 = explodedArchiveTests19.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests19.setarchive(explodedArchive24);
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests19.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests0.setarchive(explodedArchive28);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests0.archive = explodedArchive30;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive17);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        java.io.InputStream inputStream13 = null;
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.copy(inputStream13, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        java.io.File file11 = explodedArchiveTests8.rootFolder;
        java.io.File file12 = explodedArchiveTests8.rootFolder;
        java.io.File file13 = explodedArchiveTests8.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests8.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder15;
        java.io.File file17 = null;
        explodedArchiveTests0.setrootFolder(file17);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        java.io.File file16 = explodedArchiveTests13.getrootFolder();
        java.io.File file17 = explodedArchiveTests13.rootFolder;
        java.io.File file18 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        java.io.File file23 = null;
        explodedArchiveTests19.rootFolder = file23;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = explodedArchiveTests19.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests19.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests27.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests27.setarchive(explodedArchive34);
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests19.settemporaryFolder(temporaryFolder36);
        explodedArchiveTests13.settemporaryFolder(temporaryFolder36);
        explodedArchiveTests0.temporaryFolder = temporaryFolder36;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = null;
        explodedArchiveTests0.archive = explodedArchive40;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests42 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests42.temporaryFolder;
        java.io.File file44 = null;
        explodedArchiveTests42.rootFolder = file44;
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests42.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = explodedArchiveTests42.getarchive();
        java.io.File file48 = null;
        explodedArchiveTests42.setrootFolder(file48);
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests42.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = explodedArchiveTests42.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests42.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = explodedArchiveTests42.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = explodedArchiveTests42.archive;
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests42.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder55;
        java.io.File file57 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests58 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests58.temporaryFolder;
        java.io.File file60 = explodedArchiveTests58.getrootFolder();
        java.io.File file61 = explodedArchiveTests58.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder62 = explodedArchiveTests58.temporaryFolder;
        java.io.File file63 = explodedArchiveTests58.getrootFolder();
        java.io.File file64 = explodedArchiveTests58.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive65 = explodedArchiveTests58.getarchive();
        java.io.File file66 = null;
        explodedArchiveTests58.rootFolder = file66;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive68 = null;
        explodedArchiveTests58.setarchive(explodedArchive68);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests70 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder71 = explodedArchiveTests70.temporaryFolder;
        java.io.File file72 = explodedArchiveTests70.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests70.gettemporaryFolder();
        explodedArchiveTests58.temporaryFolder = temporaryFolder73;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive75 = explodedArchiveTests58.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests76 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder77 = explodedArchiveTests76.temporaryFolder;
        java.io.File file78 = explodedArchiveTests76.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder79 = explodedArchiveTests76.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder80 = explodedArchiveTests76.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder81 = explodedArchiveTests76.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive82 = null;
        explodedArchiveTests76.setarchive(explodedArchive82);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests84 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder85 = explodedArchiveTests84.temporaryFolder;
        java.io.File file86 = explodedArchiveTests84.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder87 = explodedArchiveTests84.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder88 = explodedArchiveTests84.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder89 = explodedArchiveTests84.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder90 = explodedArchiveTests84.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive91 = null;
        explodedArchiveTests84.setarchive(explodedArchive91);
        org.junit.rules.TemporaryFolder temporaryFolder93 = explodedArchiveTests84.gettemporaryFolder();
        explodedArchiveTests76.settemporaryFolder(temporaryFolder93);
        explodedArchiveTests58.temporaryFolder = temporaryFolder93;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder93);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNull(explodedArchive47);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(explodedArchive51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(explodedArchive53);
        org.junit.Assert.assertNull(explodedArchive54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(file57);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNull(file61);
        org.junit.Assert.assertNotNull(temporaryFolder62);
        org.junit.Assert.assertNull(file63);
        org.junit.Assert.assertNull(file64);
        org.junit.Assert.assertNull(explodedArchive65);
        org.junit.Assert.assertNotNull(temporaryFolder71);
        org.junit.Assert.assertNull(file72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNull(explodedArchive75);
        org.junit.Assert.assertNotNull(temporaryFolder77);
        org.junit.Assert.assertNull(file78);
        org.junit.Assert.assertNotNull(temporaryFolder79);
        org.junit.Assert.assertNotNull(temporaryFolder80);
        org.junit.Assert.assertNotNull(temporaryFolder81);
        org.junit.Assert.assertNotNull(temporaryFolder85);
        org.junit.Assert.assertNull(file86);
        org.junit.Assert.assertNotNull(temporaryFolder87);
        org.junit.Assert.assertNotNull(temporaryFolder88);
        org.junit.Assert.assertNotNull(temporaryFolder89);
        org.junit.Assert.assertNotNull(temporaryFolder90);
        org.junit.Assert.assertNotNull(temporaryFolder93);
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests13.setarchive(explodedArchive16);
        java.io.File file18 = explodedArchiveTests13.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests13.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder20);
        java.io.File file22 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        java.io.File file26 = explodedArchiveTests23.rootFolder;
        java.io.File file27 = explodedArchiveTests23.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests23.setarchive(explodedArchive28);
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests23.gettemporaryFolder();
        java.io.File file31 = explodedArchiveTests23.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests23.archive = explodedArchive32;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests23.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder34;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = null;
        explodedArchiveTests0.setarchive(explodedArchive38);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(explodedArchive36);
        org.junit.Assert.assertNull(explodedArchive37);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        java.io.File file11 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        java.io.File file16 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests13.archive = explodedArchive18;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests13.archive;
        java.io.File file23 = null;
        explodedArchiveTests13.setrootFolder(file23);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        java.io.File file27 = null;
        explodedArchiveTests25.rootFolder = file27;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = explodedArchiveTests25.archive;
        java.io.File file30 = null;
        explodedArchiveTests25.rootFolder = file30;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        java.io.File file35 = explodedArchiveTests32.rootFolder;
        java.io.File file36 = explodedArchiveTests32.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests32.gettemporaryFolder();
        explodedArchiveTests25.settemporaryFolder(temporaryFolder37);
        explodedArchiveTests13.settemporaryFolder(temporaryFolder37);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder37);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(explodedArchive29);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        java.io.File file10 = null;
        explodedArchiveTests0.setrootFolder(file10);
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests15.setarchive(explodedArchive21);
        java.io.File file23 = explodedArchiveTests15.getrootFolder();
        java.io.File file24 = null;
        explodedArchiveTests15.rootFolder = file24;
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests15.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = null;
        explodedArchiveTests0.setarchive(explodedArchive28);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder26);
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.getrootFolder();
        java.io.File file17 = explodedArchiveTests14.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        explodedArchiveTests14.settemporaryFolder(temporaryFolder19);
        explodedArchiveTests8.temporaryFolder = temporaryFolder19;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests22.gettemporaryFolder();
        explodedArchiveTests8.temporaryFolder = temporaryFolder25;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests0.setarchive(explodedArchive29);
        java.io.File file31 = null;
        explodedArchiveTests0.rootFolder = file31;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests0.archive = explodedArchive33;
        java.io.File file35 = null;
        explodedArchiveTests0.setrootFolder(file35);
        java.io.File file37 = null;
        explodedArchiveTests0.setrootFolder(file37);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(explodedArchive28);
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests8.rootFolder = file12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        java.io.File file25 = explodedArchiveTests22.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests22.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests16.temporaryFolder = temporaryFolder27;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests16.temporaryFolder = temporaryFolder33;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder33);
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests37.gettemporaryFolder();
        java.io.File file44 = explodedArchiveTests37.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = null;
        explodedArchiveTests37.setarchive(explodedArchive45);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests47 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests47.temporaryFolder;
        explodedArchiveTests37.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder48);
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = explodedArchiveTests0.archive;
        java.io.File file55 = null;
        explodedArchiveTests0.setrootFolder(file55);
        java.io.File file57 = null;
        explodedArchiveTests0.rootFolder = file57;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNull(explodedArchive52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNull(explodedArchive54);
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.archive = explodedArchive14;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.setarchive(explodedArchive5);
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
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        java.io.File file10 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests6.setarchive(explodedArchive11);
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder13;
        java.io.File file15 = null;
        explodedArchiveTests0.setrootFolder(file15);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests17.setarchive(explodedArchive19);
        java.io.File file21 = null;
        explodedArchiveTests17.rootFolder = file21;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests23.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests23.gettemporaryFolder();
        java.io.File file30 = explodedArchiveTests23.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests23.setarchive(explodedArchive31);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = explodedArchiveTests23.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests23.gettemporaryFolder();
        explodedArchiveTests17.temporaryFolder = temporaryFolder34;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder34);
        java.io.File file37 = null;
        explodedArchiveTests0.setrootFolder(file37);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests39 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests39.temporaryFolder;
        java.io.File file41 = null;
        explodedArchiveTests39.rootFolder = file41;
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests39.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = explodedArchiveTests39.getarchive();
        java.io.File file45 = null;
        explodedArchiveTests39.setrootFolder(file45);
        java.io.File file47 = explodedArchiveTests39.rootFolder;
        java.io.File file48 = explodedArchiveTests39.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests39.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = null;
        explodedArchiveTests39.archive = explodedArchive50;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = null;
        explodedArchiveTests39.setarchive(explodedArchive52);
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests39.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests55 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests55.temporaryFolder;
        java.io.File file57 = null;
        explodedArchiveTests55.rootFolder = file57;
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests55.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive60 = explodedArchiveTests55.getarchive();
        java.io.File file61 = null;
        explodedArchiveTests55.setrootFolder(file61);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests63 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests63.temporaryFolder;
        java.io.File file65 = explodedArchiveTests63.getrootFolder();
        java.io.File file66 = explodedArchiveTests63.getrootFolder();
        java.io.File file67 = explodedArchiveTests63.rootFolder;
        java.io.File file68 = explodedArchiveTests63.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests69 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests69.temporaryFolder;
        java.io.File file71 = explodedArchiveTests69.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder74 = explodedArchiveTests69.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests75 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder76 = explodedArchiveTests75.temporaryFolder;
        java.io.File file77 = explodedArchiveTests75.getrootFolder();
        java.io.File file78 = explodedArchiveTests75.rootFolder;
        java.io.File file79 = explodedArchiveTests75.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive80 = null;
        explodedArchiveTests75.setarchive(explodedArchive80);
        org.junit.rules.TemporaryFolder temporaryFolder82 = explodedArchiveTests75.gettemporaryFolder();
        explodedArchiveTests69.temporaryFolder = temporaryFolder82;
        explodedArchiveTests63.settemporaryFolder(temporaryFolder82);
        explodedArchiveTests55.temporaryFolder = temporaryFolder82;
        explodedArchiveTests39.settemporaryFolder(temporaryFolder82);
        org.junit.rules.TemporaryFolder temporaryFolder87 = explodedArchiveTests39.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder87;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive89 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(explodedArchive33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(explodedArchive44);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(explodedArchive60);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNull(file67);
        org.junit.Assert.assertNull(file68);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNotNull(temporaryFolder74);
        org.junit.Assert.assertNotNull(temporaryFolder76);
        org.junit.Assert.assertNull(file77);
        org.junit.Assert.assertNull(file78);
        org.junit.Assert.assertNull(file79);
        org.junit.Assert.assertNotNull(temporaryFolder82);
        org.junit.Assert.assertNotNull(temporaryFolder87);
        org.junit.Assert.assertNull(explodedArchive89);
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder11);
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = null;
        explodedArchiveTests17.rootFolder = file19;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests17.getarchive();
        java.io.File file23 = null;
        explodedArchiveTests17.setrootFolder(file23);
        java.io.File file25 = explodedArchiveTests17.rootFolder;
        java.io.File file26 = explodedArchiveTests17.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        java.io.File file31 = null;
        explodedArchiveTests27.rootFolder = file31;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = explodedArchiveTests27.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests27.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests27.setarchive(explodedArchive35);
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests27.temporaryFolder;
        explodedArchiveTests17.temporaryFolder = temporaryFolder37;
        explodedArchiveTests0.temporaryFolder = temporaryFolder37;
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = explodedArchiveTests0.getarchive();
        java.io.File file43 = null;
        explodedArchiveTests0.setrootFolder(file43);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests45 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests45.temporaryFolder;
        java.io.File file47 = explodedArchiveTests45.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests45.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests51 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests51.temporaryFolder;
        java.io.File file53 = explodedArchiveTests51.getrootFolder();
        java.io.File file54 = explodedArchiveTests51.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests55 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests55.temporaryFolder;
        explodedArchiveTests51.settemporaryFolder(temporaryFolder56);
        explodedArchiveTests45.temporaryFolder = temporaryFolder56;
        java.io.File file59 = explodedArchiveTests45.getrootFolder();
        java.io.File file60 = explodedArchiveTests45.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests45.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive62 = null;
        explodedArchiveTests45.setarchive(explodedArchive62);
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests45.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests45.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder65;
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(explodedArchive33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(explodedArchive41);
        org.junit.Assert.assertNull(explodedArchive42);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNull(file47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNotNull(temporaryFolder67);
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        java.io.File file10 = null;
        explodedArchiveTests0.rootFolder = file10;
        java.io.File file12 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = null;
        explodedArchiveTests0.setrootFolder(file15);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests12.setarchive(explodedArchive19);
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests12.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = explodedArchiveTests12.archive;
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests12.gettemporaryFolder();
        java.io.File file26 = explodedArchiveTests12.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests12.settemporaryFolder(temporaryFolder33);
        java.io.File file35 = null;
        explodedArchiveTests12.rootFolder = file35;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests12.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder37;
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file40 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests42 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests42.temporaryFolder;
        java.io.File file44 = explodedArchiveTests42.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests42.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests42.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests42.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = null;
        explodedArchiveTests42.setarchive(explodedArchive48);
        java.io.File file50 = explodedArchiveTests42.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = explodedArchiveTests42.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = null;
        explodedArchiveTests42.archive = explodedArchive52;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests54 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests54.temporaryFolder;
        java.io.File file56 = explodedArchiveTests54.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests54.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests54.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests54.gettemporaryFolder();
        java.io.File file60 = null;
        explodedArchiveTests54.setrootFolder(file60);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive62 = explodedArchiveTests54.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests63 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests63.temporaryFolder;
        java.io.File file65 = explodedArchiveTests63.getrootFolder();
        java.io.File file66 = explodedArchiveTests63.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests63.gettemporaryFolder();
        explodedArchiveTests54.temporaryFolder = temporaryFolder67;
        explodedArchiveTests42.settemporaryFolder(temporaryFolder67);
        java.io.File file70 = null;
        explodedArchiveTests42.setrootFolder(file70);
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests42.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder72;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests74 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests74.temporaryFolder;
        java.io.File file76 = explodedArchiveTests74.getrootFolder();
        java.io.File file77 = explodedArchiveTests74.rootFolder;
        java.io.File file78 = explodedArchiveTests74.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder79 = explodedArchiveTests74.gettemporaryFolder();
        java.io.File file80 = explodedArchiveTests74.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder81 = explodedArchiveTests74.temporaryFolder;
        java.io.File file82 = null;
        explodedArchiveTests74.setrootFolder(file82);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests84 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder85 = explodedArchiveTests84.temporaryFolder;
        java.io.File file86 = null;
        explodedArchiveTests84.rootFolder = file86;
        org.junit.rules.TemporaryFolder temporaryFolder88 = explodedArchiveTests84.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive89 = explodedArchiveTests84.getarchive();
        java.io.File file90 = explodedArchiveTests84.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder91 = explodedArchiveTests84.gettemporaryFolder();
        explodedArchiveTests74.temporaryFolder = temporaryFolder91;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder91);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(explodedArchive24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNull(explodedArchive51);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNull(file56);
        org.junit.Assert.assertNotNull(temporaryFolder57);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNull(explodedArchive62);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNull(file76);
        org.junit.Assert.assertNull(file77);
        org.junit.Assert.assertNull(file78);
        org.junit.Assert.assertNotNull(temporaryFolder79);
        org.junit.Assert.assertNull(file80);
        org.junit.Assert.assertNotNull(temporaryFolder81);
        org.junit.Assert.assertNotNull(temporaryFolder85);
        org.junit.Assert.assertNotNull(temporaryFolder88);
        org.junit.Assert.assertNull(explodedArchive89);
        org.junit.Assert.assertNull(file90);
        org.junit.Assert.assertNotNull(temporaryFolder91);
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.archive = explodedArchive13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(explodedArchive16);
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        java.io.File file10 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.archive = explodedArchive12;
        org.junit.rules.TemporaryFolder temporaryFolder14 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file16 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNull(explodedArchive11);
        org.junit.Assert.assertNull(file16);
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        java.io.File file10 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        java.io.File file13 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.nestedDirArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.archive = explodedArchive12;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests0.setarchive(explodedArchive16);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests0.archive = explodedArchive19;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.Archive archive22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap23 = explodedArchiveTests0.getEntriesMap(archive22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(explodedArchive15);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNull(explodedArchive21);
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getFilteredArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNull(explodedArchive13);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.setarchive(explodedArchive6);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        java.io.File file13 = explodedArchiveTests10.rootFolder;
        java.io.File file14 = explodedArchiveTests10.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests10.setarchive(explodedArchive15);
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests10.gettemporaryFolder();
        java.io.File file18 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests10.temporaryFolder;
        java.io.File file20 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests10.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests10.setarchive(explodedArchive22);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests24.gettemporaryFolder();
        java.io.File file28 = null;
        explodedArchiveTests24.rootFolder = file28;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = explodedArchiveTests24.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = null;
        explodedArchiveTests24.setarchive(explodedArchive32);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests24.archive = explodedArchive34;
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests24.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests24.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests38 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests38.temporaryFolder;
        java.io.File file40 = explodedArchiveTests38.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests38.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests38.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests38.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = null;
        explodedArchiveTests38.setarchive(explodedArchive44);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests46 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests46.temporaryFolder;
        java.io.File file48 = explodedArchiveTests46.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests46.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests46.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = null;
        explodedArchiveTests46.setarchive(explodedArchive53);
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests46.gettemporaryFolder();
        explodedArchiveTests38.settemporaryFolder(temporaryFolder55);
        java.io.File file57 = null;
        explodedArchiveTests38.setrootFolder(file57);
        org.junit.rules.TemporaryFolder temporaryFolder59 = explodedArchiveTests38.temporaryFolder;
        explodedArchiveTests24.temporaryFolder = temporaryFolder59;
        explodedArchiveTests10.settemporaryFolder(temporaryFolder59);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder59);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests63 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests63.temporaryFolder;
        java.io.File file65 = explodedArchiveTests63.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests63.gettemporaryFolder();
        java.io.File file67 = null;
        explodedArchiveTests63.rootFolder = file67;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive69 = explodedArchiveTests63.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests63.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder70;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive72 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive73 = explodedArchiveTests0.archive;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(explodedArchive30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNull(file48);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder59);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNotNull(temporaryFolder66);
        org.junit.Assert.assertNull(explodedArchive69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(explodedArchive72);
        org.junit.Assert.assertNull(explodedArchive73);
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = null;
        explodedArchiveTests0.archive = explodedArchive9;
        java.io.File file11 = null;
        explodedArchiveTests0.rootFolder = file11;
        java.io.File file13 = null;
        explodedArchiveTests0.setrootFolder(file13);
        java.io.File file15 = explodedArchiveTests0.getrootFolder();
        java.io.File file16 = null;
        explodedArchiveTests0.rootFolder = file16;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests18 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests18.temporaryFolder;
        java.io.File file20 = null;
        explodedArchiveTests18.rootFolder = file20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = explodedArchiveTests18.archive;
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests18.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests18.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        java.io.File file27 = explodedArchiveTests25.getrootFolder();
        java.io.File file28 = explodedArchiveTests25.rootFolder;
        java.io.File file29 = explodedArchiveTests25.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = null;
        explodedArchiveTests25.setarchive(explodedArchive30);
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests25.gettemporaryFolder();
        java.io.File file33 = explodedArchiveTests25.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = explodedArchiveTests25.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = explodedArchiveTests25.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests36 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests36.temporaryFolder;
        java.io.File file38 = explodedArchiveTests36.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests36.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests36.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests36.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests42 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests42.temporaryFolder;
        java.io.File file44 = explodedArchiveTests42.getrootFolder();
        java.io.File file45 = explodedArchiveTests42.rootFolder;
        java.io.File file46 = explodedArchiveTests42.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = null;
        explodedArchiveTests42.setarchive(explodedArchive47);
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests42.gettemporaryFolder();
        explodedArchiveTests36.temporaryFolder = temporaryFolder49;
        explodedArchiveTests25.temporaryFolder = temporaryFolder49;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests52 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests52.temporaryFolder;
        java.io.File file54 = explodedArchiveTests52.getrootFolder();
        java.io.File file55 = explodedArchiveTests52.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests52.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = null;
        explodedArchiveTests52.archive = explodedArchive57;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = null;
        explodedArchiveTests52.archive = explodedArchive59;
        org.junit.rules.TemporaryFolder temporaryFolder61 = explodedArchiveTests52.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive62 = null;
        explodedArchiveTests52.archive = explodedArchive62;
        java.io.File file64 = explodedArchiveTests52.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests52.temporaryFolder;
        explodedArchiveTests25.settemporaryFolder(temporaryFolder65);
        explodedArchiveTests18.settemporaryFolder(temporaryFolder65);
        explodedArchiveTests0.temporaryFolder = temporaryFolder65;
        org.springframework.boot.loader.archive.Archive archive69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap70 = explodedArchiveTests0.getEntriesMap(archive69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(explodedArchive34);
        org.junit.Assert.assertNull(explodedArchive35);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNull(file46);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNull(file55);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder61);
        org.junit.Assert.assertNull(file64);
        org.junit.Assert.assertNotNull(temporaryFolder65);
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        java.io.File file14 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.archive = explodedArchive17;
        java.io.File file19 = null;
        explodedArchiveTests0.setrootFolder(file19);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        java.io.File file9 = explodedArchiveTests6.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        explodedArchiveTests6.settemporaryFolder(temporaryFolder11);
        explodedArchiveTests0.temporaryFolder = temporaryFolder11;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        java.io.File file18 = explodedArchiveTests15.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests15.setarchive(explodedArchive19);
        java.io.File file21 = explodedArchiveTests15.getrootFolder();
        java.io.File file22 = null;
        explodedArchiveTests15.rootFolder = file22;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests27.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests27.gettemporaryFolder();
        java.io.File file34 = explodedArchiveTests27.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests27.setarchive(explodedArchive35);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = explodedArchiveTests27.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests24.settemporaryFolder(temporaryFolder38);
        explodedArchiveTests15.settemporaryFolder(temporaryFolder38);
        explodedArchiveTests0.temporaryFolder = temporaryFolder38;
        java.io.File file42 = null;
        explodedArchiveTests0.rootFolder = file42;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(explodedArchive37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests8.rootFolder = file12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        java.io.File file25 = explodedArchiveTests22.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests22.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests16.temporaryFolder = temporaryFolder27;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests16.temporaryFolder = temporaryFolder33;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder33);
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests0.temporaryFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder37);
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.File file8 = null;
        explodedArchiveTests0.setrootFolder(file8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        java.io.File file12 = null;
        explodedArchiveTests0.setrootFolder(file12);
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.archive = explodedArchive15;
        java.io.File file17 = explodedArchiveTests0.getrootFolder();
        java.io.File file18 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(explodedArchive19);
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        java.io.File file16 = explodedArchiveTests9.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests9.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests19 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests19.temporaryFolder;
        java.io.File file21 = explodedArchiveTests19.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests19.gettemporaryFolder();
        explodedArchiveTests9.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests0.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests0.temporaryFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder27);
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests5.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests5.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = null;
        explodedArchiveTests0.archive = explodedArchive25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder27);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests29 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests29.temporaryFolder;
        java.io.File file31 = explodedArchiveTests29.getrootFolder();
        java.io.File file32 = explodedArchiveTests29.getrootFolder();
        java.io.File file33 = explodedArchiveTests29.rootFolder;
        java.io.File file34 = explodedArchiveTests29.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests35.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        java.io.File file44 = explodedArchiveTests41.rootFolder;
        java.io.File file45 = explodedArchiveTests41.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests41.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests35.temporaryFolder = temporaryFolder48;
        explodedArchiveTests29.settemporaryFolder(temporaryFolder48);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder48);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = null;
        explodedArchiveTests0.setarchive(explodedArchive52);
        java.io.File file54 = null;
        explodedArchiveTests0.rootFolder = file54;
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests57 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder58 = explodedArchiveTests57.temporaryFolder;
        java.io.File file59 = explodedArchiveTests57.getrootFolder();
        java.io.File file60 = explodedArchiveTests57.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = null;
        explodedArchiveTests57.setarchive(explodedArchive61);
        java.io.File file63 = explodedArchiveTests57.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests64 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests64.temporaryFolder;
        java.io.File file66 = explodedArchiveTests64.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder67 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder69 = explodedArchiveTests64.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests64.gettemporaryFolder();
        java.io.File file71 = explodedArchiveTests64.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests64.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests64.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive74 = null;
        explodedArchiveTests64.setarchive(explodedArchive74);
        org.junit.rules.TemporaryFolder temporaryFolder76 = explodedArchiveTests64.temporaryFolder;
        explodedArchiveTests57.temporaryFolder = temporaryFolder76;
        org.junit.rules.TemporaryFolder temporaryFolder78 = explodedArchiveTests57.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder78);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getFilteredArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNotNull(temporaryFolder58);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNull(file60);
        org.junit.Assert.assertNull(file63);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(file66);
        org.junit.Assert.assertNotNull(temporaryFolder67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder69);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNotNull(temporaryFolder76);
        org.junit.Assert.assertNotNull(temporaryFolder78);
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = null;
        explodedArchiveTests9.setarchive(explodedArchive16);
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests9.archive;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests9.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = null;
        explodedArchiveTests23.rootFolder = file25;
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests23.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = explodedArchiveTests23.getarchive();
        java.io.File file29 = null;
        explodedArchiveTests23.setrootFolder(file29);
        java.io.File file31 = explodedArchiveTests23.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder37 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests32.gettemporaryFolder();
        java.io.File file39 = explodedArchiveTests32.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = null;
        explodedArchiveTests32.setarchive(explodedArchive40);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = explodedArchiveTests32.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests32.temporaryFolder;
        explodedArchiveTests23.settemporaryFolder(temporaryFolder44);
        explodedArchiveTests9.settemporaryFolder(temporaryFolder44);
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests9.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder47);
        java.io.File file49 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests50 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests50.temporaryFolder;
        java.io.File file52 = explodedArchiveTests50.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests50.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests50.gettemporaryFolder();
        java.io.File file55 = null;
        explodedArchiveTests50.setrootFolder(file55);
        java.io.File file57 = null;
        explodedArchiveTests50.setrootFolder(file57);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        java.io.File file61 = null;
        explodedArchiveTests59.rootFolder = file61;
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests59.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive64 = explodedArchiveTests59.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder65 = explodedArchiveTests59.gettemporaryFolder();
        explodedArchiveTests50.temporaryFolder = temporaryFolder65;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive67 = explodedArchiveTests50.archive;
        org.junit.rules.TemporaryFolder temporaryFolder68 = explodedArchiveTests50.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder68);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNull(explodedArchive28);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNotNull(temporaryFolder37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNull(explodedArchive42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNull(explodedArchive64);
        org.junit.Assert.assertNotNull(temporaryFolder65);
        org.junit.Assert.assertNull(explodedArchive67);
        org.junit.Assert.assertNotNull(temporaryFolder68);
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        java.io.File file15 = null;
        explodedArchiveTests0.setrootFolder(file15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = null;
        explodedArchiveTests0.archive = explodedArchive22;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(explodedArchive19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive21);
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = null;
        explodedArchiveTests0.archive = explodedArchive6;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        java.io.File file12 = null;
        explodedArchiveTests8.rootFolder = file12;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = explodedArchiveTests8.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests16 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests16.temporaryFolder;
        java.io.File file18 = explodedArchiveTests16.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests16.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests16.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        java.io.File file25 = explodedArchiveTests22.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests26 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests26.temporaryFolder;
        explodedArchiveTests22.settemporaryFolder(temporaryFolder27);
        explodedArchiveTests16.temporaryFolder = temporaryFolder27;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests30.gettemporaryFolder();
        explodedArchiveTests16.temporaryFolder = temporaryFolder33;
        explodedArchiveTests8.settemporaryFolder(temporaryFolder33);
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = null;
        explodedArchiveTests0.archive = explodedArchive39;
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests0.gettemporaryFolder();
        java.lang.Class<?> wildcardClass42 = temporaryFolder41.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(explodedArchive37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = explodedArchiveTests0.rootFolder;
        java.io.File file7 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file9 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.archive;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests0.setarchive(explodedArchive14);
        java.lang.Class<?> wildcardClass16 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(explodedArchive13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests9.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests9.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests17 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests17.temporaryFolder;
        java.io.File file19 = explodedArchiveTests17.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests17.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests17.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = null;
        explodedArchiveTests17.setarchive(explodedArchive24);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests17.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests27 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests27.temporaryFolder;
        java.io.File file29 = explodedArchiveTests27.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests27.gettemporaryFolder();
        explodedArchiveTests17.settemporaryFolder(temporaryFolder30);
        explodedArchiveTests9.temporaryFolder = temporaryFolder30;
        explodedArchiveTests0.temporaryFolder = temporaryFolder30;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests35 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder36 = explodedArchiveTests35.temporaryFolder;
        java.io.File file37 = explodedArchiveTests35.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder39 = explodedArchiveTests35.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests35.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        java.io.File file44 = explodedArchiveTests41.rootFolder;
        java.io.File file45 = explodedArchiveTests41.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests41.setarchive(explodedArchive46);
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests35.temporaryFolder = temporaryFolder48;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = explodedArchiveTests35.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests51 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests51.temporaryFolder;
        java.io.File file53 = explodedArchiveTests51.getrootFolder();
        java.io.File file54 = explodedArchiveTests51.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive55 = null;
        explodedArchiveTests51.setarchive(explodedArchive55);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive57 = null;
        explodedArchiveTests51.archive = explodedArchive57;
        java.io.File file59 = explodedArchiveTests51.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests51.temporaryFolder;
        explodedArchiveTests35.settemporaryFolder(temporaryFolder60);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder60);
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests0.temporaryFolder;
        java.io.File file64 = null;
        explodedArchiveTests0.rootFolder = file64;
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.setup();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNotNull(temporaryFolder36);
        org.junit.Assert.assertNull(file37);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNotNull(temporaryFolder39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(explodedArchive50);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(file53);
        org.junit.Assert.assertNull(file54);
        org.junit.Assert.assertNull(file59);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNotNull(temporaryFolder66);
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests5.temporaryFolder;
        java.io.File file12 = null;
        explodedArchiveTests5.setrootFolder(file12);
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests5.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder14);
        java.io.File file16 = explodedArchiveTests0.rootFolder;
        java.io.File file17 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests0.archive = explodedArchive18;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(file17);
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests8 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests8.temporaryFolder;
        java.io.File file10 = explodedArchiveTests8.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests8.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests8.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.temporaryFolder;
        explodedArchiveTests8.temporaryFolder = temporaryFolder18;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder18);
        java.io.File file21 = null;
        explodedArchiveTests0.rootFolder = file21;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests24.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.getrootFolder();
        java.io.File file33 = explodedArchiveTests30.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests34 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests34.temporaryFolder;
        explodedArchiveTests30.settemporaryFolder(temporaryFolder35);
        explodedArchiveTests24.temporaryFolder = temporaryFolder35;
        java.io.File file38 = explodedArchiveTests24.getrootFolder();
        java.io.File file39 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests24.gettemporaryFolder();
        java.io.File file41 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests24.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNull(explodedArchive23);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(file41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests0.archive = explodedArchive11;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests0.archive = explodedArchive17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests20 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests20.temporaryFolder;
        java.io.File file22 = explodedArchiveTests20.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests20.gettemporaryFolder();
        java.io.File file24 = null;
        explodedArchiveTests20.rootFolder = file24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests20.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = null;
        explodedArchiveTests20.archive = explodedArchive27;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests20.archive = explodedArchive29;
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests20.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder31);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNotNull(temporaryFolder31);
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive2 = null;
        explodedArchiveTests0.setarchive(explodedArchive2);
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests6.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests6.gettemporaryFolder();
        java.io.File file13 = explodedArchiveTests6.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = null;
        explodedArchiveTests6.setarchive(explodedArchive14);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = explodedArchiveTests6.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests6.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder17;
        java.io.File file19 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.Archive archive20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap21 = explodedArchiveTests0.getEntriesMap(archive20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNull(explodedArchive16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file19);
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.rootFolder = file5;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests7 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests7.temporaryFolder;
        java.io.File file9 = explodedArchiveTests7.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests7.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests7.gettemporaryFolder();
        java.io.File file14 = explodedArchiveTests7.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = null;
        explodedArchiveTests15.rootFolder = file17;
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = explodedArchiveTests15.getarchive();
        java.io.File file21 = null;
        explodedArchiveTests15.setrootFolder(file21);
        java.io.File file23 = explodedArchiveTests15.rootFolder;
        java.io.File file24 = explodedArchiveTests15.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests25 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests25.temporaryFolder;
        java.io.File file27 = explodedArchiveTests25.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests25.gettemporaryFolder();
        java.io.File file29 = null;
        explodedArchiveTests25.rootFolder = file29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests25.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests25.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = null;
        explodedArchiveTests25.setarchive(explodedArchive33);
        org.junit.rules.TemporaryFolder temporaryFolder35 = explodedArchiveTests25.temporaryFolder;
        explodedArchiveTests15.temporaryFolder = temporaryFolder35;
        explodedArchiveTests7.temporaryFolder = temporaryFolder35;
        explodedArchiveTests0.temporaryFolder = temporaryFolder35;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = explodedArchiveTests0.archive;
        java.io.File file40 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = null;
        explodedArchiveTests0.setarchive(explodedArchive42);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNotNull(temporaryFolder12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNull(explodedArchive20);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNotNull(temporaryFolder35);
        org.junit.Assert.assertNull(explodedArchive39);
        org.junit.Assert.assertNull(file40);
        org.junit.Assert.assertNull(explodedArchive41);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.temporaryFolder;
        java.io.File file6 = explodedArchiveTests0.getrootFolder();
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests9 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests9.temporaryFolder;
        java.io.File file11 = explodedArchiveTests9.getrootFolder();
        java.io.File file12 = explodedArchiveTests9.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests9.setarchive(explodedArchive13);
        java.io.File file15 = explodedArchiveTests9.getrootFolder();
        java.io.File file16 = explodedArchiveTests9.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = null;
        explodedArchiveTests9.setarchive(explodedArchive17);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = null;
        explodedArchiveTests9.setarchive(explodedArchive19);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests9.archive = explodedArchive21;
        java.io.File file23 = null;
        explodedArchiveTests9.rootFolder = file23;
        java.io.File file25 = null;
        explodedArchiveTests9.rootFolder = file25;
        java.io.File file27 = null;
        explodedArchiveTests9.rootFolder = file27;
        java.io.File file29 = null;
        explodedArchiveTests9.rootFolder = file29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests9.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests32 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests32.temporaryFolder;
        java.io.File file34 = explodedArchiveTests32.getrootFolder();
        java.io.File file35 = explodedArchiveTests32.rootFolder;
        java.io.File file36 = explodedArchiveTests32.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests37.temporaryFolder;
        java.io.File file45 = explodedArchiveTests37.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = explodedArchiveTests37.archive;
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests37.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests48 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder49 = explodedArchiveTests48.temporaryFolder;
        java.io.File file50 = explodedArchiveTests48.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder51 = explodedArchiveTests48.gettemporaryFolder();
        java.io.File file52 = null;
        explodedArchiveTests48.rootFolder = file52;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = explodedArchiveTests48.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests48.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = null;
        explodedArchiveTests48.setarchive(explodedArchive56);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive58 = null;
        explodedArchiveTests48.archive = explodedArchive58;
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests48.temporaryFolder;
        explodedArchiveTests37.temporaryFolder = temporaryFolder60;
        explodedArchiveTests32.settemporaryFolder(temporaryFolder60);
        org.junit.rules.TemporaryFolder temporaryFolder63 = explodedArchiveTests32.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests32.temporaryFolder;
        explodedArchiveTests9.settemporaryFolder(temporaryFolder64);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder64);
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNull(file6);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNull(file11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file34);
        org.junit.Assert.assertNull(file35);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(file45);
        org.junit.Assert.assertNull(explodedArchive46);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNotNull(temporaryFolder49);
        org.junit.Assert.assertNull(file50);
        org.junit.Assert.assertNotNull(temporaryFolder51);
        org.junit.Assert.assertNull(explodedArchive54);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder63);
        org.junit.Assert.assertNotNull(temporaryFolder64);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests5.gettemporaryFolder();
        java.io.File file12 = explodedArchiveTests5.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = null;
        explodedArchiveTests13.rootFolder = file15;
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = explodedArchiveTests13.getarchive();
        java.io.File file19 = null;
        explodedArchiveTests13.setrootFolder(file19);
        java.io.File file21 = explodedArchiveTests13.rootFolder;
        java.io.File file22 = explodedArchiveTests13.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests23 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder24 = explodedArchiveTests23.temporaryFolder;
        java.io.File file25 = explodedArchiveTests23.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests23.gettemporaryFolder();
        java.io.File file27 = null;
        explodedArchiveTests23.rootFolder = file27;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = explodedArchiveTests23.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder30 = explodedArchiveTests23.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests23.setarchive(explodedArchive31);
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests23.temporaryFolder;
        explodedArchiveTests13.temporaryFolder = temporaryFolder33;
        explodedArchiveTests5.temporaryFolder = temporaryFolder33;
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        java.io.File file41 = null;
        explodedArchiveTests37.rootFolder = file41;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = explodedArchiveTests37.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests37.gettemporaryFolder();
        java.io.File file45 = null;
        explodedArchiveTests37.setrootFolder(file45);
        java.io.File file47 = null;
        explodedArchiveTests37.rootFolder = file47;
        java.io.File file49 = explodedArchiveTests37.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests37.temporaryFolder;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder50);
        java.io.File file52 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file54 = explodedArchiveTests0.getrootFolder();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(explodedArchive18);
        org.junit.Assert.assertNull(file21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNotNull(temporaryFolder24);
        org.junit.Assert.assertNull(file25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNull(explodedArchive29);
        org.junit.Assert.assertNotNull(temporaryFolder30);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNull(explodedArchive43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNull(file54);
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive13 = null;
        explodedArchiveTests0.setarchive(explodedArchive13);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests15.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests15.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = explodedArchiveTests15.archive;
        java.io.File file22 = explodedArchiveTests15.rootFolder;
        java.io.File file23 = explodedArchiveTests15.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests24 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests24.temporaryFolder;
        java.io.File file26 = explodedArchiveTests24.getrootFolder();
        java.io.File file27 = explodedArchiveTests24.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = null;
        explodedArchiveTests24.archive = explodedArchive29;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = null;
        explodedArchiveTests24.archive = explodedArchive31;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests24.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = null;
        explodedArchiveTests24.archive = explodedArchive34;
        java.io.File file36 = explodedArchiveTests24.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = explodedArchiveTests24.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = explodedArchiveTests24.getarchive();
        java.io.File file39 = explodedArchiveTests24.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests40 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests40.temporaryFolder;
        java.io.File file42 = explodedArchiveTests40.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests40.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests40.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests40.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = null;
        explodedArchiveTests40.setarchive(explodedArchive46);
        java.io.File file48 = null;
        explodedArchiveTests40.rootFolder = file48;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = explodedArchiveTests40.archive;
        java.io.File file51 = null;
        explodedArchiveTests40.rootFolder = file51;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = null;
        explodedArchiveTests40.setarchive(explodedArchive53);
        org.junit.rules.TemporaryFolder temporaryFolder55 = explodedArchiveTests40.gettemporaryFolder();
        explodedArchiveTests24.settemporaryFolder(temporaryFolder55);
        org.junit.rules.TemporaryFolder temporaryFolder57 = explodedArchiveTests24.temporaryFolder;
        explodedArchiveTests15.settemporaryFolder(temporaryFolder57);
        explodedArchiveTests0.temporaryFolder = temporaryFolder57;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrlWithSpaceInPath();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNull(explodedArchive21);
        org.junit.Assert.assertNull(file22);
        org.junit.Assert.assertNull(file23);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNull(file26);
        org.junit.Assert.assertNull(file27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNotNull(temporaryFolder33);
        org.junit.Assert.assertNull(file36);
        org.junit.Assert.assertNull(explodedArchive37);
        org.junit.Assert.assertNull(explodedArchive38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNull(file42);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNull(explodedArchive50);
        org.junit.Assert.assertNotNull(temporaryFolder55);
        org.junit.Assert.assertNotNull(temporaryFolder57);
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests6 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests6.temporaryFolder;
        java.io.File file8 = explodedArchiveTests6.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests6.gettemporaryFolder();
        java.io.File file10 = null;
        explodedArchiveTests6.rootFolder = file10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests6.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests6.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests14 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests14.temporaryFolder;
        java.io.File file16 = explodedArchiveTests14.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests14.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests14.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests14.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder20 = explodedArchiveTests14.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = null;
        explodedArchiveTests14.setarchive(explodedArchive21);
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests14.gettemporaryFolder();
        explodedArchiveTests6.settemporaryFolder(temporaryFolder23);
        explodedArchiveTests0.settemporaryFolder(temporaryFolder23);
        java.io.File file26 = null;
        explodedArchiveTests0.setrootFolder(file26);
        java.io.File file28 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests0.temporaryFolder;
        java.io.File file30 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive31 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNull(file16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder20);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file28);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(explodedArchive31);
        org.junit.Assert.assertNull(explodedArchive32);
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests5 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests5.temporaryFolder;
        java.io.File file7 = explodedArchiveTests5.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests5.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder10 = explodedArchiveTests5.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive11 = null;
        explodedArchiveTests5.setarchive(explodedArchive11);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests13 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder14 = explodedArchiveTests13.temporaryFolder;
        java.io.File file15 = explodedArchiveTests13.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder18 = explodedArchiveTests13.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder19 = explodedArchiveTests13.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests13.setarchive(explodedArchive20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests13.gettemporaryFolder();
        explodedArchiveTests5.settemporaryFolder(temporaryFolder22);
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file25 = null;
        explodedArchiveTests0.rootFolder = file25;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests28 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests28.temporaryFolder;
        java.io.File file30 = explodedArchiveTests28.getrootFolder();
        java.io.File file31 = explodedArchiveTests28.rootFolder;
        java.io.File file32 = explodedArchiveTests28.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder33 = explodedArchiveTests28.gettemporaryFolder();
        explodedArchiveTests0.temporaryFolder = temporaryFolder33;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = null;
        explodedArchiveTests0.archive = explodedArchive35;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNotNull(temporaryFolder10);
        org.junit.Assert.assertNotNull(temporaryFolder14);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNotNull(temporaryFolder18);
        org.junit.Assert.assertNotNull(temporaryFolder19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNull(file30);
        org.junit.Assert.assertNull(file31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNotNull(temporaryFolder33);
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.createArchive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: the temporary folder has not yet been created");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.getrootFolder();
        java.io.File file4 = explodedArchiveTests0.rootFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = explodedArchiveTests0.getarchive();
        java.io.File file9 = null;
        explodedArchiveTests0.rootFolder = file9;
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests0.temporaryFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifest();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(file4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNull(explodedArchive8);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(explodedArchive12);
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = null;
        explodedArchiveTests0.setarchive(explodedArchive4);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = explodedArchiveTests0.archive;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.archive = explodedArchive8;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.setarchive(explodedArchive10);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.archive = explodedArchive12;
        java.io.File file14 = explodedArchiveTests0.getrootFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(explodedArchive7);
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = null;
        explodedArchiveTests0.setarchive(explodedArchive8);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests10 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder11 = explodedArchiveTests10.temporaryFolder;
        java.io.File file12 = explodedArchiveTests10.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests10.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder13);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests15 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests15.temporaryFolder;
        java.io.File file17 = explodedArchiveTests15.getrootFolder();
        java.io.File file18 = explodedArchiveTests15.rootFolder;
        java.io.File file19 = explodedArchiveTests15.rootFolder;
        java.io.File file20 = null;
        explodedArchiveTests15.setrootFolder(file20);
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests15.temporaryFolder;
        explodedArchiveTests0.temporaryFolder = temporaryFolder22;
        java.io.File file24 = null;
        explodedArchiveTests0.rootFolder = file24;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests28 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder29 = explodedArchiveTests28.temporaryFolder;
        java.io.File file30 = null;
        explodedArchiveTests28.rootFolder = file30;
        org.junit.rules.TemporaryFolder temporaryFolder32 = explodedArchiveTests28.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = explodedArchiveTests28.getarchive();
        java.io.File file34 = null;
        explodedArchiveTests28.setrootFolder(file34);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = explodedArchiveTests28.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests37 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder38 = explodedArchiveTests37.temporaryFolder;
        java.io.File file39 = explodedArchiveTests37.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder40 = explodedArchiveTests37.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder41 = explodedArchiveTests37.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests42 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder43 = explodedArchiveTests42.temporaryFolder;
        java.io.File file44 = explodedArchiveTests42.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder45 = explodedArchiveTests42.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder46 = explodedArchiveTests42.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder47 = explodedArchiveTests42.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests42.gettemporaryFolder();
        java.io.File file49 = explodedArchiveTests42.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests42.temporaryFolder;
        explodedArchiveTests37.temporaryFolder = temporaryFolder50;
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests37.temporaryFolder;
        explodedArchiveTests28.settemporaryFolder(temporaryFolder52);
        explodedArchiveTests0.temporaryFolder = temporaryFolder52;
        java.io.File file55 = explodedArchiveTests0.rootFolder;
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNotNull(temporaryFolder11);
        org.junit.Assert.assertNull(file12);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNull(file17);
        org.junit.Assert.assertNull(file18);
        org.junit.Assert.assertNull(file19);
        org.junit.Assert.assertNotNull(temporaryFolder22);
        org.junit.Assert.assertNull(explodedArchive26);
        org.junit.Assert.assertNull(explodedArchive27);
        org.junit.Assert.assertNotNull(temporaryFolder29);
        org.junit.Assert.assertNotNull(temporaryFolder32);
        org.junit.Assert.assertNull(explodedArchive33);
        org.junit.Assert.assertNull(explodedArchive36);
        org.junit.Assert.assertNotNull(temporaryFolder38);
        org.junit.Assert.assertNull(file39);
        org.junit.Assert.assertNotNull(temporaryFolder40);
        org.junit.Assert.assertNotNull(temporaryFolder41);
        org.junit.Assert.assertNotNull(temporaryFolder43);
        org.junit.Assert.assertNull(file44);
        org.junit.Assert.assertNotNull(temporaryFolder45);
        org.junit.Assert.assertNotNull(temporaryFolder46);
        org.junit.Assert.assertNotNull(temporaryFolder47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNull(file49);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNull(file55);
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        java.io.File file7 = null;
        explodedArchiveTests0.rootFolder = file7;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getEntries();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(explodedArchive10);
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive1 = explodedArchiveTests0.archive;
        java.io.File file2 = null;
        explodedArchiveTests0.setrootFolder(file2);
        java.io.File file4 = null;
        explodedArchiveTests0.setrootFolder(file4);
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStream();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(explodedArchive1);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder5 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder6 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file7 = explodedArchiveTests0.getrootFolder();
        java.io.File file8 = explodedArchiveTests0.getrootFolder();
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder10 = null;
        explodedArchiveTests0.temporaryFolder = temporaryFolder10;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests12 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder13 = explodedArchiveTests12.temporaryFolder;
        java.io.File file14 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder16 = explodedArchiveTests12.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder17 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = null;
        explodedArchiveTests12.setarchive(explodedArchive18);
        java.io.File file20 = explodedArchiveTests12.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder21 = explodedArchiveTests12.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests22 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests22.temporaryFolder;
        java.io.File file24 = explodedArchiveTests22.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder25 = explodedArchiveTests22.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder26 = explodedArchiveTests22.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder27 = explodedArchiveTests22.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder28 = explodedArchiveTests22.gettemporaryFolder();
        java.io.File file29 = explodedArchiveTests22.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests30 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder31 = explodedArchiveTests30.temporaryFolder;
        java.io.File file32 = explodedArchiveTests30.getrootFolder();
        java.io.File file33 = explodedArchiveTests30.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder34 = explodedArchiveTests30.temporaryFolder;
        explodedArchiveTests22.temporaryFolder = temporaryFolder34;
        explodedArchiveTests12.temporaryFolder = temporaryFolder34;
        explodedArchiveTests0.temporaryFolder = temporaryFolder34;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = null;
        explodedArchiveTests0.setarchive(explodedArchive38);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests41 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder42 = explodedArchiveTests41.temporaryFolder;
        java.io.File file43 = explodedArchiveTests41.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder44 = explodedArchiveTests41.gettemporaryFolder();
        java.io.File file45 = null;
        explodedArchiveTests41.rootFolder = file45;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = explodedArchiveTests41.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder48 = explodedArchiveTests41.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests49 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder50 = explodedArchiveTests49.temporaryFolder;
        java.io.File file51 = explodedArchiveTests49.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder52 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder53 = explodedArchiveTests49.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder54 = explodedArchiveTests49.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests55 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder56 = explodedArchiveTests55.temporaryFolder;
        java.io.File file57 = explodedArchiveTests55.getrootFolder();
        java.io.File file58 = explodedArchiveTests55.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests59 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder60 = explodedArchiveTests59.temporaryFolder;
        explodedArchiveTests55.settemporaryFolder(temporaryFolder60);
        explodedArchiveTests49.temporaryFolder = temporaryFolder60;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests63 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder64 = explodedArchiveTests63.temporaryFolder;
        java.io.File file65 = explodedArchiveTests63.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder66 = explodedArchiveTests63.gettemporaryFolder();
        explodedArchiveTests49.temporaryFolder = temporaryFolder66;
        explodedArchiveTests41.settemporaryFolder(temporaryFolder66);
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests69 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder70 = explodedArchiveTests69.temporaryFolder;
        java.io.File file71 = explodedArchiveTests69.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder72 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder73 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder74 = explodedArchiveTests69.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder75 = explodedArchiveTests69.gettemporaryFolder();
        java.io.File file76 = explodedArchiveTests69.getrootFolder();
        java.io.File file77 = explodedArchiveTests69.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests78 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder79 = explodedArchiveTests78.temporaryFolder;
        java.io.File file80 = explodedArchiveTests78.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive81 = null;
        explodedArchiveTests78.setarchive(explodedArchive81);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive83 = explodedArchiveTests78.archive;
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests84 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder85 = explodedArchiveTests84.temporaryFolder;
        java.io.File file86 = explodedArchiveTests84.getrootFolder();
        java.io.File file87 = explodedArchiveTests84.getrootFolder();
        java.io.File file88 = explodedArchiveTests84.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder89 = explodedArchiveTests84.gettemporaryFolder();
        explodedArchiveTests78.settemporaryFolder(temporaryFolder89);
        explodedArchiveTests69.temporaryFolder = temporaryFolder89;
        explodedArchiveTests41.temporaryFolder = temporaryFolder89;
        org.junit.rules.TemporaryFolder temporaryFolder93 = explodedArchiveTests41.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive94 = null;
        explodedArchiveTests41.setarchive(explodedArchive94);
        org.junit.rules.TemporaryFolder temporaryFolder96 = explodedArchiveTests41.gettemporaryFolder();
        explodedArchiveTests0.settemporaryFolder(temporaryFolder96);
        java.lang.Class<?> wildcardClass98 = explodedArchiveTests0.getClass();
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNotNull(temporaryFolder5);
        org.junit.Assert.assertNotNull(temporaryFolder6);
        org.junit.Assert.assertNull(file7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNull(file9);
        org.junit.Assert.assertNotNull(temporaryFolder13);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNotNull(temporaryFolder15);
        org.junit.Assert.assertNotNull(temporaryFolder16);
        org.junit.Assert.assertNotNull(temporaryFolder17);
        org.junit.Assert.assertNull(file20);
        org.junit.Assert.assertNotNull(temporaryFolder21);
        org.junit.Assert.assertNotNull(temporaryFolder23);
        org.junit.Assert.assertNull(file24);
        org.junit.Assert.assertNotNull(temporaryFolder25);
        org.junit.Assert.assertNotNull(temporaryFolder26);
        org.junit.Assert.assertNotNull(temporaryFolder27);
        org.junit.Assert.assertNotNull(temporaryFolder28);
        org.junit.Assert.assertNull(file29);
        org.junit.Assert.assertNotNull(temporaryFolder31);
        org.junit.Assert.assertNull(file32);
        org.junit.Assert.assertNull(file33);
        org.junit.Assert.assertNotNull(temporaryFolder34);
        org.junit.Assert.assertNull(explodedArchive40);
        org.junit.Assert.assertNotNull(temporaryFolder42);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(temporaryFolder44);
        org.junit.Assert.assertNull(explodedArchive47);
        org.junit.Assert.assertNotNull(temporaryFolder48);
        org.junit.Assert.assertNotNull(temporaryFolder50);
        org.junit.Assert.assertNull(file51);
        org.junit.Assert.assertNotNull(temporaryFolder52);
        org.junit.Assert.assertNotNull(temporaryFolder53);
        org.junit.Assert.assertNotNull(temporaryFolder54);
        org.junit.Assert.assertNotNull(temporaryFolder56);
        org.junit.Assert.assertNull(file57);
        org.junit.Assert.assertNull(file58);
        org.junit.Assert.assertNotNull(temporaryFolder60);
        org.junit.Assert.assertNotNull(temporaryFolder64);
        org.junit.Assert.assertNull(file65);
        org.junit.Assert.assertNotNull(temporaryFolder66);
        org.junit.Assert.assertNotNull(temporaryFolder70);
        org.junit.Assert.assertNull(file71);
        org.junit.Assert.assertNotNull(temporaryFolder72);
        org.junit.Assert.assertNotNull(temporaryFolder73);
        org.junit.Assert.assertNotNull(temporaryFolder74);
        org.junit.Assert.assertNotNull(temporaryFolder75);
        org.junit.Assert.assertNull(file76);
        org.junit.Assert.assertNull(file77);
        org.junit.Assert.assertNotNull(temporaryFolder79);
        org.junit.Assert.assertNull(file80);
        org.junit.Assert.assertNull(explodedArchive83);
        org.junit.Assert.assertNotNull(temporaryFolder85);
        org.junit.Assert.assertNull(file86);
        org.junit.Assert.assertNull(file87);
        org.junit.Assert.assertNull(file88);
        org.junit.Assert.assertNotNull(temporaryFolder89);
        org.junit.Assert.assertNotNull(temporaryFolder93);
        org.junit.Assert.assertNotNull(temporaryFolder96);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = null;
        explodedArchiveTests0.archive = explodedArchive5;
        java.io.File file7 = null;
        explodedArchiveTests0.setrootFolder(file7);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        java.io.File file10 = null;
        explodedArchiveTests0.rootFolder = file10;
        java.io.File file12 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.Archive archive13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.springframework.boot.loader.archive.Archive.Entry> strMap14 = explodedArchiveTests0.getEntriesMap(archive13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(file12);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        java.io.File file3 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.temporaryFolder;
        java.io.File file5 = explodedArchiveTests0.getrootFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive7 = null;
        explodedArchiveTests0.setarchive(explodedArchive7);
        java.io.File file9 = explodedArchiveTests0.rootFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNull(file3);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(file5);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.junit.rules.TemporaryFolder temporaryFolder4 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive5 = explodedArchiveTests0.getarchive();
        java.io.File file6 = null;
        explodedArchiveTests0.setrootFolder(file6);
        org.junit.rules.TemporaryFolder temporaryFolder8 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive9 = explodedArchiveTests0.archive;
        org.junit.rules.TemporaryFolder temporaryFolder10 = null;
        explodedArchiveTests0.settemporaryFolder(temporaryFolder10);
        org.junit.rules.TemporaryFolder temporaryFolder12 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file13 = null;
        explodedArchiveTests0.rootFolder = file13;
        org.junit.rules.TemporaryFolder temporaryFolder15 = explodedArchiveTests0.temporaryFolder;
        java.io.File file16 = null;
        explodedArchiveTests0.setrootFolder(file16);
        java.io.File file18 = null;
        explodedArchiveTests0.setrootFolder(file18);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = null;
        explodedArchiveTests0.archive = explodedArchive20;
        org.junit.rules.TemporaryFolder temporaryFolder22 = explodedArchiveTests0.temporaryFolder;
        org.junit.rules.TemporaryFolder temporaryFolder23 = explodedArchiveTests0.temporaryFolder;
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNotNull(temporaryFolder4);
        org.junit.Assert.assertNull(explodedArchive5);
        org.junit.Assert.assertNotNull(temporaryFolder8);
        org.junit.Assert.assertNull(explodedArchive9);
        org.junit.Assert.assertNull(temporaryFolder12);
        org.junit.Assert.assertNull(temporaryFolder15);
        org.junit.Assert.assertNull(temporaryFolder22);
        org.junit.Assert.assertNull(temporaryFolder23);
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = explodedArchiveTests0.getrootFolder();
        org.junit.rules.TemporaryFolder temporaryFolder3 = explodedArchiveTests0.gettemporaryFolder();
        java.io.File file4 = null;
        explodedArchiveTests0.rootFolder = file4;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive6 = explodedArchiveTests0.getarchive();
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.gettemporaryFolder();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getResourceAsStreamNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(file2);
        org.junit.Assert.assertNotNull(temporaryFolder3);
        org.junit.Assert.assertNull(explodedArchive6);
        org.junit.Assert.assertNotNull(temporaryFolder7);
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        org.springframework.boot.loader.archive.ExplodedArchiveTests explodedArchiveTests0 = new org.springframework.boot.loader.archive.ExplodedArchiveTests();
        org.junit.rules.TemporaryFolder temporaryFolder1 = explodedArchiveTests0.temporaryFolder;
        java.io.File file2 = null;
        explodedArchiveTests0.rootFolder = file2;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = explodedArchiveTests0.archive;
        java.io.File file5 = null;
        explodedArchiveTests0.setrootFolder(file5);
        org.junit.rules.TemporaryFolder temporaryFolder7 = explodedArchiveTests0.temporaryFolder;
        java.io.File file8 = explodedArchiveTests0.rootFolder;
        org.junit.rules.TemporaryFolder temporaryFolder9 = explodedArchiveTests0.gettemporaryFolder();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive10 = null;
        explodedArchiveTests0.archive = explodedArchive10;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = null;
        explodedArchiveTests0.setarchive(explodedArchive12);
        java.io.File file14 = explodedArchiveTests0.rootFolder;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = null;
        explodedArchiveTests0.setarchive(explodedArchive15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = explodedArchiveTests0.getarchive();
        // The following exception was thrown during execution in test generation
        try {
            explodedArchiveTests0.getNonRecursiveManifestEvenIfNonRecursive();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid source folder src/test/resources/root");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(temporaryFolder1);
        org.junit.Assert.assertNull(explodedArchive4);
        org.junit.Assert.assertNotNull(temporaryFolder7);
        org.junit.Assert.assertNull(file8);
        org.junit.Assert.assertNotNull(temporaryFolder9);
        org.junit.Assert.assertNull(file14);
        org.junit.Assert.assertNull(explodedArchive17);
    }
}

