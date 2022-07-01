import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive15 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str16 = explodedArchive15.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection17 = explodedArchive15.getEntries();
        java.util.jar.Manifest manifest18 = explodedArchive15.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler19 = explodedArchive15.new FilteredURLStreamHandler();
        java.net.URL uRL20 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler19);
        java.lang.String str21 = uRL20.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str28 = explodedArchive27.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection29 = explodedArchive27.getEntries();
        java.util.jar.Manifest manifest30 = explodedArchive27.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler31 = explodedArchive27.new FilteredURLStreamHandler();
        java.net.URL uRL32 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.lang.String str33 = uRL32.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str36 = explodedArchive35.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection37 = explodedArchive35.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive35.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL(uRL32, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL40 = new java.net.URL(uRL20, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL41 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str42 = uRL41.getRef();
        java.lang.String str43 = uRL41.getHost();
        int int44 = uRL41.getDefaultPort();
        java.lang.String str45 = uRL41.getAuthority();
        int int46 = uRL41.getDefaultPort();
        java.lang.String str47 = uRL41.getQuery();
        java.lang.String str48 = uRL41.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj49 = uRL41.getContent();
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler31 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL32 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.net.URL uRL33 = new java.net.URL(uRL13, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.net.URL uRL34 = new java.net.URL("hi!:1", "/archive", (int) (short) 0, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.lang.String str35 = uRL34.getFile();
        java.net.URL uRL37 = new java.net.URL(uRL34, "[hi!://:100/archive]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection38 = uRL37.openConnection();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getAuthority();
        int int18 = uRL16.getDefaultPort();
        java.lang.String str19 = uRL16.getQuery();
        int int20 = uRL16.getPort();
        java.lang.String str21 = uRL16.getFile();
        java.lang.String str22 = uRL16.getQuery();
        java.lang.String str23 = uRL16.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream24 = uRL16.openStream();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL9.getHost();
        java.lang.String str18 = uRL9.getProtocol();
        java.lang.String str19 = uRL9.toExternalForm();
        java.lang.String str20 = uRL9.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        java.util.jar.Manifest manifest29 = explodedArchive26.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler30 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL31 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.net.URL uRL32 = new java.net.URL(uRL9, "://[archive://:10archive]:100archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.lang.String str33 = uRL32.getPath();
        java.lang.String str34 = uRL32.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection35 = uRL32.openConnection();
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        boolean boolean25 = uRL9.sameFile(uRL21);
        java.net.URL uRL27 = new java.net.URL(uRL21, "");
        java.lang.String str28 = uRL27.getProtocol();
        java.lang.String str29 = uRL27.getUserInfo();
        java.lang.String str30 = uRL27.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = uRL27.getContent();
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str48 = explodedArchive47.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection49 = explodedArchive47.getEntries();
        java.util.jar.Manifest manifest50 = explodedArchive47.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive47.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.lang.String str53 = uRL52.getQuery();
        java.lang.String str54 = uRL52.getRef();
        java.lang.String str55 = uRL52.getRef();
        java.lang.String str56 = uRL52.toExternalForm();
        int int57 = uRL52.getDefaultPort();
        boolean boolean58 = uRL9.sameFile(uRL52);
        java.lang.String str59 = uRL9.getQuery();
        java.net.URL uRL61 = new java.net.URL(uRL9, "hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1");
        java.net.URL uRL63 = new java.net.URL(uRL61, "[hi!://:100/archive]:100://[/hi!://:100/archive]:0:1hi!://:100/hi!://:100/hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj64 = uRL63.getContent();
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getPath();
        java.lang.String str12 = uRL9.getFile();
        java.lang.String str13 = uRL9.getFile();
        java.lang.String str14 = uRL9.getRef();
        java.net.URL uRL16 = new java.net.URL(uRL9, "/[hi!://:100/hi!://:100/hi!://:100/archive");
        java.lang.String str17 = uRL9.getQuery();
        java.lang.String str18 = uRL9.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = uRL9.getContent();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.toExternalForm();
        java.lang.String str19 = uRL9.getProtocol();
        int int20 = uRL9.getDefaultPort();
        java.net.URL uRL22 = new java.net.URL(uRL9, "[/hi!:1]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = uRL22.getContent();
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getHost();
        int int29 = uRL26.getPort();
        java.lang.String str30 = uRL26.getQuery();
        java.net.URL uRL32 = new java.net.URL(uRL26, "");
        java.lang.String str33 = uRL32.getPath();
        int int34 = uRL32.getDefaultPort();
        java.lang.String str35 = uRL32.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str47 = uRL46.getPath();
        java.lang.String str48 = uRL46.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str55 = explodedArchive54.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection56 = explodedArchive54.getEntries();
        java.util.jar.Manifest manifest57 = explodedArchive54.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler58 = explodedArchive54.new FilteredURLStreamHandler();
        java.net.URL uRL59 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL60 = new java.net.URL(uRL46, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL61 = new java.net.URL(uRL32, "/hi!", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL62 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj63 = uRL62.getContent();
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL9.getHost();
        java.lang.String str18 = uRL9.getProtocol();
        java.lang.String str19 = uRL9.toExternalForm();
        java.lang.String str20 = uRL9.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        java.util.jar.Manifest manifest29 = explodedArchive26.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler30 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL31 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.net.URL uRL32 = new java.net.URL(uRL9, "://[archive://:10archive]:100archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.lang.String str33 = uRL9.getAuthority();
        java.lang.String str34 = uRL9.getQuery();
        int int35 = uRL9.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getFile();
        int int47 = uRL45.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str54 = explodedArchive53.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection55 = explodedArchive53.getEntries();
        java.util.jar.Manifest manifest56 = explodedArchive53.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler57 = explodedArchive53.new FilteredURLStreamHandler();
        java.net.URL uRL58 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.lang.String str59 = uRL58.getQuery();
        java.lang.String str60 = uRL58.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive66 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str67 = explodedArchive66.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection68 = explodedArchive66.getEntries();
        java.util.jar.Manifest manifest69 = explodedArchive66.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler70 = explodedArchive66.new FilteredURLStreamHandler();
        java.net.URL uRL71 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.net.URL uRL72 = new java.net.URL(uRL58, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.net.URL uRL73 = new java.net.URL(uRL45, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.lang.String str74 = uRL45.toExternalForm();
        java.lang.String str75 = uRL45.getQuery();
        java.lang.String str76 = uRL45.getAuthority();
        java.lang.String str77 = uRL45.getFile();
        java.lang.String str78 = uRL45.getQuery();
        boolean boolean79 = uRL9.sameFile(uRL45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj80 = uRL9.getContent();
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getUserInfo();
        java.lang.String str18 = uRL16.getAuthority();
        int int19 = uRL16.getPort();
        java.lang.String str20 = uRL16.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = uRL16.getContent();
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getHost();
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getProtocol();
        java.lang.String str28 = uRL9.getUserInfo();
        int int29 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection30 = uRL9.openConnection();
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getProtocol();
        int int31 = uRL9.getPort();
        java.lang.String str32 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive37 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str38 = explodedArchive37.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection39 = explodedArchive37.getEntries();
        java.util.jar.Manifest manifest40 = explodedArchive37.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler41 = explodedArchive37.new FilteredURLStreamHandler();
        java.net.URL uRL42 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler41);
        java.lang.String str43 = uRL42.getQuery();
        java.lang.String str44 = uRL42.getRef();
        int int45 = uRL42.getPort();
        java.lang.String str46 = uRL42.getProtocol();
        java.lang.String str47 = uRL42.getPath();
        java.lang.String str48 = uRL42.getAuthority();
        java.lang.String str49 = uRL42.getRef();
        int int50 = uRL42.getPort();
        java.lang.String str51 = uRL42.getAuthority();
        boolean boolean52 = uRL9.sameFile(uRL42);
        java.lang.String str53 = uRL42.getProtocol();
        java.lang.String str54 = uRL42.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = uRL42.getContent();
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getPath();
        int int17 = uRL15.getDefaultPort();
        java.lang.String str18 = uRL15.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str28 = explodedArchive27.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection29 = explodedArchive27.getEntries();
        java.util.jar.Manifest manifest30 = explodedArchive27.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler31 = explodedArchive27.new FilteredURLStreamHandler();
        java.net.URL uRL32 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.lang.String str33 = uRL32.getFile();
        int int34 = uRL32.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getQuery();
        java.lang.String str47 = uRL45.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str54 = explodedArchive53.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection55 = explodedArchive53.getEntries();
        java.util.jar.Manifest manifest56 = explodedArchive53.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler57 = explodedArchive53.new FilteredURLStreamHandler();
        java.net.URL uRL58 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.net.URL uRL59 = new java.net.URL(uRL45, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.net.URL uRL60 = new java.net.URL(uRL32, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.net.URL uRL61 = new java.net.URL("archive", "", (int) (byte) 10, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.lang.String str62 = uRL61.getFile();
        boolean boolean63 = uRL15.sameFile(uRL61);
        java.lang.String str64 = uRL61.getFile();
        java.net.URL uRL66 = new java.net.URL(uRL61, "hi!://:100/hi!://:100/hi!:1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection67 = uRL61.openConnection();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        int int18 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream19 = uRL9.openStream();
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        int int11 = uRL9.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getQuery();
        java.lang.String str39 = uRL37.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL51 = new java.net.URL(uRL37, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL52 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL53 = new java.net.URL(uRL21, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str54 = uRL53.getProtocol();
        int int55 = uRL53.getDefaultPort();
        java.lang.String str56 = uRL53.getHost();
        int int57 = uRL53.getDefaultPort();
        java.lang.String str58 = uRL53.getProtocol();
        boolean boolean59 = uRL9.sameFile(uRL53);
        java.lang.String str60 = uRL9.getPath();
        java.lang.String str61 = uRL9.getAuthority();
        java.net.URL uRL63 = new java.net.URL(uRL9, "hi!://:100/hi!://:100://[hi!://:100/hi!]:52hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection64 = uRL63.openConnection();
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getRef();
        java.lang.String str15 = uRL9.getProtocol();
        java.lang.String str16 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream17 = uRL9.openStream();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getAuthority();
        java.lang.String str17 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str23 = explodedArchive22.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection24 = explodedArchive22.getEntries();
        java.util.jar.Manifest manifest25 = explodedArchive22.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler26 = explodedArchive22.new FilteredURLStreamHandler();
        java.net.URL uRL27 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler26);
        java.lang.String str28 = uRL27.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str40 = uRL39.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str43 = explodedArchive42.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection44 = explodedArchive42.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive42.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL(uRL39, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL47 = new java.net.URL(uRL27, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str48 = uRL27.getFile();
        java.lang.String str49 = uRL27.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str55 = explodedArchive54.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection56 = explodedArchive54.getEntries();
        java.util.jar.Manifest manifest57 = explodedArchive54.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler58 = explodedArchive54.new FilteredURLStreamHandler();
        java.net.URL uRL59 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.lang.String str60 = uRL59.getQuery();
        java.lang.String str61 = uRL59.getRef();
        java.lang.String str62 = uRL59.getRef();
        java.net.URL uRL64 = new java.net.URL(uRL59, "hi!");
        boolean boolean65 = uRL27.sameFile(uRL64);
        java.lang.String str66 = uRL64.toExternalForm();
        boolean boolean67 = uRL9.sameFile(uRL64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj68 = uRL9.getContent();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getAuthority();
        java.lang.String str25 = uRL9.getPath();
        int int26 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream27 = uRL9.openStream();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL(uRL45, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL53 = new java.net.URL(uRL33, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL54 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        boolean boolean55 = uRL9.sameFile(uRL54);
        int int56 = uRL9.getPort();
        java.lang.String str57 = uRL9.getQuery();
        java.lang.String str58 = uRL9.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection59 = uRL9.openConnection();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL41.getProtocol();
        int int43 = uRL41.getDefaultPort();
        java.lang.String str44 = uRL41.getHost();
        int int45 = uRL41.getDefaultPort();
        java.lang.String str46 = uRL41.getProtocol();
        java.lang.String str47 = uRL41.getQuery();
        java.lang.String str48 = uRL41.getUserInfo();
        java.net.URL uRL50 = new java.net.URL(uRL41, "hi!://:100/://[archive://:10archive]:100archive://:10archive");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection51 = uRL50.openConnection();
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.lang.String str39 = uRL37.getQuery();
        java.lang.String str40 = uRL37.getAuthority();
        int int41 = uRL37.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream42 = uRL37.openStream();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getUserInfo();
        java.lang.String str18 = uRL16.getAuthority();
        int int19 = uRL16.getPort();
        java.lang.String str20 = uRL16.getProtocol();
        java.net.URL uRL22 = new java.net.URL(uRL16, "hi!://:100/:100://[hi!://:100/:100]:0/archive://[hi!://:100/hi!]:1/hi!");
        java.net.URL uRL24 = new java.net.URL(uRL22, "[/hi!://:100/archive]:1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection25 = uRL24.openConnection();
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getAuthority();
        java.lang.String str11 = uRL9.toExternalForm();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str30 = explodedArchive29.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection31 = explodedArchive29.getEntries();
        java.util.jar.Manifest manifest32 = explodedArchive29.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler33 = explodedArchive29.new FilteredURLStreamHandler();
        java.net.URL uRL34 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL35 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        int int36 = uRL35.getPort();
        java.lang.String str37 = uRL35.getPath();
        java.lang.String str38 = uRL35.getPath();
        java.lang.String str39 = uRL35.toExternalForm();
        boolean boolean40 = uRL9.sameFile(uRL35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream41 = uRL35.openStream();
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getFile();
        int int37 = uRL35.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str49 = uRL48.getQuery();
        java.lang.String str50 = uRL48.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str57 = explodedArchive56.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection58 = explodedArchive56.getEntries();
        java.util.jar.Manifest manifest59 = explodedArchive56.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler60 = explodedArchive56.new FilteredURLStreamHandler();
        java.net.URL uRL61 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL62 = new java.net.URL(uRL48, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL63 = new java.net.URL(uRL35, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.lang.String str64 = uRL63.getFile();
        java.lang.String str65 = uRL63.toExternalForm();
        java.lang.String str66 = uRL63.getHost();
        java.lang.String str67 = uRL63.getAuthority();
        java.lang.String str68 = uRL63.getProtocol();
        boolean boolean69 = uRL9.sameFile(uRL63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream70 = uRL63.openStream();
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getAuthority();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        java.lang.String str28 = uRL9.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream29 = uRL9.openStream();
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getFile();
        int int28 = uRL26.getDefaultPort();
        java.lang.String str29 = uRL26.getRef();
        boolean boolean30 = uRL9.sameFile(uRL26);
        java.lang.String str31 = uRL9.getHost();
        java.lang.String str32 = uRL9.getQuery();
        java.lang.String str33 = uRL9.getPath();
        java.lang.String str34 = uRL9.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection35 = uRL9.openConnection();
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        int int11 = uRL9.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getQuery();
        java.lang.String str39 = uRL37.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL51 = new java.net.URL(uRL37, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL52 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL53 = new java.net.URL(uRL21, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str54 = uRL53.getProtocol();
        int int55 = uRL53.getDefaultPort();
        java.lang.String str56 = uRL53.getHost();
        int int57 = uRL53.getDefaultPort();
        java.lang.String str58 = uRL53.getProtocol();
        boolean boolean59 = uRL9.sameFile(uRL53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj60 = uRL53.getContent();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        int int24 = uRL23.getPort();
        java.lang.String str25 = uRL23.getPath();
        java.lang.String str26 = uRL23.getPath();
        java.lang.String str27 = uRL23.getPath();
        java.net.URL uRL29 = new java.net.URL(uRL23, "://[archive://:10archive]:100archive://:10archive");
        java.lang.String str30 = uRL29.toExternalForm();
        java.lang.String str31 = uRL29.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream32 = uRL29.openStream();
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getDefaultPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str20 = explodedArchive19.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection21 = explodedArchive19.getEntries();
        java.util.jar.Manifest manifest22 = explodedArchive19.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler23 = explodedArchive19.new FilteredURLStreamHandler();
        java.net.URL uRL24 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler23);
        java.lang.String str25 = uRL24.getQuery();
        java.lang.String str26 = uRL24.getRef();
        int int27 = uRL24.getPort();
        java.lang.String str28 = uRL24.toExternalForm();
        java.lang.String str29 = uRL24.getRef();
        java.lang.String str30 = uRL24.getUserInfo();
        java.lang.String str31 = uRL24.toExternalForm();
        java.lang.Class<?> wildcardClass32 = uRL24.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass32 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj34 = uRL9.getContent(classArray33);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str37 = explodedArchive36.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection38 = explodedArchive36.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler39 = explodedArchive36.new FilteredURLStreamHandler();
        java.net.URL uRL40 = new java.net.URL(uRL33, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.net.URL uRL41 = new java.net.URL(uRL21, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.net.URL uRL42 = new java.net.URL("/archive", "", (int) ' ', "/archive", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.net.URL uRL43 = new java.net.URL("[hi!://:100/:100]", ":10", 32, "[hi!://:100/archive]:100", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.net.URL uRL44 = new java.net.URL(":100://[hi!://:100/hi!]:100hi!://:100/archive", "hi!://:100/[hi!://:100/hi!]:10", (int) 'a', "hi!://:100/hi!://[hi!://:100/:100]:100/archive://[hi!://:100/hi!]:1/hi!://[/:100]:0:32hi!://:100/hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection45 = uRL44.openConnection();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getFile();
        int int39 = uRL37.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str51 = uRL50.getQuery();
        java.lang.String str52 = uRL50.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive58 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str59 = explodedArchive58.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection60 = explodedArchive58.getEntries();
        java.util.jar.Manifest manifest61 = explodedArchive58.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler62 = explodedArchive58.new FilteredURLStreamHandler();
        java.net.URL uRL63 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler62);
        java.net.URL uRL64 = new java.net.URL(uRL50, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler62);
        java.net.URL uRL65 = new java.net.URL(uRL37, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler62);
        java.lang.String str66 = uRL37.getPath();
        java.lang.String str67 = uRL37.getPath();
        java.lang.String str68 = uRL37.getUserInfo();
        java.lang.String str69 = uRL37.getHost();
        boolean boolean70 = uRL27.sameFile(uRL37);
        int int71 = uRL37.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection72 = uRL37.openConnection();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.toExternalForm();
        java.lang.String str39 = uRL9.getHost();
        java.lang.String str40 = uRL9.getRef();
        java.lang.String str41 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj42 = uRL9.getContent();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getFile();
        int int15 = uRL13.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL40 = new java.net.URL(uRL26, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL41 = new java.net.URL(uRL13, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL42 = new java.net.URL("archive", "", (int) (byte) 10, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str43 = uRL42.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        java.util.jar.Manifest manifest51 = explodedArchive48.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler52 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL53 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.lang.String str54 = uRL53.getQuery();
        java.lang.String str55 = uRL53.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str62 = explodedArchive61.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection63 = explodedArchive61.getEntries();
        java.util.jar.Manifest manifest64 = explodedArchive61.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler65 = explodedArchive61.new FilteredURLStreamHandler();
        java.net.URL uRL66 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler65);
        java.net.URL uRL67 = new java.net.URL(uRL53, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler65);
        int int68 = uRL67.getPort();
        java.lang.String str69 = uRL67.getPath();
        java.lang.String str70 = uRL67.getPath();
        java.lang.String str71 = uRL67.toExternalForm();
        java.lang.String str72 = uRL67.getRef();
        java.lang.String str73 = uRL67.getPath();
        boolean boolean74 = uRL42.sameFile(uRL67);
        int int75 = uRL67.getDefaultPort();
        java.lang.String str76 = uRL67.getFile();
        java.lang.String str77 = uRL67.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj78 = uRL67.getContent();
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive0.filtered = false;
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive3 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file4 = explodedArchive3.root;
        java.util.jar.Manifest manifest5 = explodedArchive3.manifest;
        boolean boolean6 = explodedArchive3.filtered;
        org.springframework.boot.loader.archive.ExplodedArchive.FileEntry fileEntry7 = explodedArchive3.new FileEntry();
        java.io.File file8 = fileEntry7.file;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.springframework.boot.loader.archive.Archive archive9 = explodedArchive0.getNestedArchive((org.springframework.boot.loader.archive.Archive.Entry) fileEntry7);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getQuery();
        java.lang.String str15 = uRL13.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL27 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str28 = uRL13.getFile();
        java.lang.String str29 = uRL13.getAuthority();
        int int30 = uRL13.getPort();
        java.lang.String str31 = uRL13.getFile();
        java.net.URL uRL33 = new java.net.URL(uRL13, "hi!://:100/hi!://:100");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str40 = explodedArchive39.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection41 = explodedArchive39.getEntries();
        java.util.jar.Manifest manifest42 = explodedArchive39.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler43 = explodedArchive39.new FilteredURLStreamHandler();
        java.net.URL uRL44 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler43);
        java.lang.String str45 = uRL44.getPath();
        java.lang.String str46 = uRL44.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str53 = explodedArchive52.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection54 = explodedArchive52.getEntries();
        java.util.jar.Manifest manifest55 = explodedArchive52.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler56 = explodedArchive52.new FilteredURLStreamHandler();
        java.net.URL uRL57 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL58 = new java.net.URL(uRL44, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL59 = new java.net.URL(uRL33, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL60 = new java.net.URL("://[archive://:10archive]:100archive://:10archive", "hi!://:100/://[hi!://:100/:100]:100/hi!://:100", (int) ' ', "[://[archive://:10archive]:100archive://:10archive]", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive65 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str66 = explodedArchive65.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection67 = explodedArchive65.getEntries();
        java.util.jar.Manifest manifest68 = explodedArchive65.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler69 = explodedArchive65.new FilteredURLStreamHandler();
        java.net.URL uRL70 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.lang.String str71 = uRL70.getFile();
        int int72 = uRL70.getDefaultPort();
        java.lang.String str73 = uRL70.getRef();
        java.lang.String str74 = uRL70.getRef();
        java.net.URL uRL76 = new java.net.URL(uRL70, "hi!:1");
        int int77 = uRL70.getDefaultPort();
        int int78 = uRL70.getDefaultPort();
        java.lang.String str79 = uRL70.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection80 = filteredURLStreamHandler56.openConnection(uRL70);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        int int13 = uRL9.getPort();
        java.lang.String str14 = uRL9.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream15 = uRL9.openStream();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        int int11 = uRL9.getPort();
        java.lang.String str12 = uRL9.getFile();
        int int13 = uRL9.getDefaultPort();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = uRL9.getContent();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        java.util.jar.Manifest manifest15 = explodedArchive12.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler16 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL17 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler16);
        java.lang.String str18 = uRL17.getQuery();
        java.lang.String str19 = uRL17.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str26 = explodedArchive25.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection27 = explodedArchive25.getEntries();
        java.util.jar.Manifest manifest28 = explodedArchive25.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler29 = explodedArchive25.new FilteredURLStreamHandler();
        java.net.URL uRL30 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.net.URL uRL31 = new java.net.URL(uRL17, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.net.URL uRL32 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.net.URL uRL33 = new java.net.URL("/archive:///archive:0hi!://:100", "hi!://:100/archive", (int) (short) 100, "/archive:///archive:0hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.lang.String str34 = uRL33.getFile();
        java.lang.String str35 = uRL33.getRef();
        int int36 = uRL33.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream37 = uRL33.openStream();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getFile();
        java.lang.String str31 = uRL9.toExternalForm();
        java.lang.String str32 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream33 = uRL9.openStream();
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        java.lang.String str25 = uRL21.getQuery();
        boolean boolean26 = uRL9.sameFile(uRL21);
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!:1");
        java.lang.String str29 = uRL28.toExternalForm();
        java.lang.String str30 = uRL28.getPath();
        java.lang.String str31 = uRL28.getHost();
        java.lang.String str32 = uRL28.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj33 = uRL28.getContent();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        java.lang.String str13 = uRL9.getRef();
        int int14 = uRL9.getPort();
        java.lang.String str15 = uRL9.getPath();
        java.lang.String str16 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getQuery();
        java.lang.String str37 = uRL35.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL49 = new java.net.URL(uRL35, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL50 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL51 = new java.net.URL("/archive:///archive:0hi!://:100", "hi!://:100/archive", (int) (short) 100, "/archive:///archive:0hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL52 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str53 = uRL52.toExternalForm();
        java.lang.String str54 = uRL52.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = uRL52.getContent();
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getAuthority();
        int int11 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = uRL9.getContent();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getFile();
        int int15 = uRL13.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL40 = new java.net.URL(uRL26, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL41 = new java.net.URL(uRL13, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL42 = new java.net.URL("archive", "", (int) (byte) 10, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str43 = uRL42.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        java.util.jar.Manifest manifest51 = explodedArchive48.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler52 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL53 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.lang.String str54 = uRL53.getQuery();
        java.lang.String str55 = uRL53.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive61 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str62 = explodedArchive61.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection63 = explodedArchive61.getEntries();
        java.util.jar.Manifest manifest64 = explodedArchive61.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler65 = explodedArchive61.new FilteredURLStreamHandler();
        java.net.URL uRL66 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler65);
        java.net.URL uRL67 = new java.net.URL(uRL53, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler65);
        int int68 = uRL67.getPort();
        java.lang.String str69 = uRL67.getPath();
        java.lang.String str70 = uRL67.getPath();
        java.lang.String str71 = uRL67.toExternalForm();
        java.lang.String str72 = uRL67.getRef();
        java.lang.String str73 = uRL67.getPath();
        boolean boolean74 = uRL42.sameFile(uRL67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj75 = uRL67.getContent();
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.getPath();
        java.lang.String str39 = uRL9.getPath();
        java.lang.String str40 = uRL9.getHost();
        java.lang.String str41 = uRL9.getQuery();
        java.lang.String str42 = uRL9.getQuery();
        int int43 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj44 = uRL9.getContent();
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive14 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str15 = explodedArchive14.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection16 = explodedArchive14.getEntries();
        java.util.jar.Manifest manifest17 = explodedArchive14.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler18 = explodedArchive14.new FilteredURLStreamHandler();
        java.net.URL uRL19 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler18);
        java.lang.String str20 = uRL19.getQuery();
        java.lang.String str21 = uRL19.getPath();
        boolean boolean22 = uRL9.sameFile(uRL19);
        java.lang.String str23 = uRL19.toExternalForm();
        java.lang.String str24 = uRL19.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream25 = uRL19.openStream();
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        int int17 = uRL16.getPort();
        java.lang.String str18 = uRL16.toExternalForm();
        java.lang.String str19 = uRL16.getQuery();
        int int20 = uRL16.getDefaultPort();
        java.lang.String str21 = uRL16.getQuery();
        java.lang.String str22 = uRL16.getHost();
        java.lang.String str23 = uRL16.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream24 = uRL16.openStream();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str30 = explodedArchive29.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection31 = explodedArchive29.getEntries();
        java.util.jar.Manifest manifest32 = explodedArchive29.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler33 = explodedArchive29.new FilteredURLStreamHandler();
        java.net.URL uRL34 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL35 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL36 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL37 = new java.net.URL("archive://:10archive", "[hi!://:100/hi!]", 10, "://[archive://:10archive]:100archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL38 = new java.net.URL("hi!://:100/:100", "hi!://:100/:100", (int) (short) 0, "/archive://[hi!://:100/hi!]:1/hi!", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.lang.String str39 = uRL38.getRef();
        java.lang.String str40 = uRL38.getFile();
        java.lang.String str41 = uRL38.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection42 = uRL38.openConnection();
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getAuthority();
        java.lang.String str25 = uRL9.getRef();
        java.lang.String str26 = uRL9.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection27 = uRL9.openConnection();
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        java.lang.String str28 = uRL9.getFile();
        java.lang.String str29 = uRL9.toExternalForm();
        int int30 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream31 = uRL9.openStream();
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getAuthority();
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getFile();
        java.net.URL uRL29 = new java.net.URL(uRL9, "hi!://:100/hi!://:100");
        java.lang.String str30 = uRL29.getQuery();
        java.lang.String str31 = uRL29.toExternalForm();
        java.lang.String str32 = uRL29.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection33 = uRL29.openConnection();
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.getPath();
        int int19 = uRL9.getPort();
        java.lang.String str20 = uRL9.getQuery();
        java.lang.String str21 = uRL9.getRef();
        java.lang.String str22 = uRL9.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = uRL9.getContent();
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getQuery();
        java.lang.String str15 = uRL13.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL27 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str28 = uRL13.getFile();
        java.lang.String str29 = uRL13.getAuthority();
        int int30 = uRL13.getPort();
        java.lang.String str31 = uRL13.getFile();
        java.net.URL uRL33 = new java.net.URL(uRL13, "hi!://:100/hi!://:100");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str40 = explodedArchive39.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection41 = explodedArchive39.getEntries();
        java.util.jar.Manifest manifest42 = explodedArchive39.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler43 = explodedArchive39.new FilteredURLStreamHandler();
        java.net.URL uRL44 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler43);
        java.lang.String str45 = uRL44.getPath();
        java.lang.String str46 = uRL44.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str53 = explodedArchive52.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection54 = explodedArchive52.getEntries();
        java.util.jar.Manifest manifest55 = explodedArchive52.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler56 = explodedArchive52.new FilteredURLStreamHandler();
        java.net.URL uRL57 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL58 = new java.net.URL(uRL44, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL59 = new java.net.URL(uRL33, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL60 = new java.net.URL("://[archive://:10archive]:100archive://:10archive", "hi!://:100/://[hi!://:100/:100]:100/hi!://:100", (int) ' ', "[://[archive://:10archive]:100archive://:10archive]", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream61 = uRL60.openStream();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        java.lang.String str28 = uRL22.getUserInfo();
        java.lang.String str29 = uRL22.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str40 = uRL39.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str47 = explodedArchive46.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection48 = explodedArchive46.getEntries();
        java.util.jar.Manifest manifest49 = explodedArchive46.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive46.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.lang.String str52 = uRL51.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str55 = explodedArchive54.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection56 = explodedArchive54.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler57 = explodedArchive54.new FilteredURLStreamHandler();
        java.net.URL uRL58 = new java.net.URL(uRL51, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.net.URL uRL59 = new java.net.URL(uRL39, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.lang.String str60 = uRL39.getFile();
        java.lang.String str61 = uRL39.getProtocol();
        java.lang.String str62 = uRL39.getAuthority();
        boolean boolean63 = uRL22.sameFile(uRL39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream64 = uRL39.openStream();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.net.URL uRL14 = new java.net.URL(uRL9, "hi!://:100/archive");
        int int15 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream16 = uRL9.openStream();
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.lang.String str39 = uRL37.getProtocol();
        java.lang.String str40 = uRL37.getAuthority();
        java.lang.String str41 = uRL37.getRef();
        java.lang.String str42 = uRL37.getUserInfo();
        int int43 = uRL37.getDefaultPort();
        java.lang.String str44 = uRL37.getHost();
        java.lang.String str45 = uRL37.getQuery();
        int int46 = uRL37.getDefaultPort();
        java.net.URL uRL48 = new java.net.URL(uRL37, "hi!://:100/[hi!://:100/hi!]:10");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection49 = uRL48.openConnection();
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.toExternalForm();
        java.lang.String str12 = uRL9.toExternalForm();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.toExternalForm();
        java.lang.String str15 = uRL9.getPath();
        int int16 = uRL9.getDefaultPort();
        java.lang.String str17 = uRL9.toExternalForm();
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = uRL9.getContent(classArray18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getFile();
        boolean boolean35 = uRL23.sameFile(uRL33);
        int int36 = uRL33.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str47 = uRL46.getQuery();
        java.lang.String str48 = uRL46.getRef();
        java.lang.String str49 = uRL46.getRef();
        java.net.URL uRL51 = new java.net.URL(uRL46, "hi!");
        boolean boolean52 = uRL33.sameFile(uRL51);
        java.lang.String str53 = uRL51.getAuthority();
        int int54 = uRL51.getPort();
        java.lang.String str55 = uRL51.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection56 = uRL51.openConnection();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.net.URL uRL14 = new java.net.URL("/://[archive://:10archive]:100archive://:10archive", "hi!://:100/hi!://hi!:1hi!", (-1), "[hi!://:100/hi!]:10", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        int int15 = uRL14.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection16 = uRL14.openConnection();
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream17 = uRL15.openStream();
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getFile();
        int int15 = uRL13.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL40 = new java.net.URL(uRL26, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL41 = new java.net.URL(uRL13, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL42 = new java.net.URL("archive", "", (int) (byte) 10, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str43 = uRL42.getFile();
        int int44 = uRL42.getPort();
        java.lang.String str45 = uRL42.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream46 = uRL42.openStream();
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getFile();
        boolean boolean35 = uRL23.sameFile(uRL33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = uRL23.getContent();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getUserInfo();
        int int17 = uRL15.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str23 = explodedArchive22.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection24 = explodedArchive22.getEntries();
        java.util.jar.Manifest manifest25 = explodedArchive22.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler26 = explodedArchive22.new FilteredURLStreamHandler();
        java.net.URL uRL27 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler26);
        java.lang.String str28 = uRL27.getFile();
        int int29 = uRL27.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str36 = explodedArchive35.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection37 = explodedArchive35.getEntries();
        java.util.jar.Manifest manifest38 = explodedArchive35.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler39 = explodedArchive35.new FilteredURLStreamHandler();
        java.net.URL uRL40 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.lang.String str41 = uRL40.getQuery();
        java.lang.String str42 = uRL40.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        java.util.jar.Manifest manifest51 = explodedArchive48.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler52 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL53 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.net.URL uRL54 = new java.net.URL(uRL40, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.net.URL uRL55 = new java.net.URL(uRL27, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.lang.String str56 = uRL27.toExternalForm();
        java.lang.String str57 = uRL27.getQuery();
        java.lang.String str58 = uRL27.getHost();
        int int59 = uRL27.getPort();
        java.lang.String str60 = uRL27.getProtocol();
        boolean boolean61 = uRL15.sameFile(uRL27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj62 = uRL15.getContent();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        int int12 = uRL9.getDefaultPort();
        java.lang.String str13 = uRL9.getQuery();
        int int14 = uRL9.getDefaultPort();
        java.lang.String str15 = uRL9.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream16 = uRL9.openStream();
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL23.getAuthority();
        java.lang.String str25 = uRL23.getRef();
        int int26 = uRL23.getDefaultPort();
        java.lang.String str27 = uRL23.toExternalForm();
        java.lang.String str28 = uRL23.getPath();
        java.lang.String str29 = uRL23.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection30 = uRL23.openConnection();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        int int12 = uRL9.getDefaultPort();
        java.lang.String str13 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str19 = explodedArchive18.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection20 = explodedArchive18.getEntries();
        java.util.jar.Manifest manifest21 = explodedArchive18.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler22 = explodedArchive18.new FilteredURLStreamHandler();
        java.net.URL uRL23 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler22);
        java.lang.String str24 = uRL23.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler29 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL30 = new java.net.URL(uRL23, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.lang.String str31 = uRL30.getAuthority();
        java.lang.String str32 = uRL30.getAuthority();
        boolean boolean33 = uRL9.sameFile(uRL30);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive39 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str40 = explodedArchive39.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection41 = explodedArchive39.getEntries();
        java.util.jar.Manifest manifest42 = explodedArchive39.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler43 = explodedArchive39.new FilteredURLStreamHandler();
        java.net.URL uRL44 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler43);
        java.lang.String str45 = uRL44.getFile();
        int int46 = uRL44.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive52 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str53 = explodedArchive52.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection54 = explodedArchive52.getEntries();
        java.util.jar.Manifest manifest55 = explodedArchive52.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler56 = explodedArchive52.new FilteredURLStreamHandler();
        java.net.URL uRL57 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.lang.String str58 = uRL57.getQuery();
        java.lang.String str59 = uRL57.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive65 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str66 = explodedArchive65.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection67 = explodedArchive65.getEntries();
        java.util.jar.Manifest manifest68 = explodedArchive65.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler69 = explodedArchive65.new FilteredURLStreamHandler();
        java.net.URL uRL70 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.net.URL uRL71 = new java.net.URL(uRL57, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.net.URL uRL72 = new java.net.URL(uRL44, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.net.URL uRL73 = new java.net.URL(uRL30, "[://[archive://:10archive]:100archive://:10archive]:100", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj74 = uRL73.getContent();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        java.lang.String str28 = uRL9.getAuthority();
        java.lang.String str29 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj30 = uRL9.getContent();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL29.getQuery();
        java.lang.String str31 = uRL29.getQuery();
        int int32 = uRL29.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection33 = uRL29.openConnection();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.toExternalForm();
        java.lang.String str39 = uRL9.getQuery();
        java.lang.String str40 = uRL9.getHost();
        java.lang.String str41 = uRL9.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj42 = uRL9.getContent();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getFile();
        int int28 = uRL26.getDefaultPort();
        java.lang.String str29 = uRL26.getRef();
        boolean boolean30 = uRL9.sameFile(uRL26);
        java.lang.String str31 = uRL9.getHost();
        int int32 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream33 = uRL9.openStream();
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL(uRL45, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL53 = new java.net.URL(uRL33, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL54 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        boolean boolean55 = uRL9.sameFile(uRL54);
        java.lang.String str56 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj57 = uRL9.getContent();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getQuery();
        java.lang.String str39 = uRL37.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL51 = new java.net.URL(uRL37, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str52 = uRL37.getAuthority();
        java.lang.String str53 = uRL37.getRef();
        java.lang.String str54 = uRL37.getQuery();
        boolean boolean55 = uRL9.sameFile(uRL37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj56 = uRL37.getContent();
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getFile();
        int int15 = uRL13.getDefaultPort();
        java.lang.String str16 = uRL13.getRef();
        java.lang.String str17 = uRL13.getRef();
        int int18 = uRL13.getPort();
        java.lang.String str19 = uRL13.getPath();
        java.lang.String str20 = uRL13.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str40 = uRL39.getQuery();
        java.lang.String str41 = uRL39.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str48 = explodedArchive47.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection49 = explodedArchive47.getEntries();
        java.util.jar.Manifest manifest50 = explodedArchive47.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive47.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL53 = new java.net.URL(uRL39, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL54 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL55 = new java.net.URL("/archive:///archive:0hi!://:100", "hi!://:100/archive", (int) (short) 100, "/archive:///archive:0hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL56 = new java.net.URL(uRL13, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL57 = new java.net.URL("/hi!:1", "/hi!://:100/hi!://:100", 0, "[hi!://:100/:100]:100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection58 = uRL57.openConnection();
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getHost();
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getProtocol();
        java.lang.String str28 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection29 = uRL9.openConnection();
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getFile();
        int int28 = uRL26.getDefaultPort();
        java.lang.String str29 = uRL26.getRef();
        boolean boolean30 = uRL9.sameFile(uRL26);
        java.lang.String str31 = uRL9.getHost();
        java.lang.String str32 = uRL9.getQuery();
        java.lang.String str33 = uRL9.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream34 = uRL9.openStream();
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.toExternalForm();
        java.net.URL uRL14 = new java.net.URL(uRL9, "");
        java.lang.String str15 = uRL14.toExternalForm();
        int int16 = uRL14.getDefaultPort();
        java.lang.String str17 = uRL14.getHost();
        java.lang.String str18 = uRL14.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = uRL14.getContent();
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL23.getAuthority();
        java.lang.String str25 = uRL23.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getQuery();
        java.lang.String str37 = uRL35.getPath();
        java.lang.String str38 = uRL35.getFile();
        java.lang.String str39 = uRL35.getUserInfo();
        boolean boolean40 = uRL23.sameFile(uRL35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj41 = uRL35.getContent();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        boolean boolean25 = uRL9.sameFile(uRL21);
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getQuery();
        int int28 = uRL9.getPort();
        java.lang.String str29 = uRL9.getProtocol();
        java.lang.String str30 = uRL9.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection31 = uRL9.openConnection();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getFile();
        int int28 = uRL26.getDefaultPort();
        java.lang.String str29 = uRL26.getRef();
        boolean boolean30 = uRL9.sameFile(uRL26);
        java.lang.String str31 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str37 = explodedArchive36.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection38 = explodedArchive36.getEntries();
        java.util.jar.Manifest manifest39 = explodedArchive36.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler40 = explodedArchive36.new FilteredURLStreamHandler();
        java.net.URL uRL41 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler40);
        java.lang.String str42 = uRL41.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        java.util.jar.Manifest manifest51 = explodedArchive48.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler52 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL53 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.lang.String str54 = uRL53.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str57 = explodedArchive56.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection58 = explodedArchive56.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler59 = explodedArchive56.new FilteredURLStreamHandler();
        java.net.URL uRL60 = new java.net.URL(uRL53, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler59);
        java.net.URL uRL61 = new java.net.URL(uRL41, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler59);
        java.lang.String str62 = uRL41.getFile();
        java.lang.String str63 = uRL41.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive68 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str69 = explodedArchive68.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection70 = explodedArchive68.getEntries();
        java.util.jar.Manifest manifest71 = explodedArchive68.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler72 = explodedArchive68.new FilteredURLStreamHandler();
        java.net.URL uRL73 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler72);
        java.lang.String str74 = uRL73.getQuery();
        java.lang.String str75 = uRL73.getRef();
        java.lang.String str76 = uRL73.getRef();
        java.net.URL uRL78 = new java.net.URL(uRL73, "hi!");
        boolean boolean79 = uRL41.sameFile(uRL78);
        java.lang.String str80 = uRL78.getUserInfo();
        java.lang.String str81 = uRL78.toExternalForm();
        boolean boolean82 = uRL9.sameFile(uRL78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj83 = uRL9.getContent();
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        int int17 = uRL16.getPort();
        java.lang.String str18 = uRL16.toExternalForm();
        java.lang.String str19 = uRL16.getQuery();
        java.lang.String str20 = uRL16.getAuthority();
        java.net.URL uRL22 = new java.net.URL(uRL16, "[/hi!://:100/archive]");
        java.lang.String str23 = uRL22.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = uRL22.getContent();
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file1 = explodedArchive0.root;
        java.io.File file2 = explodedArchive0.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler3 = explodedArchive0.new FilteredURLStreamHandler();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        java.util.jar.Manifest manifest15 = explodedArchive12.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler16 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL17 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler16);
        java.lang.String str18 = uRL17.getQuery();
        java.lang.String str19 = uRL17.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive25 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str26 = explodedArchive25.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection27 = explodedArchive25.getEntries();
        java.util.jar.Manifest manifest28 = explodedArchive25.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler29 = explodedArchive25.new FilteredURLStreamHandler();
        java.net.URL uRL30 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.net.URL uRL31 = new java.net.URL(uRL17, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        java.net.URL uRL32 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str47 = uRL46.getQuery();
        java.lang.String str48 = uRL46.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str55 = explodedArchive54.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection56 = explodedArchive54.getEntries();
        java.util.jar.Manifest manifest57 = explodedArchive54.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler58 = explodedArchive54.new FilteredURLStreamHandler();
        java.net.URL uRL59 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL60 = new java.net.URL(uRL46, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL61 = new java.net.URL("/archive", "/archive", (int) (byte) 0, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        int int62 = uRL61.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive67 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str68 = explodedArchive67.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection69 = explodedArchive67.getEntries();
        java.util.jar.Manifest manifest70 = explodedArchive67.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler71 = explodedArchive67.new FilteredURLStreamHandler();
        java.net.URL uRL72 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler71);
        java.lang.String str73 = uRL72.getFile();
        java.lang.String str74 = uRL72.getQuery();
        java.lang.String str75 = uRL72.getRef();
        java.lang.String str76 = uRL72.toExternalForm();
        java.lang.String str77 = uRL72.getPath();
        java.lang.String str78 = uRL72.getAuthority();
        boolean boolean79 = uRL61.sameFile(uRL72);
        boolean boolean80 = uRL32.sameFile(uRL61);
        java.lang.String str81 = uRL32.getPath();
        int int82 = uRL32.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection83 = filteredURLStreamHandler3.openConnection(uRL32);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getQuery();
        java.lang.String str15 = uRL13.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL27 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL28 = new java.net.URL("/archive", "/archive", (int) (byte) 0, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str29 = uRL28.getPath();
        java.lang.String str30 = uRL28.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream31 = uRL28.openStream();
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.getHost();
        int int13 = uRL9.getDefaultPort();
        java.lang.String str14 = uRL9.getFile();
        java.lang.String str15 = uRL9.getHost();
        java.net.URL uRL17 = new java.net.URL(uRL9, "/[/hi!://:100/archive]");
        java.net.URL uRL19 = new java.net.URL(uRL9, "hi!://:100/hi!://:100/hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream20 = uRL9.openStream();
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getPath();
        int int17 = uRL15.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str23 = explodedArchive22.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection24 = explodedArchive22.getEntries();
        java.util.jar.Manifest manifest25 = explodedArchive22.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler26 = explodedArchive22.new FilteredURLStreamHandler();
        java.net.URL uRL27 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler26);
        java.lang.String str28 = uRL27.getQuery();
        java.lang.String str29 = uRL27.getHost();
        int int30 = uRL27.getPort();
        java.lang.String str31 = uRL27.getQuery();
        java.lang.String str32 = uRL27.getFile();
        java.lang.String str33 = uRL27.getRef();
        boolean boolean34 = uRL15.sameFile(uRL27);
        java.net.URL uRL36 = new java.net.URL(uRL15, "hi!://:100/hi!");
        java.lang.String str37 = uRL36.getAuthority();
        java.lang.String str38 = uRL36.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj39 = uRL36.getContent();
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        java.lang.String str12 = uRL9.getPath();
        int int13 = uRL9.getDefaultPort();
        java.lang.String str14 = uRL9.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive19 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str20 = explodedArchive19.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection21 = explodedArchive19.getEntries();
        java.util.jar.Manifest manifest22 = explodedArchive19.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler23 = explodedArchive19.new FilteredURLStreamHandler();
        java.net.URL uRL24 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler23);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive42 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str43 = explodedArchive42.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection44 = explodedArchive42.getEntries();
        java.util.jar.Manifest manifest45 = explodedArchive42.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler46 = explodedArchive42.new FilteredURLStreamHandler();
        java.net.URL uRL47 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler46);
        java.lang.String str48 = uRL47.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive50 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str51 = explodedArchive50.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection52 = explodedArchive50.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler53 = explodedArchive50.new FilteredURLStreamHandler();
        java.net.URL uRL54 = new java.net.URL(uRL47, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler53);
        java.net.URL uRL55 = new java.net.URL(uRL35, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler53);
        java.net.URL uRL56 = new java.net.URL(uRL24, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler53);
        java.lang.String str57 = uRL56.getUserInfo();
        java.net.URL uRL59 = new java.net.URL(uRL56, "://[archive://:10archive]:100archive://:10archive");
        boolean boolean60 = uRL9.sameFile(uRL56);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive65 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str66 = explodedArchive65.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection67 = explodedArchive65.getEntries();
        java.util.jar.Manifest manifest68 = explodedArchive65.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler69 = explodedArchive65.new FilteredURLStreamHandler();
        java.net.URL uRL70 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.lang.String str71 = uRL70.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive73 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str74 = explodedArchive73.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection75 = explodedArchive73.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler76 = explodedArchive73.new FilteredURLStreamHandler();
        java.net.URL uRL77 = new java.net.URL(uRL70, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler76);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive82 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str83 = explodedArchive82.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection84 = explodedArchive82.getEntries();
        java.util.jar.Manifest manifest85 = explodedArchive82.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler86 = explodedArchive82.new FilteredURLStreamHandler();
        java.net.URL uRL87 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler86);
        java.lang.String str88 = uRL87.getFile();
        int int89 = uRL87.getDefaultPort();
        java.lang.String str90 = uRL87.getRef();
        boolean boolean91 = uRL70.sameFile(uRL87);
        int int92 = uRL87.getPort();
        boolean boolean93 = uRL56.sameFile(uRL87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection94 = uRL87.openConnection();
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getHost();
        int int29 = uRL26.getPort();
        java.lang.String str30 = uRL26.getQuery();
        java.net.URL uRL32 = new java.net.URL(uRL26, "");
        java.lang.String str33 = uRL32.getPath();
        int int34 = uRL32.getDefaultPort();
        java.lang.String str35 = uRL32.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str47 = uRL46.getPath();
        java.lang.String str48 = uRL46.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive54 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str55 = explodedArchive54.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection56 = explodedArchive54.getEntries();
        java.util.jar.Manifest manifest57 = explodedArchive54.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler58 = explodedArchive54.new FilteredURLStreamHandler();
        java.net.URL uRL59 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL60 = new java.net.URL(uRL46, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL61 = new java.net.URL(uRL32, "/hi!", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.net.URL uRL62 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler58);
        java.lang.String str63 = uRL62.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream64 = uRL62.openStream();
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        int int15 = uRL9.getPort();
        java.lang.String str16 = uRL9.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream17 = uRL9.openStream();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.net.URL uRL40 = new java.net.URL(uRL37, "hi!");
        java.lang.String str41 = uRL40.getHost();
        int int42 = uRL40.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream43 = uRL40.openStream();
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str48 = explodedArchive47.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection49 = explodedArchive47.getEntries();
        java.util.jar.Manifest manifest50 = explodedArchive47.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive47.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.lang.String str53 = uRL52.getQuery();
        java.lang.String str54 = uRL52.getRef();
        java.lang.String str55 = uRL52.getRef();
        java.lang.String str56 = uRL52.toExternalForm();
        int int57 = uRL52.getDefaultPort();
        boolean boolean58 = uRL9.sameFile(uRL52);
        java.lang.String str59 = uRL9.getQuery();
        java.lang.String str60 = uRL9.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream61 = uRL9.openStream();
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        int int10 = uRL9.getPort();
        java.lang.String str11 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = uRL9.getContent();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler19 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL20 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler19);
        java.lang.String str21 = uRL13.getHost();
        java.lang.String str22 = uRL13.getProtocol();
        java.lang.String str23 = uRL13.toExternalForm();
        java.lang.String str24 = uRL13.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL13, "://[archive://:10archive]:100archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL("[/hi!://:100/archive]:0", "hi!://:100/hi!://:100", 52, "/archive:///archive:0hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj38 = uRL37.getContent();
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getFile();
        int int24 = uRL22.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getQuery();
        java.lang.String str37 = uRL35.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL49 = new java.net.URL(uRL35, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL50 = new java.net.URL(uRL22, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str51 = uRL22.toExternalForm();
        boolean boolean52 = uRL9.sameFile(uRL22);
        java.lang.String str53 = uRL9.getFile();
        java.lang.String str54 = uRL9.getRef();
        java.lang.String str55 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream56 = uRL9.openStream();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL23.getAuthority();
        java.lang.String str25 = uRL23.getRef();
        int int26 = uRL23.getDefaultPort();
        java.lang.String str27 = uRL23.getQuery();
        java.lang.String str28 = uRL23.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection29 = uRL23.openConnection();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.net.URL uRL40 = new java.net.URL(uRL37, "hi!");
        java.lang.String str41 = uRL40.getHost();
        java.lang.String str42 = uRL40.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive44.filtered = true;
        explodedArchive44.filtered = true;
        java.util.Map<org.springframework.boot.loader.util.AsciiBytes, org.springframework.boot.loader.archive.Archive.Entry> asciiBytesMap49 = explodedArchive44.entries;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive44.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL(uRL40, "hi!://:100/hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.net.URL uRL53 = new java.net.URL(uRL51, "/archive:///archive:0hi!://:100");
        java.lang.String str54 = uRL53.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = uRL53.getContent();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        java.lang.String str28 = uRL22.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL(uRL22, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getFile();
        int int47 = uRL45.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str54 = explodedArchive53.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection55 = explodedArchive53.getEntries();
        java.util.jar.Manifest manifest56 = explodedArchive53.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler57 = explodedArchive53.new FilteredURLStreamHandler();
        java.net.URL uRL58 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler57);
        java.lang.String str59 = uRL58.getQuery();
        java.lang.String str60 = uRL58.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive66 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str67 = explodedArchive66.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection68 = explodedArchive66.getEntries();
        java.util.jar.Manifest manifest69 = explodedArchive66.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler70 = explodedArchive66.new FilteredURLStreamHandler();
        java.net.URL uRL71 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.net.URL uRL72 = new java.net.URL(uRL58, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.net.URL uRL73 = new java.net.URL(uRL45, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler70);
        java.lang.String str74 = uRL45.getPath();
        java.lang.String str75 = uRL45.getPath();
        java.lang.String str76 = uRL45.getUserInfo();
        java.lang.String str77 = uRL45.getHost();
        java.lang.String str78 = uRL45.getProtocol();
        boolean boolean79 = uRL22.sameFile(uRL45);
        java.lang.String str80 = uRL45.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection81 = uRL45.openConnection();
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        java.lang.String str12 = uRL9.toExternalForm();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getUserInfo();
        java.lang.String str15 = uRL9.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream16 = uRL9.openStream();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.getPath();
        int int19 = uRL9.getPort();
        java.lang.String str20 = uRL9.getFile();
        java.lang.String str21 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection22 = uRL9.openConnection();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive0 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str1 = explodedArchive0.toString();
        boolean boolean2 = explodedArchive0.filtered;
        java.util.jar.Manifest manifest3 = explodedArchive0.manifest;
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection4 = explodedArchive0.getEntries();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URL uRL5 = explodedArchive0.getUrl();
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        int int17 = uRL16.getPort();
        java.lang.String str18 = uRL16.toExternalForm();
        java.lang.String str19 = uRL16.getUserInfo();
        java.lang.String str20 = uRL16.getPath();
        java.lang.Class[] classArray21 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = uRL16.getContent(classArray21);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        java.net.URL uRL13 = new java.net.URL(uRL9, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream14 = uRL13.openStream();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        int int42 = uRL9.getDefaultPort();
        java.lang.String str43 = uRL9.getAuthority();
        int int44 = uRL9.getDefaultPort();
        java.lang.String str45 = uRL9.getQuery();
        java.lang.String str46 = uRL9.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj47 = uRL9.getContent();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL41.getProtocol();
        int int43 = uRL41.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        java.util.jar.Manifest manifest51 = explodedArchive48.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler52 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL53 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler52);
        java.lang.String str54 = uRL53.getQuery();
        java.lang.String str55 = uRL53.getRef();
        int int56 = uRL53.getPort();
        java.lang.String str57 = uRL53.getProtocol();
        java.lang.String str58 = uRL53.getPath();
        java.lang.String str59 = uRL53.getPath();
        boolean boolean60 = uRL41.sameFile(uRL53);
        java.lang.String str61 = uRL53.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj62 = uRL53.getContent();
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.getPath();
        java.net.URL uRL40 = new java.net.URL(uRL9, "hi!://:100/hi!://:100/hi!://:100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj41 = uRL9.getContent();
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getAuthority();
        int int11 = uRL9.getPort();
        int int12 = uRL9.getDefaultPort();
        java.lang.String str13 = uRL9.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = uRL9.getContent();
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str19 = explodedArchive18.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection20 = explodedArchive18.getEntries();
        java.util.jar.Manifest manifest21 = explodedArchive18.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler22 = explodedArchive18.new FilteredURLStreamHandler();
        java.net.URL uRL23 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler22);
        java.lang.String str24 = uRL23.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler29 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL30 = new java.net.URL(uRL23, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler29);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive35 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str36 = explodedArchive35.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection37 = explodedArchive35.getEntries();
        java.util.jar.Manifest manifest38 = explodedArchive35.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler39 = explodedArchive35.new FilteredURLStreamHandler();
        java.net.URL uRL40 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler39);
        java.lang.String str41 = uRL40.getFile();
        int int42 = uRL40.getDefaultPort();
        java.lang.String str43 = uRL40.getRef();
        boolean boolean44 = uRL23.sameFile(uRL40);
        boolean boolean45 = uRL9.sameFile(uRL23);
        java.lang.String str46 = uRL23.getFile();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive51 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str52 = explodedArchive51.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection53 = explodedArchive51.getEntries();
        java.util.jar.Manifest manifest54 = explodedArchive51.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler55 = explodedArchive51.new FilteredURLStreamHandler();
        java.net.URL uRL56 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler55);
        java.lang.String str57 = uRL56.getAuthority();
        int int58 = uRL56.getPort();
        java.lang.String str59 = uRL56.getQuery();
        boolean boolean60 = uRL23.sameFile(uRL56);
        java.lang.String str61 = uRL56.getProtocol();
        java.lang.String str62 = uRL56.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj63 = uRL56.getContent();
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        int int10 = uRL9.getPort();
        java.lang.String str11 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = uRL9.getContent();
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        int int17 = uRL16.getPort();
        java.lang.String str18 = uRL16.toExternalForm();
        java.lang.String str19 = uRL16.getQuery();
        java.lang.String str20 = uRL16.getPath();
        java.lang.String str21 = uRL16.getAuthority();
        java.lang.String str22 = uRL16.toExternalForm();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive27 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str28 = explodedArchive27.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection29 = explodedArchive27.getEntries();
        java.util.jar.Manifest manifest30 = explodedArchive27.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler31 = explodedArchive27.new FilteredURLStreamHandler();
        java.net.URL uRL32 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler31);
        java.lang.String str33 = uRL32.getQuery();
        java.lang.String str34 = uRL32.getRef();
        int int35 = uRL32.getPort();
        java.lang.String str36 = uRL32.getProtocol();
        java.lang.String str37 = uRL32.getPath();
        java.lang.String str38 = uRL32.getAuthority();
        java.lang.String str39 = uRL32.getAuthority();
        java.lang.String str40 = uRL32.getUserInfo();
        boolean boolean41 = uRL16.sameFile(uRL32);
        java.net.URL uRL43 = new java.net.URL(uRL32, "[hi!://:100/hi!://:100]:0");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection44 = uRL43.openConnection();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getRef();
        java.lang.String str15 = uRL9.getProtocol();
        java.net.URL uRL17 = new java.net.URL(uRL9, "archive");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection18 = uRL9.openConnection();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getFile();
        int int37 = uRL35.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str49 = uRL48.getQuery();
        java.lang.String str50 = uRL48.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str57 = explodedArchive56.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection58 = explodedArchive56.getEntries();
        java.util.jar.Manifest manifest59 = explodedArchive56.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler60 = explodedArchive56.new FilteredURLStreamHandler();
        java.net.URL uRL61 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL62 = new java.net.URL(uRL48, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL63 = new java.net.URL(uRL35, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL64 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL66 = new java.net.URL(uRL64, ":100");
        java.net.URL uRL68 = new java.net.URL(uRL64, "hi!://:100/hi!://:100/hi!://hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream69 = uRL68.openStream();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL9.getPath();
        java.lang.String str18 = uRL9.toExternalForm();
        java.lang.String str19 = uRL9.getProtocol();
        java.lang.String str20 = uRL9.getProtocol();
        java.lang.String str21 = uRL9.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection22 = uRL9.openConnection();
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        java.lang.String str28 = uRL9.getHost();
        java.lang.String str29 = uRL9.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream30 = uRL9.openStream();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getQuery();
        java.lang.String str15 = uRL13.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL27 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL28 = new java.net.URL("/archive", "/archive", (int) (byte) 0, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str39 = uRL38.getQuery();
        java.lang.String str40 = uRL38.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str47 = explodedArchive46.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection48 = explodedArchive46.getEntries();
        java.util.jar.Manifest manifest49 = explodedArchive46.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive46.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.net.URL uRL52 = new java.net.URL(uRL38, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.lang.String str53 = uRL38.getFile();
        java.lang.String str54 = uRL38.getRef();
        java.net.URL uRL56 = new java.net.URL(uRL38, "");
        boolean boolean57 = uRL28.sameFile(uRL56);
        java.lang.String str58 = uRL56.toExternalForm();
        int int59 = uRL56.getDefaultPort();
        java.lang.String str60 = uRL56.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream61 = uRL56.openStream();
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.toExternalForm();
        java.lang.String str18 = uRL16.getPath();
        java.lang.String str19 = uRL16.getProtocol();
        int int20 = uRL16.getDefaultPort();
        int int21 = uRL16.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = uRL16.getContent();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.getPath();
        java.net.URL uRL20 = new java.net.URL(uRL9, "hi!://:100/hi!://[hi!://:100/hi!]:0hi!://:100/hi!");
        java.net.URL uRL22 = new java.net.URL(uRL20, "hi!://[:100]:52hi!");
        java.lang.String str23 = uRL22.getProtocol();
        java.lang.String str24 = uRL22.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection25 = uRL22.openConnection();
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file9 = explodedArchive8.root;
        java.io.File file10 = explodedArchive8.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler11 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL12 = new java.net.URL("/archive://[hi!://:100/hi!]:1/hi!", "hi!://:100", (int) 'a', "/hi!://:100/archive", (java.net.URLStreamHandler) filteredURLStreamHandler11);
        java.net.URL uRL13 = new java.net.URL("/archive://[hi!://:100/hi!]:1/hi!", "/hi!://:100/archive", (int) ' ', "hi!://:100/hi!://hi!:1hi!", (java.net.URLStreamHandler) filteredURLStreamHandler11);
        java.lang.String str14 = uRL13.getRef();
        java.lang.String str15 = uRL13.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = uRL13.getContent();
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive29 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str30 = explodedArchive29.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection31 = explodedArchive29.getEntries();
        java.util.jar.Manifest manifest32 = explodedArchive29.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler33 = explodedArchive29.new FilteredURLStreamHandler();
        java.net.URL uRL34 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL35 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL36 = new java.net.URL("/hi!://:100", "archive", (int) (short) 1, "/archive", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL37 = new java.net.URL(":100", "[hi!://:100/hi!]", (int) (short) 100, "hi!://:100/archive", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        java.net.URL uRL38 = new java.net.URL("/://[archive://:10archive]:100archive://:10archive://[/hi!://:100]:32archive://:0hi!://:100/hi!", "hi!://:100/hi!://:100/hi!://[hi!://:100/hi!]:0hi!://:100/hi!://:100/hi!://:100", (int) (byte) -1, "hi!://:100/hi!://:100/hi!://[/hi!://:100/archive]", (java.net.URLStreamHandler) filteredURLStreamHandler33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream39 = uRL38.openStream();
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getRef();
        java.lang.String str15 = uRL9.getProtocol();
        java.lang.String str16 = uRL9.getFile();
        java.lang.String str17 = uRL9.getPath();
        java.lang.String str18 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream19 = uRL9.openStream();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        java.lang.String str12 = uRL9.getRef();
        java.lang.String str13 = uRL9.getAuthority();
        java.lang.String str14 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL(uRL9, "/hi!://[hi!://:100/hi!]:1/archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str51 = uRL50.getQuery();
        java.lang.String str52 = uRL50.getHost();
        int int53 = uRL50.getPort();
        java.lang.String str54 = uRL50.getQuery();
        java.net.URL uRL56 = new java.net.URL(uRL50, "");
        java.lang.String str57 = uRL56.getPath();
        int int58 = uRL56.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive63 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str64 = explodedArchive63.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection65 = explodedArchive63.getEntries();
        java.util.jar.Manifest manifest66 = explodedArchive63.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler67 = explodedArchive63.new FilteredURLStreamHandler();
        java.net.URL uRL68 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler67);
        java.lang.String str69 = uRL68.getQuery();
        java.lang.String str70 = uRL68.getHost();
        int int71 = uRL68.getPort();
        java.lang.String str72 = uRL68.getQuery();
        java.lang.String str73 = uRL68.getFile();
        java.lang.String str74 = uRL68.getRef();
        boolean boolean75 = uRL56.sameFile(uRL68);
        java.net.URL uRL77 = new java.net.URL(uRL56, "hi!://:100/hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection78 = filteredURLStreamHandler37.openConnection(uRL77);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getRef();
        int int24 = uRL21.getPort();
        java.lang.String str25 = uRL21.getProtocol();
        java.lang.String str26 = uRL21.getPath();
        java.lang.String str27 = uRL21.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str39 = uRL38.getFile();
        int int40 = uRL38.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str47 = explodedArchive46.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection48 = explodedArchive46.getEntries();
        java.util.jar.Manifest manifest49 = explodedArchive46.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive46.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.lang.String str52 = uRL51.getQuery();
        java.lang.String str53 = uRL51.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str60 = explodedArchive59.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection61 = explodedArchive59.getEntries();
        java.util.jar.Manifest manifest62 = explodedArchive59.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler63 = explodedArchive59.new FilteredURLStreamHandler();
        java.net.URL uRL64 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL65 = new java.net.URL(uRL51, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL66 = new java.net.URL(uRL38, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL67 = new java.net.URL(uRL21, "hi!://:100/hi!", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL68 = new java.net.URL(":100", "hi!://:100/hi!", (int) (byte) 0, "archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL69 = new java.net.URL("/hi!", "hi!://:100/archive://[hi!://:100]:0[hi!://:100/hi!]", 52, "hi!://:100/hi!://:100/hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.net.URL uRL70 = new java.net.URL("[/archive:///archive:0hi!://:100]:0", "archive", 97, "hi!://:100/hi!://hi!:1hi!", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        int int71 = uRL70.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection72 = uRL70.openConnection();
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL9.getHost();
        java.lang.String str18 = uRL9.getProtocol();
        java.lang.String str19 = uRL9.toExternalForm();
        java.lang.String str20 = uRL9.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        java.util.jar.Manifest manifest29 = explodedArchive26.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler30 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL31 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.net.URL uRL32 = new java.net.URL(uRL9, "://[archive://:10archive]:100archive://:10archive", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.lang.String str33 = uRL32.getPath();
        java.lang.String str34 = uRL32.getRef();
        java.lang.String str35 = uRL32.getPath();
        java.lang.String str36 = uRL32.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection37 = uRL32.openConnection();
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getFile();
        boolean boolean35 = uRL23.sameFile(uRL33);
        java.lang.String str36 = uRL33.getFile();
        java.lang.String str37 = uRL33.getHost();
        java.net.URL uRL39 = new java.net.URL(uRL33, "hi!://:100/hi!://:100/archive:///archive:0hi!://:100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj40 = uRL33.getContent();
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.toExternalForm();
        java.lang.String str39 = uRL9.getQuery();
        java.lang.String str40 = uRL9.getQuery();
        java.lang.String str41 = uRL9.getPath();
        java.lang.String str42 = uRL9.getUserInfo();
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj44 = uRL9.getContent(classArray43);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        java.lang.String str28 = uRL22.getUserInfo();
        java.lang.String str29 = uRL22.getAuthority();
        java.lang.String str30 = uRL22.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream31 = uRL22.openStream();
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getFile();
        java.lang.String str31 = uRL9.getProtocol();
        int int32 = uRL9.getPort();
        java.lang.String str33 = uRL9.getUserInfo();
        java.lang.String str34 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection35 = uRL9.openConnection();
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getUserInfo();
        java.lang.String str18 = uRL16.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str24 = explodedArchive23.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection25 = explodedArchive23.getEntries();
        java.util.jar.Manifest manifest26 = explodedArchive23.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive23.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str29 = uRL28.getQuery();
        java.lang.String str30 = uRL28.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str37 = explodedArchive36.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection38 = explodedArchive36.getEntries();
        java.util.jar.Manifest manifest39 = explodedArchive36.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler40 = explodedArchive36.new FilteredURLStreamHandler();
        java.net.URL uRL41 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler40);
        java.net.URL uRL42 = new java.net.URL(uRL28, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler40);
        int int43 = uRL42.getPort();
        java.lang.String str44 = uRL42.getPath();
        java.lang.String str45 = uRL42.getPath();
        java.lang.String str46 = uRL42.toExternalForm();
        java.lang.String str47 = uRL42.getRef();
        java.lang.String str48 = uRL42.getPath();
        boolean boolean49 = uRL16.sameFile(uRL42);
        java.lang.String str50 = uRL42.getRef();
        java.lang.String str51 = uRL42.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection52 = uRL42.openConnection();
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.getPath();
        java.net.URL uRL20 = new java.net.URL(uRL9, "hi!://:100/hi!://[hi!://:100/hi!]:0hi!://:100/hi!");
        java.net.URL uRL22 = new java.net.URL(uRL20, "hi!://[:100]:52hi!");
        java.lang.String str23 = uRL22.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getHost();
        boolean boolean35 = uRL22.sameFile(uRL33);
        java.lang.String str36 = uRL33.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection37 = uRL33.openConnection();
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getPath();
        int int17 = uRL15.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str23 = explodedArchive22.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection24 = explodedArchive22.getEntries();
        java.util.jar.Manifest manifest25 = explodedArchive22.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler26 = explodedArchive22.new FilteredURLStreamHandler();
        java.net.URL uRL27 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler26);
        java.lang.String str28 = uRL27.getQuery();
        java.lang.String str29 = uRL27.getHost();
        int int30 = uRL27.getPort();
        java.lang.String str31 = uRL27.getQuery();
        java.lang.String str32 = uRL27.getFile();
        java.lang.String str33 = uRL27.getRef();
        boolean boolean34 = uRL15.sameFile(uRL27);
        java.net.URL uRL36 = new java.net.URL(uRL15, "hi!://:100/hi!");
        java.lang.String str37 = uRL15.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection38 = uRL15.openConnection();
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getUserInfo();
        java.lang.String str18 = uRL16.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive23 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str24 = explodedArchive23.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection25 = explodedArchive23.getEntries();
        java.util.jar.Manifest manifest26 = explodedArchive23.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive23.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str29 = uRL28.getQuery();
        java.lang.String str30 = uRL28.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive36 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str37 = explodedArchive36.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection38 = explodedArchive36.getEntries();
        java.util.jar.Manifest manifest39 = explodedArchive36.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler40 = explodedArchive36.new FilteredURLStreamHandler();
        java.net.URL uRL41 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler40);
        java.net.URL uRL42 = new java.net.URL(uRL28, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler40);
        int int43 = uRL42.getPort();
        java.lang.String str44 = uRL42.getPath();
        java.lang.String str45 = uRL42.getPath();
        java.lang.String str46 = uRL42.toExternalForm();
        java.lang.String str47 = uRL42.getRef();
        java.lang.String str48 = uRL42.getPath();
        boolean boolean49 = uRL16.sameFile(uRL42);
        java.lang.String str50 = uRL42.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection51 = uRL42.openConnection();
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        java.lang.String str13 = uRL9.getRef();
        int int14 = uRL9.getPort();
        java.lang.String str15 = uRL9.getPath();
        java.lang.String str16 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getQuery();
        java.lang.String str37 = uRL35.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL49 = new java.net.URL(uRL35, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL50 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL51 = new java.net.URL("/archive:///archive:0hi!://:100", "hi!://:100/archive", (int) (short) 100, "/archive:///archive:0hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL52 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str53 = uRL52.toExternalForm();
        java.lang.String str54 = uRL52.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream55 = uRL52.openStream();
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.net.URL uRL40 = new java.net.URL(uRL37, "hi!");
        java.lang.String str41 = uRL40.getHost();
        java.lang.String str42 = uRL40.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = new org.springframework.boot.loader.archive.ExplodedArchive();
        explodedArchive44.filtered = true;
        explodedArchive44.filtered = true;
        java.util.Map<org.springframework.boot.loader.util.AsciiBytes, org.springframework.boot.loader.archive.Archive.Entry> asciiBytesMap49 = explodedArchive44.entries;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive44.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL(uRL40, "hi!://:100/hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream52 = uRL40.openStream();
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.toExternalForm();
        java.net.URL uRL14 = new java.net.URL(uRL9, "");
        java.lang.String str15 = uRL9.getHost();
        java.lang.String str16 = uRL9.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection17 = uRL9.openConnection();
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.lang.String str39 = uRL37.getProtocol();
        java.lang.String str40 = uRL37.getAuthority();
        java.lang.String str41 = uRL37.getUserInfo();
        java.lang.String str42 = uRL37.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj43 = uRL37.getContent();
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getFile();
        int int37 = uRL35.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str49 = uRL48.getQuery();
        java.lang.String str50 = uRL48.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str57 = explodedArchive56.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection58 = explodedArchive56.getEntries();
        java.util.jar.Manifest manifest59 = explodedArchive56.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler60 = explodedArchive56.new FilteredURLStreamHandler();
        java.net.URL uRL61 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL62 = new java.net.URL(uRL48, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL63 = new java.net.URL(uRL35, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL64 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.net.URL uRL66 = new java.net.URL(uRL64, ":100");
        java.net.URL uRL68 = new java.net.URL(uRL66, "/archive");
        java.lang.String str69 = uRL66.getPath();
        java.lang.String str70 = uRL66.getUserInfo();
        java.lang.String str71 = uRL66.getAuthority();
        int int72 = uRL66.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection73 = uRL66.openConnection();
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getQuery();
        java.net.URL uRL26 = new java.net.URL(uRL9, "/hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = uRL26.getContent();
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getFile();
        int int15 = uRL13.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str27 = uRL26.getQuery();
        java.lang.String str28 = uRL26.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive34 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str35 = explodedArchive34.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection36 = explodedArchive34.getEntries();
        java.util.jar.Manifest manifest37 = explodedArchive34.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler38 = explodedArchive34.new FilteredURLStreamHandler();
        java.net.URL uRL39 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL40 = new java.net.URL(uRL26, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL41 = new java.net.URL(uRL13, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.net.URL uRL42 = new java.net.URL("archive", "", (int) (byte) 10, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler38);
        java.lang.String str43 = uRL42.getPath();
        java.net.URI uRI44 = uRL42.toURI();
        java.lang.String str45 = uRL42.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj46 = uRL42.getContent();
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getRef();
        java.lang.String str15 = uRL9.getQuery();
        java.lang.String str16 = uRL9.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection17 = uRL9.openConnection();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.io.File file9 = explodedArchive8.root;
        java.io.File file10 = explodedArchive8.root;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler11 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL12 = new java.net.URL("/archive://[hi!://:100/hi!]:1/hi!", "hi!://:100", (int) 'a', "/hi!://:100/archive", (java.net.URLStreamHandler) filteredURLStreamHandler11);
        java.net.URL uRL13 = new java.net.URL("/archive://[hi!://:100/hi!]:1/hi!", "/hi!://:100/archive", (int) ' ', "hi!://:100/hi!://hi!:1hi!", (java.net.URLStreamHandler) filteredURLStreamHandler11);
        java.lang.String str14 = uRL13.getPath();
        java.lang.String str15 = uRL13.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream16 = uRL13.openStream();
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getUserInfo();
        java.lang.String str17 = uRL15.getPath();
        java.net.URL uRL19 = new java.net.URL(uRL15, "hi!://:100/hi!://:100/hi!://:100/hi!://[://[archive://:10archive]:100archive://[hi!://:100/:100]:100");
        java.lang.String str20 = uRL15.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection21 = uRL15.openConnection();
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getFile();
        boolean boolean35 = uRL23.sameFile(uRL33);
        int int36 = uRL33.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str47 = uRL46.getQuery();
        java.lang.String str48 = uRL46.getRef();
        java.lang.String str49 = uRL46.getRef();
        java.net.URL uRL51 = new java.net.URL(uRL46, "hi!");
        boolean boolean52 = uRL33.sameFile(uRL51);
        java.lang.String str53 = uRL51.getAuthority();
        java.lang.String str54 = uRL51.getHost();
        java.lang.String str55 = uRL51.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection56 = uRL51.openConnection();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        boolean boolean25 = uRL9.sameFile(uRL21);
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getQuery();
        int int28 = uRL9.getPort();
        java.lang.String str29 = uRL9.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection30 = uRL9.openConnection();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getRef();
        java.net.URL uRL27 = new java.net.URL(uRL9, "");
        java.lang.String str28 = uRL9.getFile();
        java.lang.String str29 = uRL9.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream30 = uRL9.openStream();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        boolean boolean25 = uRL9.sameFile(uRL21);
        java.net.URL uRL27 = new java.net.URL(uRL21, "");
        java.lang.String str28 = uRL27.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str39 = uRL38.getQuery();
        java.lang.String str40 = uRL38.getHost();
        int int41 = uRL38.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str47 = explodedArchive46.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection48 = explodedArchive46.getEntries();
        java.util.jar.Manifest manifest49 = explodedArchive46.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive46.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.lang.String str52 = uRL51.getFile();
        int int53 = uRL51.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive59 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str60 = explodedArchive59.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection61 = explodedArchive59.getEntries();
        java.util.jar.Manifest manifest62 = explodedArchive59.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler63 = explodedArchive59.new FilteredURLStreamHandler();
        java.net.URL uRL64 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler63);
        java.lang.String str65 = uRL64.getQuery();
        java.lang.String str66 = uRL64.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive72 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str73 = explodedArchive72.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection74 = explodedArchive72.getEntries();
        java.util.jar.Manifest manifest75 = explodedArchive72.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler76 = explodedArchive72.new FilteredURLStreamHandler();
        java.net.URL uRL77 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler76);
        java.net.URL uRL78 = new java.net.URL(uRL64, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler76);
        java.net.URL uRL79 = new java.net.URL(uRL51, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler76);
        java.lang.String str80 = uRL51.toExternalForm();
        boolean boolean81 = uRL38.sameFile(uRL51);
        java.lang.String str82 = uRL38.getFile();
        java.lang.String str83 = uRL38.getRef();
        java.lang.String str84 = uRL38.getAuthority();
        java.lang.String str85 = uRL38.getPath();
        boolean boolean86 = uRL27.sameFile(uRL38);
        java.net.URL uRL88 = new java.net.URL(uRL38, "hi!://:100/hi!://[hi!://:100/hi!]:0hi!://:100/hi!");
        java.net.URL uRL90 = new java.net.URL(uRL38, "hi!://:100/[/hi!://:100/archive]");
        java.net.URL uRL92 = new java.net.URL(uRL90, "/[hi!://:100/hi!]");
        java.lang.String str93 = uRL92.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj94 = uRL92.getContent();
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.lang.String str14 = uRL9.getFile();
        java.lang.String str15 = uRL9.getRef();
        java.lang.String str16 = uRL9.getPath();
        int int17 = uRL9.getDefaultPort();
        java.lang.String str18 = uRL9.getQuery();
        java.net.URL uRL20 = new java.net.URL(uRL9, "hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1");
        int int21 = uRL20.getDefaultPort();
        java.lang.String str22 = uRL20.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection23 = uRL20.openConnection();
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getFile();
        java.lang.String str31 = uRL9.getRef();
        java.lang.String str32 = uRL9.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection33 = uRL9.openConnection();
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        int int11 = uRL9.getPort();
        java.lang.String str12 = uRL9.getQuery();
        java.lang.String str13 = uRL9.getHost();
        java.lang.String str14 = uRL9.getFile();
        java.lang.String str15 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection16 = uRL9.openConnection();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.net.URL uRL15 = new java.net.URL(uRL9, "");
        java.lang.String str16 = uRL15.getUserInfo();
        java.lang.String str17 = uRL15.getPath();
        java.net.URL uRL19 = new java.net.URL(uRL15, "hi!://:100/hi!://:100/hi!://:100/hi!://[://[archive://:10archive]:100archive://[hi!://:100/:100]:100");
        java.lang.String str20 = uRL15.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection21 = uRL15.openConnection();
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getQuery();
        java.net.URL uRL26 = new java.net.URL(uRL9, "/hi!");
        java.net.URL uRL28 = new java.net.URL(uRL26, "[hi!:1]");
        java.lang.String str29 = uRL26.toExternalForm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream30 = uRL26.openStream();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = uRL16.getContent();
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getAuthority();
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getFile();
        int int28 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream29 = uRL9.openStream();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        java.util.jar.Manifest manifest15 = explodedArchive12.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler16 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL17 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler16);
        java.lang.String str18 = uRL17.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getQuery();
        java.lang.String str35 = uRL33.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL47 = new java.net.URL(uRL33, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL48 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL49 = new java.net.URL(uRL17, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL50 = new java.net.URL("hi!://:100/archive://[hi!://:100]:0[hi!://:100/hi!]", "hi!://:100/:100://[archive://:10archive]hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1", (-1), "hi!://:100/hi!://:100/hi!:1", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL51 = new java.net.URL("[archive://:0hi!://:100/hi!]", "[/hi!://:100/archive]:32", 1, "[/hi!://:100/archive]:1", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive56 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str57 = explodedArchive56.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection58 = explodedArchive56.getEntries();
        java.util.jar.Manifest manifest59 = explodedArchive56.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler60 = explodedArchive56.new FilteredURLStreamHandler();
        java.net.URL uRL61 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler60);
        java.lang.String str62 = uRL61.getQuery();
        java.lang.String str63 = uRL61.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive69 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str70 = explodedArchive69.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection71 = explodedArchive69.getEntries();
        java.util.jar.Manifest manifest72 = explodedArchive69.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler73 = explodedArchive69.new FilteredURLStreamHandler();
        java.net.URL uRL74 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler73);
        java.net.URL uRL75 = new java.net.URL(uRL61, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler73);
        java.lang.String str76 = uRL61.getAuthority();
        java.lang.String str77 = uRL61.getRef();
        java.lang.String str78 = uRL61.toExternalForm();
        java.lang.String str79 = uRL61.getFile();
        int int80 = uRL61.getPort();
        java.net.URL uRL82 = new java.net.URL(uRL61, "[hi!://:100/hi!:1]:52");
        java.net.URL uRL84 = new java.net.URL(uRL82, "hi!://:100/hi!://:100/hi!://:100/archive");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection85 = filteredURLStreamHandler45.openConnection(uRL84);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        int int17 = uRL16.getPort();
        java.lang.String str18 = uRL16.toExternalForm();
        java.lang.String str19 = uRL16.getQuery();
        java.lang.String str20 = uRL16.getFile();
        java.net.URL uRL22 = new java.net.URL(uRL16, "archive");
        java.lang.String str23 = uRL22.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = uRL22.getContent();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getAuthority();
        int int26 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream27 = uRL9.openStream();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getAuthority();
        java.lang.String str25 = uRL9.getRef();
        java.lang.String str26 = uRL9.getProtocol();
        java.lang.String str27 = uRL9.getUserInfo();
        java.lang.String str28 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str39 = uRL38.getQuery();
        java.lang.String str40 = uRL38.getPath();
        java.lang.String str41 = uRL38.getFile();
        int int42 = uRL38.getPort();
        boolean boolean43 = uRL9.sameFile(uRL38);
        java.lang.String str44 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream45 = uRL9.openStream();
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getFile();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive18 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str19 = explodedArchive18.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection20 = explodedArchive18.getEntries();
        java.util.jar.Manifest manifest21 = explodedArchive18.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler22 = explodedArchive18.new FilteredURLStreamHandler();
        java.net.URL uRL23 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler22);
        java.lang.String str24 = uRL23.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive38 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str39 = explodedArchive38.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection40 = explodedArchive38.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler41 = explodedArchive38.new FilteredURLStreamHandler();
        java.net.URL uRL42 = new java.net.URL(uRL35, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler41);
        java.net.URL uRL43 = new java.net.URL(uRL23, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler41);
        java.net.URL uRL44 = new java.net.URL(uRL9, "/archive", (java.net.URLStreamHandler) filteredURLStreamHandler41);
        java.lang.String str45 = uRL9.getPath();
        java.net.URL uRL47 = new java.net.URL(uRL9, "hi!://:100/[hi!://:100/hi!]");
        java.lang.String str48 = uRL47.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection49 = uRL47.openConnection();
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!://:100", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL23.getAuthority();
        java.lang.String str25 = uRL23.getHost();
        java.net.URL uRL27 = new java.net.URL(uRL23, ":10");
        java.net.URL uRL29 = new java.net.URL(uRL27, "hi!://:100");
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = uRL29.getContent(classArray30);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getQuery();
        java.lang.String str14 = uRL9.getFile();
        java.lang.String str15 = uRL9.getRef();
        java.lang.String str16 = uRL9.getPath();
        int int17 = uRL9.getDefaultPort();
        java.lang.String str18 = uRL9.getQuery();
        java.net.URL uRL20 = new java.net.URL(uRL9, "hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1");
        java.lang.String str21 = uRL9.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = uRL9.getContent();
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL9.getQuery();
        java.lang.String str43 = uRL9.getRef();
        java.net.URL uRL45 = new java.net.URL(uRL9, "/hi!");
        java.lang.String str46 = uRL45.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection47 = uRL45.openConnection();
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getQuery();
        java.lang.String str23 = uRL21.getHost();
        int int24 = uRL21.getPort();
        boolean boolean25 = uRL9.sameFile(uRL21);
        java.net.URL uRL27 = new java.net.URL(uRL21, "");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getQuery();
        java.lang.String str39 = uRL37.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.net.URL uRL51 = new java.net.URL(uRL37, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str52 = uRL37.getQuery();
        boolean boolean53 = uRL27.sameFile(uRL37);
        int int54 = uRL27.getDefaultPort();
        java.net.URL uRL56 = new java.net.URL(uRL27, "hi!://:100/[://[archive://:10archive]:100archive://:10archive]:100");
        java.lang.String str57 = uRL27.getQuery();
        int int58 = uRL27.getPort();
        java.lang.String str59 = uRL27.getQuery();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection60 = uRL27.openConnection();
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        int int24 = uRL23.getPort();
        java.lang.String str25 = uRL23.getPath();
        java.lang.String str26 = uRL23.getPath();
        java.lang.String str27 = uRL23.toExternalForm();
        java.lang.String str28 = uRL23.getRef();
        java.lang.String str29 = uRL23.toExternalForm();
        int int30 = uRL23.getDefaultPort();
        java.lang.String str31 = uRL23.getFile();
        java.lang.String str32 = uRL23.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream33 = uRL23.openStream();
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive8 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str9 = explodedArchive8.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection10 = explodedArchive8.getEntries();
        java.util.jar.Manifest manifest11 = explodedArchive8.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler12 = explodedArchive8.new FilteredURLStreamHandler();
        java.net.URL uRL13 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler12);
        java.lang.String str14 = uRL13.getQuery();
        java.lang.String str15 = uRL13.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive21 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str22 = explodedArchive21.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection23 = explodedArchive21.getEntries();
        java.util.jar.Manifest manifest24 = explodedArchive21.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler25 = explodedArchive21.new FilteredURLStreamHandler();
        java.net.URL uRL26 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL27 = new java.net.URL(uRL13, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.net.URL uRL28 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler25);
        java.lang.String str29 = uRL28.getProtocol();
        java.lang.String str30 = uRL28.getPath();
        java.lang.String str31 = uRL28.getRef();
        java.lang.String str32 = uRL28.getRef();
        java.lang.Class[] classArray33 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj34 = uRL28.getContent(classArray33);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        java.lang.String str28 = uRL22.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj29 = uRL22.getContent();
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler15 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler15);
        java.lang.String str17 = uRL16.getUserInfo();
        java.lang.String str18 = uRL16.getUserInfo();
        java.lang.String str19 = uRL16.getProtocol();
        java.lang.String str20 = uRL16.getAuthority();
        java.lang.String str21 = uRL16.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive26 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str27 = explodedArchive26.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection28 = explodedArchive26.getEntries();
        java.util.jar.Manifest manifest29 = explodedArchive26.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler30 = explodedArchive26.new FilteredURLStreamHandler();
        java.net.URL uRL31 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler30);
        java.lang.String str32 = uRL31.getQuery();
        java.lang.String str33 = uRL31.getHost();
        int int34 = uRL31.getPort();
        java.lang.String str35 = uRL31.getQuery();
        java.net.URL uRL37 = new java.net.URL(uRL31, "");
        java.lang.String str38 = uRL37.getPath();
        int int39 = uRL37.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive44 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str45 = explodedArchive44.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection46 = explodedArchive44.getEntries();
        java.util.jar.Manifest manifest47 = explodedArchive44.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler48 = explodedArchive44.new FilteredURLStreamHandler();
        java.net.URL uRL49 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler48);
        java.lang.String str50 = uRL49.getQuery();
        java.lang.String str51 = uRL49.getHost();
        int int52 = uRL49.getPort();
        java.lang.String str53 = uRL49.getQuery();
        java.lang.String str54 = uRL49.getFile();
        java.lang.String str55 = uRL49.getRef();
        boolean boolean56 = uRL37.sameFile(uRL49);
        java.net.URL uRL58 = new java.net.URL(uRL37, "hi!://:100/hi!");
        boolean boolean59 = uRL16.sameFile(uRL58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection60 = uRL16.openConnection();
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getFile();
        java.lang.String str13 = uRL9.toExternalForm();
        int int14 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = uRL9.getContent();
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive47 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str48 = explodedArchive47.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection49 = explodedArchive47.getEntries();
        java.util.jar.Manifest manifest50 = explodedArchive47.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive47.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.lang.String str53 = uRL52.getQuery();
        java.lang.String str54 = uRL52.getRef();
        java.lang.String str55 = uRL52.getRef();
        java.lang.String str56 = uRL52.toExternalForm();
        int int57 = uRL52.getDefaultPort();
        boolean boolean58 = uRL9.sameFile(uRL52);
        java.lang.String str59 = uRL9.getQuery();
        java.lang.String str60 = uRL9.getFile();
        java.lang.String str61 = uRL9.toExternalForm();
        java.lang.String str62 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection63 = uRL9.openConnection();
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        java.lang.String str17 = uRL9.getQuery();
        java.lang.String str18 = uRL9.getUserInfo();
        java.lang.String str19 = uRL9.getFile();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection20 = uRL9.openConnection();
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive12 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str13 = explodedArchive12.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection14 = explodedArchive12.getEntries();
        java.util.jar.Manifest manifest15 = explodedArchive12.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler16 = explodedArchive12.new FilteredURLStreamHandler();
        java.net.URL uRL17 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler16);
        java.lang.String str18 = uRL17.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getQuery();
        java.lang.String str35 = uRL33.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive41 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str42 = explodedArchive41.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection43 = explodedArchive41.getEntries();
        java.util.jar.Manifest manifest44 = explodedArchive41.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler45 = explodedArchive41.new FilteredURLStreamHandler();
        java.net.URL uRL46 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL47 = new java.net.URL(uRL33, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL48 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL49 = new java.net.URL(uRL17, "", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL50 = new java.net.URL("hi!://:100/archive://[hi!://:100]:0[hi!://:100/hi!]", "hi!://:100/:100://[archive://:10archive]hi!://[://[archive://:10archive]:100archive://:10archive]:0hi!:1", (-1), "hi!://:100/hi!://:100/hi!:1", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.net.URL uRL51 = new java.net.URL("[archive://:0hi!://:100/hi!]", "[/hi!://:100/archive]:32", 1, "[/hi!://:100/archive]:1", (java.net.URLStreamHandler) filteredURLStreamHandler45);
        java.lang.String str52 = uRL51.getRef();
        java.lang.Class[] classArray53 = new java.lang.Class[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj54 = uRL51.getContent(classArray53);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.toExternalForm();
        java.lang.String str13 = uRL9.toExternalForm();
        int int14 = uRL9.getPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection15 = uRL9.openConnection();
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL37.getUserInfo();
        java.net.URL uRL40 = new java.net.URL(uRL37, "hi!");
        java.lang.String str41 = uRL40.getHost();
        int int42 = uRL40.getPort();
        java.lang.String str43 = uRL40.getUserInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection44 = uRL40.openConnection();
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getFile();
        java.lang.String str31 = uRL9.getRef();
        java.lang.String str32 = uRL9.getHost();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection33 = uRL9.openConnection();
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.getProtocol();
        java.lang.String str14 = uRL9.getPath();
        java.lang.String str15 = uRL9.getAuthority();
        java.lang.String str16 = uRL9.getRef();
        int int17 = uRL9.getPort();
        java.lang.String str18 = uRL9.getAuthority();
        int int19 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream20 = uRL9.openStream();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        java.lang.String str12 = uRL9.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive28 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str29 = explodedArchive28.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection30 = explodedArchive28.getEntries();
        java.util.jar.Manifest manifest31 = explodedArchive28.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler32 = explodedArchive28.new FilteredURLStreamHandler();
        java.net.URL uRL33 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler32);
        java.lang.String str34 = uRL33.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive40 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str41 = explodedArchive40.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection42 = explodedArchive40.getEntries();
        java.util.jar.Manifest manifest43 = explodedArchive40.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler44 = explodedArchive40.new FilteredURLStreamHandler();
        java.net.URL uRL45 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler44);
        java.lang.String str46 = uRL45.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive48 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str49 = explodedArchive48.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection50 = explodedArchive48.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler51 = explodedArchive48.new FilteredURLStreamHandler();
        java.net.URL uRL52 = new java.net.URL(uRL45, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL53 = new java.net.URL(uRL33, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        java.net.URL uRL54 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler51);
        boolean boolean55 = uRL9.sameFile(uRL54);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive60 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str61 = explodedArchive60.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection62 = explodedArchive60.getEntries();
        java.util.jar.Manifest manifest63 = explodedArchive60.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler64 = explodedArchive60.new FilteredURLStreamHandler();
        java.net.URL uRL65 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler64);
        java.lang.String str66 = uRL65.getAuthority();
        boolean boolean67 = uRL54.sameFile(uRL65);
        java.lang.String str68 = uRL65.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection69 = uRL65.openConnection();
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "hi!", (int) (byte) 1, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        int int10 = uRL9.getPort();
        java.lang.String str11 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getFile();
        java.lang.String str23 = uRL21.getFile();
        java.net.URL uRL25 = new java.net.URL(uRL21, "hi!://:100");
        java.lang.Class<?> wildcardClass26 = uRL21.getClass();
        java.lang.Class[] classArray27 = new java.lang.Class[] { wildcardClass26 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj28 = uRL9.getContent(classArray27);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getHost();
        int int12 = uRL9.getPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getFile();
        int int24 = uRL22.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str36 = uRL35.getQuery();
        java.lang.String str37 = uRL35.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive43 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str44 = explodedArchive43.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection45 = explodedArchive43.getEntries();
        java.util.jar.Manifest manifest46 = explodedArchive43.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler47 = explodedArchive43.new FilteredURLStreamHandler();
        java.net.URL uRL48 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL49 = new java.net.URL(uRL35, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.net.URL uRL50 = new java.net.URL(uRL22, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler47);
        java.lang.String str51 = uRL22.toExternalForm();
        boolean boolean52 = uRL9.sameFile(uRL22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream53 = uRL9.openStream();
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL39 = new java.net.URL(uRL25, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL40 = new java.net.URL("archive", "", 10, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.net.URL uRL41 = new java.net.URL(uRL9, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str42 = uRL41.getProtocol();
        int int43 = uRL41.getDefaultPort();
        java.lang.String str44 = uRL41.getAuthority();
        java.lang.String str45 = uRL41.getRef();
        java.lang.String str46 = uRL41.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection47 = uRL41.openConnection();
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        java.lang.String str25 = uRL22.getRef();
        java.lang.String str26 = uRL22.toExternalForm();
        boolean boolean27 = uRL9.sameFile(uRL22);
        int int28 = uRL9.getDefaultPort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream29 = uRL9.openStream();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        java.net.URL uRL14 = new java.net.URL(uRL9, "[://[archive://:10archive]:100archive://:10archive]:100");
        java.net.URL uRL16 = new java.net.URL(uRL9, "hi!://:100/hi!://:100/hi!://:100");
        java.lang.String str17 = uRL16.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive22 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str23 = explodedArchive22.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection24 = explodedArchive22.getEntries();
        java.util.jar.Manifest manifest25 = explodedArchive22.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler26 = explodedArchive22.new FilteredURLStreamHandler();
        java.net.URL uRL27 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler26);
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive33 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str34 = explodedArchive33.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection35 = explodedArchive33.getEntries();
        java.util.jar.Manifest manifest36 = explodedArchive33.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler37 = explodedArchive33.new FilteredURLStreamHandler();
        java.net.URL uRL38 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler37);
        java.lang.String str39 = uRL38.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive45 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str46 = explodedArchive45.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection47 = explodedArchive45.getEntries();
        java.util.jar.Manifest manifest48 = explodedArchive45.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler49 = explodedArchive45.new FilteredURLStreamHandler();
        java.net.URL uRL50 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler49);
        java.lang.String str51 = uRL50.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive53 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str54 = explodedArchive53.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection55 = explodedArchive53.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler56 = explodedArchive53.new FilteredURLStreamHandler();
        java.net.URL uRL57 = new java.net.URL(uRL50, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL58 = new java.net.URL(uRL38, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.net.URL uRL59 = new java.net.URL(uRL27, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler56);
        java.lang.String str60 = uRL59.getUserInfo();
        java.net.URL uRL62 = new java.net.URL(uRL59, "://[archive://:10archive]:100archive://:10archive");
        boolean boolean63 = uRL16.sameFile(uRL59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection64 = uRL16.openConnection();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str23 = uRL22.getQuery();
        java.lang.String str24 = uRL22.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive30 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str31 = explodedArchive30.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection32 = explodedArchive30.getEntries();
        java.util.jar.Manifest manifest33 = explodedArchive30.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler34 = explodedArchive30.new FilteredURLStreamHandler();
        java.net.URL uRL35 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL36 = new java.net.URL(uRL22, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.net.URL uRL37 = new java.net.URL(uRL9, "archive", (java.net.URLStreamHandler) filteredURLStreamHandler34);
        java.lang.String str38 = uRL9.toExternalForm();
        java.lang.String str39 = uRL9.getQuery();
        java.lang.String str40 = uRL9.getHost();
        int int41 = uRL9.getPort();
        int int42 = uRL9.getPort();
        java.lang.String str43 = uRL9.getProtocol();
        java.lang.String str44 = uRL9.getPath();
        java.net.URL uRL46 = new java.net.URL(uRL9, "[hi!://:100/archive]:100");
        java.lang.String str47 = uRL9.getRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection48 = uRL9.openConnection();
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getFile();
        int int11 = uRL9.getDefaultPort();
        java.lang.String str12 = uRL9.getRef();
        java.lang.String str13 = uRL9.getRef();
        java.net.URL uRL15 = new java.net.URL(uRL9, "hi!:1");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = uRL15.getContent();
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive17 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str18 = explodedArchive17.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection19 = explodedArchive17.getEntries();
        java.util.jar.Manifest manifest20 = explodedArchive17.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler21 = explodedArchive17.new FilteredURLStreamHandler();
        java.net.URL uRL22 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.net.URL uRL23 = new java.net.URL(uRL9, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler21);
        java.lang.String str24 = uRL9.getFile();
        java.lang.String str25 = uRL9.getAuthority();
        int int26 = uRL9.getPort();
        java.lang.String str27 = uRL9.getAuthority();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive32 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str33 = explodedArchive32.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection34 = explodedArchive32.getEntries();
        java.util.jar.Manifest manifest35 = explodedArchive32.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler36 = explodedArchive32.new FilteredURLStreamHandler();
        java.net.URL uRL37 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler36);
        java.lang.String str38 = uRL37.getFile();
        int int39 = uRL37.getDefaultPort();
        java.lang.String str40 = uRL37.getFile();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive46 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str47 = explodedArchive46.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection48 = explodedArchive46.getEntries();
        java.util.jar.Manifest manifest49 = explodedArchive46.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler50 = explodedArchive46.new FilteredURLStreamHandler();
        java.net.URL uRL51 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler50);
        java.lang.String str52 = uRL51.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive58 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str59 = explodedArchive58.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection60 = explodedArchive58.getEntries();
        java.util.jar.Manifest manifest61 = explodedArchive58.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler62 = explodedArchive58.new FilteredURLStreamHandler();
        java.net.URL uRL63 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler62);
        java.lang.String str64 = uRL63.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive66 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str67 = explodedArchive66.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection68 = explodedArchive66.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler69 = explodedArchive66.new FilteredURLStreamHandler();
        java.net.URL uRL70 = new java.net.URL(uRL63, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.net.URL uRL71 = new java.net.URL(uRL51, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.net.URL uRL72 = new java.net.URL(uRL37, "/archive", (java.net.URLStreamHandler) filteredURLStreamHandler69);
        java.lang.String str73 = uRL37.getFile();
        java.lang.String str74 = uRL37.getPath();
        boolean boolean75 = uRL9.sameFile(uRL37);
        java.lang.String str76 = uRL9.toExternalForm();
        java.lang.String str77 = uRL9.getHost();
        java.net.URL uRL79 = new java.net.URL(uRL9, "/hi!://:100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection80 = uRL79.openConnection();
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getPath();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive16 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str17 = explodedArchive16.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection18 = explodedArchive16.getEntries();
        java.util.jar.Manifest manifest19 = explodedArchive16.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler20 = explodedArchive16.new FilteredURLStreamHandler();
        java.net.URL uRL21 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler20);
        java.lang.String str22 = uRL21.getHost();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive24 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str25 = explodedArchive24.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection26 = explodedArchive24.getEntries();
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler27 = explodedArchive24.new FilteredURLStreamHandler();
        java.net.URL uRL28 = new java.net.URL(uRL21, "hi!", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.net.URL uRL29 = new java.net.URL(uRL9, ":100", (java.net.URLStreamHandler) filteredURLStreamHandler27);
        java.lang.String str30 = uRL9.getFile();
        java.lang.String str31 = uRL9.getRef();
        java.lang.String str32 = uRL9.toExternalForm();
        java.lang.String str33 = uRL9.getFile();
        java.net.URL uRL35 = new java.net.URL(uRL9, "/:100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream36 = uRL35.openStream();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getDefaultPort();
        java.lang.String str13 = uRL9.getPath();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = uRL9.getContent();
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getHost();
        java.lang.String str11 = uRL9.getUserInfo();
        java.lang.String str12 = uRL9.getPath();
        int int13 = uRL9.getDefaultPort();
        java.lang.String str14 = uRL9.getAuthority();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.net.URLConnection uRLConnection15 = uRL9.openConnection();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive4 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str5 = explodedArchive4.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection6 = explodedArchive4.getEntries();
        java.util.jar.Manifest manifest7 = explodedArchive4.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler8 = explodedArchive4.new FilteredURLStreamHandler();
        java.net.URL uRL9 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler8);
        java.lang.String str10 = uRL9.getQuery();
        java.lang.String str11 = uRL9.getRef();
        int int12 = uRL9.getPort();
        java.lang.String str13 = uRL9.toExternalForm();
        java.lang.String str14 = uRL9.getRef();
        java.lang.String str15 = uRL9.getProtocol();
        org.springframework.boot.loader.archive.ExplodedArchive explodedArchive20 = new org.springframework.boot.loader.archive.ExplodedArchive();
        java.lang.String str21 = explodedArchive20.toString();
        java.util.Collection<org.springframework.boot.loader.archive.Archive.Entry> entryCollection22 = explodedArchive20.getEntries();
        java.util.jar.Manifest manifest23 = explodedArchive20.manifest;
        org.springframework.boot.loader.archive.ExplodedArchive.FilteredURLStreamHandler filteredURLStreamHandler24 = explodedArchive20.new FilteredURLStreamHandler();
        java.net.URL uRL25 = new java.net.URL("hi!", "", 100, "", (java.net.URLStreamHandler) filteredURLStreamHandler24);
        java.lang.String str26 = uRL25.getQuery();
        java.lang.String str27 = uRL25.getHost();
        java.lang.String str28 = uRL25.getProtocol();
        java.lang.String str29 = uRL25.getFile();
        boolean boolean30 = uRL9.sameFile(uRL25);
        java.lang.String str31 = uRL25.getProtocol();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.InputStream inputStream32 = uRL25.openStream();
    }
}

