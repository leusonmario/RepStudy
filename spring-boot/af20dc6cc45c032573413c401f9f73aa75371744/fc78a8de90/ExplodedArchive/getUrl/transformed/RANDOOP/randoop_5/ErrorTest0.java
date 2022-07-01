import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor1 = explodedArchive0.iterator();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator2 = explodedArchive0.spliterator();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str5 = fileEntry4.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive6 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry1 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file2 = fileEntry1.getFile();
        java.io.File file3 = fileEntry1.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive4 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = explodedArchive0.iterator();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = fileEntry0.isDirectory();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive5 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry2 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file3 = fileEntry2.getFile();
        java.lang.String str4 = fileEntry2.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive5 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file6 = fileEntry5.getFile();
        java.lang.String str7 = fileEntry5.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive8 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL2 = explodedArchive0.getUrl();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        java.io.File file2 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL3 = explodedArchive0.getUrl();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator3 = explodedArchive0.spliterator();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        java.lang.String str4 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str6 = fileEntry5.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive7 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str5 = fileEntry4.name;
        java.lang.String str6 = fileEntry4.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive7 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL1 = explodedArchive0.getUrl();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator3 = explodedArchive0.spliterator();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator2 = explodedArchive0.spliterator();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file6 = fileEntry5.getFile();
        fileEntry5.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive9 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = fileEntry0.isDirectory();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry3 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str4 = fileEntry3.name;
        java.lang.String str5 = fileEntry3.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive6 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL2 = explodedArchive0.getUrl();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest2 = explodedArchive0.getManifest();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest2 = explodedArchive0.getManifest();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        boolean boolean2 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator3 = explodedArchive0.spliterator();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator7 = explodedArchive0.spliterator();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        java.lang.String str6 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        java.io.File file9 = fileEntry0.file;
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        java.lang.String str12 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = fileEntry0.isDirectory();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file6 = fileEntry5.getFile();
        java.io.File file7 = fileEntry5.file;
        fileEntry5.name = "";
        java.lang.String str10 = fileEntry5.name;
        java.io.File file11 = fileEntry5.file;
        java.lang.String str12 = fileEntry5.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive13 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        java.lang.String str4 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str6 = fileEntry5.name;
        java.io.File file7 = fileEntry5.file;
        fileEntry5.name = "exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive10 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        java.io.File file3 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.io.File file5 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL9 = explodedArchive0.getUrl();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        java.lang.String str5 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL6 = explodedArchive0.getUrl();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.io.File file5 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL3 = explodedArchive0.getUrl();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.io.File file5 = fileEntry0.file;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        fileEntry0.name = "";
        java.io.File file10 = fileEntry0.file;
        java.io.File file11 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = fileEntry0.isDirectory();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        java.lang.String str13 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = fileEntry0.isDirectory();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry5 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file6 = fileEntry5.getFile();
        java.io.File file7 = fileEntry5.file;
        fileEntry5.name = "";
        java.lang.String str10 = fileEntry5.name;
        java.io.File file11 = fileEntry5.file;
        java.io.File file12 = fileEntry5.getFile();
        fileEntry5.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive15 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator6 = explodedArchive0.spliterator();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.io.File file5 = fileEntry0.file;
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        java.lang.String str5 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor6 = explodedArchive0.iterator();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.io.File file7 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest8 = explodedArchive0.getManifest();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL7 = explodedArchive0.getUrl();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL3 = explodedArchive0.getUrl();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest8 = explodedArchive0.getManifest();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "hi!";
        java.io.File file8 = fileEntry0.file;
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator7 = explodedArchive0.spliterator();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.io.File file5 = fileEntry0.file;
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        boolean boolean5 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator6 = explodedArchive0.spliterator();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        fileEntry0.name = "file://exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator4 = explodedArchive0.spliterator();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "";
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.root;
        boolean boolean3 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        fileEntry0.name = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        java.lang.String str6 = explodedArchive0.toString();
        java.util.jar.Manifest manifest7 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest8 = explodedArchive0.getManifest();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.getFile();
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.manifestFile;
        boolean boolean6 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest7 = explodedArchive0.getManifest();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL6 = explodedArchive0.getUrl();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.io.File file9 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator10 = explodedArchive0.spliterator();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        java.lang.String str6 = explodedArchive0.toString();
        java.util.jar.Manifest manifest7 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor8 = explodedArchive0.iterator();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest2 = explodedArchive0.getManifest();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL6 = explodedArchive0.getUrl();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.io.File file5 = fileEntry0.file;
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor9 = explodedArchive0.iterator();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        boolean boolean5 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest6 = explodedArchive0.getManifest();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        java.lang.String str6 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL7 = explodedArchive0.getUrl();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        java.lang.String str3 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor7 = explodedArchive0.iterator();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/hi!";
        java.lang.String str8 = fileEntry0.getName();
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        fileEntry0.name = "";
        java.io.File file10 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.io.File file5 = fileEntry0.file;
        java.io.File file6 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.io.File file9 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest10 = explodedArchive0.getManifest();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry2 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file3 = fileEntry2.getFile();
        java.io.File file4 = fileEntry2.file;
        fileEntry2.name = "";
        java.lang.String str7 = fileEntry2.name;
        java.io.File file8 = fileEntry2.file;
        java.io.File file9 = fileEntry2.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive10 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        java.lang.String str4 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        java.lang.String str13 = fileEntry0.getName();
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = fileEntry0.isDirectory();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        java.io.File file9 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator6 = explodedArchive0.spliterator();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        fileEntry0.name = "file://exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = fileEntry0.isDirectory();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        fileEntry0.name = "file://exploded archive";
        java.io.File file11 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = fileEntry0.isDirectory();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL4 = explodedArchive0.getUrl();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = explodedArchive0.iterator();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry0.name = "exploded archive";
        java.io.File file3 = fileEntry0.file;
        java.lang.String str4 = fileEntry0.getName();
        java.io.File file5 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.getFile();
        java.io.File file9 = fileEntry0.file;
        java.io.File file10 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.io.File file5 = fileEntry0.file;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.file;
        java.lang.String str8 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        explodedArchive0.recursive = false;
        boolean boolean5 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest6 = explodedArchive0.getManifest();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        java.lang.String str4 = fileEntry0.name;
        fileEntry0.name = "";
        java.lang.String str7 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry0.name = "exploded archive";
        java.io.File file3 = fileEntry0.file;
        java.lang.String str4 = fileEntry0.getName();
        java.io.File file5 = fileEntry0.file;
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.name;
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        java.lang.String str9 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "";
        java.lang.String str4 = fileEntry0.getName();
        fileEntry0.name = "file://exploded archive";
        java.lang.String str7 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "hi!";
        java.io.File file8 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str11 = fileEntry0.name;
        java.lang.String str12 = fileEntry0.name;
        java.lang.String str13 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = fileEntry0.isDirectory();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry0.name = "exploded archive";
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.getName();
        java.io.File file6 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest3 = explodedArchive0.getManifest();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        java.lang.String str4 = fileEntry0.name;
        java.io.File file5 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.root;
        java.lang.String str6 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator7 = explodedArchive0.spliterator();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        java.lang.String str6 = explodedArchive0.toString();
        java.io.File file7 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator8 = explodedArchive0.spliterator();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        java.lang.String str10 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL11 = explodedArchive0.getUrl();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.manifestFile;
        java.io.File file4 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        java.lang.String str10 = explodedArchive0.toString();
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor13 = explodedArchive0.iterator();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry3 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file4 = fileEntry3.getFile();
        java.lang.String str5 = fileEntry3.getName();
        java.lang.String str6 = fileEntry3.getName();
        fileEntry3.name = "";
        java.io.File file9 = fileEntry3.file;
        java.io.File file10 = fileEntry3.getFile();
        java.lang.String str11 = fileEntry3.getName();
        java.lang.String str12 = fileEntry3.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive13 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str5 = fileEntry4.getName();
        fileEntry4.name = "exploded archive";
        fileEntry4.name = "hi!";
        java.io.File file10 = fileEntry4.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive11 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor2 = explodedArchive0.iterator();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        java.io.File file3 = fileEntry0.getFile();
        java.lang.String str4 = fileEntry0.name;
        java.io.File file5 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        java.io.File file10 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL11 = explodedArchive0.getUrl();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        java.io.File file3 = fileEntry0.getFile();
        java.lang.String str4 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        java.io.File file3 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = fileEntry0.isDirectory();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.io.File file7 = explodedArchive0.root;
        java.util.jar.Manifest manifest8 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest9 = explodedArchive0.getManifest();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator5 = explodedArchive0.spliterator();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.lang.String str7 = explodedArchive0.toString();
        java.lang.String str8 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL9 = explodedArchive0.getUrl();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.manifestFile;
        boolean boolean3 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor4 = explodedArchive0.iterator();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        java.io.File file2 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.io.File file2 = explodedArchive0.manifestFile;
        boolean boolean3 = explodedArchive0.recursive;
        java.lang.String str4 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.lang.String str7 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor8 = explodedArchive0.iterator();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        java.lang.String str2 = explodedArchive0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor3 = explodedArchive0.iterator();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest7 = explodedArchive0.getManifest();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        java.io.File file10 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator11 = explodedArchive0.spliterator();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        fileEntry0.name = "file://exploded archive";
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/MANIFEST.MF";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        boolean boolean5 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator6 = explodedArchive0.spliterator();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.getFile();
        java.lang.String str8 = fileEntry0.getName();
        java.lang.String str9 = fileEntry0.getName();
        java.io.File file10 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        java.io.File file9 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = fileEntry0.isDirectory();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.io.File file7 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor8 = explodedArchive0.iterator();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.lang.String str7 = explodedArchive0.toString();
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry8 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry8.name = "exploded archive";
        java.io.File file11 = fileEntry8.file;
        java.io.File file12 = fileEntry8.file;
        java.io.File file13 = fileEntry8.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive14 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.getName();
        fileEntry0.name = "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/file";
        java.io.File file8 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.io.File file7 = explodedArchive0.root;
        java.io.File file8 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor9 = explodedArchive0.iterator();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        java.io.File file7 = explodedArchive0.root;
        java.io.File file8 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator9 = explodedArchive0.spliterator();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        java.lang.String str7 = explodedArchive0.toString();
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL10 = explodedArchive0.getUrl();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.io.File file4 = fileEntry0.getFile();
        java.lang.String str5 = fileEntry0.name;
        java.lang.String str6 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        boolean boolean4 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry4 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry4.name = "exploded archive";
        java.io.File file7 = fileEntry4.file;
        java.io.File file8 = fileEntry4.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive9 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        java.lang.String str3 = explodedArchive0.toString();
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.root;
        java.lang.String str6 = explodedArchive0.toString();
        java.util.jar.Manifest manifest7 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor8 = explodedArchive0.iterator();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        java.lang.String str10 = explodedArchive0.toString();
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest13 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL14 = explodedArchive0.getUrl();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        java.io.File file4 = explodedArchive0.root;
        explodedArchive0.recursive = false;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest9 = explodedArchive0.manifest;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator10 = explodedArchive0.spliterator();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        java.io.File file3 = explodedArchive0.manifestFile;
        java.io.File file4 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest5 = explodedArchive0.getManifest();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        java.io.File file8 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.io.File file2 = fileEntry0.getFile();
        java.lang.String str3 = fileEntry0.name;
        java.io.File file4 = fileEntry0.getFile();
        java.io.File file5 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        fileEntry0.name = "file";
        java.io.File file7 = fileEntry0.getFile();
        java.lang.String str8 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = fileEntry0.isDirectory();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.name;
        java.lang.String str8 = fileEntry0.name;
        java.io.File file9 = fileEntry0.getFile();
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/file";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = fileEntry0.isDirectory();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        fileEntry0.name = "hi!";
        java.lang.String str6 = fileEntry0.getName();
        java.lang.String str7 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        boolean boolean2 = explodedArchive0.recursive;
        java.io.File file3 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest4 = explodedArchive0.getManifest();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        java.io.File file5 = explodedArchive0.root;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor6 = explodedArchive0.iterator();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.name;
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.name;
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.util.jar.Manifest manifest5 = explodedArchive0.manifest;
        explodedArchive0.recursive = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Spliterator<org.springframework.boot.loader.archive.Archive.Entry> entrySpliterator8 = explodedArchive0.spliterator();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        explodedArchive0.recursive = true;
        java.lang.String str4 = explodedArchive0.toString();
        boolean boolean5 = explodedArchive0.recursive;
        java.lang.String str6 = explodedArchive0.toString();
        boolean boolean7 = explodedArchive0.recursive;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest8 = explodedArchive0.getManifest();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        fileEntry0.name = "";
        java.lang.String str4 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.lang.String str1 = fileEntry0.name;
        java.lang.String str2 = fileEntry0.getName();
        java.io.File file3 = fileEntry0.file;
        fileEntry0.name = "file://exploded archive";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        fileEntry0.name = "";
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.manifestFile;
        java.io.File file2 = explodedArchive0.manifestFile;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.jar.Manifest manifest3 = explodedArchive0.getManifest();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        java.io.File file3 = fileEntry0.file;
        java.lang.String str4 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = fileEntry0.isDirectory();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.lang.String str2 = fileEntry0.getName();
        java.lang.String str3 = fileEntry0.getName();
        java.lang.String str4 = fileEntry0.getName();
        fileEntry0.name = "file://hi!:100hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = fileEntry0.isDirectory();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        boolean boolean1 = explodedArchive0.recursive;
        java.lang.String str2 = explodedArchive0.toString();
        boolean boolean3 = explodedArchive0.recursive;
        java.util.jar.Manifest manifest4 = explodedArchive0.manifest;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL7 = explodedArchive0.getUrl();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = fileEntry0.isDirectory();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        fileEntry0.name = "file:/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/spring-boot/af20dc6cc45c032573413c401f9f73aa75371744/randoop_5/META-INF/hi!";
        java.lang.String str8 = fileEntry0.getName();
        java.lang.String str9 = fileEntry0.name;
        java.lang.String str10 = fileEntry0.name;
        java.lang.String str11 = fileEntry0.getName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = fileEntry0.isDirectory();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        java.io.File file1 = fileEntry0.getFile();
        java.io.File file2 = fileEntry0.file;
        fileEntry0.name = "";
        java.lang.String str5 = fileEntry0.name;
        java.io.File file6 = fileEntry0.file;
        java.lang.String str7 = fileEntry0.getName();
        fileEntry0.name = "exploded archive";
        java.io.File file10 = fileEntry0.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = fileEntry0.isDirectory();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry0 = new org.springframework.boot.loader.archive.ExplodedArchive.FileEntry();
        fileEntry0.name = "exploded archive";
        java.io.File file3 = fileEntry0.file;
        java.io.File file4 = fileEntry0.file;
        java.lang.String str5 = fileEntry0.getName();
        java.io.File file6 = fileEntry0.file;
        java.io.File file7 = fileEntry0.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = fileEntry0.isDirectory();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.recursive = true;
        explodedArchive0.recursive = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Iterator<org.springframework.boot.loader.archive.Archive.Entry> entryItor5 = explodedArchive0.iterator();
    }
}

